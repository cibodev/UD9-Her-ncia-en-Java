/**
 * 
 */
package T901;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author Christian Rivas Pottier
 *
 * 9 feb. 2021
 */
public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	private static final double DFT_PB=100;
	private static final String DFT_COLOR="blanco";
	private static final char DFT_CE='F';
	private static final double DFT_PESO=5;
	
	public Electrodomestico() {
		this(DFT_PB,DFT_COLOR,DFT_CE,DFT_PESO);
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color=DFT_COLOR;
		this.consumoEnergetico=DFT_CE;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the consumoEnergetico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	
	public char comprobarConsumoEnergetico(char letra) {
		return (letra>64 && letra<71)?letra:DFT_CE;	 
	}
	
	public String comprobarColor(String color){
		switch (color.toLowerCase()) {
		case "rojo":
			break;
		case "negro":
			break;
		case "azul":
			break;
		case "gris":
			break;

		default: color=DFT_COLOR;
			break;
		}
		return color;
	}
	public double precioFinal (){
		Hashtable<Character, Integer> letraPrecio= new Hashtable();
		letraPrecio.put('A', 100);
		letraPrecio.put('B', 80);
		letraPrecio.put('C', 60);
		letraPrecio.put('D', 50);
		letraPrecio.put('E', 30);
		letraPrecio.put('F', 10);
		
		LinkedHashMap<Integer, Integer> tamanoPrecio= new LinkedHashMap();
		tamanoPrecio.put(80, 100);
		tamanoPrecio.put(50, 80);
		tamanoPrecio.put(20, 50);
		tamanoPrecio.put(0, 10);
		
		double precio=letraPrecio.get(this.consumoEnergetico);
		Iterator<Integer> it=tamanoPrecio.keySet().iterator();
		boolean exit = false;
		
		while(it.hasNext() && !exit) {
			Integer key = it.next();
			if(this.peso >= key) {
				precio+=tamanoPrecio.get(key);
				exit =true;
			}
		}
		
		return precio + this.precioBase;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
}
