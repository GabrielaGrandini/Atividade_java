//Criar um objeto 'pessoa' com propriedades nome, idade e cidade
//Exibir cada propriedade separadamente
//Modificar a idade para 26
//Exibir o objeto completo

let pessoa = {
    nome: "Órion",
    idade: 17,
    cidade: "Noite dos ventos"
};

console.log("Nome:", pessoa.nome);
console.log("Idade:", pessoa.idade);
console.log("Cidade:", pessoa.cidade);

pessoa.idade = 26;

console.log("Pessoa:", pessoa);