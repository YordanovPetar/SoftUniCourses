function printIsLowerOrUpperCase(char) {
    if (char.toUpperCase() === char) {
        console.log('upper-case');
    } else {
        console.log('lower-case');
    }
}

printIsLowerOrUpperCase('f');