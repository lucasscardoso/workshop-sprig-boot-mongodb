# 📱 Rede Social - CRUD com Spring Boot, MongoDB

Este projeto é uma aplicação CRUD desenvolvida com **Spring Boot**, representando uma **rede social**.  
Permite **criar, alterar e excluir usuários**, além de **criar e consultar posts e comentários**.  
Há funcionalidades de **busca de posts por comentários, data e texto**.

---

## 🚀 Tecnologias Utilizadas

- Java 17 (JDK 17)
- Maven 3.9.9
- Spring Boot 3.4.4
- MongoDB
- MongoDB Compass (opcional)

---

## 🧰 Instalação do MongoDB no Windows

### 1. Download e Instalação

- Acesse: [https://www.mongodb.com](https://www.mongodb.com)
- Vá em **Download > Community Server**
- Selecione a instalação do tipo **Complete**
- **Importante:** durante a instalação, **desmarque a opção de instalar o MongoDB Compass**, caso siga o curso.

### 2. Configuração do Ambiente

- Crie o diretório:
C:\data\db
- Adicione o seguinte caminho ao `PATH` do sistema (ajuste para sua versão):
```C:\Program Files\MongoDB\Server\3.6\bin```

---

### 3. Teste

Abra o terminal (CMD ou Git Bash) e execute:

```bash
mongod
```

---

### 4. (Opcional) Instalar o MongoDB Compass

Ferramenta gráfica para visualizar os dados:
https://www.mongodb.com/products/compass

---

⚙️ Como rodar o projeto
Pré-requisitos
JDK 17 instalado

Maven 3.9.9 instalado

MongoDB rodando localmente

Clonar o repositório

```git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio```


---

🧪 Funcionalidades da aplicação
Usuários
Criar usuário

Atualizar usuário

Deletar usuário

Posts
Criar post (relacionado a um usuário)

Buscar posts por:

Texto

Data

Comentários

Comentários
Visualização de comentários por post

(Lógica CRUD pode ser implementada futuramente)

---

📌 Observações
Os dados de postagens e comentários são instanciados automaticamente.

MongoDB deve estar ativo e rodando localmente na porta padrão (27017).

As APIs podem ser testadas via ferramentas como Postman ou Insomnia.
