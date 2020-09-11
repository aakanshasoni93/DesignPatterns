package abstractFactory.factories;

import abstractFactory.products.Product;
import abstractFactory.products.Product1;
import abstractFactory.products.Product2;
import abstractFactory.products.ProductType;

public class Factory2{
    public static Product getProduct(ProductType ptype){
        if(ProductType.Product1==ptype)
            return new Product1();
        else if(ProductType.Product2==ptype)
            return new Product2();
        else
            return null;
    }
}
