package ui;

import utils.Data;

import controller.EfetuarRegistoCliente_Controller;
import model.Cliente;
import model.PlataformaGED;
import utils.Utils;

public class EfetuarRegistoCliente_UI {
    private PlataformaGED ged;
    private EfetuarRegistoCliente_Controller controller;

    public EfetuarRegistoCliente_UI(PlataformaGED ged) {
        this.ged = ged;
        controller = new EfetuarRegistoCliente_Controller(ged);
    }

    public void run() {
        System.out.println("\nNovo Registo Cliente:");
        controller.novoCliente();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if (controller.registaCliente()) {
                System.out.println("Cliente registado com sucesso.");
            } else {
                System.out.println("Não foi possível registar o cliente.");
            }
        }
    }

    private void introduzDados() {
        
        String nome = Utils.readLineFromConsole("Nome do cliente: ");
        String endereco = Utils.readLineFromConsole("Endereço do cliente: ");
        String email = Utils.readLineFromConsole("Email do cliente: ");
        String nif = Utils.readLineFromConsole("NIF do cliente: ");
        String contacto = Utils.readLineFromConsole("Contacto do cliente: ");
        Data dataNasc =  Utils.readDataFromConsole("Introduza a data de nascimento (dd-MM-yyyy): ");
        
        controller.setDados(nome, endereco, email, nif, contacto, dataNasc);
        


    }

    private void apresentaDados() {

    Cliente cliente = controller.getCliente();
    System.out.println("\nDados do Cliente:");
    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Endereço: " + cliente.getEndereco());
    System.out.println("Email: " + cliente.getEmail());
    System.out.println("NIF: " + cliente.getNif());
    System.out.println("Contacto: " + cliente.getContacto());
    System.out.println("Data de Nascimento: " + cliente.getDataNasc());
}



       
    }

