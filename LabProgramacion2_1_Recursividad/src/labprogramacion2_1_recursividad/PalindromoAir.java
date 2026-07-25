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
        
        
    }
}