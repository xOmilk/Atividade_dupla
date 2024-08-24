package Exercicio_de_autorevisao;



public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente( float saldo, float valorLimite){
        if(saldo<0||valorLimite<0){
            throw new IllegalArgumentException("Saldo e limite não podem ter o seu valor negativo");

        }
        this.setSaldo(saldo);
        this.setValorLimite(valorLimite);
        this.setLimite(valorLimite);
    }




    public void depositar(float valor){
        if(valor<0){
            throw new IllegalArgumentException("O valor a ser depositado deve ser maior que 0");
        }
        System.out.println("Depositando "+valor+"R$ da sua conta!!!");
        this.setSaldo(getSaldo()+valor);
        System.out.println("Seu saldo atual é de: "+this.getSaldo()+"R$");
    }
    public void sacar(float valor){
        if(valor<0){
            throw new IllegalArgumentException("O valor a ser sacado deve ser maior que 0");
        }
        else if(valor>saldo){
            throw new IllegalArgumentException("Voce não pode sacar um valor maior que possui!!!");
        }else {
            System.out.println("Sacando "+valor+"R$ da sua conta!!!");
            this.setSaldo(getSaldo()-valor);
            System.out.println("Seu saldo atual é de: "+this.getSaldo()+"R$");
        }


    }


    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if(limite<0){
            throw new IllegalArgumentException("O limite não pode ser negativo");
        }

        this.limite = limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {


        this.saldo = saldo;
    }

    public float getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(float valorLimite) {
        this.valorLimite = valorLimite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                ", valorLimite=" + valorLimite +
                '}';
    }

    public static void main(String[] args) {
        try {
            ContaCorrente c1 = new ContaCorrente(500.0f, 200.0f);

            System.out.println(c1);

            c1.sacar(600.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ContaCorrente c2 = new ContaCorrente(500.0f, 200.0f);

            c2.depositar(-100.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ContaCorrente c3 = new ContaCorrente(500.0f, 200.0f);

            c3.setValorLimite(-50.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


}
