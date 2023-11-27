package model;

import java.util.ArrayList;
import java.util.List;

public class Recinto {
    private int codigo;
    private String endereco;
    private String contacto;
    private String dimensao;
    private Espaco espaco;
    private List<Modalidade> modalidades;
    private Calendario1 calendario;

    public Recinto(int codigo, String endereco, String contacto, String dimensao, Espaco espaco) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.contacto = contacto;
        this.dimensao = dimensao;
        this.espaco= espaco;
        this.modalidades = new ArrayList<>();
        this.calendario = new Calendario1();

        
        
    }
     public Recinto(int codigo, String endereco, String contacto, String dimensao, Espaco espaco, Calendario1 calendario) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.contacto = contacto;
        this.dimensao = dimensao;
        this.espaco= espaco;
        this.modalidades = new ArrayList<>();
        this.calendario = calendario;

        
        
    }
    public Recinto(int codigo, String endereco, String contacto, String dimensao, Espaco espaco, Calendario1 calendario,List<Modalidade> modalidades) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.contacto = contacto;
        this.dimensao = dimensao;
        this.espaco= espaco;
        this.modalidades = modalidades;
        this.calendario = calendario;

        
        
    }
    
        public Recinto() {
        this.codigo = 0;
        this.endereco = "";
        this.contacto = "";
        this.dimensao = "";
        this.espaco = null;
        this.modalidades = new ArrayList<>();
        this.calendario = new Calendario1();
    }
        

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espacos) {
        this.espaco = espacos;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }



    public void adicionarModalidade(Modalidade modalidade) {
        modalidades.add(modalidade);
    }

    public void removerModalidade(Modalidade modalidade) {
        modalidades.remove(modalidade);
    }
    
        public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }
        
        

    @Override
    public String toString() {
        return "Recinto{" +
                "codigo=" + codigo +
                ", endereco='" + endereco + '\'' +
                ", contacto='" + contacto + '\'' +
                ", dimensao='" + dimensao + '\'' +
                ", espaco=" + espaco +
                ", modalidades=" + modalidades +
                '}';
    }

    public String obterListaModalidadeDoRecinto() {
        StringBuilder sb = new StringBuilder();
        for (Modalidade m : modalidades) {
            sb.append(m.toString());
        }
        return sb.toString();
    }

    public Modalidade obterModalidadeByID(String i) {
        for (Modalidade m : modalidades) {
            if (m.getSiglaModalidade() == i) {
                return m;
            }
        }
        return null;
        
}
    public String obterListaCalendario() {
        return this.calendario.toString();
    }
    public void adicionarTimeSlot(int codigo, int dia, int duracao, int custo, int estado, int horaInic, int horaFim, Modalidade modalidade) {
                this.calendario.registaHorasCalendario(codigo, dia, duracao, custo, estado, horaInic, horaFim, modalidade);
    }
    public boolean containsModalidade(String sigla) {
        for(Modalidade m : modalidades){
            if(m.getSiglaModalidade().equals(sigla)){
                return true;
            }
        }
        return false;
    }
    public Calendario1 oberCalendario() {
        return this.calendario;
    }
    public List<TimeSlot> getListaTimeSlots() {
        return this.calendario.getTimeSlots();
    }
}