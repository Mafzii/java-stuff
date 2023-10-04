package polymorphism;
class Account {
  protected double balance;

  public Account() {
    balance = 0;
  }
  public void Withdraw(double amount) {}
  public void Deposit(double amount) {}
  public void printBalance() {
    System.out.println(balance);
  }
}

class Savings extends Account {
  private double interestRate = 0.8;
  public Savings(double balance) {
    this.balance = balance;
  }
  @Override
  public void Withdraw(double amount) {
    balance = balance - (amount * (interestRate)) - amount; 
  }
  @Override
  public void Deposit(double amount) {
    balance = balance + (amount * (interestRate)) + amount;
  } 
  @Override
  public void printBalance() {
    super.printBalance();
  }
}

class Current extends Account {
  public Current(double balance) {
    this.balance = balance;
  }
  @Override
  public void Withdraw(double amount) {
    balance = balance - amount; 
  }
  @Override
  public void Deposit(double amount) {
    balance = balance + amount;
  } 
  @Override
  public void printBalance() {
    super.printBalance();
  }
}

class demo {
  
  public static void main(String args[]) {
    // creating savings account object
    Account SAccount = new Savings(50000);
    
    SAccount.Deposit(1000);
    SAccount.printBalance();

    SAccount.Withdraw(3000);
    SAccount.printBalance();

    System.out.println();

    // creating current account object
    Account CAccount = new Current(50000);
    CAccount.Deposit(1000);
    CAccount.printBalance();

    CAccount.Withdraw(3000);
    CAccount.printBalance();  
  }
  
}