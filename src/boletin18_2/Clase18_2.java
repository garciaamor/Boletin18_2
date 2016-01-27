package boletin18_2;

import javax.swing.JOptionPane;

public class Clase18_2 {
    int []notasModulo =new int[2];
    
    public int ponerNotas(){
          int notas;
        do{
            notas=Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota"));
            if (notas<1||notas>10)
                JOptionPane.showMessageDialog(null, "Introduce una nota valida (entre 1 y 10)");
        } while (notas<1||notas>10);
        return notas;
    }
    public void cargarArray(){
        for (int i=0;i<notasModulo.length;i++){
            notasModulo[i]=ponerNotas();
        }
    }
    public void notaAlta(){
        int mayor = 0;
        for (int i=0;i<notasModulo.length;i++){
            if (notasModulo[i]>mayor){
                mayor=notasModulo[i];
            }
               }
        System.out.println("La nota mas alta es : "+mayor);
    }
    public void notaMedia(){
        int media=0;
        
        for (int i=0;i<notasModulo.length;i++){
            media=media+notasModulo[i];
        }
        
        
        System.out.println("La nota media de la clase es  : "+media/notasModulo.length );
    }
    public void aprobados(){
        int aprobados=0;
        int suspensos=0;
        for (int i=0;i<notasModulo.length;i++){
          if (notasModulo[i]<5){
              suspensos++;
              
          }
          else {aprobados++;
          }
        }
        System.out.println("numero de suspensos  "+suspensos);
        System.out.println("numero de aprobados  "+aprobados);
    }
}
