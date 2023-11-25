package model;


public class EspacoAquatico extends Espaco {
    private int temperatura;
    private int profundidadeMinima;
    private int profundidadeMaxima;
   
    private static final int INT_POR_OMISSAO = 0;

    public EspacoAquatico(boolean cobertura, int temperatura, int profundidadeMinima, int profundidadeMaxima) {
        super(cobertura);
        this.temperatura = temperatura;
        this.profundidadeMinima = profundidadeMinima;
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public EspacoAquatico() {
        super(false);
        this.temperatura = INT_POR_OMISSAO;
        this.profundidadeMinima = INT_POR_OMISSAO;
        this.profundidadeMaxima = INT_POR_OMISSAO;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getProfundidadeMinima() {
        return profundidadeMinima;
    }

    public void setProfundidadeMinima(int profundidadeMinima) {
        this.profundidadeMinima = profundidadeMinima;
    }

    public int getProfundidadeMaxima() {
        return profundidadeMaxima;
    }

    public void setProfundidadeMaxima(int profundidadeMaxima) {
        this.profundidadeMaxima = profundidadeMaxima;
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
            ", temperatura=" + temperatura +
            ", profundidadeMinima=" + profundidadeMinima +
            ", profundidadeMaxima=" + profundidadeMaxima +
            '}';
}
    
}