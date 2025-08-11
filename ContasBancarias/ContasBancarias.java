package Main.ContasBancarias;

public class ContasBancarias {
    public String nome;
    public String senha;
    public double saldo;

    public double sacarDinheiro(double valor, String senhaCheck) {

        if (senhaCheck != senha) {
            System.out.println("Sua senha está incorreta, ação inválidada.");
            return saldo;
        } else if (valor > saldo) {
            System.out.println("Você não pode sacar essa quantia, ela é maior que: " + saldo + "R$");
            return saldo;
        }
        System.out.println("Saque de " + valor + "R$ feito com sucesso!");
        return saldo -= valor;
    }

    public double depositarDinheiro(double valor, String senhaCheck) {

        if (senhaCheck != senha) {
            System.out.println("Sua senha está incorreta, ação inválidada.");
            return saldo;
        }
        System.out.println("Deposito de " + valor + "R$ feito com sucesso!");
        return saldo += valor;
    }

    public static void main(String[] args) {

        ContasBancarias c001 = new ContasBancarias();
        c001.nome = "Wanessa Lima";
        c001.senha = "wAnessa001903";
        c001.saldo = 50;

        ContasBancarias c002 = new ContasBancarias();
        c002.nome = "Emanuel Silva";
        c002.senha = "Minhasenha001";
        c002.saldo = 80;



        System.out.println(c001.depositarDinheiro(150, "wAnessa001903"));

        System.out.println("-------------------------------------------------");
        System.out.println(c001.nome + " tem um total de " + c001.saldo + "R$");
    }
}
