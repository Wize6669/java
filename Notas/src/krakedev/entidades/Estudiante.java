package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Nota> notas = new ArrayList<Nota>();

	public Estudiante(String cedula, String nombre, String apellido) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public boolean validarValorNota(double notaVerificar) {
		if (notaVerificar >= 0 && notaVerificar <= 10) {
			return true;
		} else {
			return false;
		}
	}

	public void agregarNota(Nota notaNueva) {

		if (validarValorNota(notaNueva.getNota())) {
			if (notas.isEmpty()) {
				notas.add(notaNueva);
			} else {
				boolean materiaRepetida = false;
				for (Nota elemento : notas) {
					if (elemento.getMateria().getCodigo().equals(notaNueva.getMateria().getCodigo())) {
						System.out.println("La materia es repetida");
						materiaRepetida = true;
						break;
					}
				}
				if (!materiaRepetida) {
					notas.add(notaNueva);
				}
			}
		} else {
			System.out.println("Nota invalida");
		}

	}

	public void modificarNota(String codigoMateria, double nuevaNota) {

		boolean existeMateria = false;
		if (validarValorNota(nuevaNota)) {
			for (Nota elemento : notas) {
				if (elemento.getMateria().getCodigo().equals(codigoMateria)) {
					elemento.setNota(nuevaNota);
					existeMateria = false;
				} else {
					existeMateria = true;
				}
			}
		}

		if (existeMateria) {
			System.out.println("El código de la materia no existe.");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double promedio = 0;
		for (Nota elemento : notas) {
			promedio += elemento.getNota();
		}
		return promedio / notas.size();
	}

	public void mostrar() {
		int i = 1;
		System.out.print("Información Estudiante [ ");
		System.out.print("Nombre: " + nombre + " " + apellido + ", ");
		System.out.print("Cedula: " + cedula);
		for (Nota elemento : notas) {
			elemento.mostrar();
			// System.out.print(", Nota"+ i + ": " + elemento.getNota());
			i++;
		}
		System.out.print("]");
	}

}