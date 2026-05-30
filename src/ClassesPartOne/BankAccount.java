package ClassesPartOne;

public class BankAccount {
  private String accountNumber;
  private double accountBalance = 0.0;
  private String customerName = "";
  private String customerEmail = "";
  private String customerPhone = "";

  public BankAccount() {
    this("Kenny", "kenny@email.com", "8188506406", "09828119", 9.98);
    System.out.println("Bank Account No-Args Constructor");
  }

  public BankAccount(String customerName, String customerEmail, String customerPhone, String accountNumber, double accountBalance) {
    System.out.println("Bank Account Args Constructor");
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhone = customerPhone;

  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public void depositFunds(double fund) {
    double fundedBalance = this.accountBalance + fund;
    this.accountBalance = fundedBalance;
  }

  public void withdrawFunds(double fund) {

    double withdrawnBalance = this.accountBalance - fund;
    if (withdrawnBalance < 0.0) {
      System.out.println("Insufficient funds. You have " + "$" + this.accountBalance + " left.");
      return;
    }
    this.accountBalance = withdrawnBalance;
  }
}
