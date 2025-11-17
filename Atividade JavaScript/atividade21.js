//Usar split() para dividir string em array
//Usar join() para unir array em string
//Manipular o array resultante
//Criar nova string com separador diferente

const frutasString = "maçã,banana,laranja";

const frutasArray = frutasString.split(",");

const novaString = frutasArray.join(" - ");

console.log("String original:", frutasString);
console.log("Array:", frutasArray);
console.log("Nova string:", novaString);