package model;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {

    private int codigoUnico;
    private String nif;
    private String email;
    private String contacto;
    private String paginaWeb;
    List<Recinto> recintos = new ArrayList<>();

    private static final String STRING_POR_OMISSAO = "a definir";
    private static final int INT_POR_OMISSAO = 0;

    public Proprietario(int codigoUnico, String nif, String email, String contacto, String paginaWeb) {
        this.setCodigoUnico(codigoUnico);
        this.setNif(nif);
        this.setEmail(email);
        this.setContacto(contacto);
        this.setPaginaWeb(paginaWeb);
        this.recintos=new ArrayList<>();
    }

    public Proprietario() {
        this.codigoUnico = INT_POR_OMISSAO;
        this.nif = STRING_POR_OMISSAO;
        this.email = STRING_POR_OMISSAO;
        this.contacto = STRING_POR_OMISSAO;
        this.paginaWeb = STRING_POR_OMISSAO;
        this.recintos=null;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }


    public int getCodigoUnico() {
        return codigoUnico;
    }

    public String getNif() {
        return nif;
    }

    public String getEmail() {
        return email;
    }

    public String getContacto() {
        return contacto;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }
    
    
    
     public Recinto novoRecinto()
    {
        return new Recinto();
        
    }
    
            public boolean registaRecinto(Recinto r)
    {
        if (this.valida(r))
        {
           adicionaRecinto(r);
           return true;
        }
        return false;
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
            
    
     private void adicionaRecinto(Recinto r){
        recintos.add(r);
    }
     
    
        public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }


        
        
    @Override
    public String toString() {
        
        
    
    StringBuilder sb = new StringBuilder();
    for (Recinto r : recintos) {
        sb.append(r.toString()).append("\n");
    }    
        
        return  "Proprietario{" +
                "codigoUnico='" + codigoUnico + '\'' +
                ", nif='" + nif + '\'' +
                ", email='" + email + '\'' +
                ", contacto='" + contacto + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                '}' + sb.toString();
    }

    public void setRecinto(List<Recinto> vecR) {
        this.recintos=vecR;
    }

    public String obterListaRecintoDeProprietario() {
        return recintos.toString();
    }

    public Recinto obterRecintoByID(int codRef) {
        return recintos.get(codRef);
    }

  
}
