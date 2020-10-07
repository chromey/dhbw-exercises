<html>
  <head>
    <link rel="stylesheet" href="style.css"/>
  </head>
  <body>
    <h3>Hallo ${game.playerName}</h3>

    <#if game.numberOfGuesses == 0>
      <p>Wähle eine Zahl zwischen 1 und 100</p>
    <#else>
      <p>Dein ${game.numberOfGuesses}. Versuch war: ${game.lastGuess}.</p>
      <p>${game.hint}.</p>
    </#if>
    <form action="/make-guess" method="post">
      Neuer Versuch: <input type="number" name="guessed">
      <input type="submit" value="Raten">
    </form>
  </body
</html>

