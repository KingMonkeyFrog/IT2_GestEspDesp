/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.PlataformaGED;
import model.Modalidade;


/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class EspecificarModalidade_Controller
{
    private final PlataformaGED ged;
    private Modalidade modalidade;
    
    public EspecificarModalidade_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novaModalidade()
    {
        this.modalidade = ged.novaModalidade();
    }
    public void setDados(String sigla, String design, int nrParticipantes){
        this.modalidade.setSiglaModalidade(sigla);
        this.modalidade.setDesign(design);
        this.modalidade.setNrParticipantes(nrParticipantes);
    }
    
    public String getSiglaModalidade()
    {
        return this.modalidade.getSiglaModalidade();
    }
    
    public boolean registaModalidade()
    {
        return this.ged.registaModalidade(this.modalidade);
    }

    public String getModalidadeAsString()
    {
        return this.modalidade.toString();
    }
}
