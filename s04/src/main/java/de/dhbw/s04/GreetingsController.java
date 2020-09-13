package de.dhbw.s04;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingsController {

  @PostMapping("/greetings")
  ModelAndView receiveUserData(HttpServletRequest request) {

		Enumeration<String> parameters = request.getParameterNames();
		while (parameters.hasMoreElements()) {
			String parameterName = parameters.nextElement();
      String parameterValues = String.join(", ", request.getParameterValues(parameterName));
			System.out.println(parameterName + ": " + parameterValues);
		}

    ModelAndView mav = new ModelAndView("greetings")
       .addObject("firstName", request.getParameter("firstName"))
       .addObject("lastName", request.getParameter("lastName"));
    return mav;
  }
}
