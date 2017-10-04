package pdf2ejer3;

/**
 *
 * @author Gonzalo
 */
public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int anio;
    
    //Metodos
    public void prestamo(){}
    public void devolucion(){}
    
    //toString    
    
    //Constructores
    //Por defecto
    public Libro() {
    }
    //Con parametros
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    
    //Setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
  //Metodo toString

    @Override
    public String toString() {
        return "Libro :"+getTitulo()+"\n"+"Autor :"+getAutor()+"\n"+"Año: "+getAnio();
    }

}
