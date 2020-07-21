// Consulta nome da receita pelo id
async function consultaNomeReceita(matricula) {
    
    let url = "http://localhost:8080/consulta_receita/dadosreceita";
    url = url + "?matricula="+matricula;

    try {
        let resposta = await fetch(url);
        
        if (resposta.ok){
            let dados = await resposta.json();
            
            return dados;
        }else{
            
            return null;
        }
    }catch(erro){
        console.log(erro);
    }

}

// Mostra Lista Receitas
async function listaReceitas() {
    

    let url = "http://localhost:8080/consulta_receita/listareceitas";
    

    try {
        let resposta = await fetch(url);
        
        if (resposta.ok) {
            let dados = await resposta.json();
            
            return dados;
        } else {
            
            return null;
        }
    } catch(erro) {
        console.log(erro);
    }
}

// --- início do programa
document.getElementById("btDados").onclick = async function () {
    let matricula = document.getElementById("matricula").value;
    let resposta = await consultaNomeReceita(matricula);
    if (resposta != null){
        let nome = document.getElementById("nomeReceita");
        nome.innerHTML = resposta.nome;
        erro = document.getElementById("erro");
        erro.innerHTML = "";
        } else {
        let nome = document.getElementById("nomeReceita");
        nome.innerHTML = " - ";
        erro = document.getElementById("erro");
        erro.innerHTML = "Erro na consulta dos dados";
    }

}

document.getElementById("btLista").onclick = async function () {
        let resposta = await listaReceitas();
        if (resposta != null) {
            let tables = document.getElementById("listareceitas");
            let innerHTML = '';
            resposta.forEach(obj => {
                innerHTML += ' - ' + obj.nome;
            });
        tables.innerHTML = innerHTML;
            erro = document.getElementById("erro");
            erro.innerHTML = "";
            } else {
            let tables = document.getElementById("listareceitas");
            tables.innerHTML = " - ";
            erro = document.getElementById("erro");
            erro.innerHTML = "Erro na consulta dos dados";
        }
    
    }