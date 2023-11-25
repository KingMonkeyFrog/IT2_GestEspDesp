/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.EspacoNaoAquatico_Controller;
import model.EspacoNaoAquatico;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Rodrigo Soares
 */
public class EspacoNaoAquatico_UI {
    
    private PlataformaGED ged;
    private EspacoNaoAquatico_Controller controller;

    public EspacoNaoAquatico_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new EspacoNaoAquatico_Controller(ged);
    }
    
    
    
        public EspacoNaoAquatico run()
    {
        System.out.println("\nNovo Espaco Nao Aquatico :");
        controller.novoEspacoNaoAquatico();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registarEspacoNaoAquatico()) {
                System.out.println("Espaco Nao Aquatico guardado com sucesso.");
            } else {
                System.out.println("Não foi possível guardar o Espaco Nao Aquatico.");
            }
        }return this.controller.getEspacoNaoAquatico();
    }
    
    private void introduzDados() {
        boolean cobertura =false;
        String coberturaString = Utils.readLineFromConsole("Se tiver Cobertura escreva (S) : ");
        String tipoPiso = Utils.readLineFromConsole("Qual o tipo de piso : ");

        
        if(coberturaString.equals("S")){
            cobertura=true;}
        
        controller.setDados(cobertura, tipoPiso);
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nEspaço Nao Aquatico:\n" + controller.getEspacoNaoAquaticoAsString());
    }
 
}

 
