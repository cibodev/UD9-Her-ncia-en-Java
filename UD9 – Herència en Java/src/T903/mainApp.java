/**
 * 
 */
package T903;

import javax.swing.JOptionPane;

/**
 * @author Christian Rivas Pottier
 *
 * 10 feb. 2021
 */
public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Libro libro1;
		Libro libro2;
		
		libro1= new Libro("2723459934","Ultra Heaven Tomo 1", "Keiichi Koike", 180);
		libro2= new Libro("2344012400","Akira Edicion Grande Tomo 1", "Katsuhiro Otomo", 362);
		
		if(libro1.getNpaginas()>libro2.getNpaginas()) {
			JOptionPane.showMessageDialog(null, "Los libros:\n"+libro1.toString()+"\n"+libro2.toString()+"\n\nY "+libro1.getTitulo()+" tiene mas paginas");
		}else {
			JOptionPane.showMessageDialog(null, "Los libros:\n"+libro1.toString()+"\n"+libro2.toString()+"\n\nY "+libro2.getTitulo()+" tiene mas paginas");
		}
	
	}

}
