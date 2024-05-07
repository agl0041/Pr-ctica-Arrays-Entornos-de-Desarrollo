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
        int media = (int) MisArrays.mediaNotas(notasValidas);
        assertEquals(5, media); 
    }
	
	@Test
    void test2MediaNotas_NotasValidas() 
    {
		notasValidas = new int[10];
		notasValidas[0] = 1;
		notasValidas[1] = 2;
		notasValidas[2] = 3;
		notasValidas[3] = 4;
		notasValidas[4] = 5;
		notasValidas[5] = 6;
		notasValidas[6] = 7;
		notasValidas[7] = 8;
		notasValidas[8] = 9;
		notasValidas[9] = 10;
		
        float media = MisArrays.mediaNotas(notasValidas);
        assertEquals(5.5, media); 
    }
	
	@Test
	void testMediaNotas_NotasNoValidas()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.mediaNotas(notasNoValidas); 
		});
	}
	
	@Test
	void test2MediaNotas_NotasNoValidas()
	{
		notasNoValidas[0] = -11;
		notasNoValidas[1] = -2;
		notasNoValidas[2] = 100;
		notasNoValidas[3] = -3454;
		notasNoValidas[4] = 5;
		
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.mediaNotas(notasNoValidas); 
		});
	}
}
