import java.util.List;
import java.util.ArrayList;


public class Concesionaria 
{
	public String nombre;
	public List<Vehiculo> lista;
	
	public Concesionaria (String nombre)
	{
		this.lista = new ArrayList<>();
		this.nombre = nombre;
	}
	
	public boolean CargarVehiculo(Concesionaria con, Vehiculo vehi)
	{
		boolean retorno = false;
		if (con != null && vehi != null)
		{
			con.lista.add(vehi);
			retorno=true;
		}
		return retorno;
	}
	
	public void MockVehiculos()
	{
		Vehiculo a1 = new Auto(4,"206",Vehiculo.Marca.Peugeot,200000.00);
		Vehiculo m1 = new Moto("160c","YBR",Vehiculo.Marca.Yamaha,80500.50);
		Vehiculo a2 = new Auto(5,"208",Vehiculo.Marca.Peugeot,250000.00);
		Vehiculo m2 = new Moto("125c","Titan",Vehiculo.Marca.Honda,60000);
		
		CargarVehiculo(this,a1);
		CargarVehiculo(this,m1);
		CargarVehiculo(this,a2);
		CargarVehiculo(this,m2);
	}
	
	public void MasCaro(Concesionaria concesionaria)
	{
		double p=0;
		Vehiculo nuevo = null;
		for(Vehiculo vehiculo : concesionaria.lista)
		{
			if (vehiculo.precio > p)
			{
				p = vehiculo.precio;
				nuevo = vehiculo;
			}
		}
		System.out.println("Vehículo más caro: "+nuevo.Mostrar());
	}
	
	public void MasBarato(Concesionaria concesionaria)
	{
		double p=10000000;
		Vehiculo nuevo = null;
		for(Vehiculo vehiculo : concesionaria.lista)
		{
			if (vehiculo.precio < p)
			{
				p = vehiculo.precio;
				nuevo = vehiculo;
			}
		}
		System.out.println("Vehículo más barato: "+nuevo.Mostrar());
	}
	
	public void ContainsY(Concesionaria concesionaria)
	{
		for(Vehiculo vehiculo : concesionaria.lista)
		{
			
			for (char c : vehiculo.modelo.toCharArray())
			{
				if (c == 'Y')
				{
					if (vehiculo instanceof Auto)
					{
						Auto a = (Auto)vehiculo;
						System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+a.MostrarDatos());
						
						
					}else if (vehiculo instanceof Moto)
					{
						Moto m = (Moto)vehiculo;
						System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+m.MostrarDatos());
					}
				}
			}
		}
	}
	
	
	public void MostrarDatos()
	{
		for (Vehiculo vehiculo : this.lista)
		{
			if (vehiculo instanceof Auto)
			{
				Auto a = (Auto)vehiculo;
				System.out.println(""+a.MostrarDatos());
					
			}else if (vehiculo instanceof Moto)
			{
				Moto m = (Moto)vehiculo;
				System.out.println(""+m.MostrarDatos());
			}
		}
	}
	
	public void Mostrar()
	{
		System.out.println("Vehículos ordenados por precio de mayor a menor: ");
				
		for (Vehiculo vehiculo : this.lista)
		{
			System.out.println(""+vehiculo.Mostrar());
		}
	}
	
	
	
}
