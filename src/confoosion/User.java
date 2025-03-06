/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

/**
 *
 * @author shelfinna
 */
public class User extends People {
    private int dietaryrestrictions;
    private boolean fillrestrictions;
    
    public User(String name, String password){
        super (name, password);
        fillrestrictions = false;
    }
    
    // 1. none, 2.no pork, 3.vegan
    public void setDietaryRestrictions(int diet){
        this.dietaryrestrictions = diet;
    }
    
    public int getDietaryRestrictions(){
        return dietaryrestrictions;
    }
    
    public void setfillrestrictions(boolean fill){
        fillrestrictions = fill;
    }
    
    public boolean getFillRestrictions(){
        return fillrestrictions;
    }
}
