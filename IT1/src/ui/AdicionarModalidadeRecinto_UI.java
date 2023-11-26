package ui;

import controller.AdicionarModalidadeRecinto_Controller;
import model.Modalidade;
import model.PlataformaGED;
import model.Proprietario;
import model.Recinto;
import utils.Data;
import utils.Utils;

/**
 *

 */
public class AdicionarModalidadeRecinto_UI
{
    /**
     
     */
    private PlataformaGED ged;
    
    /**
     * Controller do UI.
     */
    private AdicionarModalidadeRecinto_Controller controller;

    /**

     */
    public AdicionarModalidadeRecinto_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new AdicionarModalidadeRecinto_Controller(ged);
    }

    /**
     * 
     * 
     */
    public void run()
    {
        System.out.println("\nLista de proprietarios:");
        System.out.println(obterListaProprietariosAsString());

        int codRef = Utils.IntFromConsole("Qual o codigo do Proprietario: ");
        
        Proprietario p = controller.obterProprietarioByID(codRef);
        System.out.println(p.obterListaRecintoDeProprietario());
         codRef = Utils.IntFromConsole("Qual o codigo do Recinto: ");
         Recinto r = p.obterRecintoByID(codRef);
         
         System.out.println(controller.obterModalidesAsString());


        
         codRef = Utils.IntFromConsole("Indique o codigo da modalidade que prentende adicionar ao recinto");
         
        Modalidade m = controller.obterModalidadeByID(codRef);
        r.adicionarModalidade(m);
        









        }    public String obterListaProprietariosAsString(){
        return this.controller.obterListaProprietariosAsString();
    }
    
    
}

