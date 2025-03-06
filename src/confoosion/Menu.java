/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    ListRestaurants listresto = new ListRestaurants();
    ArrayList<People> listuser = new ArrayList();
    Scanner s = new Scanner(System.in);
    PersonalizedReccommendation personalrecs = new PersonalizedReccommendation();
    MealPlanner mealplanner = new MealPlanner();
    BestRatingRecs bestratingrecs = new BestRatingRecs();

    public void register() {
        int inputmenu;
        do {
            System.out.println("1. Login");
            System.out.println("2. Create new account (Sign up): ");
            System.out.println("0. Exit");
            System.out.print("Menu: ");
            inputmenu = s.nextInt();
            if (inputmenu == 1) {
                login();
                System.out.println("");
            } else if (inputmenu == 2) {
                signup();
                System.out.println("");
            } else if (inputmenu == 0) {
                return;
            } else {
                System.out.println("Menu is not found!");
            }
        } while (inputmenu != 0);
    }

    public void login() {
        if (listuser.isEmpty()) {
            System.out.println("Create an account first");
        } else {
            System.out.print("Name: ");
            String name = s.next() + s.nextLine();
            System.out.print("Password: ");
            String password = s.next() + s.nextLine();
            for (int i = 0; i < listuser.size(); i++) {
                if (listuser.get(i).getName().equalsIgnoreCase(name)) {
                    if (listuser.get(i).getPassword().equalsIgnoreCase(password)) {
                        if (listuser.get(i) instanceof Admin) {
                            System.out.println("Admin Login successful");
                            Admin temp = (Admin) listuser.get(i);
                            mainMenuAdmin(temp);
                        } else {
                            System.out.println("User Login successful");
                            User temp = (User) listuser.get(i);
                            mainMenuUser(temp);
                        }
                    } else {
                        System.out.println("Password does not match. Try again!");
                    }
                } System.out.println("Invalid Credentials");
            }
        }
    }

    public void signup() {
        boolean checkname = false;
        String name;
        do {
            System.out.print("Name: ");
            name = s.next() + s.nextLine();
            checkname = false;
            for (int i = 0; i < listuser.size(); i++) {
                if (listuser.get(i).getName().equalsIgnoreCase(name)) {
                    System.out.println("Name is used already. Try a different name!");
                    checkname = true;
                }
            }
        } while (checkname != false);
        System.out.print("Password: ");
        String password = s.next() + s.nextLine();
        System.out.println("What are you?");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.print("Input: ");
        int choice = s.nextInt();
        if (choice == 1) {
            Admin newpadmin = new Admin(name, password);
            listuser.add(newpadmin);
            System.out.println("Account created successfully. Continue to login to your account!");
        } else if (choice == 2) {
            User newuser = new User(name, password);
            listuser.add(newuser);
            System.out.println("Account created successfully. Continue to login to your account!");
        } else {
            System.out.println("input ga ada");
            //blom error handling while loop
        }
    }

    public void mainMenuUser(User user) {
        ArrayList<Restaurant> listrestaurant = new ArrayList();
        listrestaurant = listresto.getRestaurantList();
        // user hanya input dietary restrictions saat pertama kali login app
        if (user.getFillRestrictions() == false) {
            System.out.println("Pick which dietary retrictions you have: ");
            System.out.println("1. None");
            System.out.println("2. No Pork");
            System.out.println("3. Vegan");
            int pick = s.nextInt();
            // blom error handling
            user.setDietaryRestrictions(pick);
            user.setfillrestrictions(true);
        }

        int inputmenu;
        do {
            System.out.println("1. Random Meal Planner");
            System.out.println("2. Personalized Food Recommendation");
            System.out.println("3. Best Rating Restaurants");
            System.out.println("4. List all restaurants");
            System.out.println("0. Exit");
            inputmenu = s.nextInt();
            if (inputmenu == 1) {
                randomMealPlanner(user, listrestaurant);
            } else if (inputmenu == 2) {
                personalizedRecommendation(user, listrestaurant);
            } else if (inputmenu == 3) {
                displayBestRecs(listrestaurant);
            } else if (inputmenu == 0) {
                return;
            } else if (inputmenu == 4) {
                listresto.displayrestname();
                listrestaurant.get(18).displayDetails();
            } else {
                System.out.println("Input not found");
            }
        } while (inputmenu != 0);
    }

    public void personalizedRecommendation(User user, ArrayList<Restaurant> listrestaurant) {
        System.out.println("Welcome to Personalized Food Recommendation. Please enter these details.");
        personalrecs.setPreference(user, listrestaurant);
    }

    public void randomMealPlanner(User user, ArrayList<Restaurant> listrestaurant) {
        System.out.println("Welcome to Random Meal Planner. Please enter these details.");
        mealplanner.MealPlannerDetails(user, listrestaurant);
    }

    public void displayBestRecs(ArrayList<Restaurant> listrestaurant) {
        System.out.println("These are today top restaurant ratings: ");
        bestratingrecs.displaybestratingrecs(listrestaurant);
    }

    public void mainMenuAdmin(Admin admin) {
        System.out.println("Welcome to Dashboard");
        if (admin.getRestaurant() == null) {
            System.out.println("Let's get started and set your restaurant up!");
            System.out.println("What's your restaurant name?");
            String name = s.next() + s.nextLine();
            System.out.println("What's your foodtype?");
            System.out.println("1. Indonesian");
            System.out.println("2. Western");
            System.out.println("3. Chinese");
            System.out.println("4. Japanese");
            int foodtype = s.nextInt();
            String foodtypes;
            if (foodtype == 1) {
                foodtypes = "Indonesian";
            } else if (foodtype == 2) {
                foodtypes = "Western";
            } else if (foodtype == 3) {
                foodtypes = "Chinese";
            } else if (foodtype == 4) {
                foodtypes = "Japanese";
            } else {
                //blom loop error handling
                System.out.println("Input not found. Try again");
                foodtypes = "Indonesian";
            }
            System.out.println("What is your open hours? (Input number in 24 hour format ex. 6 or 18)");
            int openhours = s.nextInt();
            System.out.println("What is your closed hours? (Input number in 24 hour format ex. 6 or 18)");
            int closedhours = s.nextInt();
            System.out.println("What is the minimum of your restaurant price range?");
            int minprice = s.nextInt();
            System.out.println("What is the maximum of your restaurant price range?");
            int maxprice = s.nextInt();
            System.out.println("How far is your restaurant distance to UC?");
            int distance = s.nextInt();
            System.out.println("Where is your restaurant address?");
            String location = s.next() + s.nextLine();
            System.out.println("Is your restaurant for vegan people? (0:no 1:yes)");
            int option = s.nextInt();
            int dietaryrestriction;
            //g ada error handling samsek
            if (option == 0) {
                System.out.println("Does your food contains pork in it? (0:no 1:yes)");
                option = s.nextInt();
                if (option == 0) {
                    dietaryrestriction = 1;
                } else {
                    dietaryrestriction = 2;
                }
            } else {
                dietaryrestriction = 3;
            }
            Restaurant restaurant = new Restaurant(foodtypes, name, openhours, closedhours, minprice, maxprice, distance, location, dietaryrestriction);
            admin.setRestaurant(restaurant);
            listresto.addRestaurant(restaurant);
            System.out.println("Added Succesfully! Don't forget to fill in the menu later");
        }

        int input;
        do {
            System.out.println("Modify your restaurant all you need!");
            //nda teratur menu
            System.out.println("1. Add Menu");
            System.out.println("2. Update Restaurant Information");
            System.out.println("3. Display Restaurant Information");
            System.out.println("4. Delete Menu");
            System.out.println("0. Exit");
            input = s.nextInt();
            if (input == 0) {
                return;
            } else if (input == 1) {
                System.out.print("Enter Food Name: ");
                String name = s.next() + s.nextLine();
                System.out.print("Enter Food Price: ");
                int price = s.nextInt();
                admin.getRestaurant().addFood(name, price);
            } else if (input == 2) {
                admin.UpdateRestaurantInfo();
            } else if (input == 3) {
                admin.restaurant.displayDetails();
            } else if (input == 4) {
                admin.deleteMenu();
            } else {
                System.out.println("Input not found!");
            }

        } while (input != 0);

    }

    public void updateRestaurantInfoInList(Restaurant updatedRestaurant) {
        for (int i = 0; i < listresto.getRestaurantList().size(); i++) {
            if (listresto.getRestaurantList().get(i).getName().equals(updatedRestaurant.getName())) {
                listresto.getRestaurantList().set(i, updatedRestaurant);
                break;
            }
        }
    }

}
