

package ui;

import controller.ConsultarRecintoPorModalidade_Controller;
import model.Modalidade;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class ConsultarRecintoPorModalidade_UI
{
    private PlataformaGED ged;
    private ConsultarRecintoPorModalidade_Controller controller;

    public ConsultarRecintoPorModalidade_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new ConsultarRecintoPorModalidade_Controller(ged);
    }

    public void run()
    {
        System.out.println("\n Consultar Recinto por Modalidade:");
        
        introduzDados();


    }
    
    private void introduzDados() {

        System.out.println(controller.getModaliades().toString());
        String s = Utils.readLineFromConsole("Introduza a Sigla da Modalidade que quer: ");
        System.out.println(s);
        System.out.println(controller.getRecintosPorModalidade(s).toString());
        int r = Utils.IntFromConsole("Introduza o codigo do recinto que quer: ");
        System.out.println(controller.getRecintosPorModalidade(s).get(r).toString());
        return ;    
     
    }
    
 
}