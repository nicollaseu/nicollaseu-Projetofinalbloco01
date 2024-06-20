package commersync.model;

public abstract class ProdutosTelefone {
    private int produtos;
    private int pedidoDeCompra;
    private int listaProdutosTelefone;
    private int cancelarContaPerfil;
    private String marcaCelular;
    private int cancelarCompra;

    public ProdutosTelefone(int produtos, int pedidoDeCompra, int listaProdutosTelefone, int cancelarContaPerfil, String marcaCelular, int cancelarCompra) {
        this.produtos = produtos;
        this.pedidoDeCompra = pedidoDeCompra;
        this.listaProdutosTelefone = listaProdutosTelefone;
        this.cancelarContaPerfil = cancelarContaPerfil;
        this.marcaCelular = marcaCelular;
        this.cancelarCompra = cancelarCompra;
    }

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    public int getPedidoDeCompra() {
        return pedidoDeCompra;
    }

    public void setPedidoDeCompra(int pedidoDeCompra) {
        this.pedidoDeCompra = pedidoDeCompra;
    }

    public int getListaProdutosTelefone() {
        return listaProdutosTelefone;
    }

    public void setListaProdutosTelefone(int listaProdutosTelefone) {
        this.listaProdutosTelefone = listaProdutosTelefone;
    }

    public int getCancelarContaPerfil() {
        return cancelarContaPerfil;
    }

    public void setCancelarContaPerfil(int cancelarContaPerfil) {
        this.cancelarContaPerfil = cancelarContaPerfil;
    }

    public String getMarcaCelular() {
        return marcaCelular;
    }

    public void setMarcaCelular(String marcaCelular) {
        this.marcaCelular = marcaCelular;
    }

    public int getCancelarCompra() {
        return cancelarCompra;
    }

    public void setCancelarCompra(int cancelarCompra) {
        this.cancelarCompra = cancelarCompra;
    }
}
