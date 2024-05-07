package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestminimaNota 
{
	static int[] notas1;
	static int[] notasValidas; 
	static int[] notasNoValidas; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		notas1 = new int[5];
		notas1[0] = 1;
		notas1[1] = 2;
		notas1[2] = 3;
		notas1[3] = 4;
		notas1[4] = 5;
		
		notasValidas = new int[5];
			
		notasNoValidas = new int[5];
		notasNoValidas[0] = 11;
		notasNoValidas[1] = 2;
		notasNoValidas[2] = -3;
		notasNoValidas[3] = 4;
		notasNoValidas[4] = 5;
		
	}
	
	@Test
	void testMinimaNota_NotasValidas()
	{
		int minima = MisArrays.minimaNota(notas1);
        assertEquals(1, minima); 	
	}
	
	@Test
	void test2MinimaNota_NotasValidas()
	{
		notasValidas[0] = 6;
		notasValidas[1] = 7;
		notasValidas[2] = 8;
		notasValidas[3] = 9;
		notasValidas[4] = 10;
		
		int minima = MisArrays.minimaNota(notasValidas);
        assertEquals(6, minima); 	
	}
	
	@Test
	void test3MinimaNota_NotasValidas()
	{
		notasValidas[0] = 0;
		notasValidas[1] = 0;
		notasValidas[2] = 0;
		notasValidas[3] = 0;
		notasValidas[4] = 0;
		
		int minima = MisArrays.minimaNota(notasValidas);
        assertEquals(0, minima); 	
	}
	
	@Test
	void testMinimaNota_NotasNoValidas()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.minimaNota(notasNoValidas); 
		});
	}
	
	@Test
	void test2MaximaNota_NotasNoValidas()
	{
		notasNoValidas[0] = (-11);
		notasNoValidas[1] = -2;
		notasNoValidas[2] = 100;
		notasNoValidas[3] = -3454;
		notasNoValidas[4] = 5;
				
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.minimaNota(notasNoValidas); 
		});
	}

}
