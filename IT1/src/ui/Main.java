/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import model.Calendario1;
import model.Cliente;
import model.Espaco;
import model.EspacoAquatico;
import model.EspacoNaoAquatico;
import model.Modalidade;
import model.PlataformaGED;
import model.Recinto;
import model.TimeSlot;
import utils.Data; 
public class Main
{
    public static void main(String[] args)
    {
        try
        {   // Construção da ged
            PlataformaGED ged = new PlataformaGED("GestEspaçosDesportivos");
            
            carregarPlataforma(ged);

            MenuInicial_UI uiMenu = new MenuInicial_UI(ged);

            uiMenu.run();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }


    /*Para Teste */

    private static void carregarPlataforma(PlataformaGED ged) {





        Modalidade m1 = new Modalidade("Futebol", "Futebol", 11, 100);
        Modalidade m2 = new Modalidade("Basquetebol", "Basquetebol", 10, 80);
        Modalidade m3 = new Modalidade("Voleibol", "Voleibol", 12, 90);
        Modalidade m4 = new Modalidade("Andebol", "Andebol", 7, 70);
        Modalidade m5 = new Modalidade("Ténis", "Ténis", 2, 50);
        Modalidade m6 = new Modalidade("Padel", "Padel", 4, 60);
        Modalidade m7 = new Modalidade("Natação",   "Natação",  20,  40);
        Modalidade m8 = new Modalidade("Ginástica", "Ginástica", 30,  30);
        Modalidade m9 = new Modalidade("Atletismo", "Atletismo", 40,  20);
        Modalidade m10 = new Modalidade("Ciclismo", "Ciclismo", 50,  10);
        List<Modalidade> modalidades = new ArrayList<>();
        modalidades.add(m1);
        modalidades.add(m2);
        modalidades.add(m3);    
        modalidades.add(m4);
        modalidades.add(m5);
        modalidades.add(m6);
        modalidades.add(m7);
        modalidades.add(m8);
        modalidades.add(m9);
        modalidades.add(m10);
        ged.setModalidades(modalidades);

    // Criar e adicionar clientes
    Cliente c1 = new Cliente("João", "Rua 1", "dwadawd",new Data(1990, 1, 1), "123456789", "123456789");
    Cliente c2 = new Cliente("Maria", "Rua 2", "dwadawd",new Data(1990, 1, 1), "123456789", "123456789");
    Cliente c3 = new Cliente("Manuel", "Rua 3", "dwadawd",new Data(1990, 1, 1), "123456789", "123456789");
    

    ged.adicionarCliente(c1);
    ged.adicionarCliente(c2);
    ged.adicionarCliente(c3);

    // Criar e adicionar TimeSlots
    TimeSlot ts1 = new TimeSlot(1,3 ,22,33,44,55,66,m1);
    TimeSlot ts2 = new TimeSlot(2,4 ,22,33,44,55,66,m2);
    TimeSlot ts3 = new TimeSlot(3,5 ,22,33,44,55,66,m3);
    TimeSlot ts4 = new TimeSlot(4,6 ,22,33,44,55,66,m4);
    TimeSlot ts5 = new TimeSlot(5,7 ,22,33,44,55,66,m5);
    TimeSlot ts6 = new TimeSlot(6,8 ,22,33,44,55,66,m6);
    TimeSlot ts7 = new TimeSlot(7,9 ,22,33,44,55,66,m7);
    TimeSlot ts8 = new TimeSlot(8,10 ,22,33,44,55,66,m8);
    TimeSlot ts9 = new TimeSlot(9,11 ,22,33,44,55,66,m9);
    TimeSlot ts10 = new TimeSlot(10,12 ,22,33,44,55,66,m10);
    TimeSlot ts11 = new TimeSlot(11,13 ,22,33,44,55,66,m1);
    TimeSlot ts12 = new TimeSlot(12,14 ,22,33,44,55,66,m2);
    

    //criar e adicionar Espacos
    
    EspacoAquatico ea1 = new EspacoAquatico(true,1,2,3);
    EspacoAquatico ea2 = new EspacoAquatico(true,1,2,3);
    EspacoAquatico ea3 = new EspacoAquatico(true,1,2,3);
    EspacoAquatico ea4 = new EspacoAquatico(true,1,2,3);
    

    //criar e adicionar EspacosNaoAquatios
    EspacoNaoAquatico ena1 = new EspacoNaoAquatico(true,"Piso 1");
    EspacoNaoAquatico ena2 = new EspacoNaoAquatico(true,"Piso 2");
    EspacoNaoAquatico ena3 = new EspacoNaoAquatico(true,"Piso 3");
    EspacoNaoAquatico ena4 = new EspacoNaoAquatico(true,"Piso 4");



            //criar e adicionar Calendarios

    List<TimeSlot> lstts1 = new ArrayList<>();
    List<Modalidade> lstm1 = new ArrayList<>();
    lstm1.add(m1);
    lstm1.add(m2);
    lstm1.add(m3);
    lstts1.add(ts1);
    lstts1.add(ts2);
    lstts1.add(ts3);
    List<TimeSlot> lstts2 = new ArrayList<>();
    List<Modalidade> lstm2 = new ArrayList<>();
    lstts2.add(ts4);
    lstts2.add(ts5);
    lstts2.add(ts6);
    lstm2.add(m4);
    lstm2.add(m5);
    lstm2.add(m6);

    List<TimeSlot> lstts3 = new ArrayList<>();
    List<Modalidade> lstm3 = new ArrayList<>();
    lstts3.add(ts7);
    lstts3.add(ts8);
    lstts3.add(ts9);
    lstm3.add(m7);
    lstm3.add(m8);
    lstm3.add(m9);


    List<TimeSlot> lstts4 = new ArrayList<>();
    List<Modalidade> lstm4 = new ArrayList<>();
    lstts4.add(ts10);
    lstts4.add(ts11);
    lstts4.add(ts12);
    lstm4.add(m10);
    lstm4.add(m1);
    lstm4.add(m2);


    Calendario1 cal1 = new Calendario1(lstts1);

    Calendario1 cal2 = new Calendario1(lstts2);
    Calendario1 cal3 = new Calendario1(lstts3);
    Calendario1 cal4 = new Calendario1(lstts4);
    



    // Criar e adicionar recintos

    Recinto r1 = new Recinto(1, "Rua 1", "123456789", "100x100", ea1,cal1,lstm1);
    Recinto r2 = new Recinto(2, "Rua 2", "123456789", "100x100", ea2,cal2,lstm2);
    Recinto r3 = new Recinto(3, "Rua 3", "123456789", "100x100", ea3,cal3,lstm3);
    Recinto r4 = new Recinto(4, "Rua 4", "123456789", "100x100", ea4,cal4,lstm4);

    ged.adicionarRecinto(r1);
    ged.adicionarRecinto(r2);
    ged.adicionarRecinto(r3);
    ged.adicionarRecinto(r4);










        return ;
    }   
    
}


