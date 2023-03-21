public class ConsultarAuxilio
{
    public static void main(String[] args) {
        
        double salarioMensal = 100001;
        double salarioMedio = 10000;
        
        int quantidadeDependentes = 3;
        int mediaDependentes = 2;
        System.out.println((salarioMensal > salarioMedio) && (quantidadeDependentes >= mediaDependentes));
        boolean salarioBaixo = salarioMensal <= salarioMedio;
        boolean muitosDependentes = quantidadeDependentes > mediaDependentes;
        System.out.println((salarioBaixo) && (muitosDependentes));
        
        boolean recebeAuxilio = (salarioBaixo) & (muitosDependentes);
        System.out.println("Recebe Auxílio " + recebeAuxilio);
        
    }
}
