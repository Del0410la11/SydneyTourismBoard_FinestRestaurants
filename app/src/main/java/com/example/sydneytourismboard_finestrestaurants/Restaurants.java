package com.example.sydneytourismboard_finestrestaurants;


import android.view.View;

import java.util.ArrayList;

public class Restaurants {
    private String name;
    private String location;
    private String type;
    private String image;

    public Restaurants() {

    }

    public Restaurants(String name, String location, String type, String image) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static ArrayList<Restaurants> getRestaurants() {
        ArrayList<Restaurants> restaurants = new ArrayList<>();
        restaurants.add(new Restaurants("Alimento Pizza Cafe", "Collaroy", "Italian, Pizza", "R.drawable.ailmento"));
        restaurants.add(new Restaurants("Wok Passion", "Lane Cove", "Chinese, Malaysian", "R.drawable.wok"));
        restaurants.add(new Restaurants("The Toxteth Hotel", "Glebe", "Bar Food, Modern Australian", "R.drawable.toxteth"));
        restaurants.add(new Restaurants("High St Society", "Randwick", "Cafe Food, Coffee and Tea", "R.drawable.high"));
        restaurants.add(new Restaurants("Chicken Licious", "Rockdale", "BBQ, Lebanese", "R.drawable.chicken"));
        restaurants.add(new Restaurants("Bach Dang Vietnamese", "Canley Vale", "Vietnamese", "R.drawable.dang"));
        restaurants.add(new Restaurants("Lucio’s", "Paddington", "Italian", "R.drawable.lucio"));
        restaurants.add(new Restaurants("Open Circus", "Mosman", "Cafe Food", "R.drawable.circus"));
        restaurants.add(new Restaurants("The Heritage Kitchen garden", "Malabar", "Cafe Food, Coffee and Tea", "R.drawable.heritage"));
        restaurants.add(new Restaurants("Ciao Down", "Lindfield", "Italian, Cafe Food ", "R.drawable.ciao"));
        return restaurants;
    }


}

