package de.dhbw.s03;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransactionListController {

  @GetMapping("/transactions")
  ModelAndView listTransactions() {
    ModelAndView mav = new ModelAndView("transaction-list");
    mav.addObject("transactions", getTransactions());
    return mav;
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
