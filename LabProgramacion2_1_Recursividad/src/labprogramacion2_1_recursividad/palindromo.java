
package labprogramacion2_1_recursividad;


public class palindromo {
    
    private boolean esPalindromo(String nombre, int prim, int seg){
        if(prim<seg){
            if(nombre.charAt(prim)== nombre.charAt(seg)){
               return esPalindromo(nombre, prim+1, seg-1); 
        }
            return false;
    }
        return true;
  }
    
    public boolean esPalindromo(String nombre){
        nombre = nombre.toLowerCase().replace(" ", "");
        return esPalindromo(nombre, 0, nombre.length() - 1);
    }
    
    
    public int firstAvailable(int index){
        if(index = asientos.length){
            return -1;
        }
        if(asientos[index] == null){
            return index;
        }
        return firstAvailable(index + 1);
    }
    
    public int searchPasenger(String nombre, int index){
        
    }
    
    public void printPassengers(int index){
        
    }
    
    public double income(int index){
        
    }
    
    public void reset(int index){
        
    }
    
    public void sellTicket(String nombre){
        
    }
    
    public static void cancelTicket(String nombre){
        
    }
    
    public static void dispatch(){
        
    }
    
    
}
    
