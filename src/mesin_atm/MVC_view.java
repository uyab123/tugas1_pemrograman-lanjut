/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesin_atm;

import java.util.Scanner;

/**
 *
 * @author bayua
 */
public class MVC_view {
    Scanner scan = new Scanner(System.in);
    private static MVC_view view = new MVC_view();
    
    public MVC_view(){}
    
    public static MVC_view getInstance(){
        return view;
    }
    
    public int Menu(){
        System.out.println("-------------------");
        System.out.println("|     ini ATM     |");
        System.out.println("|=================|");
        System.out.println("| 1. Cek Saldo    |");
        System.out.println("| 2. Tarik        |");
        System.out.println("| 3. Setor        |");
        System.out.println("| 4. Exit         |");
        System.out.println("-------------------");
        System.out.println("Masukan Pilihan: ");
        
        return scan.nextInt();
    }

    void ceksaldo(DAO_model saldo) {
        System.out.println("Saldo anda Rp "+saldo.ceksaldo.getsaldo());
    }

    void tarik(DAO_model saldo) {
        int jumlah;
        System.out.print("Jumlah penarikan (Kelipatan 50000) : Rp ");
        jumlah = scan.nextInt();
        
        if(saldo.maxlimit()){
            System.out.println("Saldo anda tidak cukup");
        }
        else if((saldo.getsaldo() - jumlah) < saldo.limit()){
            System.out.println("Penarikan melebihi limit saldo");
        }
        else if((saldo.getsaldo() > jumlah) && (saldo.cek(jumlah) == 0)){
            saldo.tariksaldo(jumlah);
            System.out.println("BERHASIL");
        }
        else{
            System.out.println("GAGAL");
        }
    }

    void setor(DAO_model saldo) {
        int jumlah;
        System.out.print("Jumlah setoran (kelipatan 50000) : Rp ");
        jumlah = scan.nextInt();
        if(saldo.cek(jumlah) == 0){
            saldo.addsaldo(jumlah);
            System.out.println("BERHASIL SETOR : Rp "+jumlah);
        }else{
            System.out.println("GAGAL");
        }
    }
    
    
}
