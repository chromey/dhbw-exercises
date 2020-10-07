package de.dhbw.exam2020;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class Game {
  String playerName;
  int result;
  int numberOfGuesses;
  int lastGuess;
  boolean success;

  public void start(String name) {
    this.success = false;
    this.playerName = name;
    this.result = ThreadLocalRandom.current().nextInt(1, 100);
    this.numberOfGuesses = 0;
  }

  public String getPlayerName() {
    return playerName;
  }

  public int getResult() {
    return result;
  }

  public void guess(int guess) {
    if (!this.success) {
      this.numberOfGuesses++;
      this.lastGuess = guess;
      this.success = guess == result;
    }
  }

  public int getLastGuess() {
    return lastGuess;
  }

  public int getNumberOfGuesses() {
    return numberOfGuesses;
  }

  public boolean isSuccess() {
    return success;
  }

  public String getHint() {
    if (lastGuess < result) {
      return "Die gesuchte Zahl ist größer.";
    } else if (lastGuess > result) {
      return "Die gesuchte Zahl ist kleiner.";
    } else {
      return "";
    }
  }
  
}
