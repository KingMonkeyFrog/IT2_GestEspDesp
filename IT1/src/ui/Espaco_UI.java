/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.Espaco_Controller;
import java.util.ArrayList;
import java.util.List;
import model.PlataformaGED;
import model.Espaco;
import model.EspacoAquatico;
import model.EspacoNaoAquatico;
import utils.Utils;

/**
 *
 * @author Rodrigo Soares
 */
public class Espaco_UI {
    
    private PlataformaGED ged;
    private Espaco_Controller controller;
    private Espaco esp = new Espaco() {};

    public Espaco_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new Espaco_Controller(ged);
    }
    
    
    
        public Espaco run()
    {
        System.out.println("\nNovo Espaco :");
        controller.novoEspaco();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registarEspaco()) {
                System.out.println("Espaco guardado com sucesso.");
            } else {
                System.out.println("Não foi possível guardar o Espaco.");
            }
        }return esp;
    }
    
    private void introduzDados() {
        
         if(Utils.readLineFromConsole("Clique (S) para criar Espaço Aquatico e (N) para criar Espaço nao Aquatico: ").equals("S")){
          EspacoAquatico_UI ui = new EspacoAquatico_UI(ged); 
          EspacoAquatico ea=ui.run();
          esp=ea;
        }else{
             
         EspacoNaoAquatico_UI ui = new EspacoNaoAquatico_UI(ged); 
         EspacoNaoAquatico ena=ui.run();
          esp=ena;
         }

}
        

   
    private void apresentaDados() 
    {
        System.out.println("\nEspaco:\n" + controller.getEspacoAsString());
    }
 
}

