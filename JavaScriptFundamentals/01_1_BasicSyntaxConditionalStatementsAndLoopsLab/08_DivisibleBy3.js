function printNumbersFrom1To100DivisibleBy3() {
    for (let i = 1; i <= 100; i++) {
        if (i % 3 === 0) {
            console.log(i);
        }
    }
}

printNumbersFrom1To100DivisibleBy3();