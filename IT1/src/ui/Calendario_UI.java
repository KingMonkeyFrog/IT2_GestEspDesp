package ui;

import controller.Calendario_Controller;
import controller.Recinto_Controller;
import java.util.ArrayList;
import java.util.List;


import model.Espaco;
import model.Modalidade;
import model.PlataformaGED;
import model.Proprietario;
import model.Recinto;
import utils.Utils;

/**
 *
 * @author Rodrigo Soares
 */
public class Calendario_UI {
    
    private PlataformaGED ged;
    private Calendario_Controller controller;

    public Calendario_UI(PlataformaGED ged)
    {
        this.ged = ged;
        controller = new Calendario_Controller(ged);
    }
    

    
        public void run()
    {   
        System.out.println(obterListaRecinto());
        int codRef = Utils.IntFromConsole("Qual o codigo do Recinto: ");
        Recinto r =ged.obterListaRecintos().get(codRef);
        System.out.println(r.obterListaCalendario());
        while (Utils.readLineFromConsole("Deseja adicionar um novo TimeSlot? (S/N)").equalsIgnoreCase("S"))
        {
            int dia = Utils.IntFromConsole("Qual o dia do TimeSlot? (1-31)");
            int mes = Utils.IntFromConsole("Qual o mes do TimeSlot? (1-12)");
            int ano = Utils.IntFromConsole("Qual o ano do TimeSlot? (2017-2020)");
            int horaInic = Utils.IntFromConsole("Qual a hora de inicio do TimeSlot? (0-23)");
            int horaFim = Utils.IntFromConsole("Qual a hora de fim do TimeSlot? (0-23)");
            int minInic = Utils.IntFromConsole("Qual o minuto de inicio do TimeSlot? (0-59)");
            int minFim = Utils.IntFromConsole("Qual o minuto de fim do TimeSlot? (0-59)");
            int custo = Utils.IntFromConsole("Qual o custo do TimeSlot? (0-100)");
            int estado = Utils.IntFromConsole("Qual o estado do TimeSlot? (Livre/Ocupado)");
            System.out.println(r.obterListaModalidadeDoRecinto());
            Modalidade modalidade = r.obterModalidadeByID(Utils.readLineFromConsole("Qual o codigo da modalidade?"));
            r.adicionarTimeSlot(dia, mes, ano, horaInic, horaFim, minInic, minFim, modalidade);
            System.out.println(r.obterListaCalendario());
        }
        
        
         
        
    }
    
    private List<Recinto> obterListaRecinto() {
            return this.controller.obterListaRecintos();}
        }




 