package bancoDigital;

import java.util.List;

public class banco {

    private String nome ;

        private List<conta> contas ;

        public void setNome(String nome)
        {
            this.nome = nome;
        }

        public String getNome()
        {
            return nome;
        }

        public List<conta> getContas() {
            return contas;
        }

        public void setContas(List<conta> contas) {
            this.contas = contas;
        }
}
