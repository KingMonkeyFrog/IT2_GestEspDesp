# IT2_GestEspDesp

A empresa “GestEspaçosDesportivos” (GED) dedica-se a gesta o de espaços desportivos de
base servindo de intermedia rio entre os proprieta rios dos espaços e os so cios que
pretendam usufruir desses espaços para as suas atividades recreativas e/ou formativas.
Nesse sentido, a GED pretende a criaça o de uma plataforma informa tica que a auxilie na
gesta o da sua atividade. A construça o da plataforma esta dividida em duas iteraço es. Em
seguida, sa o apresentadas as caraterí sticas da plataforma a ter em consideraça o durante
a primeira fase do projeto.
A plataforma necessita de guardar/manipular a informaça o de va rias fontes, tais como:
modalidades desportivas, tipos de espaços (aqua ticos e na o aqua ticos), recintos para a
pra tica de modalidade desportivas, proprietários das instalaço es desportivas (i.e., as
empresas proprieta rias dos recintos) e campanhas de descontos. Posteriormente, sera o
tratadas outras operaço es, por exemplo: reservas de recintos, registo de tarifários, de
calendários e de sócios (i.e., utilizadores registados na plataforma que pretendam
reservar recintos desportivos, entre outras operaço es).
O Administrador (Adm) da GED e responsa vel por especificar as modalidades e tambe m
tipos de espaços desportivos. Uma modalidade caracteriza-se por uma sigla u nica, uma
designaça o e o nu mero de participantes. Um espaço pode ser de dois tipos: aqua tico (p.ex.:
piscinas) e na o aqua tico (p.ex.: campo de pa del, campo de te nis, campo de futsal). Em
qualquer uma das situaço es, e necessa rio conhecer a cobertura (i.e., com ou sem
cobertura, e suficiente). No caso especí fico dos espaços aqua ticos e ainda necessa rio
conhecer a temperatura da a gua (assumir tre s ní veis) e a profundidade, quer mí nima quer
ma xima. Para estes dois u ltimos atributos, deve ser atribuí do um valor por omissa o
devendo poder ser atualizados posteriormente. Para os espaços na o aqua ticos, deve
tambe m ser identificado o tipo de piso.
Cabe ao funciona rio responsa vel pela a rea de recursos (FRR) fí sicos, registar os
proprieta rios que tenham instalaço es desportivas para reservar. Um proprieta rio e
caraterizado por um co digo u nico, um nu mero de identificaça o fiscal (NIF), um email, um
contacto e uma pa gina Web. Aquando do registo do proprieta rio devem tambe m ser
guardados todos os recintos para realizaça o de atividades desportivas, os quais podem
ficar situados em locais diferentes. Nesse sentido, cada recinto deve ter um co digo
automa tico, um endereço, um contacto, uma dimensa o e a indicaça o do tipo de espaço
entre os tipos ja definidos pela GED. No caso de o recinto estar associado a uma atividade
aqua tica, devem tambe m ser pedidas e guardadas as profundidades ma xima e mí nima.
Paralelamente, um recinto tambe m deve conhecer todas as modalidades que pode
acolher. Contudo, essa informaça o deve ser pedida e guardada noutro momento.
O FRR pode em qualquer momento adicionar uma modalidade a um recinto desportivo
pertencente a um dado proprieta rio. Em termos gerais, a plataforma deve começar por
listar todos os proprieta rios registados e solicitar a seleça o de um. Depois, devera listar
todos os recintos desse proprieta rio e pedir para escolher um dos recintos. Em seguida, o
sistema deve listar as modalidades existentes e solicitar aquela que ira ser adicionada.
Finalmente, o sistema devera adicionar a modalidade, caso ainda na o tenha sido
adicionada, ao recinto.
Finalmente, cabe ao funciona rio responsa vel pelas campanhas (FRC) de desconto, o
registo de campanhas na plataforma. Uma campanha e caraterizada por um co digo u nico,
uma data de iní cio, uma data de fim e o desconto (em valor percentual). Um recinto pode
ter va rias campanhas a decorrer em simulta neo, mas para modalidades diferentes.

