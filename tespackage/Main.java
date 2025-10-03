package PBO_Jobsheet6.tespackage;
import PBO_Jobsheet6.Dosen;

public class Main {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123456", "John Doe", 5000000.0, "789012");
        // dosen1.nip = "123456";
        // dosen1.nama = "John Doe";
        // dosen1.gaji = 5000000;
        // dosen1.nidn = "789012";

        System.out.println(dosen1.getAllInfo());
    }
}