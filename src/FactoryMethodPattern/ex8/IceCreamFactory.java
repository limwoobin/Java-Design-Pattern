package FactoryMethodPattern.ex8;

import FactoryMethodPattern.ex8.impl.ChocoIceCream;
import FactoryMethodPattern.ex8.impl.MintIceCream;
import FactoryMethodPattern.ex8.impl.SoftIceCream;
import FactoryMethodPattern.ex8.impl.VanillaIceCream;

public class IceCreamFactory {

    public IceCream makeIceCream(Taste taste) {
        switch (taste) {
            case CHOCO: return new ChocoIceCream();
            case MINT: return new MintIceCream();
            case VANILLA: return new VanillaIceCream();
            default: return new SoftIceCream();
        }
    }
}