Um utilizador na o registado (UNR) necessita de se registar para reservar recintos, entre
outras operaço es. Depois passara a englobar o conjunto de clientes (Cli) na plataforma.
Um cliente e caraterizado por um co digo u nico, um nu mero de identificaça o fiscal (NIF),
uma data de nascimento, um email e um contacto telefo nico.
Para o ca lculo do custo de reservas efetuadas pelos clientes, o proprieta rio de recintos
desportivos (PRD) precisa de associar um preço a cada modalidade praticada nos seus
recintos. O preço para a pra tica/treino de uma modalidade e igual para todos os recintos
desportivos afetos ao mesmo proprieta rio, mas pode variar de proprieta rio para
proprieta rio. O preço base e definido tendo em conta slots de 30 minutos cada.
O PRD tambe m tem a responsabilidade de registar, mensalmente, o calenda rio das
modalidades para cada um dos seus recintos. O formato do calenda rio e igual para todos
os proprieta rios. E mensal e contempla 7 dias por semana entre as 7h00 e as 23h00 com
slots de 30 minutos. O calenda rio na o varia ao longo das quatro semanas de um me s. Cada
recinto deve ter o seu pro prio calenda rio.
Um cliente autenticado pode em qualquer momento fazer uma reserva de um recinto para
a pra tica/treino de uma modalidade desportiva. O sistema deve começar por lhe
apresentar uma lista de modalidades pedindo para escolher a que pretende. Em seguida,
o sistema deve listar todos os recintos, onde e possí vel praticar essa modalidade,
solicitando a escolha de um. O sistema prossegue mostrando o calenda rio com as
disponibilidades a partir do dia corrente ate ao limite do calenda rio, com base na
informaça o introduzida pelo cliente, i.e., modalidade e recinto. O cliente seleciona o(s)
slot(s) pretendido(s), desde que sejam consecutivos. O sistema deve perguntar ao cliente
se pretende reserva com cancelamento gratuito, ou na o. Depois do cliente escolher uma
das duas opço es, o sistema deve calcular e mostrar o custo da reserva (ver abaixo),
juntamente com os restantes dados da reserva, e solicitar confirmaça o. Depois do cliente
confirmar, o sistema devera registar a reserva na plataforma, gerar uma refere ncia
multibanco e enviar uma notificaça o para o email do cliente com os dados necessa rios
para efetuar o pagamento. Uma reserva deve ter um co digo automa tico, uma data de
reserva (data do sistema), o cliente que fez a reserva, o recinto, a modalidade pretendida,
a data do treino, a hora de iní cio, a duraça o do treino (em mu ltiplos de 30 minutos), o
custo e o estado (0-ativa; 1-cancelada; 2- terminada).
A GED possui duas polí ticas de reserva: reserva com cancelamento gratuito (RCCG) e
reserva sem cancelamento gratuito (RSCG). Para efeitos de ca lculo do custo da reserva
com cancelamento gratuito, ao valor base praticado e aplicado um acre scimo de 10%. Esse
produto deve ser multiplicado pelo nu mero de slots escolhido pelo cliente sendo
finalmente aplicada uma taxa de 5% para despesas administrativas por parte da GED. No
caso de cancelamento, o cliente recebera um reembolso de 95% sobre o valor que pagou
quando fez a reserva. Para uma RSCG, o ca lculo e ide ntico ao efetuado para uma RCCG mas
sem a componente do acre scimo. Se o cliente cancelar a reserva, o cliente na o tera direito
a qualquer reembolso.
Para ale m de fazer reservas, os clientes devem poder realizar dois tipos de consultas. 1)
consultar a informaça o dos recintos para uma dada modalidade e 2) consultar a
informaça o das suas reservas para um dado estado (0/1/2). No primeiro caso, o sistema
deve começar por perguntar qual a modalidade pretendida e, em seguida, mostrar a
informaça o dos recintos. No segundo caso, deve solicitar o estado e mostrar todas as
reservas do cliente que esta o nesse estado.
Finalmente, quer o Adm quer o FRC devem poder consultar o valor total das reservas
efetuadas pelos clientes, devendo para isso indicar o intervalo de datas pretendido. As
datas dizem respeito a data de reserva.
O desenvolvimento da aplicaça o deve seguir uma abordagem iterativa e incremental,
adotando boas pra ticas de engenharia e de desenvolvimento de software bem como
contemplar a existe ncia de documentaça o de suporte com qualidade. Para ale m disso, o
seu nu cleo principal deve ser desenvolvido em Java (POO).
A aplicaça o deve manter bons ní veis de desempenho independentemente do nu mero de
utilizadores que estejam a aceder a plataforma. Deve tambe m cumprir todas as leis e
regulamentos aplica veis, ser fa cil de manter e atualizar e ser intuitiva, permitindo que os
utilizadores interajam com ela de maneira eficiente e eficaz. Finalmente, a interface com
o utilizador deve estar disponí vel em tre s idiomas. 
