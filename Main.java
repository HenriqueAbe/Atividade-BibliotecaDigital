public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Assim Falou Zaratustra", "Nietzsche");
        Ebook ebook2 = new Ebook("Infocracia", "Byung Chul Han");
        VideoDigital videodigital1 = new VideoDigital("Transformers", "Michael Bay");
        VideoDigital videodigital2 = new VideoDigital("MLB", "Major League Baseball");

        System.out.println("------- Descrição Ebook(s) -------");
        System.out.println(ebook1.getDescricao());
        System.out.println(ebook2.getDescricao());

        System.out.println("\n------- Descrição video(s) digital(s) -------");
        System.out.println(videodigital1.getDescricao());
        System.out.println(videodigital1.getDescricao());

        System.out.println("\n------- Baixando Ebook(s) -------");
        ebook2.baixar();
        ebook1.baixar();

        System.out.println("\n------- Visualizando Video(s) Digital(s) -------");
        videodigital1.visualizar();
        videodigital2.visualizar();

        System.out.println("\n ------- Baixando Video(s) Digital(s) -------");
        videodigital1.baixar();
        videodigital2.baixar();
    }
}