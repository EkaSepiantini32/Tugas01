package tugaspert4_array2dimensi;

import java.util.Scanner;

/**
 *
 * @author Eka
 */
public class TugasPert4_array2dimensi {

    public static void main(String[] args) {
        Scanner masuk=new Scanner (System.in);
        
        System.out.print("Jumlah Mahasiswa : ");
        int nama=masuk.nextInt();
        
        String mahasiswa[][] = new String[nama][3];

        for(int i= 0; i<nama; i++)
        {
            System.out.println("");
            System.out.println("Data Mahasiswa ke "+(i+1));

            for(int j=0;j<3;j++)
            {      
                if (j == 0)
                    System.out.print("Nama     :");
                else if (j == 1)
                    System.out.print("NIM    : ");
                else
                    System.out.print("Jurusan : ");
                
                System.out.print("");
                mahasiswa[i][j] = masuk.next();
            }
        }

        System.out.println("Data Mahasiswa yang diinput");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
    }
}
