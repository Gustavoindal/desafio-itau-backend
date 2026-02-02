# 💳 Desafio Itaú – API de Transações

API REST desenvolvida em *Java com Spring Boot* para cadastro de transações financeiras e cálculo de estatísticas em tempo real, simulando um desafio técnico comum em processos seletivos de backend.

---

## 🚀 Tecnologias utilizadas

- Java 21  
- Spring Boot  
- Spring Web  
- Maven  
- REST API  

---

## 🧠 Arquitetura do projeto

O projeto segue uma arquitetura em camadas, com separação clara de responsabilidades:
src/main/java/desafio/itau ├── controller   → Endpoints REST ├── service      → Regras de negócio ├── repository   → Armazenamento em memória ├── model        → Entidades do domínio ├── DTO          → Objetos de entrada e saída └── DesafioItauApplication.java
Copiar código

---

## 📌 Funcionalidades

### 🔹 Transações
- Cadastro de transações financeiras
- Remoção de transações
- Listagem de todas as transações

### 🔹 Estatísticas
- Contagem de transações
- Soma total dos valores
- Média
- Valor mínimo
- Valor máximo

As estatísticas são calculadas dinamicamente com base nas transações registradas.

---

## 🔐 Validações implementadas

- Valor da transação não pode ser negativo
- Data da transação não pode estar no futuro
- Retorno de *HTTP 400 (Bad Request)* para dados inválidos

---

## 🌐 Endpoints

### ➕ Criar transação
POST /transacoes
Copiar código

### 📊 Obter estatísticas
GET /transacoes/estatisticas
Copiar código

### 📋 Listar transações
GET /transacoes
Copiar código

### ❌ Remover transações
DELETE /transacoes
Copiar código

---

## 📸 Exemplos de uso (Postman)

O repositório contém exemplos de uso via Postman demonstrando:

# Transação adicionada
![POST200](desafio-itau-backend/docs/postman/Adicionar200.png)

# Transação com Bad Request devido ao formato imprório do OffDatesetTime
![POST400](desafio-itau-backend/docs/postman/Adicionar400.png)

# Estatísticas executadas
![Estatísticas](desafio-itau-backend/docs/postman/Estatísticas.png)

# Delete efetuado com sucesso
![Delete](desafio-itau-backend/docs/postman/Delete.png)


---

## 🔎 Referência do desafio

Este projeto foi desenvolvido com base em um desafio técnico júnior público, utilizado em processos seletivos para backend Java.

O foco foi aprender boas práticas de arquitetura, validações de negócio, separações de responsabilidades e documentação de endpoints

### Desafio original:
https://github.com/rafaellins-itau/desafio-itau-vaga-99-junior

## ▶️ Como executar o projeto

Clone o repositório:

git clone https://github.com/seu-usuario/desafio-itau-backend.git
Entre no projeto e execute:
Copiar código
Bash
mvn spring-boot:run
A API estará disponível em:
Copiar código

http://localhost:8080

---

## 🎯 Objetivo do projeto

Este projeto tem como objetivo:
Consolidar fundamentos de Java e Spring Boot
Praticar arquitetura em camadas
Trabalhar com validações e regras de negócio
Simular um desafio técnico de backend

---

##👤 Autor

Gustavo Indalêncio da Silva
Projeto desenvolvido para estudo e evolução contínua em backend Java.
