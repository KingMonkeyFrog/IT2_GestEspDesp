package controller;

import java.util.List;


import model.Calendario1;
import model.PlataformaGED;
import model.Recinto;

/**
 *
 * @author Rodrigo Soares
 */
public class Calendario_Controller {
    
    private final PlataformaGED ged;
    private Calendario1 c; 
    
    public Calendario_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
  

    public String obterListaProprietariosAsString() {
        return this.ged.obterListaProprietariosAsString();
    }


    public List<Recinto> obterListaRecintos() {
        return this.ged.obterListaRecintos();
    }


    public String obterTinmeStampsAsString() {
        return c.toString();
    }

   
}
