import java.util.Random;
public class Dado {
    private int face; // face do dado sendo 1, 2, 3, 4, 5 e 6
    public Dado(){
        this.setNumero(1);
    }
    public int getNumero() {
        return face;
    }
    public void setNumero(int numero) {
        if(numero > 0 && numero < 7){
            this.face = numero;
        }else{
            this.face = 1;
        }
    }
    public void JogarDado(){
        Random gerador = new Random();
        this.setNumero(gerador.nextInt(6)+1);
    }
}