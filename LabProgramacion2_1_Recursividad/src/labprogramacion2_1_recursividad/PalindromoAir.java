package labprogramacion2_1_recursividad;

public class PalindromoAir {

    private Ticket[] asientos;
    private static final double Precio_Base = 100;
    
    public PalindromoAir(){
        this.asientos = new Ticket [30];
    }
    
    public int firstAvailable(int indice){
        if (indice >= asientos.length){
            return -1;
        }
        if (asientos[indice] == null){
            
                    return indice;
        }
        return firstAvailable(indice + 1);
    }
        
        public int searchPassenger(String nombre, int indice){
            
           if (indice >= asientos.length){
               return -1;
           }
           
           if (asientos[indice] != null && asientos[indice].getName().equalsIgnoreCase(nombre)){
             return indice;
           }
           return searchPassenger(nombre, indice +1);
        }
        
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
        
        public String printPassengers(int indice){
        if(indice == asientos.length){
            return "";
        }
        if(asientos[indice] == null){
            return printPassengers(indice + 1);
        }
        
        return "Asiento" + (indice + 1) + "\n" + asientos[indice].imprimirInformacion() + "\n\n" + printPassengers(indice + 1);
    }
    
    public double income(int indice){
        if (indice == asientos.length){
            return 0;
        }
        
        if(asientos[indice] == null){
            return income(indice+1);
        }
        
        return asientos[indice].getFinalAmount() + income(indice + 1);
    }
    
    public void reset(int indice){
        if (indice == asientos.length){
            return;
        }
        
        asientos[indice] = null;
    }
        
        
    }