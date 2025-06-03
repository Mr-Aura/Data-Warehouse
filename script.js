alert("Welcome to the True or False Quiz Game!")
let questionNumber = 0;
let score = 0;
let correctAnswer = null;

let question = document.getElementById('question');
let points = document.getElementById('points');

function trueButton() {
    if (correctAnswer)
    score += 1
    points.textContent = score
    nextQuestion()
}

function falseButton() {
    if (!correctAnswer && correctAnswer != null)
    score += 1
    points.textContent = score
    nextQuestion()
}

function nextQuestion() {
    questionNumber = questionNumber + 1;
    switch (questionNumber) {
        case 1:
            questionNo.textContent = 'Question 1 of 20'
            question.textContent = 'Java has pointers?';
            correctAnswer = false;
            break;
        case 2:
            questionNo.textContent = 'Question 2 of 20'
            question.textContent = 'Founder of Python is Guido van Rossum?';
            correctAnswer = true;
            break;
        case 3:
            questionNo.textContent = 'Question 3 of 20'
            question.textContent = 'Founder of C++ is Bjarne Stroustrup';
            correctAnswer = true;
            break;
        case 4:
            questionNo.textContent = 'Question 4 of 20'
            question.textContent = 'Array in Javascript can have multiple data type and is created using []?';
            correctAnswer = true;
            break;
        case 5:
            questionNo.textContent = 'Question 5 of 20'
            question.textContent = 'Multiple inheritance is possible with classes in Java?';
            correctAnswer = false;
            break;
        case 6:
            questionNo.textContent = 'Question 6 of 20'
            question.textContent = 'C++ has interfaces?';
            correctAnswer = false;
            break;
        case 7:
            questionNo.textContent = 'Question 7 of 20'
            question.textContent = 'Full form of SQL is Structured Query Language?';
            correctAnswer = true;
            break;
        case 8:
            questionNo.textContent = 'Question 8 of 20'
            question.textContent = 'JavaScript is a compiled language.';
            correctAnswer = false;
            break;

        case 9:
            questionNo.textContent = 'Question 9 of 20'
            question.textContent = 'Python supports multiple inheritance.';
            correctAnswer = true;
            break;

        case 10:
            questionNo.textContent = 'Question 10 of 20'
            question.textContent = 'The creator of Java is James Gosling.';
            correctAnswer = true;
            break;

        case 11:
            questionNo.textContent = 'Question 11 of 17'
            question.textContent = 'In SQL, DELETE and TRUNCATE do the same thing.';
            correctAnswer = false;
            break;

        case 12:
            questionNo.textContent = 'Question 12 of 20'
            question.textContent = 'Go programming language was developed at Google.';
            correctAnswer = true;
            break;

        case 13:
            questionNo.textContent = 'Question 13 of 20'
            question.textContent = 'The === operator in JavaScript checks only value, not type.';
            correctAnswer = false;
            break;

        case 14:
            questionNo.textContent = 'Question 14 of 20'
            question.textContent = 'try...except is used for error handling in JavaScript.';
            correctAnswer = false;
            break;

        case 15:
            questionNo.textContent = 'Question 15 of 20'
            question.textContent = 'C# is a language developed by Microsoft.';
            correctAnswer = true;
            break;

        case 16:
            questionNo.textContent = 'Question 16 of 20'
            question.textContent = 'Java supports operator overloading.';
            correctAnswer = false;
            break;

        case 17:
            questionNo.textContent = 'Question 17 of 20'
            question.textContent = 'LocalStorage in JavaScript stores data permanently unless cleared.';
            correctAnswer = true;
            break;

        case 18:
            questionNo.textContent = 'Question 18 of 20'
            question.textContent = 'HTML stands for HyperText Markup Language.';
            correctAnswer = true;
            break;

        case 19:
            questionNo.textContent = 'Question 19 of 20'
            question.textContent = 'NaN === NaN returns true in JavaScript.';
            correctAnswer = false;
            break;

        case 20:
            questionNo.textContent = 'Question 20 of 20'
            question.textContent = 'In Python, indentation is mandatory for defining blocks.';
            correctAnswer = true;
            break;

        default:
            question.textContent = 'You finished the quiz!'
            questionNo.textContent = ''
            correctAnswer = null;
    }
}

nextQuestion();