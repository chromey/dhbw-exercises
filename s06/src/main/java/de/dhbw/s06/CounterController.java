package de.dhbw.s06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import de.dhbw.s06.counter.ApplicationCounter;
import de.dhbw.s06.counter.RequestCounter;
import de.dhbw.s06.counter.SessionCounter;

@Controller
public class CounterController {
  
  @Autowired
  private ApplicationCounter appCounter;

  @Autowired
  private SessionCounter sessionCounter;

  @Autowired
  private RequestCounter requestCounter;

  @GetMapping("/")
  ModelAndView count() {
    appCounter.increment();
    sessionCounter.increment();
    requestCounter.increment();
    
    return new ModelAndView("index")
      .addObject("requestCount", requestCounter.getCount())
      .addObject("sessionCount", sessionCounter.getCount())
      .addObject("applicationCount", appCounter.getCount());
  }
}


