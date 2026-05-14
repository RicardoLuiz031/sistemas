# 🍔 ByteEats — Sistema de Lanchonete

Sistema de gerenciamento de lanchonete desenvolvido em Java, com cadastro de produtos, clientes e pedidos via terminal.

---

## 📋 Sobre o Projeto

O **ByteEats** é um sistema de lanchonete em linha de comando (CLI) que permite:

- Cadastrar produtos do cardápio (lanches, bebidas e sobremesas)
- Registrar clientes com nome, CPF, endereço e telefone
- Criar e gerenciar pedidos

---

## 🗂️ Estrutura do Projeto

```
ByteEats/
├── main.java          # Ponto de entrada e menu principal
├── Cliente.java       # Classe de modelo para clientes
├── Pedido.java        # Classe de modelo para pedidos
├── Produto.java       # Classe base para produtos
├── Lanche.java        # Cadastro e gerenciamento de lanches
├── bebida.java        # Cadastro e gerenciamento de bebidas
└── sobremesa.java     # Cadastro e gerenciamento de sobremesas
```

---

## ⚙️ Pré-requisitos

- [Java JDK 11+](https://www.oracle.com/java/technologies/downloads/)
- Terminal / Prompt de Comando

---

## 🚀 Como Executar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/ByteEats.git
   cd ByteEats
   ```

2. **Compile os arquivos:**
   ```bash
   javac *.java
   ```

3. **Execute o sistema:**
   ```bash
   java main
   ```

---

## 🖥️ Menu Principal

```
=== sistema lanchonete ===
(1) - cadastrar produto
(2) - area do cliente
(3) - faca seu pedido
(0) - sair
```

### Opções disponíveis:

| Opção | Descrição |
|-------|-----------|
| `1`   | Cadastrar um novo produto (lanche, bebida ou sobremesa) |
| `2`   | Cadastrar um novo cliente |
| `3`   | Criar um pedido |
| `0`   | Encerrar o sistema |

---

## 🍟 Produtos

### Lanche
- Nome, ingredientes, tamanho, tipo de pão e preço

### Bebida
- Nome, sabor, tamanho (350ml, 600ml, 1L, 2L) e preço

### Sobremesa
- Nome, sabor e preço

---

## 👤 Cliente

Campos coletados no cadastro:
- Nome e sobrenome
- CPF (14 caracteres)
- Endereço
- Telefone de contato

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem principal
- **Scanner** — Leitura de entrada do usuário
- **ArrayList** — Armazenamento em memória dos dados

---

## 🔮 Melhorias Futuras

- [ ] Implementar a classe `Pedido` com associação de cliente e produtos
- [ ] Adicionar persistência de dados (arquivo ou banco de dados)
- [ ] Calcular total do pedido automaticamente
- [ ] Listagem de produtos cadastrados
- [ ] Padronizar nomenclatura das classes (convenção Java)

---

## 👨‍💻 Autor

Desenvolvido como projeto de aprendizado em Java.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
