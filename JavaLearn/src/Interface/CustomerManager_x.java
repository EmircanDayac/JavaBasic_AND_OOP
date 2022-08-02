package Interface;

public class CustomerManager_x {

    ICustomerDal _Custom;
    public CustomerManager_x(ICustomerDal Customer){
        this._Custom = Customer;
    }

    public void add(){
     _Custom.database();
    }

}
