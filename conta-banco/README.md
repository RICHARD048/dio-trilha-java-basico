# ContaBanco 🚀

Projeto desenvolvido como parte da trilha de Java Básico da [DIO - Digital Innovation One](https://www.dio.me/).

## 📋 Descrição

O **ContaBanco** é um programa simples em Java que simula a criação de uma conta bancária via terminal. Ele utiliza conceitos fundamentais da linguagem como:

- Entrada de dados com a classe `Scanner`
- Manipulação de Strings
- Estruturas de repetição (`while`)
- Validação com expressões regulares (Regex)
- Configuração de `Locale` para leitura de números decimais com ponto (`.`)

O sistema solicita ao usuário as seguintes informações:

- Nome do cliente (apenas letras e espaços)
- Número da agência (formato entre 3 e 5 dígitos, seguido de `-` e um dígito, ex: `1234-5`)
- Número da conta (apenas números)
- Valor a ser depositado (decimal, com ponto)

Após as validações, uma mensagem de confirmação é exibida.

## 💻 Tecnologias Utilizadas

- Java
- IDE: VS Code

## 📂 Estrutura do Projeto

```bash
ContaBanco/
├── README.md
└── src/
    └── ContaTerminal.java
```

## 📦 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/ContaBanco.git
   ```
   
1. Abra o projeto em sua IDE Java preferida.

1. Compile e execute a classe ContaTerminal.

1. Siga as instruções exibidas no terminal.


## 🧠 Autor
Projeto proposto por Gleyson Sampaio na plataforma DIO.
Implementado por RICHARD GOMEZ como parte dos exercícios práticos da trilha Java.
