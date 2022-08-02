package Override_x;

public class TarımOdemesi extends  BaseÖdeme {
    public void hesapla(double tutar){
        tutar = tutar*1.3;

        System.out.println(tutar);
    }
}
