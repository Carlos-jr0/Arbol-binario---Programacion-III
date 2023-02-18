
public class Nodo {
	
	    private int dato; //Tiene un dato
	    private Nodo izquierda, derecha; //Nodo izquierdo y derecho

	    public Nodo(int dato) {
	        this.dato = dato; //dato igual a dato
	        this.izquierda = this.derecha = null; //nodo izquierdo y derecho se inicializan en null
	    }

	    //Getter y setter
	    public int getDato() {
	        return dato;
	    }

	    public Nodo getIzquierda() {
	        return izquierda;
	    }

	    public void setIzquierda(Nodo izquierda) {
	        this.izquierda = izquierda;
	    }

	    public Nodo getDerecha() {
	        return derecha;
	    }

	    public void setDerecha(Nodo derecha) {
	        this.derecha = derecha;
	    }

	    public void imprimirDato() {
	        System.out.println(this.getDato());
	    }
	    

}
