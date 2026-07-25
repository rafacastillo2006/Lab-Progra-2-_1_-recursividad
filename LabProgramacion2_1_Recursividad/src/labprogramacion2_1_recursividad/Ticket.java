
package labprogramacion2_1_recursividad;

public class Ticket {
    
    String nombre;
    double montoPago;
    double precioTicket;
    boolean esPalindromo;                
    
    public Ticket(String nombre, double precioTicket) {
        this.nombre = nombre;
        this.precioTicket = precioTicket;
        this.esPalindromo = palindromo.esPalindromo(nombre);
    
        if (this.esPalindromo) {
            this.montoPago = precioTicket * 0.80;
        } else {
            this.montoPago = precioTicket;
        }
    }
    
    public String getName(){
        
        return nombre;
    }
    
    public double getFinalAmount(){
        return montoPago;
    }
    
    public double getOriginalAmount(){
        return precioTicket;
    }
    
    public boolean isPalindrome() {
        return esPalindromo;
    }
    
    public String imprimirInformacion(){
        String agregarDescuento = esPalindromo? "Si, usted recibe un 20%":"No";
        return "Pasajero: " + nombre + " | Monto Inicial: " + precioTicket + " | Monto Final: " + montoPago + " | ¿Es palíndromo?: " + agregarDescuento;
    }
    
}
