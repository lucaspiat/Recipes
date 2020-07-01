//Consulta nome da receita pelo id

async function consultaNomeReceita(matricula) {
    //console.log(matricula);

    let url = "http://localhost:8080//consulta_receita/dadosreceita";
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


/*async function listaReceitas() {
    //console.log(matricula);

    let url = "http://localhost:8080/mywebapp/listareceitas";
    //url = url + "?matricula="+matricula;

    try{
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
    }*/


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
    }else{
        let nome = document.getElementById("nomeReceita");
        nome.innerHTML = " - ";
        erro = document.getElementById("erro");
        erro.innerHTML = "Erro na consulta dos dados";
    }

}

    /*document.getElementById("btLista").onclick = async function () {
        id = document.getElementById("recipeList").value;
        let resposta = await listaReceitas();
        if (resposta != null){
            let lista = document.getElementById("recipeList");
            if (resposta == true){
                lista.innerHTML = "id Receita: "+id;
            }else{
                lista.innerHTML = "Nome Receita: "+nome;
            }
            erro = document.getElementById("erro");
            erro.innerHTML = " - ";
        }else{
            erro = document.getElementById("erro");
            erro.innerHTML = "Erro na consulta";
        }  
    }
*/
