public class Conta {

    protected String agencia;
    protected String numero;
    protected float saldo;

    public void saque(float valor) {2
        if (saldo < valor) {
            System.out.println("O saldo é insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque efetura com sucesso!");

        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}