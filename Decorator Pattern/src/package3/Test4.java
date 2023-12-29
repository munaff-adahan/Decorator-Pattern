/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package3;

abstract class IceCream {

    public abstract String getDescription();

    public abstract double getPrice();
}

class VanillaIceCream extends IceCream {

    @Override
    public String getDescription() {
        return "Vanilla IceCream";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}

///Ice Cream Decorators///
abstract class Decorator extends IceCream {

    IceCream iceCream;

    public Decorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

}

class StrawberryDecorator extends Decorator {

    public StrawberryDecorator(IceCream iceCream) {
        super(iceCream);
    }
    
   

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " with Strawberry Serup";
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 80;
    }

}

public class Test4 {

    public static void main(String[] args) {
        IceCream vanillaIceCream = new VanillaIceCream();
        System.out.println(vanillaIceCream.getDescription());
        vanillaIceCream = new StrawberryDecorator(vanillaIceCream);
        System.out.println(vanillaIceCream.getPrice());
        System.out.println(vanillaIceCream.getDescription());
    }

}
