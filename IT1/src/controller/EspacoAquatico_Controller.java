/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.PlataformaGED;
import model.Espaco;
import model.EspacoAquatico;
/**
 *
 * @author Rodrigo Soares
 */
public class EspacoAquatico_Controller {
    
    private final PlataformaGED ged;
    private EspacoAquatico ea; 
    
    public EspacoAquatico_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novoEspacoAquatico()
    {
        this.ea = ged.novoEspacoAquatico();
    }
    
    public void setDados(boolean cobertura, int temperatura, int profundidadeMinima, int profundidadeMaxima) {
        this.ea.setCobertura(cobertura);
        this.ea.setTemperatura(temperatura);
        this.ea.setProfundidadeMinima(profundidadeMinima);
        this.ea.setProfundidadeMaxima(profundidadeMaxima);   
    }


    public boolean getCobertura() {
        return this.ea.getCobertura();
        
    }
    
    public int getTemperatura() {
        
        return this.ea.getTemperatura();   
    }
            
    public int getProfundidadeMinima() {
        return this.ea.getProfundidadeMinima();     
    }
    
    public int getProfundidadeMaxima() {
        return this.ea.getProfundidadeMaxima();   
    }
    
    
        public boolean registarEspacoAquatico()
    {
        return this.ged.registaEspacoAquatico(ea);
    }
            public String getEspacoAquaticoAsString()
    {
        return this.ea.toString();
    }
        public EspacoAquatico getEspacoAquatico()
    {
        return this.ea;
    }
            
 
        
}
