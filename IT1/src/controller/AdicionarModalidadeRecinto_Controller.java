package controller;

import model.PlataformaGED;
import model.Proprietario;
import model.Modalidade;
import model.Recinto;

/**
 *
 * 
 */
public class AdicionarModalidadeRecinto_Controller {
    /**
     * A plataforma de gestão de eventos desportivos
     */
    private final PlataformaGED ged;
    
 
    private Modalidade modalidade;
    

    private Recinto recinto;
    
  
    public  AdicionarModalidadeRecinto_Controller(PlataformaGED ged){
        this.ged = ged;
        
    }
    

    public String obterListaProprietariosAsString(){
        return this.ged.obterListaProprietariosAsString();
    }


    public Proprietario obterProprietarioByID(int codRef) {
        return this.ged.obterProprietarioByID(codRef);
    }


    public Modalidade obterModalidadeByID(int codRef) {
        return this.ged.obterModalidadeByID(codRef);
    }


    public String obterModalidesAsString() {
        return this.ged.obterModalidesAsString();
    }

}