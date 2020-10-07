package de.dhbw.exam2020;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Component
public class LeaderBoard {
  private SortedSet<LeaderBoardEntry> entries = new TreeSet<>();

  public void addEntry(String playerName, int attempts) {
    entries.add(new LeaderBoardEntry(playerName, attempts));
  }

  public Set<LeaderBoardEntry> getEntries() {
    return this.entries;
  }
}
