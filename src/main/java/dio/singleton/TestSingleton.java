package dio.singleton;

public class TestSingleton {
    public static void runTests(){
        //Testing singleton Lazy
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        System.out.println(SingletonLazy.getInstancia());

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println(SingletonEager.getInstancia());

        SingletonlazyHolder holder = SingletonlazyHolder.getInstancia();
        System.out.println(holder);
        System.out.println(SingletonlazyHolder.getInstancia());

    }
}
