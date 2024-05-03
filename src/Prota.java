import br.com.devdidi.goslingfilms.modelo.film;
import br.com.devdidi.goslingfilms.modelo.Serie;
public class Prota extends film {
    public static void main(String[] args) {
        film meuFilme = new film();
        meuFilme.setNome("Drive");
        meuFilme.setAnoDeLancamento(2011);
        meuFilme.setEstaNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9.9);
        meuFilme.avalia(8.9);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.obterMedia());
    }


    Serie serie = new Serie();
    serie.setNome("avatar");


}