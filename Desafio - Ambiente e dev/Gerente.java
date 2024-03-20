

public class Gerente extends Funcionario {

    public Gerente(String nome, int dataContratacao, double salario) {
        super(nome, dataContratacao, salario);
    }

    @Override
    public void mostraSalarioAntigo() {
        super.mostraSalarioAntigo();
    }


    @Override
    public void aumentarSalario(double percentual) {
        int anoAtual = 2024;
        int anosTrabalhados = anoAtual - getDataContratacao();
        double reajuste = 0;
        for(int i =0 ; i<anosTrabalhados;i++){
            percentual = percentual + 0.01;
            reajuste = percentual;
        }
        reajuste = Math.round(reajuste * 100.0) / 100.0; //Sem o metodo .round retorna muitas casas decimais, invalido para salario.
        super.aumentarSalario(reajuste);
    }
}