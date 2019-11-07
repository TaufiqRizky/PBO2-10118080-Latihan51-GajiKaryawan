/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager M = new Manager();
       
        System.out.println("=====Program Perhitungan Gaji Karyawan=====");
        System.out.print("Masukan NIK\t\t\t: ");
        Scanner nik = new Scanner(System.in);
        M.setNik(nik.nextLine());
        System.out.print("Masukan Nama\t\t\t: ");
        Scanner nm = new Scanner(System.in);
        M.setNama(nm.nextLine());
        System.out.print("Masukan Golongan (1/2/3)\t: ");
        Scanner gl = new Scanner(System.in);
        M.setGolongan(gl.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag)\t: ");
        Scanner jb = new Scanner(System.in);
        M.setJabatan(jb.nextLine().toLowerCase());
        System.out.print("Masukan Jumlah Kehadiran\t: ");
        Scanner kh = new Scanner(System.in);
        M.setKehadiran(kh.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK      : "+M.getNik());
        System.out.println("NAMA     : "+M.getNama());
        System.out.println("GOLONGAN : "+M.getGolongan());
        System.out.println("JABATAN  : "+M.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan GOLONGAN    : "+M.tunjanganGolongan(M.getGolongan()));
        System.out.println("Tunjangan JABATAN     : "+M.tunjanganJabatan(M.getJabatan()));
        System.out.println("Tunjangan KEHADIRAN   : "+M.tunjanganKehadiran(M.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL\t: "+M.gajiTotal());
       
    }
    
}
