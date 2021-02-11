/**
 * 
 */
package T901;

/**
 * @author Christian Rivas Pottier
 *
 * 9 feb. 2021
 */
public class Lavadora extends Electrodomestico {
	private double carga;
	
	static final double DFT_CARGA=5;

	public Lavadora() {
		this.carga = DFT_CARGA;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga=DFT_CARGA;
	}
	
	public Lavadora(double carga) {
	}

	
	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}
	
	public double precioFinal() {
		return (this.carga>30)?super.precioFinal()+50:super.precioFinal();
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
}
