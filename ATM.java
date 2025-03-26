public class ATM{
  public static void main(String[] args){
     double balance=2000.00;
     double withdrawAmount=1500.00;
     try{
           if(withdrawAmount>balance){
              throw new
Exception("Insufficient Balance");
        }
        balance-=withdrawAmount;
        System.out.println("Withdrawal successfully remaining balance:"+balance);
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
  }                                                              
}