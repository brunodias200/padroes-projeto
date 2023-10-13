package dio.facade.subsistema.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public static String recuperarCidade(String cep){
        return "Araraquara";
    }
    public static String recuperarEstado(String cep){
        return "São Paulo";
    }
}
