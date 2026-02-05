# 💳Desafio Itaú – API de Transações

---

## API REST desenvolvida em Java com Spring Boot para cadastro de transações financeiras e cálculo de estatísticas em tempo real, baseada em um desafio técnico júnior de backend.
O projeto utiliza armazenamento em memória e tem foco em boas práticas, validações de negócio, tratamento centralizado de erros e organização em camadas.

---

## 🚀 Tecnologias utilizadas

+ Java 21
+ Spring Boot
+ Spring Web
+ Maven
+ REST API

---
  
## 🧠 Arquitetura do projeto

O projeto segue uma arquitetura em camadas, com separação clara de responsabilidades:
Copiar código

src/main/java/desafio/itau
 ├── controller   → Endpoints REST
 ├── service      → Regras de negócio
 ├── repository   → Armazenamento em memória
 ├── model        → Entidades do domínio
 ├── DTO          → Objetos de entrada e saída
 ├── exception    → Exceções customizadas e handler global
 └── DesafioItauApplication.java

---

## 📌 Funcionalidades

### 🔹 Transações

Cadastro de transações financeiras
Remoção de todas as transações
Listagem das transações registradas

### 🔹 Estatísticas

Contagem de transações
Soma total dos valores
Média dos valores
Valor mínimo
Valor máximo
As estatísticas são calculadas dinamicamente com base nas transações válidas registradas.

### 🔐 Validações implementadas

O valor da transação não pode ser negativo
A data da transação não pode estar no futuro
A data deve estar dentro da janela válida do desafio
Regras de negócio lançam exceções customizadas
Respostas HTTP apropriadas para dados inválidos

---

## 🌐 Endpoints
➕ Criar transação
Copiar código

### POST /transacao
📊 Obter estatísticas
Copiar código

### GET /estatistica
📋 Listar transações
Copiar código

### GET /transacao
❌ Remover transações
Copiar código

### DELETE /transacao

---

# 📸 Exemplos de uso (Postman)

O repositório contém exemplos de uso via Postman demonstrando:
Criação de transação válida
Rejeição de dados inválidos
Cálculo de estatísticas
Limpeza das transações

## Transação criada com sucesso

[!Post201](itau/docs/postman/Post201.png)

---

## Erros de validação

[!Post400negativo](itau/docs/postman/Post400negativo.png)
[!Post400datafutura](itau/docs/postman/Post400datafutura.png)

---

## Estatísticas calculadas

[!Estatisticas](itau/docs/postman/Estatisticas.png)

---

## Remoção das transações

[!Delete](itau/docs/postman/DeleteTransacao.png)

---

## Estatísticas após remoção

[!EstatisticasPosDelete](itau/docs/postman/EstatisticasPosDelete.png)

---

## 🔎 Referência do desafio

Projeto desenvolvido com base em um desafio técnico júnior público, utilizado em processos seletivos para backend Java.
Desafio original:

https://github.com/rafaellins-itau/desafio-itau-vaga-99-junior

---

## ▶️ Como executar o projeto

Copiar código
Bash
git clone https://github.com/seu-usuario/desafio-itau-backend.git
cd desafio-itau-backend
mvn spring-boot:run
A API estará disponível em:
Copiar código

http://localhost:8080

---

## 🎯 Objetivo do projeto
Consolidar fundamentos de Java e Spring Boot
Praticar arquitetura em camadas
Implementar validações e exceções de domínio
Simular um desafio técnico de backend

---

## 👤 Autor
Gustavo Indalêncio da Silva
Projeto desenvolvido para estudo e evolução contínua em backend Java.
