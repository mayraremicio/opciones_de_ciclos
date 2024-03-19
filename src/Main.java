import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {

        
       int  opci,n,i,a,c,suma =0,mult,sum=0 ,num,summa=0;
        JOptionPane.showMessageDialog(null," bienvenido al programa");

        Object interger;

                opci= Integer.parseInt(showInputDialog("por favor escoge el tipo de ciclo con el que quieres hacer la operacion \" +\n" +
                        "                        \"1.while  2.do while  3.for\""));
        n=                 n = Integer.parseInt(showInputDialog("por favor ingrese un  numero "));


                switch (opci){

                    case 1:


                        i=0;

                        while (i<=n) {

                            sum = i++;
                              mult= sum*sum;
                            suma =suma +mult;

                              JOptionPane.showMessageDialog(null, " cuadrado  "+ sum+ "x" +sum
                                      + " = "+mult ); }
                        JOptionPane.showMessageDialog(null, " suma de cuadrados"+suma );
                        break;

                              case 2:
                                i=0;
                                do

                                {
                                 sum =  i++;
                                mult= sum*sum;
                                suma=suma+mult;

                                }


                                while (i<=n);

                                  JOptionPane.showMessageDialog(null, " numero "+n );
                                  JOptionPane.showMessageDialog(null, " suma de cuadrados  = "+suma);
                                  break;

                    case 3:


                        for ( i=0 ;i<=n;)

                        sum = i++;
                        mult= sum*sum;

                        JOptionPane.showMessageDialog(null, " cuadrado  "+ sum+ "x" +sum
                                + " = "+mult );

                        suma=  suma+mult;

                        JOptionPane.showMessageDialog(null, " suma de cuadrados"+ suma);}

                }

    }
