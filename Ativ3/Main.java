package org.herancapolimorfismo.heranca_polimorfismo.Exercicio_3;

public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Carlos", 3000);
        Gerente gerente = new Gerente("Mariana", 5000, 1500);
        Desenvolvedor dev = new Desenvolvedor("João", 4000);

        System.out.println(func.nome + " - Salário: R$" + func.calcularSalario());
        System.out.println(gerente.nome + " - Salário: R$" + gerente.calcularSalario());
        System.out.println(dev.nome + " - Salário: R$" + dev.calcularSalario());
    }
}

