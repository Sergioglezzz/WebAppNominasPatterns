package com.model;

import com.exceptions.DatosNoCorrectosException;

public class Empleado extends Persona {

	private int categoria;
	public int anyos;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String dni, char sexo, int categoria, int anyos) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);

		if (categoria < 1 || categoria > 10) {
			throw new DatosNoCorrectosException("Categoría incorrecta, tiene que ser entre 1 y 10");
		} else {
			this.categoria = categoria;
		}

		if (anyos < 0) {
			throw new DatosNoCorrectosException("Los años no pueden ser negativos");
		} else {
			this.anyos = anyos;
		}

	}

	public Empleado(String nombre, String dni, char sexo) throws DatosNoCorrectosException {
		super(nombre, dni, sexo);
		this.categoria = 1;
		if (categoria < 1 || categoria > 10) {
			throw new DatosNoCorrectosException("Categoría incorrecta, tiene que ser entre 1 y 10");
		}

		this.anyos = 0;
		if (anyos < 0) {
			throw new DatosNoCorrectosException("Los años no pueden ser negativos");
		}
	}

	public void setCategoria(int nuevaCategoria) {
		this.categoria = nuevaCategoria;
	}

	public int getCategoria() {
		return this.categoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDni() {
		return this.dni;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	public int getAnyos() {
		return this.anyos;
	}

	public void incrAnyo() {
		this.anyos++;
	}

	// Imprime los datos del empleado
	public void imprime() {
		super.imprime(); // imprime datos de la clase Persona
		System.out.println(super.sexo + ", " + categoria + ", " + anyos);
	}

}
