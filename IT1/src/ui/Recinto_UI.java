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
        System.out.println(Qual o tipo de Espaço: Escreva (S) para Espaço Aquatico e (N) para Espaço Nao Aquatico );
        if(S){
            
        
        }
        
         while(Utils.readLineFromConsole("Quer adicionar algum Espaco (S/N): ").equals("S")){
       
        Espaco_UI espaco = new Espaco_UI(ged);
        vecE.add(espaco.run());}
        
        controller.setDados(codigo, endereco, contacto, dimensao);
        controller.setEspaco(vecE);
}
        

   
    private void apresentaDados() 
    {
        System.out.println("\nRecinto:\n" + controller.getRecintoAsString());
    }
 
}
