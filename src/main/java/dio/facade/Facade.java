package dio.facade;

import dio.facade.subsistema.cep.CepApi;
import dio.facade.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.recuperarCidade(cep);
        String estado = CepApi.recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
