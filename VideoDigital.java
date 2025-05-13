public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    public VideoDigital(String titulo, String autorItem) {
        super(titulo, autorItem);
    }

    public String getDescricao() {
        return "\nVideo Digital:\nTitulo: " + getTitulo() + "| Nome do Autor: " + getAutorItem();
    }

    public void baixar() {

    }

    public void visualizar() {

    }
}
