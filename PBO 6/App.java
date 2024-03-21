import BangunDatar.*;
import Shape.*;

public class App {

    public static void main(String[] args) {
        persegi A = new persegi(5);
        Square B = new Square(6);
        persegiPanjang C = new persegiPanjang(6, 8);

        B.print();
        A.getInfo();
        B.getInfo();
        B.setPaper();
        C.getInfo();
    }
    
}
