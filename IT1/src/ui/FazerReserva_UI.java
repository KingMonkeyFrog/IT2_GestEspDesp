package ui;

import controller.FazerReserva_Controller;
import model.Cliente;
import model.Modalidade;
import model.PlataformaGED;
import model.Proprietario;
import model.Recinto;
import model.TimeSlot;
import utils.Data;
import utils.Utils;

/**
 *
 * @author Rodrigo o Rei <mdm@isep.ipp.pt>
 */
public class FazerReserva_UI
{
    private PlataformaGED ged;
    private FazerReserva_Controller controller;

    public FazerReserva_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new FazerReserva_Controller(ged);
    }

    public void run()
    {
        System.out.println("\nNova Reserva:");
        

        introduzDados();

    }


    
    private void introduzDados() {



        String codRef = Utils.readLineFromConsole("Qual o Email do Cliente: ");
        Cliente c = controller.obterClienteByEmail(codRef);

         System.out.println(controller.obterModalidesAsString());
         String codRef2 = Utils.readLineFromConsole("Qual a Sigla da modalidade que prentende reservar");


        System.out.println(controller.obterRecintoBySiglaModalidade(codRef2));

       
        int codRef1 = Utils.IntFromConsole("Qual o codigo do Recinto que deseja reservar");
            
            Recinto r = controller.obterRecintoByID(codRef1);
            r.obterListaCalendario();
            int codigo= Utils.IntFromConsole("Qual o codigo? (Livre/Ocupado)");
            int dia = Utils.IntFromConsole("Qual o dia do TimeSlot? (1-31)");
            int mes = Utils.IntFromConsole("Qual o mes do TimeSlot? (1-12)");
            int ano = Utils.IntFromConsole("Qual o ano do TimeSlot? (2017-2020)");
            int horaInic = Utils.IntFromConsole("Qual a hora de inicio do TimeSlot? (0-23)");
            int horaFim = Utils.IntFromConsole("Qual a hora de fim do TimeSlot? (0-23)");
            int minInic = Utils.IntFromConsole("Qual o minuto de inicio do TimeSlot? (0-59)");
            int minFim = Utils.IntFromConsole("Qual o minuto de fim do TimeSlot? (0-59)");
            int custo = Utils.IntFromConsole("Qual o custo do TimeSlot? (0-100)");
            int estado = Utils.IntFromConsole("Qual o estado do TimeSlot? (Livre/Ocupado)");
            int duracao= Utils.IntFromConsole("Qual a duracao? (Livre/Ocupado)");
           
            TimeSlot t = new TimeSlot(codigo, dia, duracao, custo, estado, horaInic, horaFim, controller.obtemModalidadeBySigla(codRef2)); 
            controller.obterListaRecintos().get(codRef1).oberCalendario().add(t);

             boolean s = Utils.confirma("Pretende cancelamento gratuito???? (S/N) ");
             
                if(s){
                    controller.obterListaRecintos().get(codRef1).oberCalendario().getTimeSlots().get(controller.obterListaRecintos().get(codRef1).oberCalendario().getTimeSlots().size()-1).setCusto(custo*1.10);
                     System.out.println("Foi aplicado o cancelamento gratuito, custo " + custo);
                }
                else{
                    System.out.println("Nao foi aplicado o cancelamento gratuito, custo " + custo);
             }
           


    }
    

 
}
