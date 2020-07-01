//Consulta nome da receita pelo id

async function consultaNomeReceita(matricula) {
    //console.log(matricula);

    let url = "http://localhost:8080/consulta_receita/dadosreceita";
    url = url + "?matricula="+matricula;

    try {
        let resposta = await fetch(url);
        //console.log(resposta);
        if (resposta.ok){
            let dados = await resposta.json();
            //console.log(dados);
            return dados;
        }else{
            //console.log(resposta.status+", text="+resposta.statusText);
            return null;
        }
    }catch(erro){
        console.log(erro);
    }

}

// Mostra Lista Receitas


async function listaReceitas() {
    //console.log(matricula);

    let url = "http://localhost:8080/consulta_receita/listareceitas";
    //url = url + "?matricula="+matricula;

    try {
        let resposta = await fetch(url);
        //console.log(resposta);
        if (resposta.ok) {
            let dados = await resposta.json();
            //console.log(dados);
            return dados;
        } else {
            //console.log(resposta.status+", text="+resposta.statusText);
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
        //let json = document.getElementById("jsonValor");
        //json.innerHTML = JSON.stringify(resposta);
    } else {
        let nome = document.getElementById("nomeReceita");
        nome.innerHTML = " - ";
        erro = document.getElementById("erro");
        erro.innerHTML = "Erro na consulta dos dados";
    }

}

document.getElementById("btLista").onclick = async function () {
        let resposta = await listaReceitas();
        if (resposta != null){
            let tables = document.getElementById("listareceitas");
            tables.innerHTML = resposta;
            erro = document.getElementById("erro");
            erro.innerHTML = "";
            //let json = document.getElementById("jsonValor");
            //json.innerHTML = JSON.stringify(resposta);
        } else {
            let tables = document.getElementById("listareceitas");
            tables.innerHTML = " - ";
            erro = document.getElementById("erro");
            erro.innerHTML = "Erro na consulta dos dados";
        }
    
    }

