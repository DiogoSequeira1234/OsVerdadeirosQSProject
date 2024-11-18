import org.example.Admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class AdminTeste {
    @Test
    void testDefinirSemestre() {
        Admin admin = new Admin("João", "joao@email.com", "senha123");

        // Simular definição de semestre
        String inicio = "2024-02-01";
        String fim = "2024-07-01";

        try {
            admin.definirSemestre(inicio, fim);
            // Se nenhum erro ocorreu, o teste passou.
        } catch (Exception e) {
            fail("Definir semestre falhou com erro: " + e.getMessage());
        }
    }

    @Test
    void testDefinirEpocasDeExames() {
        Admin admin = new Admin("João", "joao@email.com", "senha123");

        // Simular definição de épocas
        String[] epocas = {"Época Normal", "Época de Recurso", "Época Especial"};

        try {
            admin.definirEpocasDeExames(epocas);
            // Se nenhum erro ocorreu, o teste passou.
        } catch (Exception e) {
            fail("Definir épocas de exames falhou com erro: " + e.getMessage());
        }
    }
}
