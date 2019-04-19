INSERT INTO `empresa` (`id`, `cnpj`, `data_atualizacao`, `data_criacao`, `razao_social`) 
VALUES (NULL, '82198127000121', CURRENT_DATE(), CURRENT_DATE(), 'LABESTEN IT');

INSERT INTO `funcionario`  (`id`, `cpf`, `data_atualizacao`, `data_criacao`, `email`, `nome`, 
`perfil`, `qtd_horas_almoco`, `qtd_horas_trabalho_dia`, `senha`, `valor_hora`, `empresa_id`) 
VALUES (NULL,'41972842846',CURRENT_DATE(), CURRENT_DATE(),'admin@caiovlf.com','Caio Labesten','ROLE_ADMIN',NULL,NULL,
'$2a$10$Yzt55.oMLuyvcpUhV9UdoOTtaYYv/rODBK/pB9i7322Mqn0k7J74G',NULL,
(SELECT `id` FROM `empresa` WHERE `cnpj` = '82198127000121'));
