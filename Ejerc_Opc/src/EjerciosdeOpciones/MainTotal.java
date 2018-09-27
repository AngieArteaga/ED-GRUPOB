package EjerciosdeOpciones;

import javax.swing.JOptionPane;

public class MainTotal {

    public static void main(String[] args) {
        int nNumeroEstudiantes = 0;
        nNumeroEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes: "));
        int[] edadesOrdenadas = new int[nNumeroEstudiantes];

        int[] edades = new int[nNumeroEstudiantes];
        String nListaMensaje = "";
        int res = 0, op = 0;

        try {
            for (int i = 0; i < edades.length; i++) {

                edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: " + (i + 1) + " "));

            }
            for (int i = 0; i < edadesOrdenadas.length; i++) {
                nListaMensaje += (i + 1) + " . - Edad: " + edades[i] + "\n";
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Dato Incorrecto ");
        }

        try {
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog("Seleccion Opcion de Ordenar por: \n"
                        + "1.- Metodo Burbuja \n"
                        + "2.- Metodo Insercion Directa \n"
                        + "3.- Metodo Shell \n"
                        + "4.- Metodo  Busqueda Binaria \n"));
            } while (op < 1 || op > 4);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, " Dato Incorrecto ");
        }

        if (op != JOptionPane.CLOSED_OPTION) {
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, " Ordenado por Método Burbuja ");

                    MOrdenamiento oClsOrdenamiento = new MOrdenamiento();

                    //ordenando el arreglo
                    edadesOrdenadas = oClsOrdenamiento.burbuja(edades);

               
                    nListaMensaje += "EDADES ORDENADAS " + "\n";

                    for (int i = 0; i < edadesOrdenadas.length; i++) {
                        nListaMensaje += (i + 1) + " . - Edad: " + edadesOrdenadas[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, nListaMensaje);
                break;
                    
                case 2:
                    JOptionPane.showMessageDialog(null, " Ordenado por Método Insercion Directa ");
                    
                    MOrdenamiento twomet = new MOrdenamiento();
                    
                    edadesOrdenadas = twomet.insercion_directa(edades);
                    nListaMensaje += "EDADES ORDENADAS " + "\n";

                    for (int i = 0; i < edadesOrdenadas.length; i++) {
                        nListaMensaje += (i + 1) + " . - Edad: " + edadesOrdenadas[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, nListaMensaje);
                break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, " Ordenado por Método Shell ");
                    
                    MOrdenamiento threemet = new MOrdenamiento();
                    
                    edadesOrdenadas = threemet.insercion_directa(edades);
                    nListaMensaje += "EDADES ORDENADAS " + "\n";

                    for (int i = 0; i < edadesOrdenadas.length; i++) {
                        nListaMensaje += (i + 1) + " . - Edad: " + edadesOrdenadas[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, nListaMensaje);
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, " Busqueda por Método Binario ");
                    
                    MOrdenamiento fourmet = new MOrdenamiento();
                    
                    edadesOrdenadas = fourmet.busq_binaria(edades);
                    nListaMensaje += "EDADES ORDENADAS " + "\n";

                    for (int i = 0; i < edadesOrdenadas.length; i++) {
                        nListaMensaje += (i + 1) + " . - Edad: " + edadesOrdenadas[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, nListaMensaje);
                    break;
            }

        }
    }

}
