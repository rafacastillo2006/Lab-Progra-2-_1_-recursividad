package labprogramacion2_1_recursividad;

public class PalindromoAir {

    private Ticket[] asientos;
    private static final double precioTicket = 100.0;

    public PalindromoAir() {
        this.asientos = new Ticket[30];
    }

    // --- MÉTODOS RECURSIVOS ---

    // 1. Busca el primer asiento disponible a partir de 'index'
    public int firstAvailable(int index) {
        if (index >= asientos.length) {
            return -1; // Avión lleno
        }
        if (asientos[index] == null) {
            return index; // Encontró asiento libre
        }
        return firstAvailable(index + 1);
    }

    // 2. Busca a un pasajero por su nombre recursivamente
    public int searchPassenger(String name, int index) {
        if (index >= asientos.length) {
            return -1; // No encontrado
        }
        if (asientos[index] != null && asientos[index].getName().equalsIgnoreCase(name)) {
            return index; // Encontrado en esta posición
        }
        return searchPassenger(name, index + 1);
    }

    // 3. Determina recursivamente si una cadena es un palíndromo
    public boolean isPalindromo(String name) {
        String clean = name.replaceAll("\\s+", "").toLowerCase();
        return checkPalindromeRecursive(clean, 0, clean.length() - 1);
    }

    private boolean checkPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(str, start + 1, end - 1);
    }

    // 4. Retorna el texto acumulado de todos los pasajeros vigentes
    public String printPassengers(int index) {
        if (index >= asientos.length) {
            return "";
        }
        String actual = "";
        if (asientos[index] != null) {
            actual = "Asiento #" + (index + 1) + " -> " + asientos[index].print() + "\n";
        }
        return actual + printPassengers(index + 1);
    }

    // 5. Calcula la suma total de ingresos recursivamente
    public double income(int index) {
        if (index >= asientos.length) {
            return 0.0;
        }
        double montoActual = (asientos[index] != null) ? asientos[index].getFinalAmount() : 0.0;
        return montoActual + income(index + 1);
    }

    // 6. Resetea todos los asientos poníendolos en null recursivamente
    public void reset(int index) {
        if (index >= asientos.length) {
            return;
        }
        asientos[index] = null;
        reset(index + 1);
    }

    // --- REGLAS DE NEGOCIO Y OPERACIONES ---

    public String sellTicket(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Error: Debe ingresar un nombre válido.";
        }

        if (searchPassenger(name, 0) != -1) {
            return "Error: El pasajero '" + name + "' ya posee un boleto.";
        }

        int indexLibre = firstAvailable(0);
        if (indexLibre == -1) {
            return "¡Error! No se puede vender el ticket: El avión está lleno.";
        }

        boolean esPal = isPalindromo(name);
        Ticket nuevoTicket = new Ticket(name, PRECIO_TICKET, esPal);
        asientos[indexLibre] = nuevoTicket;

        String mensaje = "Ticket vendido con éxito en Asiento #" + (indexLibre + 1) + ".\n"
                + "Monto a pagar: $" + nuevoTicket.getFinalAmount();

        if (esPal) {
            mensaje += " (¡Aplica 20% de descuento por nombre Palíndromo!)";
        }

        return mensaje;
    }

    public boolean cancelTicket(String name) {
        int index = searchPassenger(name, 0);
        if (index != -1) {
            asientos[index] = null; // Libera el asiento
            return true;
        }
        return false;
    }

    public double dispatch() {
        double totalIngresos = income(0);
        reset(0); // Reinicia los asientos a estado original (vacío)
        return totalIngresos;
    }

    // Getter útil para que MainApp consulte el arreglo y pinte los botones
    public Ticket[] getAsientos() {
        return asientos;
    }
}