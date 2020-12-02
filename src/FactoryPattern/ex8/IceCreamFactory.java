package FactoryPattern.ex8;

import FactoryPattern.ex8.impl.ChocoIceCream;
import FactoryPattern.ex8.impl.MintIceCream;
import FactoryPattern.ex8.impl.SoftIceCream;
import FactoryPattern.ex8.impl.VanillaIceCream;

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
