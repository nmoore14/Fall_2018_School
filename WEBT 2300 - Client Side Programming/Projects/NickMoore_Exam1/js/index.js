var userDifficulty;
var gameSettings;
var random_num;
var guess_count = 0;
var gameLog = [];

function gameInfo() {
    var info = `
        Welcome To Guess-A-Number

        * To start, click "Load Game File" > Follow the prompt
        * Once Difficulty is selected click on "Start"
        * Enter a guess in the box and click submit

        *** HAVE FUN!!! ***
    `;

    alert(info);
}

function loadGame() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if(this.readyState == 4 && this.status == 200) {
            gameSettings = this.responseText;
        }
    };
    xhttp.open("GET", "./data/guessinggame.json", true);
    xhttp.send();
    userDifficulty = prompt("Please select a difficulty.\n0 - Easy\n1 - Medium\n2 - Difficult", "Choice");
    gameSettings = JSON.parse(gameSettings);
};

function getRandomInt(from, to) {
    from = Math.ceil(from);
    to = Math.floor(to);
    return Math.floor(Math.random() * (to - from + 1) + from);
}

function setGame() {
    var num_from = gameSettings.guessinggame[userDifficulty].from;
    var num_to = gameSettings.guessinggame[userDifficulty].to;
    random_num = getRandomInt(num_from, num_to);
    var num_range = "Range: " + num_from + " to " + num_to + ".";
    document.getElementById("range-display").innerHTML = num_range;
};

function guess() {
    var user_guess = document.myGameForm.userGuess.value;
    // console.log(random_num);

    if (user_guess < random_num) {
        var gameHint = "My number is higher than " + user_guess;
        document.getElementById("hint-display").innerHTML = gameHint;
        guess_count++;
       // console.log(guess_count);
    } else if (user_guess > random_num) {
        var gameHint = "My number is less than " + user_guess;
        document.getElementById("hint-display").innerHTML = gameHint;
        guess_count++;
        // console.log(guess_count);
    } else {
        guess_count++;
        alert("Your guessed CORRECTLY!!! It took you " + guess_count + " guess(es)");
        gameLogCount();
        document.getElementById("guess-display").innerHTML = guess_count;
        var startHint = "Please enter a MIN and MAX number to generate your number.";
        document.getElementById("range-display").innerHTML = "";
        document.getElementById("hint-display").innerHTML = '';
        document.getElementById("form-grid-wrapper").reset();
        guess_count = 0;
        random_num = 0;
        num_from = 0;
        num_to = 0;
    }
    document.getElementById("form-grid-wrapper").reset();
    document.getElementById("guess-display").innerHTML = guess_count;
};

function gameLogCount() {
    gameLog.push(guess_count);
    alert("You have played " + gameLog.length + " game(s).");
    document.getElementById("game-display").innerHTML = gameLog.length;
}