package model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class TimeSlot {

private int codigo, dia, duracao, custo, estado, horaInic, horaFim;
private Modalidade modalidade;


public TimeSlot(int codigo, int dia, int duracao, int custo, int estado, int horaInic, int horaFim, Modalidade modalidade) {
this.codigo = codigo;
this.dia = dia;
this.duracao = duracao;
this.custo = custo;
this.estado = estado;
this.horaInic = horaInic;
this.horaFim = horaFim;
this.modalidade = modalidade;  
        
    }

public TimeSlot() {
this.modalidade = new Modalidade();
this.codigo = 0;
this.dia = 0;
this.duracao = 0;
this.custo = 0;
this.estado = 0;
this.horaInic = 0;
this.horaFim = 0;
}

@Override
    public String toString() {
        return "TimeSlot{" + "codigo=" + codigo + ", dia=" + dia + ", duracao=" + duracao + ", custo=" + custo + ", estado=" + estado + ", horaInic=" + horaInic + ", horaFim=" + horaFim + ", modalidade=" + modalidade + '}';
    }

public void setCusto(double d) {
    this.custo=(int) d;
}
}
