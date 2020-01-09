
public abstract class Vehiculo implements Comparable<Vehiculo>
{
	protected String modelo;
	protected Marca marca;
	protected double precio;
	
	protected Vehiculo(String modelo, Marca marca, double precio)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	

	public enum Marca
	{
		Peugeot,
		Yamaha,
		Honda
	}
	
	public double GetPrecio()
	{
		return this.precio;
	}
	public String Mostrar()
	{
		StringBuilder cadena = new StringBuilder();
		cadena.append(" "+this.marca);
		cadena.append(" "+this.modelo);
		return cadena.toString();
	}
	
	@Override
	public int compareTo(Vehiculo v)
	{
		int retorno = 0;
		if (precio < v.precio)
		{
			retorno = 1;
		}else if (precio > v.precio)
		{
			retorno = -1;
		}
		return retorno;
	}
	/*
	protected String MostrarDatos()
	{
		StringBuilder cadena = new StringBuilder();
		cadena.append("{0}"+this.marca);
		cadena.append("{0} "+this.modelo);
		cadena.append("{0} "+this.precio);
		return cadena.toString();
	}*/
	
}
