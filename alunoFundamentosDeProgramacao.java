public class alunoFundamentosDeProgramacao {
    private String nome;
    private int matricula;
    private int frequencia;
    private double p1;
    private double p2;
    private double p3;
    private double mediaExercicios;
    private double g1;
    private double g2;

    public alunoFundamentosDeProgramacao(String nome, int matricula, int frequencia, double p1, double p2, double p3, double mediaExercicios, double g1, double g2) {
        this.nome = nome;
        this.matricula = matricula;
        this.frequencia = frequencia;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mediaExercicios = mediaExercicios;
        this.g1 = this.calcularG1(p1, p2, p3, mediaExercicios);
        this.g2 = g2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getP3() {
        return p3;
    }

    public void setP3(double p3) {
        this.p3 = p3;
    }

    public double getMediaExercicios() {
        return mediaExercicios;
    }

    public void setMediaExercicios(double mediaExercicios) {
        this.mediaExercicios = mediaExercicios;
    }

    public double getG1() {
        return g1;
    }

    public void setG1(double g1) {
        this.g1 = g1;
    }

    public double getG2() {
        return g2;
    }

    public void setG2(double g2) {
        this.g2 = g2;
    }

    public double calcularG1(double p1, double p2, double p3, double mediaExercicio) {
        return (p1 + p2 + p3 + mediaExercicio)/4;
    }

    public String calcularResultado() {
        if (this.g1 >= 7 && this.frequencia > 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
