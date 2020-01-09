
public class Auto extends Vehiculo implements IMostrarDatos
{
	protected int puertas;
	
	public Auto(int puertas, String modelo, Marca marca, double precio)
	{
		super(modelo, marca, precio);
		this.puertas=puertas;
	}
	
	//@Override
	public String MostrarDatos()
	{
		StringBuilder cadena = new StringBuilder();
		cadena.append("Marca: "+this.marca);
		cadena.append(" // Modelo: "+this.modelo);
		cadena.append(" // Puertas: "+this.puertas);
		cadena.append(" // Precio: $"+this.precio);	
		return cadena.toString();
	}
}
