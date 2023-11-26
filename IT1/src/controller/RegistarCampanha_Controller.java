/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.PlataformaGED;
import model.Campanha;
import utils.Data;


/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class RegistarCampanha_Controller
{
    private final PlataformaGED ged;
    private Campanha campanha;
    
    public RegistarCampanha_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novaCampanha()
    {
        this.campanha = ged.novaCampanha();
    }
    public void setDados(int codigo, Data dataInicio, Data dataFim, double desconto) {
        this.campanha.setCodigo(codigo);
        this.campanha.setDataInicio(dataInicio);
        this.campanha.setDataFim(dataFim);
        this.campanha.setDesconto(desconto);
        
    }
    
    public int getCodigo()
    {
        return this.campanha.getCodigo();
    }
    
    public boolean registaCampanha()
    {
        return this.ged.registaCampanha(this.campanha);
    }

    public String getCampanhaAsString()
    {
        return this.campanha.toString();
    }
}

