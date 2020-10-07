function getJoke() {
  fetch('https://official-joke-api.appspot.com/random_joke')
    .then(res => res.json())
    .then(joke => {
      $('#setup').text(joke.setup);
      $('#punchline').text(joke.punchline);
    })
}

function showPunchline() {
  $('#punchline').css('visibility', 'visible');
}