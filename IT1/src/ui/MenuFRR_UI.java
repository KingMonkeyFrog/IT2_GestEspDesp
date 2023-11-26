/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class MenuFRR_UI
{
    private PlataformaGED ged;
    private String opcao;

    public MenuFRR_UI(PlataformaGED ged)
    {
        this.ged = ged;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Proprietário");
            System.out.println("2. Adicionar Modalidade a Recinto");
            System.out.println("0. Voltar");

            opcao = Utils.readLineFromConsole("Introduza opção: ");
 
            if( opcao.equals("1") )
            {
                RegistarProprietario_UI ui = new RegistarProprietario_UI(ged);
                ui.run();
                System.out.println("Selecinada a opção: Registar Proprietário");   
            }
            else
            if( opcao.equals("2") )
            {
                RegistarProprietario_UI ui = new RegistarProprietario_UI(ged);
                ui.run();
                System.out.println("Selecinada a opção: Registar Proprietário");   
            }
           
            
            
        }
        while (!opcao.equals("0") );
    }
}


