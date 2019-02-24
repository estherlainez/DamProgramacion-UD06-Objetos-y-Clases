package Ejercicio2_Libros;

public class Libros {
	String isbn;
	String titulo;
	String autor;
	int num_pag;
	
	public Libros (String t) {	
		titulo=t;
		autor="";
		isbn="0000";
		num_pag=100;
	}	
	
	public Libros(String i,String t,String a,int n) {
		isbn=i;
		titulo=t;
		autor=a;
		num_pag=n;
	}
	
	//metodos get
	public String getIsbn() {
		return this.isbn; 
	}
	public String getTitulo() {
		return this.titulo; 
	}
	public String getAutor() {
		return this.autor; 
	}
	public int getNum_pag() {
		return this.num_pag; 
	}
	
	//metodos set
	public void  setIsbn(String i){
		this.isbn=i;
	}
	public void setTitulo(String t) {
		this.titulo=t;
	}
	public void setAutor(String a) {
		this.autor=a;
	}
	public void setNum_pag(int n) {
		this.num_pag=n;
	}
	
public String toString () {
		
		System.out.println("\nTitulo: "+titulo+"\nAutor: "+autor+"\nIsbn: "+isbn
				+"\nNumero de páginas: "+num_pag);
		return"\nTitulo: "+titulo+"\nAutor: "+autor+"\nIsbn: "+isbn
				+"\nNumero de páginas: "+num_pag;
	}
}
