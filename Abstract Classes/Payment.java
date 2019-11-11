

abstract class Payment{
    abstract void payBill();
}

class CreditCard extends Payment{
    void payBill(){
        System.out.println("Credit Card : pay bill");
    }
}

class DebitCard extends Payment{
    void payBill(){
        System.out.println("Debit Card : pay bill");
    }
}

class Cash extends Payment{
    void payBill(){
        System.out.println("Cash : pay bill");
    }
}

class UPI extends Payment{
    void payBill(){
        System.out.println("UPI : pay bill");
    }
}