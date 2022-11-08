import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TugasJavaBasic {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     String nama ;
     String Password;
     int pin ;

     System.out.println("Masukkan Nama :");            
     nama = sc.next();

     System.out.println("Masukkan Password :");
     Password = sc.next();

     System.out.println("Masukkan PIN :");
     pin = sc.nextInt();

     if (nama.equals("Administrator") && Password.length() >= 5 && pin == 123456789) {
        System.out.println("Akses Diterima, Selamat Datang !!!");

        int number = 1;
        do {
            
            System.out.println("Pilih Menu dibawah ini : \n 1. Bangun Ruang/Datar \n 2. Konversi \n 3. Secret Menu \n 4. Exit " );
            number = sc.nextInt();
    
            System.out.println("Anda Memilih Menu Nomer : " + number);
    
            switch (number) {
                case 1: 
                System.out.println("Menu 1");
                int menu1 = 1;
                do {
                    System.out.println("Pilih Menu di bawah ini : \n 1. Luas (Meter Kuadrat) \n 2. Volume (Liter) \n 3. Exit");
                    menu1 = sc.nextInt();
    
                    System.out.println("Masukan Pilihan : " + menu1);
                    
                    switch (menu1) {
                        case 1: 
                        System.out.println("Luas");
                        int luas = 1;
                        do {
                            int panjang, lebar;
                            int sisi;
                            int alas, tinggi;
                            int jari ;
                            System.out.println("Pilih Soal di bawah ini : \n 1. Persegi Panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit");
                            System.out.println("Masukan Pilihan" + luas);
                            luas = sc.nextInt();
                            switch (luas) {
                                case 1: 
                                System.out.println("Persegi Panjang :");
                                System.out.println("Panjang :");
                                panjang = sc.nextInt();
                                System.out.println("Lebar :");
                                lebar = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (panjang*lebar) + " m²");
                                break;
    
                                case 2:
                                System.out.println("Persegi :");
                                System.out.println("Sisi :");
                                sisi = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (sisi*sisi) + " m²");
                                break;
    
                                case 3:
                                System.out.println("Segitiga :");
                                System.out.println("Alas :");
                                alas = sc.nextInt();
                                System.out.println("Tinggi :");
                                tinggi = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (1* alas * tinggi /2) + " m²");
                                break;
    
                                case 4:
                                System.out.println("Lingkaran :");
                                System.out.println("Jari-Jari :");
                                jari = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (22*jari*jari /7) + " m²");
                                break;
                            }
                        } while ( luas < 5);
                        break;
                        case 2:
                        System.out.println("Volume");
                        int volume = 1; 
                        do {
                            int p,l,t;
                            int sisi;
                            int jari;
                            System.out.println("Pilih Soal di bawah ini : \n 1. Balok \n 2. Kubus \n 3. Bola \n 4. Exit");
                            System.out.println("Masukan Pilihan = " + volume);
                            volume = sc.nextInt();
                            switch (volume) {
                                case 1:
                                System.out.println("Panjang :");
                                p = sc.nextInt();
                                System.out.println("Lebar :");
                                l = sc.nextInt();
                                System.out.println("Tinggi :");
                                t = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (p*l*t) + " liter");
                                break;
    
                                case 2:
                                System.out.println("Sisi :");
                                sisi = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (sisi*sisi*sisi) + " liter");
                                break;
    
                                case 3:
                                System.out.println("Jari-Jari :");
                                jari = sc.nextInt();
    
                                System.out.println("Hasilnya : " + (4* 22 *jari*jari*jari /3 /7) + " liter");
                                break;
                            }
                        } while ( volume < 4);
                        break;
                    }
                    
                } while ( menu1 < 3);
                break; 
    
                case 2:
                System.out.println("Menu 2");
                int menu2 = 1;
                
                do{
                    System.out.println("Pilih Menu di bawah ini : \n 1. Derajat \n 2. Panjang (meter) \n 3. Berat (gram)  \n 4. Exit");
                    menu2 = sc.nextInt();
    
                    System.out.println("Masukan Pilihan :" + menu2);
                    
                    switch (menu2) {
                        case 1:
                        System.out.println("Derajat :");
                        int derajat = 1;
    
                        do{
                            System.out.println("Pilih Soal di bawah ini : \n 1. Celcius \n 2. Reamur \n 3. Fahrenheit \n 4. Exit");
                            derajat = sc.nextInt();
                            System.out.println("Masukkan Pilihan :" + derajat);
    
                            switch (derajat) {
                                case 1:
                                System.out.println("celcius");
                                int celcius = 1;
                                do {
                                    int C;
                                    System.out.println("Pilihlah : \n 1. Celcius ke Reamur \n 2. Celcius ke Fahrenheit \n 3. Exit");
                                    celcius = sc.nextInt();
                                    System.out.println("Massukan Pilihan : " + celcius);
    
                                    switch (celcius) {
                                        case 1:                                   
                                        System.out.println("Celcius ke Reamur :");
                                        C = sc.nextInt();
    
                                        System.out.println("Hasilnya : " + (4*C /5) + " °R");
                                        break;
    
                                        case 2: 
                                        System.out.println("Celcius ke Fahrenheit :");
                                        C = sc.nextInt();
    
                                        System.out.println("Hasilnya : " + (9* C + 32 / 5) + " °F");
                                        break;
                                    }
                                } while ( celcius < 3);
                                break;
                                case 2: 
                                System.out.println("Reamur");
                                int reamur =1;
                                do {
                                    int R;
                                    System.out.println("Pilihlah : \n 1. Reamur ke Celcius \n 2. Reamur ke Fahrenheit \n 3. Exit");
                                    reamur = sc.nextInt();
                                    System.out.println("Masukkan Pilihan :" + reamur);
    
                                    switch (reamur) {
                                        case 1:
                                        System.out.println("Reamur ke Celcius");
                                        R = sc.nextInt();
    
                                        System.out.println("Hasilnya : " + (5 / R /4 ) + " °C");
                                        break;
    
                                        case 2:
                                        System.out.println("Reamur ke Fahrenheit");
                                        R = sc.nextInt();
    
                                        System.out.println("Hasilnya :" + (9 * R + 32 / 4) + " °F");
                                        break;
                                    }
                                } while (reamur < 3);
                                break;
    
                                case 3:
                                System.out.println("Fahrenheit");
                                int fahrenheit = 1;
                                do {
                                    int F;
                                    System.out.println("Pilihlah : \n 1. Fahrenheit ke Celcius \n 2. Fahrenheit ke Reamur \n 3. Exit");
                                    fahrenheit = sc.nextInt();
                                    System.out.println("Masukkan Pilihan :" + fahrenheit);
    
                                    switch (fahrenheit) {
                                        case 1: 
                                        System.out.println("Fahrenheit ke Celcius");
                                        F = sc.nextInt();
    
                                        System.out.println("Hasilnya :" + (F - 32 * 5 /9) + " °C");
                                        break;
                                        case 2:
                                        System.out.println("Fahrenheit ke Reamur");
                                        F = sc.nextInt();
    
                                        System.out.println("Hasilnya :" + (4 * F - 32 / 9) + " °R");
                                        break;
                                    }
                                } while (fahrenheit < 3);
                                break;
                            }
                        } while ( derajat < 4);
                        break;
                        case 2:
                        System.out.println("Panjang (Meter)");
                        int panjang = 1;
                        do {
                            int meter;
                            System.out.println("Silahkan pilih : \n 1. Kilometer \n 2. Hektometer \n 3. Dekameter \n 4. Desimeter \n 5. Centimeter \n 6. Milimeter \n 7. Exit");
                            panjang = sc.nextInt();
                            System.out.println("Masukkan Pilihan :" + panjang);
                            
                            switch (panjang) {
                                case 1:
                                System.out.println("KM");
                                System.out.println("Masukkan Nilai (meter) =");
                                meter = sc.nextInt();
                                System.out.println("Hasil konverensi " + meter + "="+ (meter / 1000) + " km ");
                                break; 
                                case 2:
                                System.out.println("HM");
                                System.out.println("Masukkan Nilai (meter) =");       
                                meter = sc.nextInt();
                                System.out.println("Hasil konverensi " + meter + "=" + (meter / 100) + " hm ");   
                                break;   
                                case 3:
                                System.out.println("dam");
                                System.out.println("Masukkan Nilai (meter) =");       
                                meter = sc.nextInt();
                                System.out.println("Hasil konverensi " + meter + "=" + (meter / 10) + " dam ");   
                                break;   
                                case 4:
                                System.out.println("dm");   
                                System.out.println("Masukkan Nilai (meter) =");   
                                meter = sc.nextInt();
                                System.out.println("Hasil konverensi " + meter + "=" +(meter * 10) + " dm ");
                                break;
                                case 5:
                                System.out.println("cm");
                                System.out.println("Masukkan Nilai (meter) =");
                                meter = sc.nextInt();
                                System.out.println("Hasil konverensi " + meter + "=" + (meter * 100) + " cm ");
                                break;
                                case 6:
                                System.out.println("mm");
                                System.out.println("Masukkan Nilai (meter) =");
                                meter = sc.nextInt();
                                System.out.println("Hasil konverensi " + meter + "=" + (meter * 1000) + " mm ");
                                break;                                            
                            }
                        } while (panjang < 7);
                        break;
                        case 3:
                        System.out.println("Berat (Gram)");
                        int berat = 1;
                        do {
                            int gram;
                            System.out.println("Silahkan Pilih : \n 1. Kilogram \n 2. Hektogram \n 3. Dekagram \n 4. Desigram \n 5. Centigram \n 6. Miligram \n 7. Exit");
                            berat = sc.nextInt();
                            System.out.println("Masukkan Pilihan :" + berat);
                            switch (berat) {
                                case 1:
                                System.out.println("Kilogram");
                                System.out.println("Masukkan Nilai (Gram) ="); 
                                gram = sc.nextInt();
                                System.out.println("Hasil konverensi " + gram + "=" + (gram / 1000) + " kg ");
                                break;
                                case 2:
                                System.out.println("Hektogram");
                                System.out.println("Masukkan Nilai (Gram) ="); 
                                gram = sc.nextInt();
                                System.out.println("Hasil konverensi " + gram + "=" + (gram / 100) + " hg ");
                                break;
                                case 3:
                                System.out.println("Dekagram");
                                System.out.println("Masukkan Nilai (Gram) ="); 
                                gram = sc.nextInt();
                                System.out.println("Hasil konverensi " + gram + "=" + (gram / 10) + " dag ");
                                break;
                                case 4:
                                System.out.println("Desigram");
                                System.out.println("Masukkan Nilai (Gram) ="); 
                                gram = sc.nextInt();
                                System.out.println("Hasil konverensi " + gram + "=" + (gram * 10) + " dg ");
                                break;
                                case 5:
                                System.out.println("Centigram");
                                System.out.println("Masukkan Nilai (Gram) ="); 
                                gram = sc.nextInt();
                                System.out.println("Hasil konverensi " + gram + "=" + (gram * 100) + " cg ");
                                break;
                                case 6:
                                System.out.println("Miligram");
                                System.out.println("Masukkan Nilai (Gram) ="); 
                                gram = sc.nextInt();
                                System.out.println("Hasil konverensi " + gram + "=" + (gram * 1000) + " mg ");
                                break;
                            }
                        } while (berat < 7);
                        break;
                    }
                }  while ( menu2 < 3);
                break;
                case 3:
                String khoir;
                System.out.println("Seceret Menu");
                System.out.println("Masukkan Nilai Unik :");
                khoir = sc.next();
                if (khoir.length() > 7 && khoir.length() < 10 ) {
                    System.out.println("Selamat Datang VIP !!");
                    System.out.println(" Silahkan Pilih Menu Rahasia ");
                    int menu3 = 1;
                    do {
                        System.out.println("Silahkan Pilih : \n 1.  Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit");
                        menu3 = sc.nextInt();
                        switch (menu3) {
                            case 1:
                            String mimi;
                            System.out.println("Uppercase");
                            System.out.println("Masukkan Data");
                            mimi = sc.next();
                            System.out.println(mimi.toUpperCase());
                            break;
                            case 2:
                            String MOO;
                            System.out.println("Lowercase");
                            System.out.println("Masukkan Data");
                            MOO = sc.next();
                            System.out.println(MOO.toLowerCase());
                            break;
                            case 3:
                            String miii;
                            System.out.println("Reverse");
                            System.out.println("Masukkan Data");
                            miii = sc.next();
                            List<String> list = Arrays.asList(miii.split(""));
                            Collections.reverse(list);
                            System.out.println(
                                String.join("", list)
                            );
                            break;
                        }
                    } while (menu3 < 4);
                    break;
                } else {
                    System.out.println("Salah : Kembali Ke Menu Awal ");
                }
            }
        }  while (number < 4);   
        System.out.println("Anda Sudah Keluar !!");
    } else {
        System.out.println("Akses Ditolak");
        sc.close();
    }
 }
}