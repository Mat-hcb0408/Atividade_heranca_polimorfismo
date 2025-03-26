package org.herancapolimorfismo.heranca_polimorfismo.Exercicio_3;

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.1;
    }
}
