function printMultiplicationTable(input) {
    let num = input[0];

    for (let i = 1; i <= 10; i++) {
        console.log(`${i} * ${num} = ${i * num}`);
    }
}

printMultiplicationTable(["9"]);