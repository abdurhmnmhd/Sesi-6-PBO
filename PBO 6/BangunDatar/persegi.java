package BangunDatar;
public class persegi extends BangunDatar{
    private double sisi;

    public persegi(double sisi) {
        this.sisi = sisi;
    }

    public double luas(){
        return sisi*sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
    
}
