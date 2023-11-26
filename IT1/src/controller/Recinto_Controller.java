/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.PlataformaGED;
import model.Espaco;
import model.Recinto;
/**
 *
 * @author Rodrigo Soares
 */
public class Recinto_Controller {
    
    private final PlataformaGED ged;
    private Recinto r; 
    
    public Recinto_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novoRecinto()
    {
        this.r = ged.novoRecinto();
    }
    
    public void setDados(int codigo, String endereco, String contacto, String dimensao, Espaco espaco) {
        this.r.setCodigo(codigo);
        this.r.setEndereco(endereco);
        this.r.setEndereco(contacto);
        this.r.setDimensao(dimensao); 
        this.r.setEspaco(espaco);     
    }


    public int getCodigo() {
        return this.r.getCodigo();
        
    }
    
    public String getEndereco() {
        
        return this.r.getEndereco();   
    }
            
    public String getContacto() {
        return this.r.getContacto();     
    }
    
    public String getDimensao() {
        return this.r.getDimensao();   
    }
    
    
        public boolean registarRecinto()
    {
        return this.ged.registarRecinto(r);
    }
        
            public String getRecintoAsString()
    {
        return this.r.toString();
    }
            
    public Recinto getRecinto()
    {
        return this.r;
    }

    public void setR(Recinto r) {
        this.r = r;
    }
    public void setEspaco(Espaco espaco){
        this.r.setEspaco(espaco);
    }
    }       
 
        

