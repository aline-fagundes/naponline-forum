INSERT INTO usuario(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');
INSERT INTO usuario(nome, email, senha) VALUES('Moderador', 'moderador@email.com', '123456');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES (1,1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES (2,2);

INSERT INTO curso(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO curso(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 1', 'Erro ao criar projeto', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não compila', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO topico(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', 1, 2);