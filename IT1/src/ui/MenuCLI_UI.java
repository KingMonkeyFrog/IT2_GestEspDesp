package ui;

import java.io.IOException;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class MenuCLI_UI
{
    private PlataformaGED ged;
    private String opcao;

    public MenuCLI_UI(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU Cliente #####\n\n");
            System.out.println("1. Consultar Recinto Por Modalidade");
            System.out.println("2. Consultar Reserva Para Estado");
            System.out.println("3. Fazer Reserva");
            System.out.println("0. Voltar");
            opcao = Utils.readLineFromConsole("Introduza opção: ");
 
            if( opcao.equals("1") )
            {
                ConsultarRecintoPorModalidade_UI ui = new ConsultarRecintoPorModalidade_UI(ged);
                ui.run();
            }
            else
            if( opcao.equals("2") )
            {
                ConsultarReservaEstado_UI ui = new ConsultarReservaEstado_UI(ged);
                ui.run();
            }
                        else
            if( opcao.equals("3") )
            {
                FazerReserva_UI ui = new FazerReserva_UI(ged);
                ui.run();
            }
       
            
        }
        while (!opcao.equals("0") );
    }
}
