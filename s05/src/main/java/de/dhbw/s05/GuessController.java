package de.dhbw.s05;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuessController {
  
  @GetMapping ("/")
  public String index() {
    return "index";
  }

  @GetMapping("/guess")
  public ModelAndView guess(HttpServletRequest request) {
    int userGuess = Integer.parseInt(request.getParameter("number"));
    
    GuessingGame game = new GuessingGame();
    
    ModelAndView mav = new ModelAndView("result");
    mav
      .addObject("userGuess", userGuess)
      .addObject("actual", game.getCorrectResult())
      .addObject("correct", game.test(userGuess));
    return mav;
  }
}
