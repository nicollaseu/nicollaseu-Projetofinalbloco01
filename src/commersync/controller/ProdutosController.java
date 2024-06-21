package commersync.controller;

import commersync.repository.Interface;

public class ProdutosController implements Interface {


    @Override
    public void produtos(int produtos) {
        System.out.println("Produto adicionado com ID: " + produtos);
    }

    @Override
    public void pedidoDeCompra(int pedidoDeCompra) {
        System.out.println("Pedido de compra realizado com ID: " + pedidoDeCompra);
    }

    @Override
    public void listaProdutosTelefone(int listaProdutosTelefone) {
        System.out.println("Listando produtos para telefone com ID: " + listaProdutosTelefone);
    }

    @Override
    public void cancelarContaPerfil(int cancelarContaPerfil) {
        System.out.println("Conta perfil cancelada com ID: " + cancelarContaPerfil);
    }

    @Override
    public void marcaCelular(int marcaCelular) {
        System.out.println("Marca de celular selecionada com ID: " + marcaCelular);
    }

    @Override
    public void cancelaCompra(int cancelarCompra) {
        System.out.println("Compra cancelada com ID: " + cancelarCompra);
    }
}
