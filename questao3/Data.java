package q03;

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

class Voo {
    private int numeroVoo;
    private Data dataVoo;
    private boolean[] ocupacao;

    public Voo(int numeroVoo, Data dataVoo) {
        this.numeroVoo = numeroVoo;
        this.dataVoo = dataVoo;
        ocupacao = new boolean[100];
    }

    public int proximoLivre() {
        for (int i = 0; i < ocupacao.length; i++) {
            if (!ocupacao[i]) {
                return i + 1; // Cadeiras são numeradas a partir de 1, não de 0
            }
        }
        return -1; // Todas as cadeiras estão ocupadas
    }

    public boolean verifica(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            return false; // Número de cadeira inválido
        }
        return ocupacao[numeroCadeira - 1];
    }

    public boolean ocupa(int numeroCadeira) {
        if (numeroCadeira < 1 || numeroCadeira > 100) {
            return false; // Número de cadeira inválido
        }

        if (!ocupacao[numeroCadeira - 1]) {
            ocupacao[numeroCadeira - 1] = true;
            return true;
        } else {
            return false; // Cadeira já ocupada
        }
    }

    public int retornaVagas() {
        int vagas = 0;
        for (boolean cadeira : ocupacao) {
            if (!cadeira) {
                vagas++;
            }
        }
        return vagas;
    }

    public int retornaVoo() {
        return numeroVoo;
    }

    public Data retornaData() {
        return dataVoo;
    }
}
