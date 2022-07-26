package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {
    ArrayList<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Menu(MenuItem[] items) {
        this.items = new ArrayList<>(Arrays.asList(items));
    }

    public static String categoryName(MenuCategory category) {
        return switch (category) {
            case APPETIZER -> "Appetizer";
            case MAIN_COURSE -> "Main Course";
            case DESSERT -> "Dessert";
        };
    }

    public static Menu getSampleMenu() {
        Menu menu = new Menu();

        menu.addItem(new MenuItem("Potato Skins", "Baked Potato Skins topped with cheese, bacon crumbles, and chives. Served with Sour Cream.", 7.99, MenuCategory.APPETIZER));
        menu.addItem(new MenuItem("Mozzarella Sticks", "Breaded and fried mozzarella sticks. Served with Marinara dipping sauce.", 8.99, MenuCategory.APPETIZER));

        menu.addItem(new MenuItem("Chicken Pesto", "Angel hair pasta topped with basil pesto sauce and grilled chicken.", 12.99, MenuCategory.MAIN_COURSE));
        menu.addItem(new MenuItem("Cowboy Burger", "Quarter pound hamburger with provolone cheese, bacon and house barbeque sauce.", 9.99, MenuCategory.MAIN_COURSE));

        menu.addItem(new MenuItem("Chocolate Cake", "Dark chocolate cake with buttercream frosting.", 4.99, MenuCategory.DESSERT));
        menu.addItem(new MenuItem("Strawberry Shortcake", "Fluffy shortcake topped with whipped cream and strawberries.", 5.99, MenuCategory.DESSERT));

        return menu;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public void display() {
        System.out.println(":::        MENU          :::");

        MenuCategory[] categories = new MenuCategory[]{MenuCategory.APPETIZER, MenuCategory.MAIN_COURSE, MenuCategory.DESSERT};

        for (MenuCategory category : categories) {
            System.out.printf("\n:::   %s   :::\n", categoryName(category));

            for (MenuItem item : items) {
                if (item.isCategory(category)) {
                    System.out.println(item.display());
                }
            }
        }
    }
}
