/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

/**
 *
 * @author shelfinna
 */
public abstract class People {
    protected String name;
    protected String password;
    
    public People (String name, String password){
        this.name = name;
        this.password = password;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
}
