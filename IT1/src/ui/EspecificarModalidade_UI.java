/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import controller.EspecificarModalidade_Controller;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class EspecificarModalidade_UI
{
    private PlataformaGED ged;
    private EspecificarModalidade_Controller controller;

    public EspecificarModalidade_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new EspecificarModalidade_Controller(ged);
    }

    public void run()
    {
        System.out.println("\nNova Modalidade:");
        controller.novaModalidade();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) 
        {
            if (controller.registaModalidade()) {
                System.out.println("Modalidade guardada com sucesso.");
            } else {
                System.out.println("Não foi possível guardar a Modalidade.");
            }
        }
    }
    
    private void introduzDados() {
        String sigla = Utils.readLineFromConsole("Introduza a sigla da modalidade: ");
        String design = Utils.readLineFromConsole("Introduza a designação da modalidade: ");
        int nrParticipantes = Utils.IntFromConsole("Introduza o número de participantes: ");
        controller.setDados(sigla, design, nrParticipantes);
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nModalidade:\n" + controller.getModalidadeAsString());
    }
 
}
