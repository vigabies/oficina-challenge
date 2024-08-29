package controle;

import modelo.Cliente;
import modelo.Veiculo;

public class Principal {
    public static void main(String[] args) {
        // Exemplo de instanciamento de Cliente
        Cliente cliente1 = new Cliente("123.456.789-00", "Joao da Silva", "Rua A, 123", "(11) 98765-4321", "joao.silva@email.com");
        System.out.println(cliente1);

        // Exemplo de instanciamento de Veiculo
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Fusca", 1975, "Volkswagen", "Azul");
        System.out.println(veiculo1);
    }
}