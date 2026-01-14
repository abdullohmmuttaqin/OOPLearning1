public class Main{
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Ain",21);
        mhs1.perkenalan();

        System.out.println("------------");

        MahasiswaAktif mhs2 = new MahasiswaAktif("Ain", 21, "20240123");
        mhs2.perkenalan();
    }
}