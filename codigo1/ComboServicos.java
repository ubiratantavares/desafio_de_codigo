package codigo1;
import java.util.Arrays;

class ComboServicos {
    private Servico[] servicos;
    private double desconto1, desconto2, desconto3;
    private double descontoAdicional = 20.00;

    public ComboServicos(Servico[] servicos, double[] descontos) {
        this.servicos = servicos;
        this.desconto1 = descontos[0];
        this.desconto2 = descontos[1];
        this.desconto3 = descontos[2];
    }

    public double calcularValorTotal() {
        // Conta quantos serviços foram contratados (com valor maior que 0)
        int servicosContratados = (int) Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .count();

        double desconto;

        switch (servicosContratados) {
            case 1:
                desconto = desconto1;
                break;
            case 2:
                desconto = desconto2;
                break;
            case 3:
                desconto = desconto3;
                break;        
            default:
                desconto = 0;
                break;
        }

        // Calcula o valor total com desconto
        double valorComDesconto = Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .mapToDouble(Servico::getValor)
                .sum() * (1 - desconto / 100);

        if (servicosContratados == 3) {
            valorComDesconto -= descontoAdicional;
        }
        return valorComDesconto;
    }
}
