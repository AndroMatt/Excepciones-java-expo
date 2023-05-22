package excepciones;

import javax.swing.JOptionPane;

public class EjemploExcepciones {

    /**
     * printStackTrace() -> Proporciona información detallada sobre el origen y
     * el seguimiento de la excepción a través de los métodos en la pila de
     * llamadas.
     *
     * getMessage() -> Retorna un String que describe el detalle del error o
     * excepción.
     *
     * toString() -> Retorna una representación en forma de String de la
     * excepción. Por defecto, esta representación incluye el nombre de la
     * excepción y su mensaje.
     */
    public static void main(String[] args) {

        int div = 0, num1 = 0, num2 = 0;

        try {
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Número:", "Dividendo", JOptionPane.PLAIN_MESSAGE));
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Número:", "Divisor", JOptionPane.PLAIN_MESSAGE));

            div = num1 / num2;
        } catch (NumberFormatException nf) {
            System.out.println("Error ocasionado por: " + nf.getMessage());
            System.out.println(nf.toString());
            nf.printStackTrace();
        } catch (ArithmeticException ae) {
            System.out.println("Error ocasionado por: " + ae.getMessage());
            System.out.println(ae.toString());
            ae.printStackTrace();
        }

        // Resulatdo
        System.out.println(div);
    }
}
