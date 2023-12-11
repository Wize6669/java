package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double nota;

	public Nota(Materia materia, double nota) {
		this.materia = materia;
		this.nota = nota;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void mostrar() {
		System.out.print("Nota [ ");
		System.out.print("Materia= " + materia.getNombre() + ", ");
		System.out.print("Nota= " + nota + " ] ");
	}
}