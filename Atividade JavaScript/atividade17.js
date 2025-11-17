//Usar map() para transformar array de números
//Usar map() para extrair propriedades de objetos
//Combinar map() com arrow functions

const numeros = [1, 2, 3, 4, 5];

const quadrados = numeros.map(numeros => numeros * numeros);

const pessoas = [
    { nome: "Ana", idade: 25 },
    { nome: "João", idade: 30 },
    { nome: "Maria", idade: 28 }
];

const nomes = pessoas.map(pessoas => pessoas.nome);

console.log("Quadrados:", quadrados);
console.log("Nomes:", nomes);