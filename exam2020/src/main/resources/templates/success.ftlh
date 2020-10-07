<html>
  <head>
    <link rel="stylesheet" href="style.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="/joke.js"></script>
  </head>
  <body onload="getJoke()">
    <h1>Gewonnen</h1>
    <p>Herzlichen Glückwunsch ${game.playerName}. Du hast ${game.numberOfGuesses} Versuche benötigt</p>
    <a href="/">Nochmal!</a>
    <h2>Leaderboard</h2>
    <ol>
      <#list leaderBoard.entries as e>
      <li>${e.player}: ${e.attempts}</li>
      </#list>
    </ol>
    <div class="desktop-only">
      <hr>
      <p id="setup"></p><button onclick="showPunchline()">OK, sag's mir</button>
      <p style="visibility: hidden" id="punchline"></p>
    </div>
  </body>
</html>
