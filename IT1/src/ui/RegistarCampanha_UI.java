/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.RegistarCampanha_Controller;
import model.PlataformaGED;
import utils.Data;
import utils.Utils;

/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class RegistarCampanha_UI
{
    private PlataformaGED ged;
    private RegistarCampanha_Controller controller;

    public RegistarCampanha_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new RegistarCampanha_Controller(ged);
    }

    public void run()
    {
        System.out.println("\nNova Campanha:");
        controller.novaCampanha();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registaCampanha()) {
                System.out.println("Campanha guardada com sucesso.");
            } else {
                System.out.println("Não foi possível guardar a Campanha.");
            }
        }
    }
    
    private void introduzDados() {
        int codigo = Utils.IntFromConsole("Introduza o codigo da campanha: ");
        Data dataI = new Data();
        dataI.setData(Utils.IntFromConsole("Ano: "), Utils.IntFromConsole("Mes : "), Utils.IntFromConsole("Dia : "));
        Data dataF = new Data();
        dataF.setData(Utils.IntFromConsole("Ano: "), Utils.IntFromConsole("Mes : "), Utils.IntFromConsole("Dia : "));
        double desconto = Utils.IntFromConsole("Desconto: ");
        controller.setDados(codigo, dataI, dataF, desconto);
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nCampanha:\n" + controller.getCampanhaAsString());
    }
 
}

