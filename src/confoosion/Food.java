/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

/**
 *
 * @author shelfinna
 */
public class Food {
    private String name;
    private int price;
    
    public Food (String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPrice (){
        return price;
    }
    
    public void displayFoodDetails(){
        System.out.println(name + " : " + price);
    }
}
