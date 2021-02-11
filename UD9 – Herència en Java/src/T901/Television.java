/**
 * 
 */
package T901;

/**
 * @author Christian Rivas Pottier
 *
 * 9 feb. 2021
 */
public class Television extends Electrodomestico {
	private double resolucion;
	private boolean tdt;
	
	public final double DFT_RES=20;
	public final boolean DFT_TDT=false;
	
	public Television() {
		this.resolucion=DFT_RES;
		this.tdt=DFT_TDT;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion=DFT_RES;
		this.tdt=DFT_TDT;
	}

	public Television(double resolucion, boolean tdt) {
	}

	/**
	 * @return the resolucion
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * @return the tdt
	 */
	public boolean isTdt() {
		return tdt;
	}
	
	public double precioFinal() {
		double precioFinal=super.precioFinal();
		if (this.tdt) {
			precioFinal+=50;
		}
		if (this.resolucion>=40) {
			precioFinal=precioFinal*1.3;
		}
		return precioFinal;
	}
	
	
}
