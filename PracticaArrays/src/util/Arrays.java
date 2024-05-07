//ALVARO GARCIA LAMUDA
package util;

import java.io.*;

public abstract class Arrays 
{
    public float mediaNotas (int numeros[]) throws Exception
    {
        float media = 0;
        float contador = 0;
        
        try
        {
            for (int i = 0; i < numeros.length; i++)
            {
                if (numeros[i] < 0 || numeros[i] > 10)
                    throw new IOException();
  
                else
                {
                    media += numeros[i];
                    contador ++;
                }
            }  
        }
        
        catch (IOException e)
        {
            System.out.println("ERROR: el número tiene que estar entre 0 y 10");
        }
        
        return media/contador;
				
    }

    	
    
    
}
