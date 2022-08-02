package Override_x;


public class OgretmenOdemesi extends BaseÖdeme {
    public void hesapla(double tutar){
        tutar = tutar*1.2;
        System.out.println(tutar);
    }
}
