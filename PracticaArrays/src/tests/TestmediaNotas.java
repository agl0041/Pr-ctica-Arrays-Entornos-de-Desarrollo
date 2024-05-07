//ALVARO GARCIA LAMUDA
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestmediaNotas 
{
	static int[] notasValidas; 
	static int[] notasNoValidas; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		notasValidas = new int[5];
		notasValidas[0] = 5;
		notasValidas[1] = 5;
		notasValidas[2] = 5;
		notasValidas[3] = 5;
		notasValidas[4] = 5;
		
		notasNoValidas = new int[5];
		notasNoValidas[0] = 11;
		notasNoValidas[1] = 2;
		notasNoValidas[2] = -3;
		notasNoValidas[3] = 4;
		notasNoValidas[4] = 5;
		
	}

	@Test
    void testMediaNotas_NotasValidas() 
    {
        float media = MisArrays.mediaNotas(notasValidas);
        assertEquals(5, media); 
    }
	
	@Test
	void testMediaNotas_NotasNoValidas()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.mediaNotas(notasNoValidas); 
		});
	}
}
