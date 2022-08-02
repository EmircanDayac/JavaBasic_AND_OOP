package Interface;

public class MysqlDal implements ICustomerDal {

    @Override
    public void database() {
        System.out.println("Mysql Data");
    }
}
