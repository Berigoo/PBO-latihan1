public class DemoNilai {
    public static void main(String[] args) {
        Nilai mhs1 = new Nilai();

        mhs1.NIM = "2210631170081";
        mhs1.nama = "Muhamad Rizqi Fajri";
        mhs1.n_absen = 100;
        mhs1.n_tugas = 95;
        mhs1.n_uts = 90;
        mhs1.n_uas = 95;

        mhs1.nilai();
        mhs1.cetakNilai();
    }
}
