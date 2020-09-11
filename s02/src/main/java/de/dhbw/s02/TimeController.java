package de.dhbw.s02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TimeController {

  @GetMapping("/time")
  ModelAndView currentTime() {
    ModelAndView modelAndView = new ModelAndView("current-time");
    modelAndView.addObject("now", new SimpleDateFormat("HH:mm:ss").format(new Date()));
    return modelAndView;
  }
}
