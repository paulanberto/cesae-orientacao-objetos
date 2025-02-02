package Ex_01;


//Desenvolva um programa para uma estação de rádio programar as músicas a passar. Deve conter a classe
//Música com atributos de título, género, artista e duração (segundos). Seguidamente a classe MusicPlayer
//deve conter um atributo ArrayList de Musicas nomeado programacao.
//Na classe MusicPlayer programe o método para adicionar músicas ao ArrayList.
//Na classe MusicPlayer programe o método para trocar músicas ao ArrayList.
//Na classe MusicPlayer programe o método para remover músicas ao ArrayList.
//Na classe MusicPlayer programe o método para remover todas as músicas ao ArrayList.
//Na classe Music Player programe o método imprimirRelatorio que imprima na consola todas as músicas da
//programação com o seguinte exemplo de aspeto:
//Música 1: The Scientist | Rock Alternativo | Coldplay | 260
//Música 2: Bohemian Rapsody | Rock | Queen | 359
//Música 3: Mestre da Culinária | Heavy Metal | Quim Barreiros | 233
//…
//Na classe MusicPlayer programe o método duracao que calcule e imprima na consola no formato hh:mm:ss
//a duração total da programação definida.
//Exemplo de teste: deve instanciar 6 músicas, adicionar as 6 à programação. De seguida troque a última com
//a primeira. Seguidamente remova a número 3. Posteriormente calcule a duração da programação. Remova
//todas as músicas e calcule de novo a duração.

public class Musica {

    private String titulo;
    private String genero;
    private String artista;
    private int duracaoSegundos;

    public Musica(String titulo, String genero, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void exibirDetalhes(){
        System.out.println(this.titulo+" | "+this.genero+ " | "+this.artista+" | Duração: "+this.duracaoSegundos+" s.");
    }
}