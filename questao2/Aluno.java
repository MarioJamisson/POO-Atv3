package q02;

class Aluno {
    private int matricula;
    private String nome;
    private double notaEtapa1Aval1;
    private double notaEtapa1Aval2;
    private double notaEtapa2Aval1;
    private double notaEtapa2Aval2;
    private double mediaEtapa1;
    private double mediaEtapa2;
    private double mediaFinal;
    private String resultadoFinal;

    public Aluno(int matricula, String nome, double notaEtapa1Aval1, double notaEtapa1Aval2, double notaEtapa2Aval1, double notaEtapa2Aval2) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaEtapa1Aval1 = notaEtapa1Aval1;
        this.notaEtapa1Aval2 = notaEtapa1Aval2;
        this.notaEtapa2Aval1 = notaEtapa2Aval1;
        this.notaEtapa2Aval2 = notaEtapa2Aval2;
        this.calculaMediaPorEtapa();
        this.calculaMediaFinal();
        this.calculaResultadoFinal();
    }

    public void calculaMediaPorEtapa() {
        mediaEtapa1 = (notaEtapa1Aval1 + notaEtapa1Aval2) / 2;
        mediaEtapa2 = (notaEtapa2Aval1 + notaEtapa2Aval2) / 2;
    }

    public void calculaMediaFinal() {
        mediaFinal = (mediaEtapa1 + mediaEtapa2) / 2;
    }

    public void calculaResultadoFinal() {
        if (mediaFinal >= 7.0) {
            resultadoFinal = "Aprovado";
        } else if (mediaFinal >= 4.0) {
            resultadoFinal = "Avaliação Final";
        } else {
            resultadoFinal = "Reprovado";
        }
    }

    public String apresentaResultado() {
        return "Matrícula: " + matricula + "\nNome: " + nome + "\nMédia Etapa 1: " + mediaEtapa1 + "\nMédia Etapa 2: " + mediaEtapa2 + "\nMédia Final: " + mediaFinal + "\nResultado Final: " + resultadoFinal;
    }
}
