package ui;

import java.io.IOException;
import model.PlataformaGED;
import utils.Utils;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class MenuAdm_UI
{
    private PlataformaGED ged;
    private String opcao;

    public MenuAdm_UI(PlataformaGED ged)
    {
        this.ged = ged;
    }
    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Especificar Modalidade");
            System.out.println("2. Especificar Espaço Aquático");
            System.out.println("3. Especificar Espaço Não Aquático");
            System.out.println("4. Consultar o Total de Reservas");
            System.out.println("0. Voltar");
            opcao = Utils.readLineFromConsole("Introduza opção: ");
 
            if( opcao.equals("1") )
            {
                EspecificarModalidade_UI ui = new EspecificarModalidade_UI(ged);
                ui.run();
            }
            else
            if( opcao.equals("2") )
            {
                EspacoAquatico_UI ui = new EspacoAquatico_UI(ged);
                ui.run();
            }
            else
            if( opcao.equals("3") )
            {
                EspacoNaoAquatico_UI ui = new EspacoNaoAquatico_UI(ged);
                ui.run();
            }
            else
            if( opcao.equals("4") )
            {
                ConsultarTotalReservas_UI ui = new ConsultarTotalReservas_UI(ged);
                ui.run();
            }

            

            // Incluir as restantes opções aqui
            
        }
        while (!opcao.equals("0") );
    }
}

