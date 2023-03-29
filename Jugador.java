import java.util.ArrayList;
import java.util.Scanner;

class Jugador {
    private ArrayList<Carta> mano;
    private int id;
    private Carta cartaLanzada;
    private int puntuacion;
    private Dado dado;

    public Jugador(int id) {
        this.mano = null;
        this.cartaLanzada = null;
        this.id = id;
        dado=new Dado(5,1);//los dados de los jugadores deben tener 5 caras en el juego
    } 

    public Jugador(int id, ArrayList<Carta> mano) {
        this.mano = mano;
        this.cartaLanzada = null;
        this.id = id;
    }

    /*
     lo hice de una manera en que el jugador elige que carta jugar, nuevo escanner
    */
    public Carta lanzarUnaCarta() {
        Scanner sc=new Scanner(System.in);
         int posicionDeLaCarta;
        int cantidadDeCartasEnMano = mano.size();
        if (cantidadDeCartasEnMano == 0) {
            return null;
        }
        do{
        System.out.print("Jugador "+id+", cual carta lanzara:");
        posicionDeLaCarta = sc.nextInt()-1;
          if(posicionDeLaCarta>cantidadDeCartasEnMano-1)System.out.println("ERROR: NO EXISTE ESA CARTA EN TU MANO");
          }while(posicionDeLaCarta>cantidadDeCartasEnMano-1);//para representar correctamente que valores son disponibles
        this.cartaLanzada = mano.remove(posicionDeLaCarta);
        return cartaLanzada;
    }

    public Carta getCartaLanzada() {
        return this.cartaLanzada;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public ArrayList<Carta> getMano() {
        return this.mano;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }
    /**
     * Este metodo es para determinar cuantas mas cartas tendra el jugador por el dado
     * @return 
     */
    public int ExtraCartasPorDado()
    {
    dado.girarDado();
        System.out.println("Para Jugador "+(id)+" Cartas Por Dado: "+dado.getCaraVisible());
    return dado.getCaraVisible();
    
    }
    
}