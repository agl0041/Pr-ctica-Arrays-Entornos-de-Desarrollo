package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class TestmaximaNota 
{
	static int[] notasValidas; 
	static int[] notasNoValidas; 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		notasValidas = new int[5];
		notasValidas[0] = 1;
		notasValidas[1] = 2;
		notasValidas[2] = 3;
		notasValidas[3] = 4;
		notasValidas[4] = 5;
		
		notasNoValidas = new int[5];
		notasNoValidas[0] = 11;
		notasNoValidas[1] = 2;
		notasNoValidas[2] = -3;
		notasNoValidas[3] = 4;
		notasNoValidas[4] = 5;
		
	}
	
	@Test
	void testMaximaNota_NotasValidas()
	{
		int maxima = MisArrays.maximaNota(notasValidas);
        assertEquals(5, maxima); 	
	}
	
	@Test
	void test2MaximaNota_NotasValidas()
	{
		notasValidas[0] = 6;
		notasValidas[1] = 7;
		notasValidas[2] = 8;
		notasValidas[3] = 9;
		notasValidas[4] = 10;
		
		int maxima = MisArrays.maximaNota(notasValidas);
        assertEquals(10, maxima); 	
	}
	
	@Test
	void test3MaximaNota_NotasValidas()
	{
		notasValidas[0] = 0;
		notasValidas[1] = 0;
		notasValidas[2] = 0;
		notasValidas[3] = 0;
		notasValidas[4] = 0;
		
		int maxima = MisArrays.maximaNota(notasValidas);
        assertEquals(0, maxima); 	
	}
	
	@Test
	void testMaximaNota_NotasNoValidas()
	{
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.maximaNota(notasNoValidas); 
		});
	}
	
	@Test
	void test2MaximaNota_NotasNoValidas()
	{
		notasNoValidas[0] = -11;
		notasNoValidas[1] = -2;
		notasNoValidas[2] = 100;
		notasNoValidas[3] = -3454;
		notasNoValidas[4] = 5;
				
		assertThrows(IllegalArgumentException.class, () -> 
		{
			MisArrays.maximaNota(notasNoValidas); 
		});
	}
}
