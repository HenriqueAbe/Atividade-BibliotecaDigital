public abstract class ItemBibliotecaDigital {
    private String titulo;
    private String autorItem;

    public ItemBibliotecaDigital(String titulo, String autorItem) {
        this.titulo = titulo;
        this.autorItem = autorItem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutorItem() {
        return autorItem;
    }

    public String toString() {
        return getDescricao();
    }

    public abstract String getDescricao();
}
