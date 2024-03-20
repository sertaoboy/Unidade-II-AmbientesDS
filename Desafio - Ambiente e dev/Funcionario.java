


public class Funcionario {
    private String nome;
    private int dataContratacao;
    private double salario;

    public Funcionario(String nome, int dataContratacao, double salario) {
        this.nome=nome;
        this.dataContratacao=dataContratacao;
        this.salario=salario;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public void setDataContratacao(int dataContratacao){
        this.dataContratacao=dataContratacao;
    }
    public String getNome(){
        return nome;
    }
    public int getDataContratacao(){
        return dataContratacao;
    }
    public double getSalario(){
        return salario;
    }

    public void mostraSalarioAntigo(){
        System.out.println("Salario antes do reajuste: R$"+ getSalario());
    }

    public void aumentarSalario(double percentual){
        double aumento = getSalario() *percentual;
        setSalario(getSalario()+aumento);
        System.out.println("Salario apos aumento: R$"+getSalario()); 
    }


}