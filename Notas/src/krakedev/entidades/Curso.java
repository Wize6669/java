package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public Curso() {
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public void mostrar() {
		System.out.print("Curso [ ");
		int i = 1;
		for (Estudiante estudiante : estudiantes) {
			System.out
					.print(" Estudiante" + i + " = " + estudiante.getNombre() + " " + estudiante.getApellido() + ", ");
			i++;
		}
		System.out.print(" ] ");
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {

		String aux = null;
		for (Estudiante elemento : estudiantes) {
			if (elemento.getCedula().equals(estudiante.getApellido())) {
				aux = "El estudiante si esta en el curso";
			}
		}
		return aux;
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		if (buscarEstudiantePorCedula(estudiante) == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		double promedio = 0;
		for (Estudiante estudiante : estudiantes) {
			promedio += estudiante.calcularPromedioNotasEstudiante();
		}

		return promedio / estudiantes.size();
	}
}