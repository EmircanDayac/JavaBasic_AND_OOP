package polymorphism;


public class CustomerManager {
    private  BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Müşterli EKlendi");

        this.logger.log();

    }
}
