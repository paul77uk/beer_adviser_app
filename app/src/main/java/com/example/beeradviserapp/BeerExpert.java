package com.example.beeradviserapp;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "light":
                brands.add("Jail Pale Ale");
                break;
            case "amber":
                brands.add("Jack Amber");
                break;
            case "brown":
                brands.add("Red Moose");
                break;
            default:
                brands.add("Gout Stout");
                break;
        }
        return brands;
    }
}
