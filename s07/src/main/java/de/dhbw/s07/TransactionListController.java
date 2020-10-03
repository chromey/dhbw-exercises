package de.dhbw.s07;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionListController {

  @GetMapping("/transactions")
  List<Transaction> listTransactions() {
    return getTransactions();
  }

  private List<Transaction> getTransactions() {
    return Arrays.asList(
      new Transaction("Gehalt", 3000),
      new Transaction("Miete", -800),
      new Transaction("Netflix Abo", -10),
      new Transaction("Steuerrückzahlung", 1500)
    );
  }
}
