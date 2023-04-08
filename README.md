# TodoApp-Java

## Descrição
Este é um aplicativo para gerenciamento de projetos e tarefas desenvolvido em Java.

## Funcionalidades
- Cadastrar e gerenciar projetos
- Adicionar e gerenciar tarefas associadas aos projetos
- Marcar tarefas como concluídas
- Visualizar estatísticas de conclusão de tarefas

## Tecnologias utilizadas
- Java
- MySQL

## Banco de dados
O aplicativo utiliza um banco de dados MySQL. É necessário ter o driver específico do JDBC para conectá-lo ao aplicativo.

### Tabelas

```CREATE TABLE projects (
id int(11) NOT NULL,
name varchar(50) NOT NULL,
description varchar(255) DEFAULT NULL,
createdAt datetime NOT NULL,
updatedAt datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE tasks (
id int(11) NOT NULL,
idProject int(11) NOT NULL,
name varchar(50) NOT NULL,
description varchar(255) DEFAULT NULL,
completed tinyint(1) NOT NULL,
notes varchar(255) DEFAULT NULL,
deadline date NOT NULL,
createdAt datetime NOT NULL,
updatedAt datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```

## Como executar o projeto
1. Clone o repositório para sua máquina local
2. Abra o projeto em sua IDE de preferência
3. Configure o arquivo application.properties com as informações do banco de dados
5. Configure o seu Banco de dados.
4. Execute a aplicação na sua IDE

## Como contribuir
1. Faça um fork do repositório
2. Crie uma nova branch com a feature a ser implementada
3. Commit suas alterações
4. Push para a branch
5. Abra um Pull Request

## Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.
