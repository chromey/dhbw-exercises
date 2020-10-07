package de.dhbw.exam2020;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

  @Autowired
  Game game;

  @Autowired
  LeaderBoard leaderBoard;

  @PostMapping("/register")
  String register(HttpServletRequest request) {
    String name = request.getParameter("playerName");
    game.start(name);
    return "redirect:guess";
  }

  @PostMapping("/make-guess")
  String makeGuess(HttpServletRequest request) {
    game.guess(Integer.parseInt(request.getParameter("guessed")));
    if (game.isSuccess()) {
      leaderBoard.addEntry(game.getPlayerName(), game.getNumberOfGuesses());
      return "redirect:success";
    } else {
      return "redirect:guess";
    }
  }

  @GetMapping("/guess")
  ModelAndView guess() {
    return new ModelAndView("guess").addObject("game", game);
  }

  @GetMapping("/success")
  ModelAndView success() {
    return new ModelAndView("success").addObject("game", game).addObject("leaderBoard", leaderBoard);
  }
}
