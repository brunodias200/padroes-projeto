package dio.singleton;

public class SingletonlazyHolder {
    private static class Holder {
        public static SingletonlazyHolder instancia = new SingletonlazyHolder();
    }

    private SingletonlazyHolder(){
        super();
    }

    public static SingletonlazyHolder getInstancia(){
        return Holder.instancia;
    }
}
