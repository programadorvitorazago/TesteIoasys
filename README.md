# TesteIoasys2

# Desafio Pessoa Desenvolvedora Java

 - Para deploy, utilize o arquivo .war na pasta "target";
 - Deve-se configurar o recuros de JDBC (Connetion Pool) de nome "DefaultDS" apontando para o banco de teste;
 - A estrutura do banco de Teste pode ser replica pelos arquivos de Scripts na pasta "Script DB";
 - O items da API são:
 -- API/administrador
 -- API/usuario
 -- API/filme
 
 - OS Métodos de CRUD seguem o padrão RESTFULL:
 
 *Exemplo:*
 - Adicionando Administrador: Chame por HTTP POST as URI API/administrador
 passando os seguintes dados no corpo da requisição:
 {
	  "nome":"Admin Silva"
	, "username": "a.silva"
 }
 
 - Adicionando Usuário: Chame por HTTP POST as URI API/usuario
 passando os seguintes dados no corpo da requisição:
 {
	  "nome":"Teste Silva"
	, "username": "t.silva"
 }
 
 - Adicionando Filme: Chame por HTTP POST as URI API/filme
 passando os seguintes dados no corpo da requisição:
 {
	  "nome": "Matrix"
	, "descricao": "Ficção científica"
	, "diretos": "Irmão Watch"
 }
 
 *Para votação*
 - Chame por HTTP POST as URI API/filme passando os seguintes dados no corpo da requisição:
 {
	  "ID_Filme":1 *ID do Filme*
	, "ID_Usuario": "ID do usuário"
	, "Nota": *NOta para o filme (0 a 4)*
 }

 
 
 
 
 
 
 