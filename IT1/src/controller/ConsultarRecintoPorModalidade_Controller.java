
package controller;

import java.util.List;

import model.Modalidade;
import model.PlataformaGED;
import model.Proprietario;
import model.Recinto;


/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class ConsultarRecintoPorModalidade_Controller
{
    private final PlataformaGED ged;
    

    public ConsultarRecintoPorModalidade_Controller(PlataformaGED ged)
    {

        this.ged = ged;
    }


    public List<Modalidade> getModaliades()
    {
        return ged.getModalidades();
    }
    
    public List<Recinto> getRecintosPorModalidade(String sigla)
    {
        return ged.obterRecintosBySiglaModalidade(sigla);
    }




    

}

