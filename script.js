document.getElementById('carbonForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Evita o recarregamento da página

    // Obtendo valores do formulário
    const consumoKWh = parseFloat(document.getElementById('consumo').value);
    const fatorEmissao = parseFloat(document.getElementById('energia').value);

    // Cálculo da emissão de CO₂
    const emissaoCO2 = consumoKWh * fatorEmissao;

    // Exibindo o resultado na tela
    const resultadoDiv = document.getElementById('resultado');
    resultadoDiv.textContent = `A emissão de CO₂ é de ${emissaoCO2.toFixed(2)} kg para um consumo de ${consumoKWh} kWh.`;
});
