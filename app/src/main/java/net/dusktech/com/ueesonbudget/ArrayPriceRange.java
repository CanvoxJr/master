package net.dusktech.com.ueesonbudget;

import java.util.ArrayList;

import static java.lang.Float.parseFloat;

public class ArrayPriceRange {
    public String[][] priceRange = {
            {"kawka", "7.50"},
            {"sambolon", "5.00"},
            {"persa", "9.00"},
            {"redcrab", "20.50"},
            {"ilbucco", "18.50"},
            {"caramel", "5.50"},
    };

    public ArrayList<String> getList(float input) {
        ArrayList<String> resultados = new ArrayList<String>();
        String in = "";

        for (int i = 0; i < priceRange.length; i++) {
            if (parseFloat(priceRange[i][1]) <= input) {

            }
        }
        return resultados;
    }
}
