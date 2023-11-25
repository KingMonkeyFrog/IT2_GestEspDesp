package model;


public class EspacoNaoAquatico extends Espaco {
    private String tipoDePiso;

    public EspacoNaoAquatico(boolean cobertura, String tipoDePiso) {
        super(cobertura);
        this.tipoDePiso = tipoDePiso;
    }

    public EspacoNaoAquatico() {
        super(false);
        this.tipoDePiso = "";
    }

    public String getTipoDePiso() {
        return tipoDePiso;
    }

    public void setTipoDePiso(String tipoDePiso) {
        this.tipoDePiso = tipoDePiso;
    }
    
        public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }
    
    @Override
public String toString() {
    return "EspacoAquatico{" +
             super.toString() +
            ", TipoPiso=" + tipoDePiso +
            '}';
}
 
}