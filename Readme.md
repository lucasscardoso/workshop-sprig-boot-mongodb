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

### 2.5 Postman
- Acesse: [https://www.postman.com/downloads/](https://www.postman.com/downloads/)
- Realize o downlod do Postman(windows)
- No Postman, você pode importar um arquivo de coleção ou um arquivo de ambiente. Geralmente, os arquivos exportados são JSON, que podem ser importados por meio do menu "Arquivo" > "Importar".


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

```
git clone https://github.com/lucasscardoso/workshop-sprig-boot-mongodb.git
```

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


---

# 📱Social Network - CRUD with Spring Boot, MongoDB

This project is a CRUD application developed with **Spring Boot**, representing a **social network**.

It allows **creating, modifying and deleting users**, as well as **creating and consulting posts and comments**.

There are features for **searching posts by comments, data and text**.

---

## 🚀 Technologies Used

-Java 17 (JDK 17)
-Maven 3.9.9
- Spring Boot 3.4.4
-MongoDB
- MongoDB Compass (optional)

---

## 🧰 Installing MongoDB on Windows

### 1. Download and Installation

- Go to: [https://www.mongodb.com](https://www.mongodb.com)
- Go to **Download > Community Server**
- Select the **Complete** installation type
- **Important:** during the installation, **uncheck the MongoDB Compass installation option**, if you follow the course.

### 2. Environment Setup

- Create the directory:
C:\data\db
- Add the following path to the system `PATH` (adjust for your version):
```C:\Program Files\MongoDB\Server\3.6\bin```

---

### 2.5 Postman
- Go to: [https://www.postman.com/downloads/](https://www.postman.com/downloads/)
- Download Postman (Windows)
- In Postman, you can import a collection file or an environment file. Typically, exported files are JSON files, which can be imported via the "File" > "Import" menu.

---


### 3. Test

Open the terminal (CMD or Git Bash) and run:

```bash
mondeus
```

---

### 4. (Optional) Install MongoDB Compass

Graphical tool to visualize data:
https://www.mongodb.com/products/compass

---

⚙️ How to run the project
Prerequisites
JDK 17 installed

Maven 3.9.9 installed

MongoDB running locally

Clone the repository

```
clone https://github.com/lucasscardoso/workshop-sprig-boot-mongodb.git
```

---

🧪 Application Features
Users
Create user

Update user

Delete user

Posts
Create post (related to a user)

Search posts by:

Text

Data

Comments

Comments
View comments by post

(CRUD logic may be innovative in the future)

---

📌 Notes
Post and comment data is instantiated automatically.

MongoDB must be active and running locally on the default port (27017).

APIs can be tested using tools such as Postman or Insomnia.