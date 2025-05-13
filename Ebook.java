public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    public Ebook(String titulo, String nomeItem){
        super(titulo, nomeItem);
    }

    public String getDescricao() {
        return "\nEbook \nTítulo: " + getTitulo() + "| Nome: " + getAutorItem();
    }

    public void baixar() {

    }
}
