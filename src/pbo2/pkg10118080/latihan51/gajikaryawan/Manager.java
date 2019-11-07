/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan51.gajikaryawan;

/**
 *
 * @author USER
 */
public class Manager extends Karyawan{
    private  int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan,tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public  float tunjanganKehadiran(int kehadiran){
        return this.kehadiran*10000;
    }
    public float tunjanganJabatan(String jabatan){
        if ("manager".equals(jabatan)) {
            return 2000000;
        } else if("kabag".equals(jabatan)) {
            return 1000000;
        }else{
            return 0;
        }
    }
    
    public float tunjanganGolongan(int golongan){
        if (golongan == 1) {
            return 500000;
        } else if (golongan == 2) {
            return 1000000;
        } else if (golongan == 3) {
            return 1500000;
        } else{
            return 0;
        }
    }
    
    public float gajiTotal(){
        return tunjanganJabatan(this.getJabatan())+tunjanganGolongan(this.getGolongan())+tunjanganKehadiran(this.getKehadiran());
    }
    
}
