package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    // Add these variables
    private int basePrice;
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        bill = "";

        if(isVeg){
            price = 300;
        }
        else{
            price = 400;
        }

        basePrice = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(!extraCheeseAdded){
            price += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){

        if(!extraToppingsAdded){

            if(isVeg){
                price += 70;
            }
            else{
                price += 120;
            }

            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){

        if(!takeawayAdded){
            price += 20;
            takeawayAdded = true;
        }
    }

    public String getBill(){

        bill += "Base Price Of The Pizza: " + basePrice + "\n";

        if(extraCheeseAdded){
            bill += "Extra Cheese Added: 80\n";
        }

        if(extraToppingsAdded){
            if(isVeg){
                bill += "Extra Toppings Added: 70\n";
            }
            else{
                bill += "Extra Toppings Added: 120\n";
            }
        }

        if(takeawayAdded){
            bill += "Paperbag Added: 20\n";
        }

        bill += "Total Price: " + price;

        return bill;
    }
}
