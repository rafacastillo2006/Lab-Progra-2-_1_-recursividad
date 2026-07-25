
package labprogramacion2_1_recursividad;


public class palindromo {
    
    
    public String sellTicket(String nombre){
        int asiento = firstAvailable(0);
        boolean palindromo = esPalindromo(nombre);
        
        if(asiento == -1){
            return "No has asientos disponibles en este momento, vuelva pronto";  
        }
        
        asientos[asiento] = new Ticket(nombre, Precio_Base, palindromo);
        
        return "Ticket vendido.\n" + "Asiento: " + (asiento + 1) + "\n Monto pagado: L." + asientos[asiento].getFinalAmount();
    }
    
    public static void cancelTicket(String nombre){
        
    }
    
    public static void dispatch(){
        
    }
    
    
}
    
