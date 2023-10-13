package dio;

import dio.facade.TestFacade;
import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonlazyHolder;
import dio.singleton.TestSingleton;
import dio.strategy.TestStrategy;

public class Main {
    public static void main(String[] args){
        System.out.println("testando singleton");
        new TestSingleton().runTests();


        System.out.println("testando strategy");
        new TestStrategy().runTests();


        System.out.println("testando facade");
        new TestFacade().runTests();
    }
}
