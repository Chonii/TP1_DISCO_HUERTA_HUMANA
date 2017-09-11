package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testContructorVacio() 
	{
		Disco miDisco = new Disco();
		assertEquals(301.59, miDisco.getSuperficie(), 0.01);
	}
	@Test
	public void testContructorCambiandoRadios()
	{
		Disco miDisco = new Disco(1.8, 11.5);
		assertEquals(405.29, miDisco.getSuperficie(), 0.01);
	}
}