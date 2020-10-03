package de.dhbw.s07;

public class Transaction {

  private String description;
  private int amount;

  public Transaction(String description, int amount) {
    this.description = description;
    this.amount = amount;
  }

  public String getDescription() {
    return description;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
