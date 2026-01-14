public class MahasiswaAktif extends Mahasiswa {

    private String nim;

// Constructor
    public MahasiswaAktif(String nama, int umur, String nim) {
        super(nama, umur); //panggil constructor Mahasiswa
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    // Override method
    @Override
    public void perkenalan(){
        System.out.println("Nama saya " + getNama());
        System.out.println("Umur saya " + getUmur() + " tahun");
        System.out.println("NIM saya " + nim);
    }
}
