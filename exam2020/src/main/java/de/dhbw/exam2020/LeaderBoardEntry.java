package de.dhbw.exam2020;

public class LeaderBoardEntry implements Comparable {

  private String player;
  private int attempts;

  public LeaderBoardEntry(String player, int attempts) {
    this.player = player;
    this.attempts = attempts;
  }

  @Override
  public int compareTo(Object o) {
    return this.attempts - ((LeaderBoardEntry) o).attempts;
  }

  public String getPlayer() {
    return player;
  }

  public int getAttempts() {
    return attempts;
  }


}
