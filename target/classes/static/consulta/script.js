const pessoasRadio = document.querySelector("#pessoas");
const alocacoesRadio = document.querySelector("#alocacoes");
const formPessoas = document.querySelector(".form-pessoas");
const formAlocacoes = document.querySelector(".form-alocacoes");
const resultadoPessoas = document.querySelector("#resultado-pessoas");
const resultadoAlocacoes = document.querySelector("#resultado-alocacoes");

pessoasRadio.addEventListener('change', () => {
  formPessoas.classList.remove("hidden");
  formAlocacoes.classList.add("hidden");
  resultadoAlocacoes.classList.add("hidden")
});

alocacoesRadio.addEventListener('change', () => {
  formPessoas.classList.add("hidden");
  resultadoPessoas.classList.add("hidden");
  formAlocacoes.classList.remove("hidden");
})

formPessoas.addEventListener('submit', mostrarResultado);
formAlocacoes.addEventListener('submit', mostrarResultado);

function mostrarResultado(event) {
  if(pessoasRadio.checked){
    resultadoPessoas.classList.remove("hidden");
    event.preventDefault();
  }
  if(alocacoesRadio.checked){
    resultadoAlocacoes.classList.remove("hidden")
    event.preventDefault();
  }
}
