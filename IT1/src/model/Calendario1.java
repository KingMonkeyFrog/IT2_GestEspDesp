
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.Data;

/**
 *
 * @Rodrigo Soares
 */
public class Calendario1
{
    Recinto recinto;
    List<TimeSlot> timeSlots;
   
    public Calendario1(Recinto recinto){
        this.recinto = recinto;
        this.timeSlots = new ArrayList<>();
    }


    public Recinto getRecinto() {
        return recinto;
    }

    /**
     * Obtém os slots de tempo do calendário.
     * 
     * @return Uma lista com os slots de tempo do calendário
     */
    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }
    
    /**
     * Regista as disponibilidades do médico.
     * 
     * @parurn Um boolean com o resultado da operação
     */
    public boolean registaHorasCalendario(int codigo, int dia, int duracao, int custo, int estado, int horaInic, int horaFim, Modalidade modalidade) {
        TimeSlot timeSlot = new TimeSlot(codigo, dia, duracao, custo, estado, horaInic, horaFim, modalidade);
        return timeSlots.add(timeSlot);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (TimeSlot t : timeSlots) {
            sb.append(t.toString());
            sb.append("\n");
        }
        return sb.toString();
    }


    public List<TimeSlot> obterListaCalendario() {
        return timeSlots;
    }

   


    public void add(TimeSlot t) {
        timeSlots.add(t);
    }}
