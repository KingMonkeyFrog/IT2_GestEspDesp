/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.PlataformaGED;
import model.Proprietario;
import model.Recinto;


/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class RegistarProprietario_Controller
{
    private final PlataformaGED ged;
    private Proprietario proprietario;
    private List<Recinto> vecR;
    
    public RegistarProprietario_Controller(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void novoProprietario()
    {
        this.proprietario = ged.novoProprietario();
    }
    public void setDados(int codigoUnico, String nif, String email, String contacto, String paginaWeb) {
        this.proprietario.setCodigoUnico(codigoUnico);
        this.proprietario.setNif(nif);
        this.proprietario.setEmail(email);
        this.proprietario.setContacto(contacto);
        this.proprietario.setPaginaWeb(paginaWeb);
    }
    
    public int getCodigo()
    {
        return this.proprietario.getCodigoUnico();
    }
    
    public boolean registaProprietario()
    {
        return this.ged.registaProprietario(this.proprietario);
    }

    public String getProprietarioAsString()
    {
        return this.proprietario.toString();
    }

    public void setRecinto(List<Recinto> vecR) {
         this.proprietario.setRecinto(vecR);
    }
}
