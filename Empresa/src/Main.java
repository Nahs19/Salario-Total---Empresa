
public class Main {
    
	public static void main(String[] args) {
		
		Empleado ofc1 = new Oficionistas ("1", 500);
		Empleado ofc2 = new Oficionistas ("2", 500);
		
		Empleado spt1 = new SuperTec ("3", 1000, 2);
		Empleado spt2 = new SuperTec ("4", 1000, 2);
		
		Empleado gr1 = new Gerente ("5", 2000, 2, 1000);
		
		System.out.println(ofc1.getSalario());
		System.out.println(ofc2.getSalario());
		
		System.out.println(spt1.getSalario());
		System.out.println(spt2.getSalario());
        
		System.out.println(gr1.getSalario());
		
		Empresa empresa = new Empresa();
		empresa.contratar(ofc1);
		empresa.contratar(ofc2);
		empresa.contratar(spt1);
		empresa.contratar(spt2);
		empresa.contratar(gr1);
		
		System.out.println(empresa.TotalEmpleados());
		System.out.println(empresa.diaDePago());
	}
    
}
