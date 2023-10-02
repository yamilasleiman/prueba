package ar.edu.unlam.pb2.empresa;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaPermanenteTest {
	/*
	 * 
	 * Un empleado de Planta permanente (que no es gerente) con 80 horas trabajadas,
	 * 2 hijos, esposa y 6 años de antiguedad. (251.00)
	 */
	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaPermanente() {
		Integer horasTrabajadas = 80;
		Integer cantidadHijos = 2;
		Boolean estaCasado = true;
		Integer antiguedad = 6;
		Double esperado = 251_000.0;
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

	/*
	 * • Un empleado de Planta Permanente (que no sea gerente) con 160 horas
	 * trabajadas, sin esposa, sin hijos y con 4 años de antigüedad. (484.000)
	 */
	public void queSePuedaCrearUnEmpleadoDePlantaPermanenteNoGerente() {
		Integer horasTrabajadas = 160;
		Integer cantidadHijos = 0;
		Boolean estaCasado = false;
		Integer antiguedad = 4;
		Double esperado = 484_000.0;
		PlantaPermanente natan = new PlantaPermanente(horasTrabajadas, cantidadHijos, estaCasado, antiguedad);
		Double obtenido = natan.getSueldo();
		assertEquals(esperado, obtenido);
	}

}
