<html>
	<body>
	<p>Ihre Eingabe: ${userGuess}</p>
	<#if correct>
	<h1>Glückwunsch!</h1>
	<#else>
	<h1>Daneben!</h1>
	<p>Die richtige Zahl ist ${actual}.</p>
	</#if>
	</body>
</html>
