package org.launchcode.java.studios.restaurant;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class MenuItem {
    private static final DecimalFormat DF = new DecimalFormat("0.00");
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM-dd-yyyy");
    private static final long DAY_IN_MS = 1000 * 60 * 60 * 24;
    Date created, updated;
    private String name, description;
    private double price;
    private MenuCategory category;

    public MenuItem() {
        this("Name", "A short description.", 0.01, MenuCategory.MAIN_COURSE);
    }

    public MenuItem(String name, String description, double price, MenuCategory category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;

        created = today();
        updated = today();
    }

    private static Date oneWeekBefore(Date date) {
        return new Date(date.getTime() - (7 * DAY_IN_MS));
    }

    public static Date today() {
        try {
            LocalDateTime date = LocalDateTime.now();
            return DATE_FORMAT.parse(String.format("%2d-%2d-%4d", date.getMonthValue(), date.getDayOfMonth(), date.getYear()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String display() {
        String text = "";

        if (isNew()) {
            text += "(NEW) ";
        }
        text += String.format("%-30s ($%6s)\n  :  %s", name, DF.format(price), description);

        return text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        updated = today();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        updated = today();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Error: Price must be positive.");
            return;
        }

        this.price = price;
        updated = today();
    }

    public String getCategory() {
        return Menu.categoryName(category);
    }

    public void setCategory(MenuCategory category) {
        this.category = category;
        updated = today();
    }

    public boolean isNew() {
        Date cutoff = oneWeekBefore(today());
        return created.after(cutoff) || updated.after(cutoff);
    }

    public boolean isCategory(MenuCategory category) {
        return this.category == category;
    }
}
