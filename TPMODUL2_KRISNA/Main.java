public class Main {
    public static void main(String[] args) {
        Hewan hewanUmum = new Hewan("Hewan Umum", 5);
        Kucing kucing = new Kucing("Tom", 3, "Persia");
        Burung burung = new Burung("Rio", 2, "Hijau");

        System.out.println("Info Hewan Umum:");
        hewanUmum.infoHewan();
        hewanUmum.suara();
        hewanUmum.makan();
        hewanUmum.makan("daging");
        System.out.println();

        System.out.println("Info Kucing:");
        kucing.infoHewan();
        kucing.suara();
        kucing.makan("ikan");
        System.out.println();

        System.out.println("Info Burung:");
        burung.infoHewan();
        burung.suara();
        burung.makan("biji-bijian");
    }
}