public class Barang {
    //Atribut
private String nama;
private Int jumlah;
private double harga;



    // Constructor Barang
public Barang (String nama,int jumlah,double harga){
    this.nama = nama;
    this.jumlah = jumlah;
    this.harga = harga;
}



    // Getter dan Setter
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getJumlah(){
        return jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }


    // Method tampilkanData
    public void tampilkanData(){
        System.out.printIn("nama Barang: " + nama);
        System.out.printIn("jumlah: " + jumlah);
        System.out.printIn("harga: " +harga);
    }

}
