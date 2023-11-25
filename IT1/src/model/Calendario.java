/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Rodrigo Soares
 */
public class Calendario {

    /**
     * Médico responsável pelo calendário.
     */
    private Recinto recinto;
    
    /**
     * Slots de tempo do calendário.
     */
    private List<TimeSlot> timeSlots;
    
    /**
     * Constrói um calendário, dado um médico.
     * 
     * @param medico médico responsável pelo calendário
     */
    public Calendario(Recinto recinto){
        this.recinto = recinto;
        timeSlots = new ArrayList<>();
    }

    /**
     * Obtém o médico responsável pelo calendário.
     * 
     * @return O médico responsável pelo calenddário
     */
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
    public boolean registaHorasCalend(Recinto recinto,int dia, Data dataInic, Data dataFim){
        TimeSlot timeSlot = new TimeSlot(recinto,dia, dataInic, dataFim);
        if (timeSlot.valida() && validaGlobal(timeSlot)){
            timeSlots.add(timeSlot);
            Collections.sort(timeSlots);
            
            return true;
            
        }
        
        return false;
    }
    
    /**
     * Valida os horários do timeslot para ver se são compatíveis com os que já existem.
     * 
     * @param timeSlot timeslot a ser verificado
     * @return Um boolean com o resultado da operação
     */
    public boolean validaGlobal(TimeSlot timeSlot){ //verifica se os horarios do timeslot sao compativeis com os ja presentes
        for (int i = 0; i < timeSlots.size(); i++) {
            if (timeSlots.get(i).getDia()==timeSlot.getDia()) {
                if (timeSlots.get(i).getHoraFim()<timeSlot.getHoraInic()) {
                    if (i==timeSlots.size()) {
                        return true;
                    }else if(timeSlots.get(i+1).getDia()==timeSlot.getDia()){
                        if (timeSlots.get(i+1).getHoraInic()>timeSlot.getHoraFim()) {
                            return true;
                        }
                    }
                }
            }else if(timeSlot.getDia()>timeSlots.get(i).getDia()){
                return true;
            }
        }
        return false;
    }
    

    /**
     * Obtém as vagas livres do calendário do médico.
     * 
     * @return Uma string com as vagas livres do calendário do médico
     */
    public String vagasToString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<timeSlots.size(); i++){
            if (!timeSlots.get(i).isEstado()){ //estado falso = vaga
                sb.append(timeSlots.get(i).toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    /**
     * Obtém as marcações do horário do médico.
     * 
     * @return Uma string com as marcações do horário do médico
     */
    public String marcacoesToString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<timeSlots.size(); i++){
            if (timeSlots.get(i).isEstado()){ //estado true = marcado
                sb.append(timeSlots.get(i).toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    /**
     * Obtém o calendário do médico.
     * 
     * @return Uma string com o calendário completo do médico
     */
    public String calendarioToString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<timeSlots.size(); i++){
            sb.append(timeSlots.get(i).toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    @Override
    /**
     * Adiciona um espaço após os dados.
     */
    public String toString(){
        return " ";
    }
}
