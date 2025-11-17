//Criar uma função chamada 'saudacao'
//A função deve receber um parâmetro 'nome'
//Retornar a string 'Olá, [nome]!'
//Chamar a função com seu nome


function saudacao(nome) {
    return String ("Olá, ") + nome;
}

let resultado = saudacao("Maria");
console.log(resultado);