/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.EspacoAquatico_Controller;
import model.EspacoAquatico;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Rodrigo Soares
 */
public class EspacoAquatico_UI {
    
    private PlataformaGED ged;
    private EspacoAquatico_Controller controller;

    public EspacoAquatico_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new EspacoAquatico_Controller(ged);
    }
    
    
    
        public EspacoAquatico run()
    {
        System.out.println("\nNovo EspacoAquatico :");
        controller.novoEspacoAquatico();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registarEspacoAquatico()) {
                System.out.println("Espaco Aquatico guardado com sucesso.");
            } else {
                System.out.println("Não foi possível guardar o Espaco Aquatico.");
            }
        }return this.controller.getEspacoAquatico();
    }
    
    private void introduzDados() {
        boolean cobertura =false;
        String coberturaString = Utils.readLineFromConsole("Se tiver Cobertura escreva (S) : ");
        int temperatura = Utils.IntFromConsole("Qual a Temperatura : ");
        int profundidadeMaxima = Utils.IntFromConsole("Qual a Profundidade Maxima : ");
        int profundidadeMinima = Utils.IntFromConsole("Qual a Profundidade Minima : ");
        
        if(coberturaString.equals("S")){
            cobertura=true;}
        
        controller.setDados(cobertura, temperatura, profundidadeMaxima, profundidadeMinima);
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nEspaço Aquatico:\n" + controller.getEspacoAquaticoAsString());
    }
 
}

    
