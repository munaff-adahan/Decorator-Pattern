/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

class ChickenPizza extends Pizza {

    @Override
    public double getPrice() {
        return 850;
    }

    @Override
    public String getDescription() {
        return "Chicken Pizza";
    }
}

class VeggiePizza extends Pizza {

    @Override
    public double getPrice() {
        return 650;
    }

    @Override
    public String getDescription() {
        return "Veggie Pizza";
    }
}

class FishPizza extends Pizza {

    @Override
    public double getPrice() {
        return 720;
    }

    @Override
    public String getDescription() {
        return "Fish Pizza";
    }
}

abstract class Pizza {

    public abstract String getDescription();

    public abstract double getPrice();

}

abstract class ToppingsDecorator extends Pizza {

    Pizza pizza;

    public ToppingsDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}

class BBQSauceTopping extends ToppingsDecorator {

    public BBQSauceTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with BBQ Sauce";
    }
}

class SwissCheesTopping extends ToppingsDecorator {

    public SwissCheesTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Swiss Chees";
    }
}

class FriedOnionTopping extends ToppingsDecorator {

    public FriedOnionTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Fried Onion";
    }
}

class MayonniseTopping extends ToppingsDecorator {

    public MayonniseTopping(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 35;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with Mayonnise";
    }
}

public class Test3 {

    public static void main(String[] args) {
        Pizza fishPizza = new FishPizza();
        fishPizza = new BBQSauceTopping(fishPizza);
        fishPizza = new SwissCheesTopping(fishPizza);
        System.out.println(fishPizza.getDescription() + ": Price Is " + fishPizza.getPrice());

        Pizza chickePizza = new ChickenPizza();

        chickePizza = new BBQSauceTopping(chickePizza);
        chickePizza = new FriedOnionTopping(chickePizza);
        chickePizza = new MayonniseTopping(chickePizza);

        System.out.println(chickePizza.getDescription() + ": Price Is " + chickePizza.getPrice());

        Pizza veggiPizza = new VeggiePizza();
        veggiPizza = new SwissCheesTopping(veggiPizza);
        veggiPizza = new FriedOnionTopping(veggiPizza);

        System.out.println(veggiPizza.getDescription() + ": Price Is " + veggiPizza.getPrice());

    }

}
