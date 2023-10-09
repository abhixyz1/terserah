import java.util.Scanner;

public class ngawur {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        //input
        String nama;
    int na;
    char nh;
    
    System.out.print("Masukkan nama : ");
    nama = input.next();
    System.out.print("Masukkan nilai: ");
    na = input.nextInt();
    
    if (na >= 80){
        nh = 'A';
    }else if (na >= 70){
        nh = 'B';        
    }else if (na >= 60){
        nh = 'C';
    }else if (na >= 50){
        nh = 'D';
    }else{
        nh = 'E';
    }
    
    if (nh=='A'){
        System.out.println("Selamat, "+nama );
        System.out.println("Nilai Anda A !");
    }else if (nh=='B'){
        System.out.println("Bagus, "+nama );
        System.out.println("Nilai Anda B");
    }else if (nh=='C'){
        System.out.println("Lumayan, "+nama );
        System.out.println("Nilai Anda C");
    }else if (nh=='D'){
        System.out.println("Maaf, "+nama );
        System.out.println("Nilai Anda D, Tidak lulus");
    }else              
    { 
        System.out.println("Maaf, "+nama );
        System.out.println("Anda tidak ada nilai.(E)");
    


    }
} }
