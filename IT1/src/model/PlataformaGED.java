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
    
    
    public PlataformaGED(String nome)
    {
        this.setNome(nome);
        this.lstModalidades = new ArrayList<>();
        this.lstEspacos = new ArrayList<>();
        this.lstProprietarios= new ArrayList<>();
        this.lstCampanhas= new ArrayList<>();
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
       

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome da empresa: "+nome+"\n");
        sb.append("Lista das modalidades: "+lstModalidades.toString()+"\n");
        return sb.toString();
    }
}
    
    
