public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel{
    public VideoDigital(String titulo, String autorItem) {
        super(titulo, autorItem);
    }

    public String getDescricao() {
        return "Video Digital\nTitulo: " + getTitulo() + "| Nome do Autor: " + getAutorItem();
    }

    public void baixar() {
        System.out.println("Baixando video '" + getTitulo() + "' do autor '" + getAutorItem() + "'");
    }

    public void visualizar() {
        System.out.println("Visualizando video '" + getTitulo() + "' do autor '" + getAutorItem() + "'");
    }
}
