package Throw;

public class BalanceException extends Exception{
private String Message;
public  BalanceException(String Message_x){
    this.Message = Message_x;
}

    public String getMessage() {
        return Message;
    }
}
