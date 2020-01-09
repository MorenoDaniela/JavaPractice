//import Vehiculo.Marca;

public class Moto extends Vehiculo implements IMostrarDatos
{
	protected String cilindrada;
	
	public Moto(String cilindrada, String modelo, Marca marca, double precio)
	{
		super(modelo, marca, precio);
		this.cilindrada=cilindrada;	
	}
	
	public String MostrarDatos()
	{
		StringBuilder cadena = new StringBuilder();
		cadena.append("Marca: "+this.marca);
		cadena.append(" // Modelo: "+this.modelo);
		cadena.append(" // Cilindrada: "+this.cilindrada);
		cadena.append(" // Precio $"+this.precio);
		return cadena.toString();
	}
}
