
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Fernando", 2004, 1200);
        funcionario1.mostraSalarioAntigo();
        funcionario1.aumentarSalario(0.10);

        Gerente gerente1 = new Gerente("Narcelio", 1999, 2200);
        gerente1.mostraSalarioAntigo();
        gerente1.aumentarSalario(0.15);
    }
    
}