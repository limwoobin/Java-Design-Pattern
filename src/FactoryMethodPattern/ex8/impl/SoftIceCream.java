package FactoryMethodPattern.ex8.impl;

import FactoryMethodPattern.ex8.IceCream;

public class SoftIceCream implements IceCream {

    @Override
    public void taste() {
        System.out.println("Soft IceCream");
    }
}
