
package labprogramacion2_1_recursividad;


public class palindromo {
    
    String nombre;
    
    public palindromo(String nombre){
        this.nombre = nombre;
    }
    
    private static boolean esPalindromo(String nombre, int prim, int seg){
        if(prim<seg){
            if(nombre.charAt(prim)== nombre.charAt(seg)){
               return esPalindromo(nombre, prim+1, seg-1); 
        }
            return false;
    }
        return true;
  }
    
    public static boolean esPalindromo(String nombre){
        return esPalindromo(nombre, 0, nombre.length());
    }
}
    
