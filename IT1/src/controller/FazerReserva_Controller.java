package controller;


import java.util.List;

import model.Cliente;
import model.Modalidade;
import model.PlataformaGED;
import model.Recinto;
import model.TimeSlot;

public class FazerReserva_Controller {
    private PlataformaGED ged;
  
    public FazerReserva_Controller(PlataformaGED ged) {
        this.ged = ged;
    }

    
    public boolean registaReserva() {
        // Aqui você pode adicionar a lógica para registar a reserva
        // Por exemplo:
        // return ged.adicionaReserva(reserva);
        return false;
    }

    public String obterModalidesAsString() {
        return ged.obterModalidesAsString();
    }

    public Recinto obterRecintoBySiglaModalidade(String codRef) {
        return ged.obterRecintoBySiglaModalidade(codRef);
    }

 


    public Cliente obterClienteByEmail(String email) {
    for (Cliente cliente : ged.getListaClientes()) {
        if (cliente.getEmail().equals(email)) {
            return cliente;
        }
    }
    return null;
}


    public List<Recinto> obterListaRecintos() {
        return ged.obterListaRecintos();
    }


    public Recinto obterRecintoByID(int codRef1) {
        return ged.obterRecintoByID(codRef1);
    }


    public Modalidade obtemModalidadeBySigla(String codRef2) {
        return ged.obterModalidadeBySigla(codRef2);
    }


 
}
