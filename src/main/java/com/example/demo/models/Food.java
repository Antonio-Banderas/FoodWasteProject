package com.example.demo.models;

import java.time.LocalDate;

/**
 * @author Julius Panduro
 * Time: 11.00
 * Date: 12/03/2021
 */

public class Food {
    private String foodCategory;
    private String foodType;
    private LocalDate expiration;
    private boolean isVegan;
    private boolean isHalal;
    private boolean isLactoseFree;
    private boolean isGlutenFree;


    public Food(String foodCategory, String foodType, LocalDate expiration) {
        this.foodCategory = foodCategory;
        this.foodType = foodType;
        this.expiration = expiration;
    }

    public boolean otherInfo(boolean isVegan, boolean isHalal, boolean isLactoseFree, boolean isGlutenFree){
        if (this.isVegan = isVegan){
            return true;
        } else if ( this.isHalal = isHalal){
            return true;
        } else if (this.isLactoseFree = isLactoseFree){
            return true;
        } else if (this.isGlutenFree = isGlutenFree){
            return true;
        }
       return false;
    }
}
