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
        	if (numeros[i] < 0 || numeros[i] > 10)
        		throw new IllegalArgumentException("ERROR: el número tiene que estar entre 0 y 10");
  
            else
            {
            	media += numeros[i];
                contador ++;
            }
        }  
        
        return (media/contador);			
    }    
}
