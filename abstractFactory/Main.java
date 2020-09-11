package abstractFactory;

import abstractFactory.factories.FactoryType;
import abstractFactory.factories.SuperFactory;
import abstractFactory.products.ProductType;

public class Main {
    public static void main(String args[]){
        System.out.println(SuperFactory.getFactoryName(FactoryType.Factory1, ProductType.Product1));
        System.out.println(SuperFactory.getFactoryName(FactoryType.Factory1, ProductType.Product2));
        System.out.println(SuperFactory.getFactoryName(FactoryType.Factory2, ProductType.Product1));
        System.out.println(SuperFactory.getFactoryName(FactoryType.Factory2, ProductType.Product2));
    }
}
