


/**
 *
 * @author estuam
 */

    
    
    /**
 * Representa un paquete con código, destino, peso y estado de seguro.
 */
public class Paquete {
    String codigo;
    String destino;
    double peso;
    boolean asegurado;

    /**
     * Constructor completo (Etapa 2)
     */
    public Paquete(String codigo, String destino, double peso, boolean asegurado) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;
    }

    /**
     * Constructor que recibe código y destino. Delega en el completo (Etapa 3.1)
     */
    public Paquete(String codigo, String destino) {
        this(codigo, destino, 1.0, false);
    }

    /**
     * Constructor que recibe solo el código. Delega en el anterior (Etapa 3.2)
     */
    public Paquete(String codigo) {
        this(codigo, "Por asignar");
    }

    /**
     * Muestra la información básica del paquete (Etapa 2.2)
     */
    public void mostrarInformacion() {
        System.out.println(codigo + " -> " + destino + " | " + peso + " kg | asegurado: " + asegurado);
    }

    /**
     * Reto Parte C.3: Sobrecarga que imprime un encabezado y reutiliza la versión sin parámetros.
     */
    public void mostrarInformacion(String encabezado) {
        System.out.println("=== " + encabezado + " ===");
        mostrarInformacion();
    }

    /**
     * Actualiza el peso del paquete (Etapa 4.1)
     */
    public void actualizarPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Calcula el costo base del envío: 5000 por kilo + 8000 si está asegurado (Etapa 4.2)
     */
    public double calcularCosto() {
        double costoBase = peso * 5000;
        if (asegurado) {
            costoBase += 8000;
        }
        return costoBase;
    }

    /**
     * Sobrecarga del cálculo de costo con tarifa personalizada por kilo (Etapa 5.1)
     */
    public double calcularCosto(double tarifaPorKilo) {
        double costoBase = peso * tarifaPorKilo;
        if (asegurado) {
            costoBase += 8000;
        }
        return costoBase;
    }

    /**
     * Reto Parte C.2: Devuelve true si el peso supera los 5 kilos.
     */
    public boolean esPesado() {
        return peso > 5.0;
    }
}

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

