package dio.strategy;

import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonlazyHolder;

public class TestStrategy {
    public static void runTests(){
        Comportamento normal = new ComportamentoNormal();
        Comportamento def = new ComportamentoDefensivo();
        Comportamento agr = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agr);
        robo.mover();

        robo.setComportamento(def);
        robo.mover();

    }
}
