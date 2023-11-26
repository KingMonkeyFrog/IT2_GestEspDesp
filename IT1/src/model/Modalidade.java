/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Dulce Mota <mdm@isep.ipp.pt>
 */
public class Modalidade
{   
    private String sigla;
    private String design;
    private int nrParticipantes;
    private int preco;
   
  
    
    
    private static final String STRING_POR_OMISSAO = "a definir";
    private static final int INT_POR_OMISSAO = 0;
    
    public Modalidade()
    {
        this.setSiglaModalidade(STRING_POR_OMISSAO);
        this.setDesign(STRING_POR_OMISSAO);
        this.setNrParticipantes(INT_POR_OMISSAO);
        this.preco = INT_POR_OMISSAO;
        
    }
    public Modalidade(String sigla, String design, int nrParticipantes)
    {
        this.setSiglaModalidade(sigla);
        this.setDesign(design);
        this.setNrParticipantes(nrParticipantes);
        this.preco = INT_POR_OMISSAO;
    }
    public Modalidade(String sigla, String design, int nrParticipantes,int preco)
    {
        this.setSiglaModalidade(sigla);
        this.setDesign(design);
        this.setNrParticipantes(nrParticipantes);
        this.preco = preco;
    }
    public final void setSiglaModalidade(String sigla)
    {
        this.sigla = sigla;
    }
    public final void setDesign(String design)
    {
        this.design = design;
    }
    public final void setNrParticipantes(int nrParticipantes)
    {
        this.nrParticipantes = nrParticipantes;
    }
   
    public String getSiglaModalidade() {
        return sigla;
    }
    // Validação local   
    public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Sigla da modalidade: "+sigla+"\n");
        sb.append("Designação: "+design+"\n");
        sb.append("Número de participantes: "+nrParticipantes+"\n");
        return sb.toString();
    }
      public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }



}
