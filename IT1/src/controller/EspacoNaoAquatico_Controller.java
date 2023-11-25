/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.PlataformaGED;
import model.Espaco;
import model.EspacoNaoAquatico;

/**
 *
 * @author Rodrigo Soares
 */
public class EspacoNaoAquatico_Controller {
    
    private final PlataformaGED ged;
    private EspacoNaoAquatico ea; 
    
    public EspacoNaoAquatico_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novoEspacoNaoAquatico()
    {
        this.ea = ged.novoEspacoNaoAquatico();
    }
    
    public void setDados(boolean cobertura, String tipoPiso) {
        this.ea.setCobertura(cobertura);
        this.ea.setTipoDePiso(tipoPiso);
    
    }


    public boolean getCobertura() {
        return this.ea.getCobertura();
        
    }
    
    public String getTipoPiso() {
        
        return this.ea.getTipoDePiso();   
    }

   
        public boolean registarEspacoNaoAquatico()
    {
        return this.ged.registaEspacoNaoAquatico(ea);
        
    }
        
        
            public String getEspacoNaoAquaticoAsString()
    {
        return this.ea.toString();
    }
            
            public EspacoNaoAquatico getEspacoNaoAquatico()
    {
        return this.ea;
    }
 
        
}
