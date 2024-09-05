import java.util.Scanner;

    public class CalculadoraCarbono {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Dados básicos para cálculo (emissões médias de CO₂ por kWh)
            double emissaoPorKWh = 0.475; // kg de CO₂ por kWh

            System.out.println("Bem-vindo à Calculadora de Carbono!");
            System.out.print("Insira o consumo de energia do seu dispositivo (em kWh): ");
            double consumoKWh = scanner.nextDouble();

            // Cálculo da emissão de CO₂
            double emissaoCO2 = consumoKWh * emissaoPorKWh;

            System.out.printf("A emissão de CO₂ para um consumo de %.2f kWh é de %.2f kg.%n", consumoKWh, emissaoCO2);

            scanner.close();
        }
    }
