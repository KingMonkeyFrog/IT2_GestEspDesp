

package ui;

import controller.ConsultarTotalReservas_Controller;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class ConsultarTotalReservas_UI
{
    private PlataformaGED ged;
    private ConsultarTotalReservas_Controller controller;

    public ConsultarTotalReservas_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new ConsultarTotalReservas_Controller(ged);
    }

    public void run()
    {
        System.out.println("\n  Consultar Total Reservas:");
        
        introduzDados();


    }
    
    private void introduzDados() {
        int  i = Utils.IntFromConsole("Qual o Primeiro dia com Reservas: ");
        int o = Utils.IntFromConsole("Qual o Ultimo dia com Reservas: ");
        System.out.println(controller.obterTotalReservas(i, o).toString());


    }
    
 
}
