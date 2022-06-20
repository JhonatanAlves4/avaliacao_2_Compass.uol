create database questao2;
use questao2;

create table filme (
	id int auto_increment not null primary key,
    nome varchar(100) not null,
    descricao varchar(500) not null,
    ano int not null
);

insert into filme(nome, descricao, ano) values ('Laranja Mecânica', 'O jovem Alex passa as noites com uma gangue de amigos briguentos. Depois que é preso, se submete a uma técnica de modificação de comportamento para poder ganhar sua liberdade.', 1972);
insert into filme(nome, descricao, ano) values ('Matrix', 'Um jovem programador é atormentado por estranhos pesadelos nos quais sempre está conectado por cabos a um imenso sistema de computadores do futuro. À medida que o sonho se repete, ele começa a levantar dúvidas sobre a realidade.', 1999);
insert into filme(nome, descricao, ano) values ('Coringa', 'Isolado, intimidado e desconsiderado pela sociedade, o fracassado comediante Arthur Fleck inicia seu caminho como uma mente criminosa após assassinar três homens em pleno metrô. Sua ação inicia um movimento popular contra a elite de Gotham City, da qual Thomas Wayne é seu maior representante.', 2019);
insert into filme(nome, descricao, ano) values ('Batman', 'Após dois anos espreitando as ruas como Batman, Bruce Wayne se encontra nas profundezas mais sombrias de Gotham City. Com poucos aliados confiáveis, o vigilante solitário se estabelece como a personificação da vingança para a população.', 2022);
insert into filme(nome, descricao, ano) values ('Os Vingadores', 'Loki, o irmão de Thor, ganha acesso ao poder ilimitado do cubo cósmico ao roubá-lo de dentro das instalações da S.H.I.E.L.D. Nick Fury, o diretor desta agência internacional que mantém a paz, logo reúne os únicos super-heróis que serão capazes de defender a Terra de ameaças sem precedentes.', 2012);
insert into filme(nome, descricao, ano) values ('Harry Potter e a Pedra Filosofal', 'Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys. Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos.', 2001);
insert into filme(nome, descricao, ano) values ('Sexta-Feira 13', 'A história do homicído em Crystal Lake não impede que os instrutores montem um acampamento de verão no bosque e acabam sendo perseguidos por um assassino brutal.', 1980);
insert into filme(nome, descricao, ano) values ('Sempre ao Seu Lado', 'Professor universitário encontra na estação de trem um filhote de cachorro da raça Akita, conhecida por sua lealdade. O cão passa a acompanhá-lo até a estação de trem e esperar sua volta. Até que um acontecimento inesperado altera sua vida.', 2009);
insert into filme(nome, descricao, ano) values ('Megatubarão', 'Na fossa mais profunda do Oceano Pacífico, a tripulação de um submarino fica presa dentro do local depois de ser atacada por uma criatura pré-histórica que acreditavam estar extinta: um tubarão de mais de 20 metros de comprimento, o Megalodon.', 2018);
insert into filme(nome, descricao, ano) values ('Transformers', 'O destino da humanidade está em jogo quando duas raças de robôs, os Autobots e os vilões Decepticons, chegam à Terra. Os robôs possuem a capacidade de se transformarem em diferentes objetos mecânicos enquanto buscam a chave do poder supremo com a ajuda do jovem Sam.', 2007);
insert into filme(nome, descricao, ano) values ('Avatar', 'No exuberante mundo alienígena de Pandora vivem os Navi, seres que parecem ser primitivos, mas são altamente evoluídos. Como o ambiente do planeta é tóxico, foram criados os avatares, corpos biológicos controlados pela mente humana que se movimentam livremente em Pandora.', 2009);
insert into filme(nome, descricao, ano) values ('A Teoria de Tudo', 'Baseado na história de Stephen Hawking, o filme expõe como o astrofísico fez descobertas relevantes para o mundo da ciência, inclusive relacionadas ao tempo. Aos 21 anos de idade, Hawking descobriu que sofria de uma doença motora degenerativa, mas isso não o impediu de se tornar um dos maiores cientistas da atualidade.', 2015);
insert into filme(nome, descricao, ano) values ('WALL·E', 'Após entulhar a Terra de lixo e poluir a atmosfera com gases tóxicos, a humanidade deixou o planeta e passou a viver em uma gigantesca nave. O plano era que o retiro durasse alguns poucos anos, com robôs sendo deixados para limpar o planeta. WALL-E é o último destes robôs, e sua vida consiste em compactar o lixo existente no planeta.', 2008);
insert into filme(nome, descricao, ano) values ('À Procura da Felicidade', 'Chris enfrenta sérios problemas financeiros e Linda, sua esposa, decide partir. Ele agora é pai solteiro e precisa cuidar de Christopher, seu filho de 5 anos.', 2007);
insert into filme(nome, descricao, ano) values ('Guerra nas Estrelas', 'A princesa Leia é mantida refém pelas forças imperiais comandadas por Darth Vader. Luke Skywalker e o capitão Han Solo precisam libertá-la e restaurar a liberdade e a justiça na galáxia.', 1977);
insert into filme(nome, descricao, ano) values ('Rambo - Programado para Matar', 'Um veterano da Guerra do Vietnã usa todo seu treinamento e agressividade exercitada nos campos de batalha quando é preso e torturado por policiais.', 1982);
insert into filme(nome, descricao, ano) values ('Rocky: Um Lutador', 'Rocky Balboa, um pequeno boxeador da classe trabalhadora da Filadélfia, é arbitrariamente escolhido para lutar contra o campeão dos pesos pesados, Apollo Creed, quando o adversário do invicto lutador agendado para a luta é ferido.', 1977);
insert into filme(nome, descricao, ano) values ('2012', 'Em 2012, eventos catastróficos ameaçam destruir o planeta, confirmando uma antiga profecia maia. Enquanto os governos mundiais tentam salvar a humanidade e o globo cai em ruínas, um homem entra em ação e faz de tudo para salvar sua família.', 2009);
insert into filme(nome, descricao, ano) values ('Alice no País das Maravilhas', 'Ainda garotinha, Alice Kingsleigh visitou um lugar mágico pela primeira vez e não tinha mais lembranças sobre o local a não ser em seus sonhos. Em uma festa da nobreza, a jovem vê um coelho branco. Alice o segue e cai em um buraco, indo parar em um mundo estranho: o País das Maravilhas. Lá, ela reencontra personagens que estavam guardados em sua memória através dos sonhos.', 2010);
insert into filme(nome, descricao, ano) values ('O Exorcista', 'Uma atriz vai gradativamente tomando consciência de que a sua filha de doze anos está tendo um comportamento completamente assustador. Deste modo, ela pede ajuda a um padre, que também é um psiquiatra, e este chega a conclusão de que a garota está possuída pelo demônio.', 1974);