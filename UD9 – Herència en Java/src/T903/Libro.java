package T903;

public class Libro {
	
	protected String isbn;
	protected String titulo;
	protected String autor;
	protected int npaginas;

	
//	GETTERS Y SETTERS -----------------------------------------------------------------------------------------------
	
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * @return the npaginas
	 */
	public int getNpaginas() {
		return npaginas;
	}
	/**
	 * @param npaginas the npaginas to set
	 */
	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}
	
	
// TOSTRING-----------------------------------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "El libro "+titulo+" con isbn:" + isbn + " creado por el autor: "+autor+" tiene "+npaginas+" paginas";
	}

	
	
// CONSTRUCTORES------------------------------------------------------------------------------------------------------
	
	public Libro(String isbn, String titulo, String autor, int npaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
	}

	
}
