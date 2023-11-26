/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class PlataformaGED
{
    private String nome;
    private final List<Modalidade> lstModalidades;
    private final List<Espaco> lstEspacos;
    private final List<Proprietario> lstProprietarios;
    private final List<Campanha> lstCampanhas;
    private final List<Recinto> lstRecintos;
    private final List<Cliente> lstClientes;
    
    
    public PlataformaGED(String nome)
    {
        this.setNome(nome);
        this.lstModalidades = new ArrayList<>();
        this.lstEspacos = new ArrayList<>();
        this.lstProprietarios= new ArrayList<>();
        this.lstCampanhas= new ArrayList<>();
        this.lstRecintos= new ArrayList<>();
        this.lstClientes= new ArrayList<>();
            }
    
    public final void setNome(String nome)
    {
        this.nome = nome;
    }
    public Modalidade novaModalidade()
    {
        return new Modalidade();
        
    }
    public EspacoAquatico novoEspacoAquatico()
    {
        return new EspacoAquatico();
    }
    
    public EspacoNaoAquatico novoEspacoNaoAquatico()
    {
        return new EspacoNaoAquatico();
    }
        
    
    
    public boolean registaModalidade(Modalidade modalidade)
    {
        if (this.valida(modalidade))
        {
           adicionaModalidade(modalidade);
           return true;
        }
        return false;
    }
        
    private void adicionaModalidade(Modalidade modalidade){
        lstModalidades.add(modalidade);
    }
    
        public boolean valida(Modalidade modalidade)
    {
        boolean resp = false;
        if (modalidade.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }
    
    
    public boolean registaEspacoAquatico(EspacoAquatico ea)
    {
        if (this.valida(ea))
        {
           adicionaEspacoAquatico(ea);
           return true;
        }
        return false;
    }
        
    private void adicionaEspacoAquatico(EspacoAquatico ea){
        lstEspacos.add(ea);
    }
    
        public boolean valida(EspacoAquatico ea)
    {
        boolean resp = false;
        if (ea.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }
        
        public boolean registaEspacoNaoAquatico(EspacoNaoAquatico ena)
    {
        if (this.valida(ena))
        {
           adicionaEspacoNaoAquatico(ena);
           return true;
        }
        return false;
    }
        
    private void adicionaEspacoNaoAquatico(EspacoNaoAquatico ena){
        lstEspacos.add(ena);
    }
    
        public boolean valida(EspacoNaoAquatico ena)
    {
        boolean resp = false;
        if (ena.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }
        
        public Proprietario novoProprietario()
    {
        return new Proprietario();
        
    }
        
        public boolean registaProprietario(Proprietario p)
    {
        if (this.valida(p))
        {
           adicionaProprietario(p);
           return true;
        }
        return false;
    }
        
    private void adicionaProprietario(Proprietario p){
        lstProprietarios.add(p);
    }
    
        public boolean valida(Proprietario p)
    {
        boolean resp = false;
        if (p.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }
        
        
        public Campanha novaCampanha()
    {
        return new Campanha();
        
    }
        
        public boolean registaCampanha(Campanha c)
    {
        if (this.valida(c))
        {
           adicionaCampanha(c);
           return true;
        }
        return false;
    }
        
    private void adicionaCampanha(Campanha c){
        lstCampanhas.add(c);
    }
    
        public boolean valida(Campanha c)
    {
        boolean resp = false;
        if (c.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }

    public String obterListaProprietariosAsString() {
        return this.lstProprietarios.toString();
    }
        
        
        
        
        
        public Espaco novoEspaco()
    {
            return new Espaco() {};
        
    }
        
        public boolean registaEspaco(Espaco e)
    {
        if (this.valida(e))
        {
           adicionaEspaco(e);
           return true;
        }
        return false;
    }
        
    private void adicionaEspaco(Espaco e){
        lstEspacos.add(e);
    }
    
        public boolean valida(Espaco e)
    {
        boolean resp = false;
        if (e.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }
       

        public Recinto novoRecinto()
    {
            return new Recinto() {};
        
    }
        
        public boolean registarRecinto(Recinto r)
    {
        if (this.valida(r))
        {
           adicionarRecinto(r);
           return true;
        }
        return false;
    }
        
    private void adicionarRecinto(Recinto r){
        lstRecintos.add(r);
    }
    
        public boolean valida(Recinto r)
    {
        boolean resp = false;
        if (r.valida())
        {
           // Escrever aqui o código de validação
        
           //
           resp = true; 
        }
        return resp;
    }

    public Cliente novoCliente() {
        return new Cliente() {};
    }
    
    public boolean registarCliente(Cliente c) {
        if (this.valida(c)) {
            adicionarCliente(c);
            return true;
        }
        return false;
    }
    
    private void adicionarCliente(Cliente c) {
        lstClientes.add(c);
    }
    
    public boolean valida(Cliente c) {
        boolean resp = false;
        if (c.valida()) {
            // Escrever aqui o código de validação
    
            //
            resp = true; 
        }
        return resp;
    }








    

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da empresa: "+nome+"\n");
        sb.append("Lista das modalidades: "+lstModalidades.toString()+"\n");
        return sb.toString();
    }

    public Proprietario obterProprietarioByID(int codRef) {
        return lstProprietarios.get(codRef);
    }

    public Modalidade obterModalidadeByID(int codRef) {
        return lstModalidades.get(codRef);
    }

    public String obterModalidesAsString() {
        return lstModalidades.toString();
    }

    public List<Recinto> obterListaRecintos() {
        return lstRecintos;
    }

        public List<Proprietario> obterListaProprietarios() {
        return lstProprietarios;
    }


        public Recinto obterRecintoBySiglaModalidade(String sigla) {
            List<Recinto> newRecintos = obterListaRecintos();
            for(Recinto r : lstRecintos){
                if(r.containsModalidade(sigla)){
                    newRecintos.add(r);
                }
            
            }   

            return null;
        }

        public List<Cliente> getListaClientes() {
            return lstClientes;
        }

        public Recinto obterRecintoByID(int codRef1) {
            return lstRecintos.get(codRef1);
        }

        public Modalidade obterModalidadeBySigla(String codRef2) {
            for(Modalidade m  : lstModalidades){
                if(m.getSiglaModalidade().equals(codRef2)){
                    return m;
                }
                
            }
            return null;
        }

        public List<Modalidade> getModalidades() {
            return lstModalidades;
        }

        public List<Recinto> obterRecintosBySiglaModalidade(String sigla) {
            List<Recinto> recintosM = obterListaRecintos();
            List<Recinto> newRecintos = new ArrayList<>();
            for(Recinto r : recintosM){
                if(r.containsModalidade(sigla)){
                    newRecintos.add(r);
                }

            }   

            return newRecintos;
        }


        public List<TimeSlot> obterReservasByEstado(int e) {
            List<TimeSlot> timeSlots = new ArrayList<>();
            for(Recinto r : lstRecintos){
                for(TimeSlot t : r.getListaTimeSlots()){
                    if(t.getEstado() == e){
                        timeSlots.add(t);
                    }
                }
            }
            return timeSlots;

            
        }

        public List<TimeSlot> obterTotalReservas(int i, int o) {
            List<TimeSlot> ts = new ArrayList<>();
            for(Recinto r : lstRecintos){
                for(TimeSlot t : r.getListaTimeSlots()){
                    if(t.isInDate(i, o)){
                        ts.add(t);
                    }
                }
            }	
            return ts;
        }
        

}


    
    
