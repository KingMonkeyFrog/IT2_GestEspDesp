package controller;

import utils.Data;

import model.Cliente;
import model.PlataformaGED;

public class EfetuarRegistoCliente_Controller {
    private PlataformaGED ged;
    private Cliente cliente;

    public EfetuarRegistoCliente_Controller(PlataformaGED ged) {
        this.ged = ged;
    }

    public void novoCliente() {
        cliente = new Cliente();
    }

    public boolean registaCliente() {
        if (ged.registarCliente(cliente)) {
            return true;
        }   
        return false;
    }

    public void setDados(String nome, String endereco, String email, String nif, String contacto, Data dataNasc) {

        cliente.setNome(nome);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        cliente.setNif(nif);
        cliente.setContacto(contacto);
        cliente.setDataNasc(dataNasc);




    }

    public Cliente getCliente() {
        return cliente;
    }

    
}
