package q03;

public class Main {
    public static void main(String[] args) {
        Data dataVoo = new Data(12, 9, 2023);
        Voo voo = new Voo(101, dataVoo);

        System.out.println("Número do Voo: " + voo.retornaVoo());
        System.out.println("Data do Voo: " + voo.retornaData());

        int proximaCadeiraLivre = voo.proximoLivre();
        System.out.println("Próxima cadeira livre: " + proximaCadeiraLivre);

        int numeroCadeira = 5;
        System.out.println("A cadeira " + numeroCadeira + " está ocupada? " + voo.verifica(numeroCadeira));

        boolean ocupouCadeira = voo.ocupa(numeroCadeira);
        System.out.println("Ocupou a cadeira " + numeroCadeira + "? " + ocupouCadeira);

        int vagasDisponiveis = voo.retornaVagas();
        System.out.println("Número de vagas disponíveis: " + vagasDisponiveis);
    }
}


