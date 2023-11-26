package controller;

import model.PlataformaGED;
import model.Proprietario;

import java.util.List;

import model.Modalidade;
import model.Recinto;

/**
 *
 * 
 */
public class EfetuarPrecoModalidade_Controller {
    /**
     * Clínica onde será adicionada a especialidade ao médico.
     */
    private final PlataformaGED ged;
    
 
    private Modalidade modalidade;
    

    private Recinto recinto;
    
  
    public  EfetuarPrecoModalidade_Controller(PlataformaGED ged){
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

    public List<Proprietario> obterListaProprietarios() {
        return this.ged.obterListaProprietarios();
    }
}