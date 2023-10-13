package dio.facade.subsistema.crm;

public class CrmService {
    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome,String cep, String cidade, String estado){
        System.out.println("Salvo no CRM" +
                "\n- Nome: " + nome +
                "\n- CEP: " + cep +
                "\n- Cidade: " + cidade +
                "\n- Estado: " + estado);
    }
}
