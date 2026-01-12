public class Main{
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa("Ain",21);

        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getUmur());

        mhs1.setUmur(22);
        mhs1.setUmur(-5);

        mhs1.perkenalan();
    }
}