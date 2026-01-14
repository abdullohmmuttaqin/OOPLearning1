public class Mahasiswa {

    //1. Data disembunyikan
    private String nama;
    private int umur;

    //2. Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        setUmur(umur); //Pakai setter agar tervalidasi
    }

    //3. Getter
    public String getNama() {
        return nama;
    }

    public int getUmur(){
        return umur;
    }

    //4. Setter (ada aturan)
    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid");
        }
    }

    public void perkenalan(){
        System.out.println("Nama saya " + nama);
        System.out.println("Umur saya " + umur + " tahun");
    }
}