package PBO_Jobsheet6;
import PBO_Jobsheet6.tespackage.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;
    
    // public Dosen(){
    //     System.out.println(gaji);
    //     System.out.println("Objek dari class dosen dibuat");
    // }

    public Dosen(String nip, String nama, double gaji, String nidn){
        //System.out.println("Objek dari class dosen dibuat dengan constructor berparameter");
        super(nip, nama, gaji);
        this.nidn = nidn;
    }

    public String getInfo(){
        return "NIDN : " + this.nidn + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += this.nidn + "\n";
        return info;
    }
}
