import java.util.ArrayList;
import java.util.Scanner;

public class CardShark {
    Baraja b;
    ArrayList<Jugador> jugadores;
    int cantidadDeJugadores;
    public CardShark(int cantJugadores){
        this.cantidadDeJugadores = cantJugadores;
    }

    public void inicia() {
        b = new Baraja();
        jugadores = new ArrayList<>();
        int barajas_a_agregar;
        for(int i=0; i < this.cantidadDeJugadores; i++) {
            jugadores.add(new Jugador(i+1));
        }
        barajas_a_agregar=cantidadDeJugadores/3;//determina cuantas barajas extras se haran
        for(int i=0;i<barajas_a_agregar;i++){
        b.agregarOtraBaraja();//los genera ciclicamente
        }
        b.barajar();
        reparteCartas();
        juega();
       
    }
    /**
     * ya no se presentan las cartas de los jugadores aqui
     */
    private void reparteCartas(){
        for(Jugador j : jugadores) {
            j.setMano(b.repartir(5+j.ExtraCartasPorDado()));
        }
        System.out.println();
    }

    /*
    cambie juega para que se acabe cuando sea la ronda 10
    */
    private void juega() {
         for(int i=0;i<10;i++)
         {
             System.out.println("--------------- RONDA "+(i+1)+" ---------------");
          for(Jugador j : jugadores){
          if(j.getMano().isEmpty()){
              j.setMano(b.repartir(j.ExtraCartasPorDado()));// dar mas cartas si vacio con dado
              System.out.println("pero -3 puntos");
              j.setPuntuacion(j.getPuntuacion()-3);// restar los 3 puntos
          }
          System.out.println("Jugador: " + j.getId()+": "+j.getMano()); 
          
          }
          jugarRonda();
         }
         publicaGanador();
         especificarGanadores();
    }
/**
 * los hice void, como ya no se ocupa determinar si seguir jugando por la falta de cartas
 */
    private void jugarRonda(){
      for(Jugador j : this.jugadores) {
          if(j.lanzarUnaCarta() == null)
          System.out.println(j.getCartaLanzada());  
      }
      comparaCartas();
    }

    private void comparaCartas() {
        Jugador ganador = null;
        int cartaMasAlta=0;
        boolean empate = false;
        boolean primerEmpate = true;
        ArrayList<Jugador> empatados = new ArrayList<>();
        for(int i=0; i< this.cantidadDeJugadores; i++) {
            if(jugadores.get(i).getCartaLanzada().getValor() > cartaMasAlta) {
                ganador = jugadores.get(i);
                cartaMasAlta = ganador.getCartaLanzada().getValor();
            } else if(jugadores.get(i).getCartaLanzada().getValor() == cartaMasAlta) {
                empate = true;
                if(primerEmpate==true){//si es la primera vez que se empato agrerar el ganador y despues el otro.
                    empatados.add(ganador);
                    primerEmpate=false;
                }
                empatados.add(jugadores.get(i));// si mas de 2 jugadores empataron, solo agregar el otro nuevo.
            }
            
        }
        if(empate && ganador.getCartaLanzada().getValor() == empatados.get(0).getCartaLanzada().getValor()){
              System.out.println("A desempate");
              desempatar(empatados);
        } else {
            System.out.println("Jugador con carta mas alta: " + ganador.getId());
            ganador.setPuntuacion(ganador.getPuntuacion()+2);
        }
        System.out.println();
    }

    private void desempatar(ArrayList<Jugador> js) {

        System.out.println("Empatados: ");
        int cartaMasAlta = 0;
        Jugador ganador = null;
        boolean empate=false;
        int valorDeEmpate = 0;

        for(Jugador j: js) {
            if(j.getMano().isEmpty()){
                j.setMano(b.repartir(j.ExtraCartasPorDado()));
                System.out.println("pero -3 puntos");
              j.setPuntuacion(j.getPuntuacion()-3);// restar los 3 puntos
            }// por si se acaba en empate
            System.out.println("Jugador: " + j.getId()+": "+j.getMano());
            Carta c = j.lanzarUnaCarta();
            System.out.println("J: "+j.getId()+" C: "+c);
            if(c.getValor() > cartaMasAlta) {
                cartaMasAlta = c.getValor();
                ganador = j;
            }else if (c.getValor()== cartaMasAlta) {
                empate = true;
                valorDeEmpate = cartaMasAlta;
            }
        }
        if(empate && valorDeEmpate==cartaMasAlta) {
            for(Jugador j : js) {
                if(j.getCartaLanzada().getValor() == valorDeEmpate) {
                    System.out.println("Jugador " + j.getId() + " 1 punto");
                    j.setPuntuacion(j.getPuntuacion()+1);
                }
            }
        }else{
                 System.out.println("Jugador " + ganador.getId() + " 2 puntos");
                 ganador.setPuntuacion(ganador.getPuntuacion()+2);
              }
    }
 
    private void publicaGanador() {
        System.out.println("Puntuaciones: ");
        for (Jugador j : jugadores) {
            System.out.println("Jugador: "+j.getId()+ " puntos: "+j.getPuntuacion());
        }
    }
    /**
     * main
     * @param args 
     */
    public static void main(String[] args) {
        int numeroDeJugadores;
        Scanner sc =new Scanner(System.in);
        System.out.print("De Cuantos jugadores sera: ");
        numeroDeJugadores=sc.nextInt();
        CardShark c = new CardShark(numeroDeJugadores);
        c.inicia();
    }
    /**
     * para buscar el ganador o ganadores si hubo un empate
     */
    private void especificarGanadores()
    {
        int puntajeMasAlto=0;
         for(Jugador j:jugadores)
        {
          if(j.getPuntuacion()>puntajeMasAlto)puntajeMasAlto=j.getPuntuacion();//buscar puntaje alto
         }
         System.out.println("GANADORES:");
          for(Jugador j:jugadores)
        {
          if(j.getPuntuacion()==puntajeMasAlto)System.out.println(j.getId());//presentar ganadores
         }
    }
}
