/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import utils.Data;

/**
 *
 * @Rodrigo Soares
 */
public class Cliente
{
    /**
     * Nome completo do cliente.
     */
    private String nome;
    
    /**
     * Endereço do cliente.
     */
    private String endereco;
    
    /**
     * Endereço de email do cliente.
     */
    private String email;
    
    /**
     * NIF do cliente.
     */
    private String nif;
    
    /**
     * Nº de telefone do cliente.
     */
    private String contacto;
    
    /**
     * Data de nascimento do cliente.
     */
    private Data dataNasc;
    
    /**
     * Código do cliente.
     */
    private int cod;
    private static int cont = 1;
    
    
    private static final String STRING_POR_OMISSAO = "a definir";
    private static final int INT_POR_OMISSAO = 0;
    
    /**
     * Constrói um cliente sem dados.
     */
    public Cliente()
    {
        this.cod = cont;
        cont++;
        
        this.setNome(STRING_POR_OMISSAO);
        this.setEndereco(STRING_POR_OMISSAO);
        this.dataNasc = new Data();
        this.setEmail(STRING_POR_OMISSAO);
        this.setNif(STRING_POR_OMISSAO);
        this.setContacto(STRING_POR_OMISSAO);
    }
    
    /**
     * Constrói um cliente com os dados todos.
     * 
     * @param nomeComp nome completo do cliente
     * @param endereco morada do cliente
     * @param nif NIF do cliente
     * @param dataNasc data de nascimento do cliente
     * @param contacto nº de telefone do cliente
     * @param email endereço de email do cliente
     */
    public Cliente(String nome, String endereco, String nif, Data dataNasc, String contacto, String email)
    {
        this.cod = cont;
        cont++;
        
        this.setNome(nome);
        this.setEndereco(endereco);
        this.dataNasc = dataNasc;
        this.setEmail(email);
        this.setNif(nif);
        this.setContacto(contacto);
    }

    /**
     * Define o nome completo do cliente.
     * 
     * @param nomeComp nome completo do cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o Endereço do cliente.
     * 
     * @param endereco Endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Define o email do cliente.
     * 
     * @param email email do cliente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Define o NIF do cliente.
     * 
     * @param nif NIF do cliente
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Define o nº de telefone do cliente.
     * 
     * @param contacto nº de telefone do cliente
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Define a data de nascimento do cliente.
     * 
     * @param dataNasc2 data de nascimento do cliente.
     */
    public void setDataNasc(Data dataNasc2) {
        this.dataNasc = dataNasc2;}

    /**
     * Obtém o código do cliente.
     * 
     * @return Um int com o código do cliente
     */
    public int getCod() {
        return cod;
    }
    
    /**
     * Valida o cliente
     * 
     * @return Um boolean com o resultado da validação
     */
    public boolean valida()
    {
        char[] charsNome = nome.toCharArray();
        for(char c : charsNome){
            if(Character.isDigit(c)){
                System.out.println("Nome completo contém números.");
                return false;
            }
        }
        
        char[] charsNif = nif.toCharArray();
        for(char c : charsNif){
            if(!Character.isDigit(c)){
                System.out.println("NIF contém letras.");
                return false;
            }
        }
        
        char[] charsContacto = contacto.toCharArray();
        for(char c : charsContacto){
            if(!Character.isDigit(c)){
                System.out.println("Contacto contém letras.");
                return false;
            }
        }
        return true;
    }
    
    /**
     * Obtém os dados do cliente.
     * 
     * @return Uma string com os dados do cliente
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Nome Completo: "+nome+"\n");
        sb.append("Endereço: "+endereco+"\n");
        sb.append("NIF: "+nif+"\n");
        sb.append("Data de Nascimento: "+dataNasc+"\n");
        sb.append("Contacto: "+contacto+"\n");
        sb.append("Email: "+email+"\n");
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public String getNif() {
        return nif;
    }

    public String getContacto() {
        return contacto;
    }

    public static int getCont() {
        return cont;
    }

}

