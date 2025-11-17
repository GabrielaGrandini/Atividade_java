//Usar length para obter tamanho da string
//Usar toUpperCase() e toLowerCase()
//Usar charAt() para acessar caracteres
//Usar indexOf() para encontrar posições

const frase = "JavaScript é incrível";

const tamanho = frase.lenght;

const maiuscula = frase.toUpperCase();
const minuscula = frase.toLocaleLowerCase();

const primeiro = frase.charAt(0);
const ultimo = frase.charAt(frase.length - 1);

const posicao = frase.indexOf("é");

console.log("Tamanho:", tamanho);
console.log("Maiúscula:", maiuscula);
console.log("Minúscula:", minuscula);
console.log("Primeiro caractere:", primeiro);
console.log("Último caractere:", ultimo);
console.log("Posição de 'é':", posicao);