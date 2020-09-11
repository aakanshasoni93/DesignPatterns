package abstractFactory.factories;

import abstractFactory.factories.Factory1;
import abstractFactory.factories.Factory2;
import abstractFactory.factories.FactoryType;
import abstractFactory.products.Product;
import abstractFactory.products.ProductType;

public class SuperFactory {
    static public Product getFactoryName(FactoryType ftype, ProductType type){
        if(ftype==FactoryType.Factory1)
            return Factory1.getProduct(type);
        else
            return Factory2.getProduct(type);
    }
}
