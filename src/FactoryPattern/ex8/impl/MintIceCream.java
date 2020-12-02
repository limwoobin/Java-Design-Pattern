package FactoryPattern.ex8.impl;

import FactoryPattern.ex8.IceCream;

public class MintIceCream implements IceCream {

    @Override
    public void taste() {
        System.out.println("Mint IceCream");
    }
}
