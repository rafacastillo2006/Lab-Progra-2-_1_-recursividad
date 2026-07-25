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
        
        public int searchPassenger (String nombre, int indice){
            
           if (indice >= asientos.length){
               return -1;
           }
           
           if (asientos[indice] != null && asientos[indice].getName().equalsIgnoreCase(nombre)){
             
           }
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
        
        public String printPassengers(int index){
        if(index == asientos.length){
            return "";
        }
        if(asientos[index] == null){
            return printPassengers(index + 1);
        }
        
        return "Asiento" + (index + 1) + "\n" + asientos[index].imprimirInformacion() + "\n\n" + printPassengers(index + 1);
    }
    
    public double income(int index){
        if (index == asientos.length){
            return 0;
        }
        
        if(asientos[index] == null){
            return income(index+1);
        }
        
        return asientos[index].getFinalAmount() + income(index + 1);
    }
    
    public void reset(int index){
        if (index == asientos.length){
            return;
        }
        
        asientos[index] = null;
    }
    
    public String sellTicket(String nombre){
        int asiento = firstAvailable(0);
        boolean palindromo = esPalindromo(nombre);
        
        if(asiento == -1){
            return "No has asientos disponibles en este momento, vuelva pronto";  
        }
        
        asientos[asiento] = new Ticket(nombre, Precio_Base, palindromo);
        
        return "Ticket vendido.\n" + "Asiento: " + (asiento + 1) + "\n Monto pagado: L." + asientos[asiento].getFinalAmount();
    }
        
        
    }
}