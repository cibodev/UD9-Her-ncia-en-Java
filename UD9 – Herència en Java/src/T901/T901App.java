/**
 * 
 */
package T901;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier
 *
 * 9 feb. 2021
 */
public class T901App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Electrodomestico[] electrodomestico = new Electrodomestico[10];
		
		electrodomestico[0]= new Lavadora();
		electrodomestico[1]= new Television();
		electrodomestico[2]= new Electrodomestico(200, "Amarillo", 'G', 20);
		electrodomestico[3]= new Electrodomestico();
		electrodomestico[4]= new Electrodomestico(30, 100);
		electrodomestico[5]= new Lavadora(40, 200);
		electrodomestico[6]= new Lavadora(50);
		electrodomestico[7]= new Television(50, 250);
		electrodomestico[8]= new Television(40, true);
		electrodomestico[9]= new Electrodomestico(200, "Rojo", 'F', 20);
		
		double precioFinalElectrodomesticos = 0;
		double precioFinalTelevisiones= 0;
		double precioFinalLavadoras= 0;
		
		for (int i = 0; i < electrodomestico.length; i++) {
			if(electrodomestico[i] instanceof Electrodomestico) {
				precioFinalElectrodomesticos+=electrodomestico[i].precioFinal();
			}
			if(electrodomestico[i] instanceof Television) {
				precioFinalTelevisiones+=electrodomestico[i].precioFinal();
			}
			if(electrodomestico[i] instanceof Lavadora) {
				precioFinalLavadoras+=electrodomestico[i].precioFinal();
			}
		}
		
		JOptionPane.showMessageDialog(null, "Los precios son los siguientes:"
											+ "\nElectrodomesticos: "+precioFinalElectrodomesticos
											+ "\nTelevisiones: "+precioFinalTelevisiones
											+ "\nLavadora: "+precioFinalLavadoras);
	}

}
