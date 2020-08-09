
public class Gerente extends SuperTec {
	
	private double viaticos;

	public Gerente(String identificacion, double salario, int aniosTrabajo, double viaticos) {
		super(identificacion, salario, aniosTrabajo);
		this.viaticos = viaticos;
	}
	public double getSalario() {
		return super.getSalario() + viaticos;	
	}   
}


