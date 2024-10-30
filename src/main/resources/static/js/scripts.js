// js/scripts.js

// Login
document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Implementar a requisição para login
    console.log('Login:', { username, password });
});

// Cadastro de Produto
document.getElementById('cadastroProdutoForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const nome = document.getElementById('nome').value;
    const descricao = document.getElementById('descricao').value;
    const valorInicial = document.getElementById('valorInicial').value;

    // Implementar requisição para cadastrar o produto
    console.log('Cadastro Produto:', { nome, descricao, valorInicial });
});

// Fazer Lance
document.getElementById('fazerLanceForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const valorLance = document.getElementById('valorLance').value;

    // Implementar requisição para fazer lance
    console.log('Lance:', { valorLance });
});