
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Arbol arbol=new Arbol();
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(12);
        arbol.insertar(6);
        arbol.insertar(20);
        arbol.insertar(2);
        
        System.out.println("Recorrido del arbol Inorden");
        arbol.inorden();
        

	}

}
