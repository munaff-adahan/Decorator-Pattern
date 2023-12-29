/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

abstract class IceCream {

    public abstract double getPrice();
}

class VanillaIceCream extends IceCream {

    @Override
    public double getPrice() {
        return 100;
    }

}

abstract class IceCreamDecorator extends IceCream {

    IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

}

class StrawBerryDecorator extends IceCreamDecorator {

    public StrawBerryDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getPrice() {
        return iceCream.getPrice() + 25;

    }
}

public class Test2 {

    public static void main(String[] args) {
        IceCream iceCream1 = new VanillaIceCream();
        System.out.println(iceCream1.getPrice());

        IceCream iceCream2 = new VanillaIceCream();
        iceCream2 = new StrawBerryDecorator(iceCream2);
        iceCream2 = new StrawBerryDecorator(iceCream2);
        iceCream2 = new StrawBerryDecorator(iceCream2);
        iceCream2 = new StrawBerryDecorator(iceCream2);
       
        System.out.println(iceCream2.getPrice());
    }
}
