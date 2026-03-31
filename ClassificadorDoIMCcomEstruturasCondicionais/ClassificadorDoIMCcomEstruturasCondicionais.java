public class AtividadeIMC {
    public static void main(String[] args) {
        String nome = IO.readln("Informe seu nome:");
    char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefio não informar)").charAt(0);
    double altura = Double.parseDouble(IO.readln("Informe sua altura em metros:"));
    double peso = Double.parseDouble(IO.readln("Informe seu peso em quilos:"));

    double imc = peso / (altura * altura);
    String classificacao = "";

    switch (Character.toUpperCase(genero)) {
        case 'M':
            if (imc < 20) {
                classificacao = "Abaixo do Normal";
            } else if (imc < 25) {
                classificacao = "Normal";
            } else if (imc < 30) {
                classificacao = "Obesidade Leve";
            } else if (imc < 40) {
                classificacao = "Obesidade Moderada";
            } else {
                classificacao = "Obesidade Mórbida";
            }
            break;
        case 'F':
        case 'N':
            if (imc < 19) {
                classificacao = "Abaixo do Normal";
            } else if (imc < 24) {
                classificacao = "Normal";
            } else if (imc < 29) {
                classificacao = "Obesidade Leve";
            } else if (imc < 39) {
                classificacao = "Obesidade Moderada";
            } else {
                classificacao = "Obesidade Mórbida";
            }
            break;
        default:
            classificacao = "Gênero inválido";
            break;
    }

    System.out.println("Nome: " + nome);
    System.out.println("Gênero: " + Character.toUpperCase(genero));
    System.out.printf("IMC: %.1f\n", imc);
    System.out.println("Classificação: " + classificacao);
    }
}