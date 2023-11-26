/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.RegistarProprietario_Controller;
import java.util.ArrayList;
import java.util.List;
import model.PlataformaGED;
import model.Recinto;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class RegistarProprietario_UI
{
    private PlataformaGED ged;
    private RegistarProprietario_Controller controller;
    
    public RegistarProprietario_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new RegistarProprietario_Controller(ged);
        
    }

    public void run()
    {
        System.out.println("\nNovo Proprietario:");
        controller.novoProprietario();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registaProprietario()) {
                System.out.println("Proprietario guardado com sucesso.");
            } else {
                System.out.println("Não foi possível guardar o Proprietario.");
            }
        }
    }
    
    private void introduzDados() {

        int codigo = Utils.IntFromConsole("Introduza o codigo do Proprietario: ");
        String nif = Utils.readLineFromConsole("Introduza o nif do Proprietario: ");
        String email = Utils.readLineFromConsole("Introduza o email do Proprietario: ");
        String contacto = Utils.readLineFromConsole("Introduza contacto do Proprietario: ");
        String pagWeb = Utils.readLineFromConsole("Introduza a pagWeb do Proprietario: ");
        List<Recinto> vecR=new ArrayList<Recinto>();
        
       

        while(Utils.readLineFromConsole("Quer adicionar algum recinto (S/N): ").equalsIgnoreCase("S")){
       
        Recinto_UI recinto = new Recinto_UI(ged);
        vecR.add(recinto.run());

        controller.setDados(codigo, nif, email,contacto,pagWeb, vecR);
        controller.registaProprietario();
        
        }
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nProprietario:\n" + controller.obterListaProprietariosASString());
    }
 
}

