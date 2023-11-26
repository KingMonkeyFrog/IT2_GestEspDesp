
package controller;

import java.util.List;

import model.PlataformaGED;
import model.TimeSlot;


/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class ConsultarReservaEstado_Controller
{
    private final PlataformaGED ged;
    

    public ConsultarReservaEstado_Controller(PlataformaGED ged)
    {

        this.ged = ged;
    }



    public List<TimeSlot> obterReservasByEstado(int e) {
        List<TimeSlot> timeSlots = ged.obterReservasByEstado(e);
        return timeSlots;
    }




    

}
