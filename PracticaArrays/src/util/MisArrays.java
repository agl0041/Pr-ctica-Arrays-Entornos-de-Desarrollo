//ALVARO GARCIA LAMUDA
package util;

public abstract class MisArrays 
{
    public static float mediaNotas (int numeros[]) throws IllegalArgumentException
    {
        float media = 0;
        float contador = 0;
        
        for (int i = 0; i < numeros.length; i++)
        {
        	System.out.println("Número " + (i+1) + ": " + numeros[i]);
        	
        	if (numeros[i] < 0 || numeros[i] > 10)
        		throw new IllegalArgumentException("ERROR: el número tiene que estar entre 0 y 10");
  
            else
            {
            	media += numeros[i];
                contador ++;
            }
        }  
        
        System.out.println("La media total es: " + (media/contador));
        System.out.println("");
        
        return (media/contador);			
    }
    
    public static int maximaNota (int numeros[]) throws IllegalArgumentException
    {
        int maximo = 0;
        
        for (int i = 0; i < numeros.length; i++)
        {
        	System.out.println("Número " + (i+1) + ": " + numeros[i]);
        	
        	if (numeros[i] < 0 || numeros[i] > 10)
        		throw new IllegalArgumentException("ERROR: el número tiene que estar entre 0 y 10");
  
            if (numeros[i] > maximo)
            	maximo = numeros[i];
        } 
        
        System.out.println("El número máximo es: " + maximo); 
        System.out.println("");
        
        return maximo;			
    }   
}
