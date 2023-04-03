import java.util.Random;
/**
 * Clase para modelar dados
 * Clase nueva para decidir cuantas cartas mas tendra el jugador
 * @author (ACR)
 * @version (1)
 */
public class Dado
{
    private int numeroDeCaras;
    private int caraVisible;
    //constructor
    public Dado()
    {
    numeroDeCaras=6;// para dado normal
    caraVisible=1;
    }
    
    //constructor parametrizado
    public Dado(int numeroDeCaras,int caraVisible)
    {
    this.numeroDeCaras=numeroDeCaras;
    this.caraVisible=caraVisible;
    }
    
    //setters
    public void setNumeroDeCaras(int numeroDeCaras)
    {
    this.numeroDeCaras=numeroDeCaras;    
    }
    public void setCaraVisible(int caraVisible)
    {
    this.caraVisible=caraVisible;    
    }
    //getters
    public int getNumeroDeCaras()
    {
    return numeroDeCaras;    
    }
    public int getCaraVisible()
    {
    return caraVisible;    
    }
    //otros metodos...
    public void girarDado()
    {
    Random rmd=new Random();
    caraVisible=rmd.nextInt(numeroDeCaras)+1;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
    return  "Numero De Caras:"+numeroDeCaras+" Cara Mostrada:"+caraVisible;   
    }
}
