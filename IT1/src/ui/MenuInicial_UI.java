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
public class MenuInicial_UI
{
    private PlataformaGED ged;
    private String opcao;

    public MenuInicial_UI(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Administrador (Adm) ");
            System.out.println("2. Responsável pela área de Recursos (FRR) ");
            System.out.println("3. Responsável pelas Campanhas (FRC)");
            System.out.println("4. Utilizador nao Registado (UNR)");
            System.out.println("5. Proprietario de Recintos Desportivos (PRD)");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
                MenuAdm_UI ui = new MenuAdm_UI(ged);
                ui.run();
            }
            else
            if( opcao.equals("2") )
            {
                MenuFRR_UI ui = new MenuFRR_UI(ged);
                ui.run();
            }
            if( opcao.equals("3") )
            {
                MenuFRC_UI ui = new MenuFRC_UI(ged);
                ui.run();
            }
            else
            if( opcao.equals("4") )
            {
                MenuUNR_UI ui = new MenuUNR_UI(ged);
                ui.run();
            }  
            else
            if( opcao.equals("5") )
            {
                int escolha = Utils.IntFromConsole("1. Preco; 2. Calendario");
                if(escolha==1){EfetuarPrecoModalidade_UI ui = new EfetuarPrecoModalidade_UI(ged); ui.run();}
                else 
                {Calendario_UI ui = new Calendario_UI(ged);
                ui.run();}
            }  
        
        }
        while (!opcao.equals("0") );
    }
}
