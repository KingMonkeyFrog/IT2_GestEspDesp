

package ui;

import controller.ConsultarReservaEstado_Controller;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class ConsultarReservaEstado_UI
{
    private PlataformaGED ged;
    private ConsultarReservaEstado_Controller controller;

    public ConsultarReservaEstado_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new ConsultarReservaEstado_Controller(ged);
    }

    public void run()
    {
        System.out.println("\n Consultar Reserva por Estado:");
        
        introduzDados();


    }
    
    private void introduzDados() {
        int e = Utils.IntFromConsole("Qual o estado das reservas que pretende consultar ( 0- ativa, 1- cancelada  ou  2- terminada): ");
        System.out.println(controller.obterReservasByEstado(e).toString());


    }
    
 
}
