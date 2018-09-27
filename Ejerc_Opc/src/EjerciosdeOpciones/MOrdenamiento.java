package EjerciosdeOpciones;

import javax.swing.JOptionPane;

public class MOrdenamiento {
    // metodo de burbuja
    public int[] burbuja(int[] p_arreglo) {
        int aux=0;
        int[] nArregloOrdenado = new int[p_arreglo.length];
        int nTerminoArreglo = p_arreglo.length;

        for (int i = 0; i < nTerminoArreglo - 1; i++) {
            for (int j = 0; j < nTerminoArreglo - 1; j++) {
                if (p_arreglo[j] > p_arreglo[j + 1]) {

                    aux = p_arreglo[j];
                    p_arreglo[j] = p_arreglo[j+1];
                    p_arreglo[j+1] = aux;
                }
            }
        }
        nArregloOrdenado=p_arreglo;
        return nArregloOrdenado;
    }
    
    public int[] insercion_directa(int[] p_arreglo) {
        int aux=0, p, j;
        int[] nArregloOrdenado = new int[p_arreglo.length];
        int nTerminoArreglo = p_arreglo.length;
        
        JOptionPane.showMessageDialog(null,"Vector Desordenado:");
        
        for (int i = 0; i < p_arreglo.length; i++) {
            JOptionPane.showMessageDialog(null,p_arreglo[i]+" ");
        }
        
        
        for (p = 1; p < p_arreglo.length; p++){ // desde el segundo elemento hasta
          aux = p_arreglo[p]; // el final, guardamos el elemento y
          j = p - 1; // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < p_arreglo[j])){ // mientras queden posiciones y el
                                             // valor de aux sea menor que los
                p_arreglo[j + 1] = p_arreglo[j];       // de la izquierda, se desplaza a
                j--;                   // la derecha
            }
            p_arreglo[j + 1] = aux; // colocamos aux en su sitio
        }
        JOptionPane.showMessageDialog(null,"Vector Ordenado:");
        
        for (int i = 0; i < p_arreglo.length; i++) {
            JOptionPane.showMessageDialog(null,p_arreglo[i]+" ");
        }
        
        nArregloOrdenado=p_arreglo;
        return nArregloOrdenado;
    }
    
    public int[] shell(int[] p_arreglo) {
        int[] nArregloOrdenado = new int[p_arreglo.length];
        int nTerminoArreglo = p_arreglo.length;
        
        int salto, aux, i;
        boolean cambios;
        
       
        JOptionPane.showMessageDialog(null,"Vector Desordenado:");
        
        for (int l = 0; l < p_arreglo.length; l++) {
            JOptionPane.showMessageDialog(null,p_arreglo[l]+" ");
        }
        
        
        for(salto=p_arreglo.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){ // Mientras se intercambie algún elemento
                 cambios=false;
                for(i=salto; i< p_arreglo.length; i++){ // se da una pasada
                    if(p_arreglo[i-salto]>p_arreglo[i]){ // y si están desordenados
                        aux=p_arreglo[i]; // se reordenan
                        p_arreglo[i]=p_arreglo[i-salto];
                        p_arreglo[i-salto]=aux;
                        cambios=true; // y se marca como cambio.
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Vector Ordenado:");
        
        for (int l = 0; l < p_arreglo.length; l++) {
            JOptionPane.showMessageDialog(null,p_arreglo[l]+" ");
        }
        nArregloOrdenado=p_arreglo;
        return nArregloOrdenado;
        
    }
    
    public int[] busq_binaria(int[] p_arreglo) {
        int[] nArregloOrdenado = new int[p_arreglo.length];
        int nTerminoArreglo = p_arreglo.length;
        int i, j, menor, pos, tmp;
        
        JOptionPane.showMessageDialog(null,"Vector Desordenado:");
        for (int l = 0; l < p_arreglo.length; l++) {
            JOptionPane.showMessageDialog(null,p_arreglo[l]+" ");
        }
        
        for (i = 0; i < p_arreglo.length - 1; i++) { // tomamos como menor el primero
            menor = p_arreglo[i]; // de los elementos que quedan por ordenar
            pos = i; // y guardamos su posición
            for (j = i + 1; j < p_arreglo.length; j++){ // buscamos en el resto
                if (p_arreglo[j] < menor) { // del array algún elemento
                    menor = p_arreglo[j]; // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){ // si hay alguno menor se intercambia
                tmp = p_arreglo[i];
                p_arreglo[i] = p_arreglo[pos];
                p_arreglo[pos] = tmp;
            }
        }
        JOptionPane.showMessageDialog(null,"Vector Ordenado:");
        
        for (int l = 0; l < p_arreglo.length; l++) {
            JOptionPane.showMessageDialog(null,p_arreglo[l]+" ");
        }
        
        int busca=Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero a buscar"));
        
        int ba = 1;
        int al = (p_arreglo.length);
        int c = (ba+al)/2;
        while ((ba<al) && (busca!=p_arreglo[c-1])) {
                if (busca>p_arreglo[c-1]) {
                        ba = c+1;
                } else {
                        al = c-1;
                }
                c = (ba+al)/2;
        }
        if (busca==p_arreglo[c-1]) {
            JOptionPane.showMessageDialog(null,busca+" encontrado en posición "+c);
        } else {
            JOptionPane.showMessageDialog(null,"No fue encontrado");
        }
        nArregloOrdenado=p_arreglo;
        return nArregloOrdenado;
        
    }
    //
}
