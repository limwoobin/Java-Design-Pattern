package FactoryMethodPattern.ex8.impl;

import FactoryMethodPattern.ex8.IceCream;

public class ChocoIceCream implements IceCream {

    @Override
    public void taste() {
        System.out.println("Choco IceCream");
    }
}
