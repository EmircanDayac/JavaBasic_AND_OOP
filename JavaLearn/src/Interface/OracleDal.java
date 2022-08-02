package Interface;

public class OracleDal implements  ICustomerDal {

    @Override
    public void database() {
        System.out.println("oracle bağlandı");
    }
}
