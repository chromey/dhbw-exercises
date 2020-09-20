package de.dhbw.s05;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

  int randomNumber;

  public GuessingGame() {
    randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
  }

  public int getCorrectResult() {
    return randomNumber;
  }

  public boolean test(int guessed) {
    return guessed == randomNumber;
  }
}
