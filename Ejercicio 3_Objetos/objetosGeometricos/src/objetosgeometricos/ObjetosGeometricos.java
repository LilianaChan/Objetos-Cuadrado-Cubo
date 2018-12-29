/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosgeometricos;
import javax.swing.JOptionPane;
/**
 *
 * @author Lily
 */
public class ObjetosGeometricos {
    static Cubo cubo;
    static double operacion;
    static String numlado;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        inicio ();
        proceso();

    }
    
    private static void proceso() {

        int opc = get_menu();

        while (opc != 5) {
            operacion = calculate(opc, cubo);
            
            JOptionPane.showMessageDialog(null,"El valor es " + operacion + "\n" );

            opc = get_menu();
        }

        inicio();
        proceso();
    }
    
    public static void inicio() {

        numlado = JOptionPane.showInputDialog("Ingrese el valor del lado:\t");
        try {
            double lado = Double.parseDouble(numlado);
            cubo = new Cubo(lado);
        } catch (NumberFormatException lado) {
            JOptionPane.showMessageDialog(null, "El valor debe ser un numero");
            inicio();
        }

    }
    
    public static double calculate(int opc, Cubo cubo) {

        double resultado = 0;
        switch (opc) {
            case 1:
                resultado = cubo.calcularPerimetro(true);
                break;
            case 2:
                resultado = cubo.calcularArea();
                break;
            case 3:
                resultado = cubo.calcularVolumen();
                break;
            case 4:
                resultado = cubo.calcularPerimetro(false);
                break;
            case 5:
                inicio();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Hasta luego");
                
                System.exit(0);
                break;

        }
        return resultado;
        
    }

    
    public static int get_menu() {

        String numero = JOptionPane.showInputDialog(null, 
                                            "valor actual "+numlado+//agregue numlado para presentar en el menu el numero ingresado 
                                            "\n ingrese el numero correspondiente \n al calculo que desea realizar:\n"+
                                            "1: Perímetro cuadrado \n"+ 
                                            "2: calcular área\n"+
                                            "3: calcular Volúmen\n"+
                                            "4: calcular Perímetro cubo\n"+
                                            "5: Reinicio \n"+
                                            "6: Salir del programa \n");
                                            

        int opc  = Integer.parseInt( numero);
        return opc;
        
    }
}
       
