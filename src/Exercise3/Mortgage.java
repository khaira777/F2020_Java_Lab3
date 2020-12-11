package Exercise3;

public abstract class Mortgage implements MortgageConstants {
    int mortgageNumber;
    String customerName;
    double amount;
    double interestRate;
    int term;
  
   public int getMortgageNumber() {
       return mortgageNumber;
   }

   public void setMortgageNumber(int mortgageNumber) {
       this.mortgageNumber = mortgageNumber;
   }

   public String getCustomerName() {
       return customerName;
   }

   public void setCustomerName(String customerName) {
       this.customerName = customerName;
   }

   public double getAmount() {
       return amount;
   }

   public void setAmount(double amount) {
       this.amount = amount;
   }

   public double getInterestRate() {
       return interestRate;
   }

   public void setInterestRate(double interestRate) {
       this.interestRate = interestRate;
   }

   public int getTerm() {
       return term;
   }

   public void setTerm(int term) {
       this.term = term;
   }

   public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
       super();
       this.mortgageNumber = mortgageNumber;
       this.customerName = customerName;
       if(amount <= MAXAMOUNT)
           this.amount = amount;
       else
           this.amount =MAXAMOUNT;
       this.interestRate = interestRate;
       if(term != 3 || term != 5 )
           this.term = SHORTTERM;
   }
  
   public abstract String getMortgageInfo();
}
