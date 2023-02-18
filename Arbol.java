
public class Arbol {
	
	private Nodo raiz;
	  
    public void inorden() {
      this.inorden(this.raiz);
  }
    
    //Metodo insertar
    public void insertar(int dato) {
      if (this.raiz == null) { // Si la raiz no tiene dato
          this.raiz = new Nodo(dato); //Se le asigna el valor
      } else {
          this.insertar(this.raiz, dato); //Si la raiz ya tiene dato se comprueba en el otro constructor si es mayor o menor
      }
  }
  
    //Sobrecarga de metodo insertar
    /*Si hay un dato a la izquierda o derecha de la raiz, se comprueba de manera recursiva
     * si es mayor o menor para poder insertarlo
     * 
     */
    private void insertar(Nodo padre, int dato) {
      if (dato > padre.getDato()) { 
          if (padre.getDerecha() == null) {
              padre.setDerecha(new Nodo(dato));
          } else {
              this.insertar(padre.getDerecha(), dato);
          }
      } else {
          if (padre.getIzquierda() == null) {
              padre.setIzquierda(new Nodo(dato));
          } else {
              this.insertar(padre.getIzquierda(), dato);
          }
      }
  }
    //Recorrido inorden (izquierda, raiz, derecha)
    public void inorden(Nodo n) {
      if (n != null) {
          inorden(n.getIzquierda());
          n.imprimirDato();
          inorden(n.getDerecha());
      }
  }

}
