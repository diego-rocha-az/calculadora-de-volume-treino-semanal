package br.com.devdidi.goslingfilms.modelo;

public class titulo {


    public static class film  {
        private String nome;
        private int anoDeLancamento;
        private boolean estaNoPlano;
        private double somaAvaliacoes;
        private int totalDeAvaliacoes;

        public int getTotalDeAvaliacoes(){
            return totalDeAvaliacoes;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setAnoDeLancamento(int lancouQuando){
            this.anoDeLancamento = anoDeLancamento;
        }
        public void setEstaNoPlano(boolean tanoplno){
            this.estaNoPlano = estaNoPlano;
        }


        public double getSomaAvaliacoes(){
            return somaAvaliacoes;
        }

        public void exibeFichaTecnica(){
            System.out.println(nome);
            System.out.println(somaAvaliacoes);
            System.out.println(estaNoPlano);
            System.out.println(anoDeLancamento);
            System.out.println(totalDeAvaliacoes);
        }
        public void avalia(double nota){
            somaAvaliacoes += nota;
            totalDeAvaliacoes ++;
        }
        public double obterMedia(){
            return somaAvaliacoes / totalDeAvaliacoes;
        }
    }

}
