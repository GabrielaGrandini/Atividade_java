//Criar um objeto 'calculadora'
//Adicionar método 'somar' que recebe dois números
//Adicionar método 'multiplicar' que recebe dois números
//Testar ambos os métodos

let calculadora = {
    somar: function(a, b) {
        return a + b;
    },
    multiplicar: function(a, b) {
        return a*b;
    }
};

let soma = calculadora.somar(3, 4);
let produto = calculadora.multiplicar(3, 4);

console.log("Soma:", soma);
console.log("Produto:", produto);