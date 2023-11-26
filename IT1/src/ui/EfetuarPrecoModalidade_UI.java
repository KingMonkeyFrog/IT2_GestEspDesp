package ui;

import java.io.IOException;

import controller.EfetuarPrecoModalidade_Controller;
import model.Modalidade;
import model.PlataformaGED;
import model.Proprietario;
import model.Recinto;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class EfetuarPrecoModalidade_UI{
    private PlataformaGED ged;
    private EfetuarPrecoModalidade_Controller controller;

    public EfetuarPrecoModalidade_UI(PlataformaGED ged)
    {
        this.ged = ged;
        this.controller = new EfetuarPrecoModalidade_Controller(ged);
    }
    public void run() throws IOException
    {

     int codRef = Utils.IntFromConsole("Qual o codigo do Proprietario: ");
        
        Proprietario p = controller.obterProprietarioByID(codRef);
        System.out.println(p.obterListaRecintoDeProprietario());
         int codRef1 = Utils.IntFromConsole("Qual o codigo do Recinto: ");
         Recinto r = p.obterRecintoByID(codRef1);
         
         System.out.println(controller.obterModalidesAsString());


        
         int codRef2 = Utils.IntFromConsole("Indique o codigo da modalidade que prentende adicionar ao recinto");
         
        Modalidade m = r.getModalidades().get(codRef2);
        int preco = Utils.IntFromConsole("Indique o preco da modalidade");
        controller.obterListaProprietarios().get(codRef).obterRecintoByID(codRef1).getModalidades().get(codRef2).setPreco(preco);


        
    }
    private String obterListaProprietariosAsString() {
        return this.controller.obterListaProprietariosAsString();
    }
}

