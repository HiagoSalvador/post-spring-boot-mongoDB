# Projeto Spring Boot com MongoDB

Este projeto é uma aplicação utilizando **Spring Boot** e **MongoDB**, que implementa funcionalidades de CRUD (Create, Read, Update, Delete) para usuários e posts, além de consultas personalizadas e uso de DTOs para projeção de dados.

## Funcionalidades

- **Conexão com o MongoDB**: Configuração inicial do MongoDB utilizando repositórios e serviços.
- **Operações CRUD**:
  - Criação de usuários com `POST`
  - Recuperação de usuários por `GET`
  - Atualização de usuários com `PUT`
  - Deleção de usuários com `DELETE`
- **Gerenciamento de Posts**:
  - Referenciamento de posts por usuário
  - Recuperação de posts de um usuário específico
  - Recuperação de posts por ID
  - Comentários em posts
- **Consultas Personalizadas**:
  - Uso de Query Methods
  - Consultas com `@Query`
  - Consultas avançadas com múltiplos critérios
- **Uso de DTOs**:
  - Projeção dos dados do autor e posts para retornar informações relevantes.

---

## Estrutura do Projeto

### Pacotes principais

- `controller`: Contém os endpoints REST.
- `service`: Implementa a lógica de negócios.
- `repository`: Camada de persistência usando o MongoDB.
- `dto`: Define objetos para projeção de dados.
- `model`: Define as entidades principais, como `User` e `Post`.

### Endpoints

#### Usuários
- **Criar usuário**: `POST /users`
- **Obter todos os usuários**: `GET /users`
- **Obter usuário por ID**: `GET /users/{id}`
- **Atualizar usuário**: `PUT /users/{id}`
- **Deletar usuário**: `DELETE /users/{id}`

#### Posts
- **Criar post para um usuário**: `POST /posts`
- **Obter posts de um usuário**: `GET /users/{id}/posts`
- **Obter post por ID**: `GET /posts/{id}`
- **Adicionar comentários a um post**: `PUT /posts/{id}/comments`

---

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento rápido de aplicações Java.
- **MongoDB**: Banco de dados NoSQL para armazenamento de dados.
- **Spring Data MongoDB**: Integração do Spring com o MongoDB.
- **Lombok**: Redução de boilerplate no código.
- **DTOs**: Para projeção e encapsulamento de dados.

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/HiagoSalvador/post-spring-boot-mongoDB.git
