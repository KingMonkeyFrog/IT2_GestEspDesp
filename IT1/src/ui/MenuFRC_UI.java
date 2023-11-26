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
public class MenuFRC_UI
{
    private PlataformaGED ged;
    private String opcao;

    public MenuFRC_UI(PlataformaGED ged)
    {
        this.ged = ged;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Campanha");
            System.out.println("2. Consultar Total de Reservas");
                       
            System.out.println("0. Voltar");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
                RegistarCampanha_UI ui = new RegistarCampanha_UI(ged);
                ui.run();
                System.out.println("Selecinada a opção: Registar Campanha");
            }
            else
            if( opcao.equals("2") )
            {
                ConsultarTotalReservas_UI ui = new ConsultarTotalReservas_UI(ged);
                ui.run();
            }

        }
        while (!opcao.equals("0") );
    }
}
