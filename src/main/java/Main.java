import java.math.BigDecimal;

import com.divideai.entidades.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DIVIDE AI - SISTEMA DE DIVISAO DE CONTAS ===");
        
        // Serve pra criar usuários
        Usuario joao = new Usuario(1L, "João", "joao@email.com", "11999999999");
        Usuario maria = new Usuario(2L, "Maria", "maria@email.com", "11888888888");
        
        // serve pra criar grupos
        Grupo grupo = new Grupo(1L, "Viagem Praia", "Gastos da viagem para a praia");
        grupo.getMembros().add(joao);
        grupo.getMembros().add(maria);
        
        // Criar despesa
        Despesa despesa = new Despesa(1L, "Jantar no restaurante", new BigDecimal("120.00"), joao, grupo);
        despesa.getParticipantes().add(joao);
        despesa.getParticipantes().add(maria);
        
        // Exibir informações
        System.out.println("Grupo: " + grupo.getNome());
        System.out.println("Membros: " + grupo.getMembros().size());
        System.out.println("Despesa: " + despesa.getDescricao() + " - R$ " + despesa.getValor());
        System.out.println("Pagador: " + despesa.getPagador().getNome());
        
        System.out.println("\n✓ Entidades criadas com sucesso!");
    }
}