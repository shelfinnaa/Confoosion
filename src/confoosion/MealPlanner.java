/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author shelfinna
 */
public class MealPlanner {

    private int mealfrequency;

    Scanner s = new Scanner(System.in);

    public void MealPlannerDetails(User user, ArrayList<Restaurant> listrestaurant) {
        System.out.println("How many meal do you plan to eat today?");
        mealfrequency = s.nextInt();
        double[] mealtime = new double[mealfrequency];

        for (int i = 0; i < mealtime.length; i++) {
            if (i == 0) {
                System.out.print("What's the time for your 1st meal:  ");
                mealtime[i] = s.nextInt();
            } else if (i == 1) {
                System.out.print("What's the time for your 2nd meal:  ");
                mealtime[i] = s.nextInt();
            } else {
                System.out.print("What's the time for your " + (i + 1) + "th meal:  ");
                mealtime[i] = s.nextInt();
            }
        }

        RandomMealPlannerAlgorithm(mealtime, mealfrequency, user, listrestaurant);

    }

    public void RandomMealPlannerAlgorithm(double[] mealtime, int mealfrequency, User user, ArrayList<Restaurant> listrestaurant) {
        Collections.shuffle(listrestaurant);

        if (user.getDietaryRestrictions() == 2 || user.getDietaryRestrictions() == 3) {
            for (int i = 0; i < mealtime.length; i++) {
                boolean recommendationFound = false;
                for (int j = 0; j < listrestaurant.size(); j++) {
                    if (listrestaurant.get(j).getOpenhours() <= mealtime[i] && mealtime[i] < listrestaurant.get(j).getClosedhours()) {
                        if (listrestaurant.get(j).getDietaryRestrictions() == user.getDietaryRestrictions()) {
                            System.out.println("Food Recs for your meal at " + mealtime[i] + ": " + listrestaurant.get(j).getName());
                            listrestaurant.remove(j);
                            recommendationFound = true;
                            break;
                        }
                    }
                }
                if (!recommendationFound) {
                    System.out.println("No restaurant recommendation found for your meal at " + mealtime[i]);
                }
            }
        } else {
            for (int i = 0; i < mealtime.length; i++) {
                boolean recommendationFound = false;
                for (int j = 0; j < listrestaurant.size(); j++) {
                    if (listrestaurant.get(j).getOpenhours() <= mealtime[i] && mealtime[i] < listrestaurant.get(j).getClosedhours()) {
                            System.out.println("Food Recs for your meal at " + mealtime[i] + ": " + listrestaurant.get(j).getName());
                            listrestaurant.remove(j);
                            recommendationFound = true;
                            break;
                    }
                }
                if (!recommendationFound) {
                    System.out.println("No restaurant recommendation found for your meal at " + mealtime[i]);
                }
            }
        }
    }

}

