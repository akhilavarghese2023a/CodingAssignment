let currentInput = "";
let resultDisplayed = false;

function appendToDisplay(value) {
    if (resultDisplayed) {
        clearDisplay();
    }
    document.getElementById("display").value += value;
    currentInput += value;
}

function clearDisplay() {
    document.getElementById("display").value = "";
    currentInput = "";
    resultDisplayed = false;
}

function calculateResult() {
    try {
        const result = eval(currentInput);
        document.getElementById("display").value = result;
        currentInput = result.toString();
        resultDisplayed = true;
    } catch (error) {
        document.getElementById("display").value = "Error";
        currentInput = "";
        resultDisplayed = true;
    }
}
