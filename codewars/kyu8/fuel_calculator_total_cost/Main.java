package kyu8.fuel_calculator_total_cost;

/*
    Task: Fuel Calculator: Total Cost (8 kyu)
    URL: https://www.codewars.com/kata/57b58827d2a31c57720012e8

    Description: In this kata you will have to write a function that takes litres and pricePerLitre (in dollar) as
    arguments. Purchases of 2 or more litres get a discount of 5 cents per litre, purchases of 4 or more litres get a
    discount of 10 cents per litre, and so on every two litres, up to a maximum discount of 25 cents per litre. But
    total discount per litre cannot be more than 25 cents. Return the total cost rounded to 2 decimal places. Also, you
    can guess that there will not be negative or non-numeric inputs. 1 Dollar = 100 Cents.

    Input: 5 1.23
    Output: 5.65

    Input: 5 5.6
    Output: 27.5
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(fuelPrice(5, 1.23));
        System.out.println(fuelPrice(5, 5.6));
    }

    public static double fuelPrice(int litres, double pricePerLitre) {
        double discount = Math.min((litres / 2) * 0.05, 0.25);
        double cost = litres * pricePerLitre;
        double discountedCost = cost - discount * litres;
        return Math.round(discountedCost * 100.0) / 100.0;
    }
}
