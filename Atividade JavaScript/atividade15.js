//Converter uma função tradicional em arrow function
//Criar arrow function que calcula quadrado de um número
//Usar arrow function em um array.map()

function dobrar(numero) {
    return numero * 2;
}

const quadrado = numero => numero * numero;

const numeros = [1, 2, 3, 4];
const dobrados = numeros.map(numero => numero*2);

console.log("Quadrado de 5:", quadrado(5));
console.log("Números dobrados:", dobrados);