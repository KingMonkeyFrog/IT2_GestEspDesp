
package controller;

import java.util.List;

import model.PlataformaGED;
import model.TimeSlot;


/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class ConsultarTotalReservas_Controller
{
    private final PlataformaGED ged;
    

    public ConsultarTotalReservas_Controller(PlataformaGED ged)
    {

        this.ged = ged;
    }



    public List<TimeSlot> obterTotalReservas(int i, int o) {
        return ged.obterTotalReservas(i, o);
    }




    

}