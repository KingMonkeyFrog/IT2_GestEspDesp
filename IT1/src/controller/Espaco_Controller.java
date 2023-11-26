/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.PlataformaGED;
import model.Espaco;
import model.Recinto;
/**
 *
 * @author Rodrigo Soares
 */
public class Espaco_Controller {
    
    private final PlataformaGED ged;
    private Espaco e; 
    
    public Espaco_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novoEspaco()
    {
        this.e = ged.novoEspaco();
    }
    
    public void setDados(boolean cobertura) {
        this.e.setCobertura(cobertura);
  
    }


    public boolean getCobertura() {
        return this.e.getCobertura();
        
    }
    

    
    
        public boolean registarEspaco()
    {
        return this.ged.registaEspaco(e);
    }
        
            public String getEspacoAsString()
    {
        return this.e.toString();
    }
            
    public Espaco getEspaco()
    {
        return this.e;
    }

    
            
 
        
}
