package com.trajano.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trajano.cursomc.domain.Categoria;
import com.trajano.cursomc.domain.Cidade;
import com.trajano.cursomc.domain.Cliente;
import com.trajano.cursomc.domain.Endereco;
import com.trajano.cursomc.domain.Estado;
import com.trajano.cursomc.domain.ItemPedido;
import com.trajano.cursomc.domain.Pagamento;
import com.trajano.cursomc.domain.PagamentoComBoleto;
import com.trajano.cursomc.domain.PagamentoComCartao;
import com.trajano.cursomc.domain.Pedido;
import com.trajano.cursomc.domain.Produto;
import com.trajano.cursomc.domain.enums.EstadoPagamento;
import com.trajano.cursomc.domain.enums.TipoCliente;
import com.trajano.cursomc.repositories.CategoriaRepository;
import com.trajano.cursomc.repositories.CidadeRepository;
import com.trajano.cursomc.repositories.ClienteRepository;
import com.trajano.cursomc.repositories.EnderecoRepository;
import com.trajano.cursomc.repositories.EstadoRepository;
import com.trajano.cursomc.repositories.ItemPedidoRepository;
import com.trajano.cursomc.repositories.PagamentoRepository;
import com.trajano.cursomc.repositories.PedidoRepository;
import com.trajano.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(CursomcApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }

}
