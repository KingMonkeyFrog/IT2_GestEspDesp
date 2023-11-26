/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Recinto_Controller;
import java.util.ArrayList;
import java.util.List;
import model.Espaco;
import model.PlataformaGED;
import model.Recinto;
import utils.Utils;

/**
 *
 * @author Rodrigo Soares
 */
public class Recinto_UI {
    
    private PlataformaGED ged;
    private Recinto_Controller controller;

    public Recinto_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new Recinto_Controller(ged);
    }
    
    
    
        public Recinto run()
    {
        System.out.println("\nNovo Recinto :");
        controller.novoRecinto();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registarRecinto()) {
                System.out.println("Recinto guardado com sucesso.");
            } else {
                System.out.println("Não foi possível guardar o Recinto.");
            }
        }return controller.getRecinto();
    }
    
    private void introduzDados() {
        int codigo = Utils.IntFromConsole("Qual o codigo do Recinto : ");
        String endereco = Utils.readLineFromConsole("Qual o endereco do Recinto : ");
        String contacto = Utils.readLineFromConsole("Qual o contacto do Recinto : ");
        String dimensao = Utils.readLineFromConsole("Qual o dimensao do Recinto : ");
    
        Espaco_UI espui = new Espaco_UI(ged);
        Espaco espaco = espui.run();

        controller.setDados(codigo, endereco, contacto, dimensao,espaco);
        
    }

    private void apresentaDados() 
    {
        System.out.println("\nRecinto:\n" + controller.getRecintoAsString());
    }
 
}
