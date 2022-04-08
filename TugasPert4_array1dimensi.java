package tugaspert4_array1dimensi;

/**
 *
 * @author Eka
 */
public class TugasPert4_array1dimensi {

    
    public static void main(String[] args) {
    
        String[] nama = {"Namjoon","Seokjin","Yoongi","Hoseok","Jimin"};
        System.out.println("Data ke 1 : "+nama[0]);
        System.out.println("Data ke 2 : "+nama[1]);
        System.out.println("Data ke 3 : "+nama[2]);
        System.out.println("Data ke 3 : "+nama[3]);
        System.out.println("Data ke 3 : "+nama[4]);
        System.out.print(nama[0]);
        System.out.print(nama[1]);
        System.out.println(nama[2]);
        System.out.println(nama[3]);
        System.out.println(nama[4]);
        
           
        int a=1;
        for (int i=0;i<nama.length;i++){
            System.out.println("Indeks ke-"+a+" : "+nama[i]);
            a++;
        }
    
    }
    
}
