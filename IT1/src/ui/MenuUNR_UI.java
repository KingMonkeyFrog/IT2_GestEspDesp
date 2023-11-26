package ui;

import java.io.IOException;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class MenuUNR_UI
{
    private PlataformaGED ged;
    private String opcao;

    public MenuUNR_UI(PlataformaGED ged)
    {
        this.ged = ged;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Efetuar Registo para Cliente (UNR)");         
            System.out.println("0. Voltar");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
                EfetuarRegistoCliente_UI ui = new EfetuarRegistoCliente_UI(ged);
                ui.run();
            } 

            
            
        }
        while (!opcao.equals("0") );
    }
}

