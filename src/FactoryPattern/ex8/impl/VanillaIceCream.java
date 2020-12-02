package FactoryPattern.ex8.impl;

import FactoryPattern.ex8.IceCream;

public class VanillaIceCream implements IceCream {

    @Override
    public void taste() {
        System.out.println("Vanilla IceCream");
    }
}
