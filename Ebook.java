public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    public Ebook(String titulo, String nomeItem){
        super(titulo, nomeItem);
    }

    public String getDescricao() {
        return "Ebook \nTítulo: " + getTitulo() + "| Nome: " + getAutorItem();
    }

    public void baixar() {
        System.out.println("Baixando livro '" + getTitulo() + "' do autor '" + getAutorItem() + "'.");
    }
}
