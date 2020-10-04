package de.dhbw.s04.alternative;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsWithRedirectController {

  @Autowired
  User user;

  @PostMapping("/greetings-alternative")
  public ModelAndView receiveUserData(HttpServletRequest request) {
    user.setFirstName(request.getParameter("firstName"));
    user.setLastName(request.getParameter("lastName"));
    return new ModelAndView("redirect:greetings-result");
  }

  @GetMapping("/greetings-result")
  public ModelAndView displayGreetings() {
    return new ModelAndView("greetings")
      .addObject("firstName", user.getFirstName())
      .addObject("lastName", user.getLastName());
  }
}
