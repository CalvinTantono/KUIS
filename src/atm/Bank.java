package atm;

import java.io.*;

public class Bank {
    public static void main(String args[]){
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));{
            int pin;
            int konfirmasi_pin;
            int option;
            int saldo = 3000000;
            int proses;
            int jum_transfer = 0;
            int no_rekening =  12345678;
            int penarikan = 0;

            try {
                System.out.println (" SELAMAT DATANG ");
                System.out.println ("SILAHKAN INPUTKAN PIN ANDA ( 12345678 )");
                System.out.print ("-> ");
                pin=Integer.parseInt(input.readLine());

                if (pin == 12345678)
                {
                    do {
                        System.out.println ("\n--------------------------");
                        System.out.println ("MENU TRANSAKSI");
                        System.out.println (" Nama = Susi");
                        System.out.println ("SILAHKAN PILIH OPTION");
                        System.out.println ("1. CEK SALDO");
                        System.out.println ("2. TRANSFER");
                        System.out.println ("3. TARIK TUNAI");
                        System.out.println ("4. HISTORY TRANSAKSI");
                        System.out.println ("5. KELUAR");
                        System.out.println ("--------------------------");
                        System.out.print ("OPTION -> ");
                        option=Integer.parseInt(input.readLine());

                        switch (option ){
                            case 1:
                            System.out.println ("================================");
                            System.out.println ("SALDO ANDA SAAT INI : " +saldo);
                            System.out.println ("================================");
                            break;
                            case 2:
                            System.out.println ("=================================");
                            System.out.println ("TRANSFER DANA KE BANK LAIN ");
                            System.out.println ("=================================");
                            System.out.print( "Masukan No Rekening (87654321) : " );
                            no_rekening=Integer.parseInt(input.readLine());
                            System.out.print( "Masukan Jumlah Transfer : " );
                            jum_transfer=Integer.parseInt(input.readLine());
                            System.out.println("PIN ANDA (12345678) : ");
                            pin=Integer.parseInt(input.readLine());
                            System.out.println ("KONFIRMASI PIN ANDA (12345678): ");
                            konfirmasi_pin=Integer.parseInt(input.readLine());

                            if (konfirmasi_pin == pin){
                                System.out.println("PIN BERHASIL ");
                            }
                            else {
                                System.out.println("PIN TIDAK SESUAI");
                                System.exit(0);
                            }
                            if(jum_transfer <= (saldo-15000)){
                                System.out.println("Selanjutnya");
                            }
                            else{
                                System.out.println("Saldo Tidak Cukup");
                            }

                            if(no_rekening == 87654321){
                                System.out.println (" -> No Rekening = " +no_rekening);
                                System.out.println (" -> Nama Penerima = Budi");
                                System.out.println (" -> Jumlah Transfer = " +jum_transfer);
                                System.out.println (" TRANSAKSI BERHASIL !"); 
                            }
                            else{
                                System.out.println ("No rekening tidak sesuai");
                            }
                            saldo = saldo-jum_transfer;
                            break;
                            case 3:
                            System.out.println ("=================================");
                            System.out.println ("PENARIKAN UANG ");
                            System.out.println ("=================================");
                            System.out.print ("Masukan jumlah uang >> ");
                            penarikan=Integer.parseInt(input.readLine());
                            System.out.println ("Saldo Awal : " +saldo);
                            System.out.println ("Penarikan : " +penarikan);
                            saldo=saldo-penarikan;
                            System.out.println ("Saldo akhir : " +saldo);
                            
                            for(int i=0; i<=1; i++){
                                System.out.print ("\nPIN ANDA(12345678) :");
                                pin = Integer.parseInt(input.readLine());
                            }
                            if (pin == 12345678) {
                                System.out.println ("-> PIN MATCH ");
                                }
                            else {
                                System.out.println ("-> PIN NOT MATCH. Trasaksi Batal");
                            }
                            if (penarikan >= (saldo-50000)){
                                System.out.println ("-> SALDO TIDAK CUKUP : TRANSAKSI GAGAL !");
                            }
                            else{
                                System.out.println ("TRANSAKSI BERHASIL");
                            }
                            break;
                            case 4:
                            System.out.println ("=================================");
                            System.out.println ("HISTORY TRANSAKSI");
                            System.out.println ("=================================");
                            System.out.println ("Transksi Terakhir");
                            System.out.println ("Penarikan Uang :"+ penarikan);
                            System.out.println ("Trasfer Uang : Budi "+ jum_transfer);
                            System.out.println ("Saldo Akhir :"+ saldo);
                            break;

                            default:
                            System.out.println("TERIMA KASIH SUSI");
                        }
                        System.out.println("\n TEKAN 0 UNTUK KEMBALI KE MENU");
                        proses=Integer.parseInt(input.readLine());
                        ++proses;}
                        while(proses <= 2);
                    }
                    else {
                        System.out.println("PIN ANDA SALAH");}
                    }
                
                catch (IOException e){
            
            System.out.print("");
        }
        catch (NumberFormatException e){
            System.out.println("PIN YANG ANDA MASUKKAN HARUS ANGKA");

        }

                            
                        }
                    }
                
            

        
        
    }
    

