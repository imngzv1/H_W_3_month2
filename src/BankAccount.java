public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount=amount+sum;
        System.out.println("Вы внесли в счет : "+sum);
    }
    public void withDraw(int sum)throws LimitException{
        if (sum > amount) {
            throw new LimitException("Ты дурак?"+" У вас на счету: ",amount);
            
        }else {
            System.out.println("Вы сможете снять: "+sum);
        amount-=sum;
            System.out.println("Вы сняли: "+sum);
        }
    }
}
