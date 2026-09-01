package Ex46;

public class Programa {
    public static void main(String[] args) {
        // Instanciando a conta com R$ 500,00 de saldo
        ContaBancaria conta = new ContaBancaria("Maria Silva", 500.0);


        System.out.println("--- Dados da Conta ---");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        System.out.println("----------------------\n");


        // CENÁRIO 1: Saque bem-sucedido
        try {
            System.out.println("Tentando sacar R$ 200.00...");
            conta.sacar(200.0);
            System.out.println("Saldo restante: R$ " + conta.getSaldo());
        } catch (SaldoInsulficienteException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }


        System.out.println("\n----------------------\n");


        // CENÁRIO 2: Saque maior que o saldo (Lança exceção)
        try {
            System.out.println("Tentando sacar R$ 400.00...");
            conta.sacar(400.0); // O saldo atual é 300.0, então vai falhar!
            System.out.println("Esta linha não será executada se houver erro.");
        } catch (SaldoInsulficienteException e) {
            // Tratamento amigável exibindo a mensagem repassada na exceção
            System.out.println("[ALERTA] " + e.getMessage());
        }


        System.out.println("\n----------------------");
        System.out.println("O programa continua rodando normalmente sem quebrar!");
    }


}
