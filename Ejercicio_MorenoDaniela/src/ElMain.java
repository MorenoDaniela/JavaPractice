import java.util.Arrays;
import java.util.Collections;

public class ElMain
{

	public static void main(String[] args) 
	{
		Concesionaria concesionaria = new Concesionaria("Center");
		concesionaria.MockVehiculos();
		concesionaria.MostrarDatos();
		System.out.println("\n");
		concesionaria.MasCaro(concesionaria);
		concesionaria.MasBarato(concesionaria);
		concesionaria.ContainsY(concesionaria);
		System.out.println("\n");
		Collections.sort(concesionaria.lista);
		concesionaria.Mostrar();
		
	
	}

}
