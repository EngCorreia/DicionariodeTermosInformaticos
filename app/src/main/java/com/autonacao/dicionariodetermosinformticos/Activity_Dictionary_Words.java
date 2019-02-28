package com.autonacao.dicionariodetermosinformticos;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.autonacao.dicionariodetermosinformticos.adapters.Adapter_Dictionary_Words;
import com.autonacao.dicionariodetermosinformticos.models.Model_Dictionary_Words;

import java.util.ArrayList;

public class Activity_Dictionary_Words extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    Toolbar toolbar;

    RecyclerView recycler_view;

    Adapter_Dictionary_Words adapter_dictionary_words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        recycler_view = findViewById(R.id.recycler_view);

        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter_dictionary_words = new Adapter_Dictionary_Words(this,getPlayers());
        recycler_view.setAdapter(adapter_dictionary_words);
    }

    private ArrayList<Model_Dictionary_Words> getPlayers(){
        ArrayList<Model_Dictionary_Words> modelPlantsMedicals = new ArrayList<>();

        Model_Dictionary_Words p = new Model_Dictionary_Words();
        p.setTitle_words("10Base-2");
        p.setDescription_words("Os cabos 10Base2, também chamados de cabos coaxiais finos, ou cabos Thinnet, são os cabos\n" +
                "coaxiais usados em redes Ethernet de 10 megabits. Seu diâmetro é de apenas 0.18 polegadas,\n" +
                "cerca de 4.7 milímetros, o que os torna razoavelmente flexíveis. O \"10\" na sigla 10Base2,\n" +
                "significa que os cabos podem transmitir dados a uma velocidade de até 10 megabits por\n" +
                "segundo, \"Base\" significa \"banda base\" e se refere à distância máxima para que o sinal pode\n" +
                "percorrer através do cabo, no caso o \"2\" que teoricamente significaria 200 metros, mas que na\n" +
                "prática é apenas um arredondamento, pois nos cabos 10Base2 a distância máxima utilizável é\n" +
                "de 185 metros. Usando cabos coaxiais não é necessário utilizar um hub, mas em compensação a\n" +
                "velocidade da rede fica limitada a apenas 10 megabits. Outro problema é que esta topologia é\n" +
                "muito susceptível a problemas de mal contato, principalmente em redes com mais de 5 PCs.\n" +
                "Atualmente os cabos coaxiais são cada vez menos usados, já que além de menos susceptíveis a\n" +
                "problemas, os cabos de par trançado categoria 5 suportam transmissão de dados a 100\n" +
                "megabits, ou até mesmo 1 gigabit, caso sejam utilizadas placas de rede Gigabit Ethernet.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("10Base-T");
        p.setDescription_words("Este é o padrão de redes Ethernet de 10 megabits, onde são utilizados cabos de par trançado. O\n" +
                "10 no nome indica justamente a velocidade máxima de transmissão de dados.\n" +
                "Apesar de 10 megabits corresponderem a 1.25 megabytes por segundo, na prática a velocidade\n" +
                "de transmissão dificilmente ultrapassa os 800 kb/s, pois junto com os dados são transmitidos\n" +
                "sinais de modulação, bits de correção de erros etc. As placas de 10 megabits já caíram em\n" +
                "desuso a algum tempo, pois todas as placas PCI atuais transmitem a 100 megabits. Apesar\n" +
                "disso, as placas de 100 megabits mantém compatibilidade com o padrão anterior.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("100Base-TX");
        p.setDescription_words("Este é o padrão para redes Ethernet de 100 megabits. A topologia da rede é igual à do padrão\n" +
                "10 Base-T, com um hub central e cabos de par trançado. A grande vantagem é a maior\n" +
                "velocidade de transmissão, que faz uma grande diferença ao transferir grandes arquivos. As\n" +
                "placas 100 Base-TX também são capazes de operar a 10 megabits, caso sejam conectadas a\n" +
                "um hub antigo, por isso também são chamadas de placas 10/100.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("1 T-SRAM");
        p.setDescription_words("É uma tecnologia que permite construir chips de memória cache com apenas um transístor por\n" +
                "bit (como na memória RAM tradicional) em contraste com os vários transístores utilizados para\n" +
                "construir cada bit da memória cache tradicional. Os transístores são organizados da mesma" +
                "maneira que num chip de memória cache, permitindo que o sistema mantenha tempos de\n" +
                "acesso bastante baixos, quase tão bons quanto num chip de memória cache \"de verdade\". Em\n" +
                "compensação, continua existindo a necessidade de reescrever os dados periodicamente e a cada\n" +
                "leitura, como na memória RAM. No final das contas temos um tipo de memória cache um pouco\n" +
                "mais lento, que consome mais energia, mas que em compensação é muito mais barato de se\n" +
                "produzir.\n" +
                "Esta tecnologia foi desenvolvida no início dos anos 80 e ficou esquecida durante muitos anos, até\n" +
                "a HP ressuscitar a idéia no seu processador PA-8800 que traz nada menos que 32 MB de cache\n" +
                "L2 embutidos no mesmo cartucho do processador (como no Pentium II), uma quantidade que só\n" +
                "pôde ser obtida graças ao uso da tecnologia.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("2.5G");
        p.setDescription_words("A primeira geração de celulares ou 1G, ainda composta por modelos analógicos, surgiu durante a\n" +
                "década de 70, se popularizou durante a década de 80 e continuou sendo usada durante boa\n" +
                "parte da década de 90. Os celulares analógicos são pouco mais sofisticados que os aparelhos de\n" +
                "rádio amador e não são muito adequados para a transmissão de dados.\n" +
                "No início da década de 90 surgiram os celulares digitais, a segunda geração, ou 2G, composta\n" +
                "pelos padrões CDMA, TDMA e GSM. Apesar de já trabalharem com transmissões digitais, a\n" +
                "velocidade de transmissão de dados é muito baixa. Que o digam os usuários do Wap.\n" +
                "Os celulares 2.5G representam uma grande evolução em termos de transmissão de dados, pois\n" +
                "utilizam transmissão por pacotes, o que significa que os celulares ficam constantemente\n" +
                "conectados à Web e o usuário paga apenas pelos dados transmitidos, ao contrário do Wap, onde\n" +
                "é cobrado por minuto de conexão. Outra vantagem do 2.5G é a maior velocidade. O padrão que\n" +
                "está sendo implantado no Brasil permite a transmissão de dados a 144 kbps.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("1U Case");
        p.setDescription_words("Este é o tipo mais compacto de gabinete usado em servidores, projetado para ocupar um único\n" +
                "espaço no rack, o que significa uma grande economia no custo de hospedagem em data centers,\n" +
                "onde paga-se por espaço ocupado. Claro que esta economia tem um custo. O gabinete tem\n" +
                "apenas 8,5 cm de altura, o que limita o número de placas mãe que podem ser utilizadas. Os\n" +
                "pentes de memória não podem ser encaixados na vertical, como nos desktops, mas sim na\n" +
                "horizontal. Também não é possível utilizar processadores que dissipam muito calor, pois não é\n" +
                "possível usar coolers muito grandes.\n" +
                "É possível usar uma única placa de expansão, conectada na horizontal, com a ajuda de uma\n" +
                "placa riser, por isso as placas mãe mais indicadas são as com vídeo, rede e RAID onboard. É\n" +
                "possível utilizar até dois HDs");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("2U case");
        p.setDescription_words("Este é o formato de gabinete mais usado por servidores (superando o 1U), pois é razoavelmente\n" +
                "compacto, sem com isto limitar tanto a capacidade de expansão.\n" +
                "Um gabinete 2U tem 16,8 cm de altura e mede 42,65 x 45,4 centímetros. Ainda é mais fino que\n" +
                "um gabinete ATX tradicional. Apesar disso, ele acomoda um servidor com dois processadores,\n" +
                "até três placas PCI (encaixadas na horizontal, com a ajuda de um riser) e até quatro HDs. Por\n" +
                "causa do pequeno espaço, esta não é a melhor solução do ponto de vista da refrigeração, daí a\n" +
                "necessidade dos data centers terem o ambiente refrigerado.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("32-bit RIMM");
        p.setDescription_words("Os módulos de memória Rambus utilizados no Pentium III e no Pentium 4 são módulos de\n" +
                "memória com um barramento de apenas 16 bits (contra os 64 bits de um módulo de memória\n" +
                "SDRAM ou DDR), mas em compensação são capazes de operar a frequências muito altas, 800\n" +
                "MHz no padrão original e até 1066 MHz no mais recente, o que equilibra a balança. A partir do\n" +
                "Pentium 4 (com o chipset i850) a Intel adotou uma arquitetura dual Rambus, onde os módulos\n" +
                "são utilizados em pares, formando um barramento de 32 bits. Apesar da medida ter dobrado a\n" +
                "velocidade de acesso à memória, trouxe a desvantagem de ter de utilizar dois módulos de\n" +
                "memória ao invés de um, o que acaba saindo mais caro. Os módulos RIMM de 32 bits são um\n" +
                "novo padrão que promete resolver este problema, trazendo de volta a flexibilidade de podermos\n" +
                "utilizar os módulos de memória livremente.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("3Dfx");
        p.setDescription_words("Fabricante das placas de vídeo Voodoo. Foi uma das primeiras companhias a lançar placas de\n" +
                "vídeo 3D e dominou o mercado durante algum tempo., mas acabou sendo comprada pela Nvidia\n" +
                "em Dezembro de 2000, depois de atrasar muito o lançamento das placas Voodoo 4 e Voodoo 5,\n" +
                "que quando foram finalmente lançadas não eram mais páreo para a GeForce da nVidia.\n" +
                "Entre as placas e chipsets lançados pela 3dfx estão o Voodoo e Voodoo 2, usados em placas de\n" +
                "vários fabricantes (como por exemplo as placas Monster 1 e Monster 2), e as placas Voodoo 3,\n" +
                "Voodoo 4 e Voodoo 5, fabricadas exclusivamente pela 3Dfx.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("3D-Now!");
        p.setDescription_words("O processador K6 da AMD tinha um bom desempenho em números inteiros, mas ao mesmo\n" +
                "tempo um coprocessador aritmético bastante fraco, que comprometia seu desempenho em jogos\n" +
                "e aplicativos gráficos.Desenvolver um projeto de coprocessador aritmético demora anos. Por isso, a AMD optou por\n" +
                "uma solução elegante para tentar corrigir este problema no K6-2. Seguiu o exemplo da Intel e\n" +
                "incorporou novas instruções ao seu processador, o conjunto 3D-Now!, formado por 27 novas\n" +
                "instruções que têm como objetivo agilizar o processamento de imagens tridimensionais,\n" +
                "funcionando em conjunto com uma placa aceleradora 3D. Como acontece com as instruções\n" +
                "MMX, é necessário que o software usado faça uso do 3D-Now!, caso contrário não existe ganho\n" +
                "algum.\n" +
                "O conjunto 3D-Now! Foi aperfeiçoado no Athlon e a partir do Athlon XP ganhou mais instruções,\n" +
                "tornando-se compatível também com as instruções SSE do Pentium III. Com o reforço, o 3DNow! passou a ser chamado de 3D-Now! Professional.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("3G");
        p.setDescription_words("Os celulares de terceira geração, ou 3G estão começando a serem implantados no Japão e\n" +
                "devem ainda demorar mais alguns anos para chegarem ao Brasil, onde ainda estamos vendo a\n" +
                "transição do 2G para o 2.5G.\n" +
                "O principal atrativo deste novo padrão é a maior velocidade de transmissão de dados. Estamos\n" +
                "falando de 2 megabits, contra apenas 14.4 k do Wap e 144 k dos celulares 2.5G.\n" +
                "Além de oferecerem acesso rápido à Web, os celulares 3G poderão ser utilizados para realizar\n" +
                "videoconferência e para streaming de vídeo (clipes, seriados, etc.). De fato, vários protótipos de\n" +
                "celulares 3G trazem chips decodificadores de vídeo em MPEG 2 ou MPEG 4, telas coloridas de\n" +
                "alta resolução e câmeras de videoconferência.\n" +
                "Assim como no 2.5G a transmissão de dados é feita através de pacotes, o que significa que o\n" +
                "celular fica continuamente conectado à Web e o usuário paga apenas pelos dados transmitidos.\n" +
                "Um detalhe importante é que os 2 megabits são compartilhados entre todos os celulares\n" +
                "cobertos por cada torre, o que significa uma velocidade muito mais baixa na prática,\n" +
                "principalmente nos horários de maior movimento.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("3GIO");
        p.setDescription_words("O 3GIO é um barramento de dados ultra-rápido que conta com o apoio da Intel para\n" +
                "eventualmente substituir o barramento PCI.\n" +
                "A versão inicial do 3GIO será capaz de transmitir apenas 2.5 gigabits por segundo, ou 312 MB/s,\n" +
                "pouco mais que o dobro dos slots PCI atuais. Este primeiro padrão começará a ser utilizado em\n" +
                "2004 segundo os planos da Intel. O padrão seguinte entrará em operação em 2005 e será 4\n" +
                "vezes mais rápido, atingindo 10 gigabits por segundo.\n" +
                "Ambos os padrões conviverão por algum tempo, mas felizmente serão intercompatíveis. Uma\n" +
                "placa 3GIO de 10 gigabits poderá trabalhar num slot de 2.5 gigabits (embora a performance\n" +
                "possa ser prejudicada) e vice-versa. As placas PCI continuarão sendo suportadas durante muito\n" +
                "tempo, pelo menos até o lançamento do próximo padrão. Lembre-se que as placas ISAdemoraram quase 10 anos para deixarem de ser suportadas nas placas novas depois do\n" +
                "surgimento do PCI.\n" +
                "Apesar de parecer apenas um \"remendo\" do PCI, o 3GIO elimina toda a carga de legado do\n" +
                "barramento antigo. O conector PCI foi mantido, mas toda a parte lógica foi muito modificada.\n" +
                "Juntos, os slots do 3GIO utilizam apenas 40 trilhas de dados, contra nada menos que 84 trilhas\n" +
                "do PCI tradicional, 150 trilhas do PCI de 64 bits e 108 trilhas do AGP. Sem dúvida uma economia\n" +
                "expressiva.\n" +
                "Mais uma característica importante do 3GIO é a sua topologia ponto a ponto. Ao contrário do\n" +
                "PCI, onde todos os dispositivos compartilham o mesmo barramento e apenas um pode transmitir\n" +
                "de cada vez, o 3GIO utiliza um switch para garantir que cada dispositivo disponha de uma\n" +
                "ligação exclusiva com o chipset e os demais componentes do PC. Graças a isto, vários\n" +
                "dispositivos podem transmitir o mesmo tempo e dispor do barramento a qualquer instante.\n" +
                "Isto é especialmente efetivo quando dois dispositivos ligados ao barramento 3GIO precisam\n" +
                "trocar dados entre sí, como por exemplo dados que vão de uma placa de rede para a outra.\n" +
                "Estas transferências podem ser feitas dentro do próprio barramento, sem ocupar a ponte sul do\n" +
                "chipset, nem muito menos o processador.\n" +
                "Está anunciada ainda uma versão do 3GIO destinada a notebooks, que substituirá os slots PCCard utilizados atualmente, que são uma extensão do barramento PCI. Mas, ainda não foi\n" +
                "divulgado se o novo padrão manterá compatibilidade com o atual. As placas PC-Card atuais por\n" +
                "exemplo, não podem ser instaladas em muitos notebooks antigos, com slots PCMCIA que são\n" +
                "baseados no barramento ISA. O encaixe é o mesmo, mas placas não funcionam.\n" +
                "Para completar, está previsto que o 3GIO permitirá também a conexão de dispositivos externos,\n" +
                "mantendo a mesma velocidade de transferência de dados, sem dúvida um grande avanço sobre\n" +
                "os 400 megabits do USB 2.0 e do Fireware, mas que será aproveitado por poucos periféricos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("4G");
        p.setDescription_words("A quarta geração de telefones celulares ainda está em desenvolvimento, mas promete\n" +
                "velocidades de transmissão bastante superiores aos celulares 3G: entre 20 e 40 megabits. Os\n" +
                "celulares 4G de vem começar a ser usados no Japão por volta de 2006, (só Deus sabe quando\n" +
                "chegarão por aqui :-). O 4G aumentará ainda mais o potencial dos celulares como plataforma de\n" +
                "entretenimento, além de tornar a transmissão de dados mais barata em relação aos padrões\n" +
                "anteriores.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("4i RDRAM");
        p.setDescription_words("Esta é uma tecnologia de memória Rambus sensivelmente mais barata que a tradicional, onde\n" +
                "temos apenas 4 páginas de memória por chip, ao invés de 16 páginas. Em teoria, o fato de\n" +
                "usarem menos páginas de memória tornaria os módulos 4i mais lentos, já que menos páginas de\n" +
                "memória abertas, significa uma chance menor do chipset conseguir obter os dados de que\n" +
                "necessita sem precisar abrir uma página inativa da memória.\n" +
                "Porém, os chipsets que suportam memória Rambus, como o i850 são capazes de manter apenas\n" +
                "64 páginas de memórias abertas simultâneamente. Como nestas soluções é preciso utilizar os\n" +
                "módulos RIMM aos pares, teremos sempre pelo menos dois módulos de memória Rambus\n" +
                "espetados na placa mãe. Se temos sempre pelo menos 8 chips por módulo, teremos então pelo menos 16 chips. Com 4 bancos por chip já teremos as 64 páginas que o chipset é capaz de\n" +
                "manter abertas.\n" +
                "Ou seja, os módulos 4i RDRAM já são capazes de oferecer o número de páginas de que o chipset\n" +
                "pode tomar vantagem, por isso não há perda de desempenho em relação aos módulos de 16\n" +
                "páginas, que são mais úteis em sistemas que utilizam poucos chips de memória, como por\n" +
                "exemplo o Playstation 2, onde temos apenas 2 chips soldados à placa mãe.\n" +
                "Em teoria, a arquitetura simplificada dos módulos 4i RDRAM permitiriam que, se produzidos em\n" +
                "quantidade, pudessem custar o mesmo, ou até menos que os módulos de memória DDR. Porém,\n" +
                "isso parece não importar tanto atualmente, já que além do chipset i850 da Intel, que está\n" +
                "prestes a ser descontinuado, não temos mais nenhuma plataforma importante que utilize\n" +
                "memórias Rambus, o que deixa pouco espaço para uma eventual massificação desta tecnologia.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("680x0");
        p.setDescription_words("Esta é a família de processadores, produzidos pela Motorola, que foram utilizados nos Macintoshs\n" +
                "até a metade da década de 90. Existiram basicamente 5 versões, 6800, 68020, 68030, 68040 e\n" +
                "68060. Em parceria com a Apple e a IBM, a Motorola lançou em 94 os chips Power PC, seus\n" +
                "sucessores.\n" +
                "Os Macintoshs da família Performa foram os últimos a utilizar os chips 680x0, a partir dos Power\n" +
                "Macs passaram a ser usados os novos chips. Mais um fato importante é que as duas famílias são\n" +
                "incompatíveis, os chips 680x0 possuem uma arquitetura CISC, enquanto os chip Power PC\n" +
                "possuem um design inspirado na arquitetura RISC.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("80186");
        p.setDescription_words("O processador usado nos primeiros PCs, entre eles o PC XT, foi o 8088, uma variação do 8086.\n" +
                "Depois, surgiram os PCs baseados no 80286, ou simplesmente 286. Mas, entre as duas\n" +
                "gerações, existiu um modelo intermediário, pouco conhecido, mas igualmente importante.\n" +
                "O 80186 é uma evolução do 8086, que trouxe algumas instruções novas e um sistema de\n" +
                "tolerância à falhas. Apesar de não ter sido usado como processador em micros PC, o 80186\n" +
                "tornou-se um componente bastante popular, sendo usado em controladores de HDs,\n" +
                "controladores de interrupção entre vários outros periféricos. Nestas aplicações, o 80186 continua\n" +
                "em uso até hoje.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("802.11b+");
        p.setDescription_words("Esta é uma evolução do padrão de redes sem fio IEEE 802.11b desenvolvido pela DLink. Este\n" +
                "não é um padrão aprovado pelo IEEE por isso é chamado apenas \"802.11+\" e não \"IEEE\n" +
                "802.11+\".\n" +
                "O 802.11b+ é suportado por um número relativamente pequeno de produtos, mas traz como\n" +
                "principal vantagem o aumento da taxa de transferência a curtas distâncias, que segundo os\n" +
                "fabricantes pode chegar a até 22 megabits, o dobro dos 11 megabits permitidos pelo 802.11b\n" +
                "tradicional, ao mesmo tempo em que mantém compatibilidade com o padrão antigo.\n" +
                "A mudança é transparente para o usuário. Ao conectar dois dispositivos 802.11b+ ele se\n" +
                "reconhecem e passam a trabalhar a 22 megabits. Caso sejam misturados com dispositivos\n" +
                "802.11b tradicionais a taxa de transmissão cai automaticamente para 11 megabits, respeitando\n" +
                "a velocidade dos dispositivos mais lentos.\n" +
                "Vale lembrar que os 22 megabits são atingidos apenas em distâncias muito curtas, apenas\n" +
                "alguns metros. A partir daí a velocidade cai vertiginosamente, se aproximando cada vez mais da\n" +
                "velocidade dos transmissores 802.11b tradicionais.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("A3D (Aureal 3D)");
        p.setDescription_words("A primeira empresa a desenvolver uma API de som tridimensional foi a Aureal, com seu Aureal\n" +
                "3D, ou simplesmente A3D. As primeiras placas de som compatíveis com esta API, como a\n" +
                "Monster Sound foram lançadas no início de 97. O A3D 1.0 permite simular 3 eixos: frente e trás,\n" +
                "direita e esquerda e frente e baixo, aplicando filtros especiais para que o som realmente pareça\n" +
                "vir de todas as direções, mesmo utilizando apenas duas caixas acústicas ou fones de ouvido.\n" +
                "Estes filtros são capazes de distorcer sutilmente as ondas sonoras, conseguindo enganar nossos\n" +
                "ouvidos, fazendo-nos pensar que elas vêem de diferentes direções. Estes filtros consomem uma\n" +
                "enorme quantidade de poder de processamento e seu uso é o principal motivo dos chipsets de\n" +
                "som atuais serem tão poderosos. A vantagem é que como tudo é processado na própria placa de\n" +
                "som, não há quase utilização do processador principal. Existem claro algumas excessões,\n" +
                "maioria das placas de som onboard quando compatíveis com o padrão processam os efeitos via\n" +
                "software, o que consome cerca de 15% do desempenho de um Pentium III de 1.0 GHz. Veja\n" +
                "também: EAX\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Abandonware");
        p.setDescription_words("É um software \"abandonado\", que não é mais vendido, nem conta com suporte por parte do\n" +
                "fabricante. Apesar disso, a menos que o software seja disponibilizado como freeware, cópias não\n" +
                "registradas continuam sendo ilegais, já que a lei de direitos autorias garante direitos ao criador\n" +
                "por de 50 a 75 anos, dependendo do país. Um bom exemplo é o MS-DOS da Microsoft. O\n" +
                "programa não é mais vendido, mas continua sendo ilegal copia-lo, empresta-lo etc. A Apple por\n" +
                "sua vez disponibilizou como freewares várias versões antigas do MAC OS.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ABR");
        p.setDescription_words("Average Bit Rate. Esta é uma opção encontrada em muitos programas de compressão de áudio\n" +
                "(seja em MP3 ou qualquer outro formato baseado em perda). O ABR é o método mais rápido de\n" +
                "compressão, onde é utilizado o mesmo bit-rate em todos os trechos da música. Por exemplo, a\n" +
                "maioria dos arquivos em MP3 utiliza um bit-rate de 128 kbits, onde temos 128 kbits de dados\n" +
                "por segundo para representar a música. No ABR é usada a mesma quantidade de bits para\n" +
                "representar tanto os trechos de silêncio no início e no final da faixa quanto para representar as\n" +
                "partes mais movimentadas da música, onde vários instrumentos concorrem entre sí e com a voz\n" +
                "do cantor. Você acaba com um silêncio de excelente qualidade, mas alguns trechos representados de forma precária. Este sistema é também chamado de CBR, ou \"constant bit\n" +
                "rate\", mas o significado é o mesmo\n" +
                "Em oposição temos o VBR ou \"variable bit rate\", um formato de compressão mais complexo e\n" +
                "demorado, mas que permite obter arquivos de melhor qualidade, mesmo mantendo o mesmo\n" +
                "bit-rate. O truque é economizar bits nos trechos menos movimentados, onde temos frequências\n" +
                "mais ou menos constantes e descarregar a munição acumulada nos trechos mais movimentados,\n" +
                "que passam a ser representados com mais bits e conseqüentemente uma qualidade maior. A\n" +
                "desvantagem do sistema é que a compressão da música demora muito mais. É ideal para quem\n" +
                "tem um PC rápido.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AC");
        p.setDescription_words("Aternating Current, corrente alternada. A forma como a eletricidade vem a partir da usina e\n" +
                "consequentemente a partir das tomadas. A direção é alternada 60 vezes por segundo (50 na\n" +
                "Europa). Veja também: DC");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Access");
        p.setDescription_words("Acesso. Leitura ou gravação de dados na memória RAM ou em outro meio qualquer, como um\n" +
                "disco rígido. Os tempos de acesso variam muito de acordo com o dispositivo, por exemplo, a\n" +
                "memória RAM pode ter tempos de acesso de 70, 60, 50, 10, 8, 7 ou mesmo 6 nanossegundos,\n" +
                "dependendo da tecnologia usada. O HD por sua vez é muito mais lento, com tempos de acesso\n" +
                "na casa dos 8 ou 9 milessegundos num HD atual.\n" +
                "O tempo de acesso determina apenas o tempo necessário para o dispositivo começar a transferir\n" +
                "dados e não a sua velocidade de transferência. Um módulo de memória PC-133 pode transferir\n" +
                "dados, em condições ideais, a 1066 MB/s, enquanto um HD topo de linha chega perto dos 50\n" +
                "MB/s. Veja que o HD demora por volta de um milhão de vezes mais tempo para começar a\n" +
                "transferir dados, mas depois que inicia a transferência, a diferença cai para cerca de 20 vezes.\n" +
                "Naturalmente, tanto a memória RAM quanto o HD são muito mais lentos que o processador,\n" +
                "tanto em termos de tempo de acesso quanto em termos de velocidade de transferência. Por\n" +
                "exemplo, um Athlon de 1.5 GHz executa um bilhão e meio de ciclos por segundo e processa 32\n" +
                "bits de dados em cada ciclo. Ou seja, em condições idéias o processador precisa de dados a cada\n" +
                "0,66 nanossegundo e processa 6 gigabytes de dados por segundo. Para diminuir a diferença\n" +
                "entre o processador, a memória RAM e o disco rígido, são usadas várias categorias de memória\n" +
                "cache, rápidas o bastante para acompanhar o processador. Leia também: Cache, Cache L1,\n" +
                "Cache L2, Cache L3, Cache de Disco.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Access Time");
        p.setDescription_words("Tempo de acesso, o tempo que o dispositivo acesso demora para entregar os dados requisitados,\n" +
                "ou armazenar a informação desejada. Quanto mais baixo for o tempo acesso, mais rápido será o\n" +
                "dispositivo. Na memória RAM o tempo de acesso é medido em nanossegundos, sendo que as\n" +
                "memórias SDRAM mais rápidas chegam a 6 nanos. Em HDs o tempo de aceso é bem mais alto, medido em milessegundos. Os HDs mais rápidos chegam a 8 milessegundos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Aceleração de Vídeo");
        p.setDescription_words("Placas de vídeo mais antigas, como as CGA e EGA usadas em micros 286, assim como as\n" +
                "primeiras placas padrão VGA não possuíam aceleração de vídeo. Isto significa que elas\n" +
                "limitavam-se a mostrar na tela as imagens enviadas pelo processador. Este tipo de placa\n" +
                "funcionava bem em ambientes texto como o DOS, onde a quantidade de informações a ser\n" +
                "mostrada no vídeo é pequena. Em ambientes gráficos como o Windows 95/98 porém, uma\n" +
                "quantidade enorme de dados deve ser processada para formar a imagem. Usando uma placa\n" +
                "sem aceleração, todo o trabalho tem que ser feito pelo processador, tornando o sistema bastante\n" +
                "lento.\n" +
                "Uma placa aceleradora alivia a carga sobre o processador, executando muitas das tarefas que\n" +
                "antes cabiam a ele. Ao arrastar uma janela por exemplo, o processador apenas transmitirá à\n" +
                "placa de vídeo: \"Arrastar a janela x para a posição y\" e a placa de vídeo fará o resto do\n" +
                "trabalho. Todas as placas de vídeo atuais possuem estes recursos. Se você abrir o painel de\n" +
                "controle do Windows, e abrir a janela \"sistema\", encontrará uma guia que permite diminuir ou\n" +
                "mesmo desativar a aceleração de vídeo, o que obviamente só deverá ser feito no caso de\n" +
                "problemas com a placa. Vale lembrar que esta aceleração visa apenas diminuir o trabalho do\n" +
                "processador quando lidamos com imagens bidimensionais, não tendo nada a ver com a geração\n" +
                "de gráficos 3D.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ACK");
        p.setDescription_words("Um comando suportado por vários sistemas e vários serviços e arquiteturas de rede, que\n" +
                "confirma o recebimento de um pacote de dados, mensagem ou comando.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ACPI");
        p.setDescription_words("Advanced Configuration and Power Interface. É o modo de economia de energia utilizado pelos\n" +
                "PCs atuais. Micros mais antigos suportam o DPMA, que é o modo anterior. A diferença básica é\n" +
                "que no ACPI o gerenciamento de energia é feito pelo sistema operacional e não pelo BIOS. Isso\n" +
                "permite um gerenciamento muito mais avançado, permitindo recursos como diminuir a\n" +
                "frequência de operação do processador (um recurso incomum em desktops, mas presente na\n" +
                "maioria dos notebooks), desligar dispositivos, etc.\n" +
                "Graças ao ACPI, os PCs atuais permitem um gerenciamento de energia muito mais sofisticado\n" +
                "que os antigos, onde era possível apenas desligar o monitor e o HD. O avanço veio na forma de\n" +
                "dois novos modos, o modo de espera e o hibernar.\n" +
                "Ao entrar em modo de espera, não apenas o HD e o monitor, mas quase todo o PC é desligado,\n" +
                "incluindo o processador, o cooler, placa de vídeo ou som, etc. Apenas a memória RAM, partes da\n" +
                "placa mãe, modem e placa de rede continuam ativos.\n" +
                "A memória RAM continua sendo alimentada para manter os dados gravados e permitir que o PC\n" +
                "volte exatamente onde estava. É a única parte do PC que realmente não pode ser desligada sem\n" +
                "que seja necessário um novo boot. O modem permanece ligado para que a conexão não caia e a\n" +
                "placa de rede permanece alerta para acordar o PC caso o recurso de wake-on-lan esteja ativado\n" +
                "no Setup.\n Em modo de espera o PC consome de 15 a 20 Watts de energia, o mesmo que uma lâmpada\n" +
                "fluorescente e pode voltar à atividade em poucos segundos. Note que apenas o cooler do\n" +
                "processador é desligado, o exaustor da fonte continua funcionando, pois ainda é necessário que\n" +
                "ela forneça uma quantidade razoável de energia.\n" +
                "Para que a opção de entrar em modo de espera esteja disponível, é necessário que a sua placa\n" +
                "mãe ofereça suporte a ACPI. O Windows 98/2000 é capaz de detectar isto e ativar ou não o\n" +
                "suporte automaticamente. Veja que isto inclui apenas placas razoavelmente recentes, e mesmo\n" +
                "assim o suporte pode ser desativado caso você tenha alguma placa ISA que não suporte este\n" +
                "recurso.\n" +
                "Como opção, existe o hibernar (ou suspender) onde o conteúdo da memória RAM é gravado no\n" +
                "HD e o PC é realmente desligado. Ao liga-lo novamente o sistema simplesmente recupera os\n" +
                "dados e também volta exatamente onde estava. O tempo necessário depende da quantidade de\n" +
                "memória RAM que estiver instalada, quanto mais memória maior será o arquivo no HD e mais\n" +
                "demorará. Mas, geralmente ainda será bem mais rápido que um boot completo.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Active Directory");
        p.setDescription_words("Este é um recurso presente no Windows 2000 Server e Windows XP Server (quando for lançado)\n" +
                "que cria uma interface para a administração dos recursos de rede. Usando o Active Directory o\n" +
                "administrador pode visualizar e modificar todos os recursos da rede de forma centralizada, ao\n" +
                "invés de ter fazê-lo micro por micro. O Active Directory é baseado no LDAP e é uma resposta\n" +
                "direta ao NDS do Novell Netware.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Actuator");
        p.setDescription_words("Num HD, é o mecanismo de movimenta as cabeças de leitura. Basicamente é composto por um\n" +
                "braço móvel em forma de triângulo. Na ponta do triângulo encontram-se as cabeças de leitura\n" +
                "do HD, enquanto na base temos um eixo e dois eletroímãs, que controlados pela placa lógica do\n" +
                "HD movimentam o mecanismo com uma velocidade e precisão espantosas. Em HDs muito\n" +
                "antigos e em drives de disquete, é utilizado um motor de passo no lugar do actuator, por isso\n" +
                "esses dispositivos são extremamente lentos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ActiveX");
        p.setDescription_words("Linguagem que pode ser usada para construir páginas Web dinâmicas, com scripts que rodam a\n" +
                "partir do servidor. Apesar dos recursos, o ActiveX peca pelas incompatibilidades com vários\n" +
                "browsers, bugs, sobrecarga do servidor devido à grande quantidade de processamento exigido e\n" +
                "brechas de segurança. Apesar de tudo, muitos acreditam que o ActiveX é o futuro da Web.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ACR");
        p.setDescription_words("Advanced Communications Riser. Um padrão desenvolvido por uma associação de vários\n" +
                "fabricantes, que inclui a AMD, Lucent, Motorola, 3Com, Nvidia, Texas Instruments e Via. Os slots\n" +
                "ACR se parecem com um slot PCI invertido, na verdade os fabricantes optaram por aproveitar o\n" +
                "mesmo encaixe para cortar custos, mas as semelhanças param por aqui, já que mudam a\n" +
                "posição e sinalização elétrica do slot. Os slots ACR são Risers para a conexão de placas de som e modems de baixo custo, assim como\n" +
                "os slots AMR. Muitas placas atuais trazem um slot ACR, mas os fabricantes evitam desenvolver\n" +
                "placas com dois ou mais slots ACR para não diminuir o número de slots PCI da placa.\n" +
                "A principal vantagem do ACR sobre o AMR é enquanto o AMR permite que o Riser inclua apenas\n" +
                "modem e placa de som, no ACR o Riser pode conter praticamente todo tipo de dispositivos,\n" +
                "desde modems e placas de som baratas, controlados via software, até placas de rede, modems\n" +
                "ADSL ou ISDN, placas de som e modems controlados via hardware, etc. ");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Acrobat");
        p.setDescription_words("Formato de arquivo desenvolvido pela Adobe que permite que documentos sejam exibidos em\n" +
                "qualquer micro com as fontes e layout corretos, alem de também suportar imagens, tabelas e\n" +
                "recursos de segurança. A Adobe lançou no mercado dois produtos relacionados ao formato, o\n" +
                "Acrobat Reader que permite apenas visualizar os arquivos e é gratuíto e o Acrobat Writer, que\n" +
                "permite gerar os arquivos e é pago.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Adaptive Compression");
        p.setDescription_words("Algoritmo inteligente de compressão que altera o nível de compressão de acordo com o tipo de\n" +
                "dados. Um exemplo de uso são vídeos, onde as cenas de maior movimentação devem receber\n" +
                "um nível mais baixo de compressão do que as cenas de diálogos, onde há poucas mudanças de\n" +
                "imagem.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ADC");
        p.setDescription_words("Analogue-to-Digital Converter, componente que faz conversão de um sinal analógico para digital.\n" +
                "Todas as placas de som possuem um ADC, responsável por digitalizar os sons analógicos vindos\n" +
                "do microfone ou outro dispositivo analógico qualquer.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Additive Colour");
        p.setDescription_words("Uma cor produzida através da mistura de diferentes tonalidades de algumas cores primárias.\n" +
                "Num monitor as cores são obtidas através da mistura de pontos azuis, vermelhos e verdes.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ADSL");
        p.setDescription_words("Assimetric Digital Subscriber Line, tecnologia de acesso rápido que usa as linhas telefônicas\n" +
                "oferecida em várias cidades. As velocidades variam em geral de 256 kbits a 2 mbps, dependendo do plano de acesso escolhido. A principal virtude é não usar o sistema telefônico\n" +
                "comutado, dispensando o assinante de pagar pulsos, apenas a tarifa mensal.\n" +
                "Para isso, é instalado um modem ADSL na casa do assinante e outro na central telefônica. Os\n" +
                "dois modems estabelecem uma comunicação contínua, usando frequências mais altas que as\n" +
                "utilizadas nas comunicações de voz, o que permite falar no telefone e usar o ADSL ao mesmo\n" +
                "tempo. O modem instalado na central é ligado diretamente ao sistema do provedor, sem passar\n" +
                "por outras centrais telefônicas.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Adware");
        p.setDescription_words("São programas, geralmente gratuítos, que mostram anúncios, na forma de banners incorporados\n" +
                "à interface do programa, ou mesmo janelas pop-up. As propagandas são uma forma alternativa\n" +
                "dos desenvolvedores ganharem dinheiro com o programa. Existem claro os contrários à idéia,\n" +
                "que argumentam que, como acessam a rede para baixar os banners a serem exibidos, estes\n" +
                "programas podem ser usados para investigar os hábitos de navegação do usuário. Muitas vezes\n" +
                "existe a opção de comprar uma versão do programa que não mostra os anúncios.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AfterStep");
        p.setDescription_words("Uma interface gráfica para o Linux e Unix que é baseada na NEXTSTEP, outra interface para o X,\n" +
                "que foi utilizada pela Apple como base para a interface Aqua do MacOS X. Apesar disso, o\n" +
                "desenvolvimento da AfterStep continua independente, servindo como uma opção mais leve para\n" +
                "os usuários das interfaces KDE e Gnome.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AGC");
        p.setDescription_words("Automatic Gain Control. É um recurso necessário para que o gravador ou leitor de CDs seja\n" +
                "capaz de ler CDs regraváveis. Em comparação com os CDs prensados, os CDs regraváveis\n" +
                "possuem uma taxa de refração muito baixa, em torno de 20 ou 25%. Para lê-los, é necessário\n" +
                "aumentar a potência do laser de leitura, trabalho feito pelo AGC. Quase todos os gravadores são\n" +
                "compatíveis, mas infelizmente apenas uma pequena parte dos leitores o são. Os CDs graváveis\n" +
                "por sua vez podem ser lidos em praticamente qualquer leitor, já que oferecem uma refração de\n" +
                "luz de até 80%");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AGP");
        p.setDescription_words("Acelerated Graphics Port. Barramento de dados extremamente rápido usado pela placa de vídeo.\n" +
                "Aparece como um slot marrom na placa mãe. Existem várias versões do AGP, chamadas AGP 1X,\n" +
                "2X, 4X e AGP Pro, o padrão mais novo. Os três primeiros, diferenciam-se pela velocidade: O AGP\n" +
                "1X permite transmissão de dados a 266 MB/s, o AGP 2X trabalha a 533 MB/s, enquanto o AGP\n" +
                "4X atinge 1066 MB/s. O AGP Pro por sua vez, diferencia-se dos demais por possuir uma\n" +
                "capacidade maior de fornecimento elétrico. Enquanto os slots AGP tradicionais fornecem até 20\n" +
                "Watts de eletricidade, os slots AGP Pro fornecem 50 Watts (AGP Pro 50) ou 110 Watts (AGP Pro\n" +
                "110). Os slots AGP Pro são maiores que os tradicionais. Uma placa AGP comum pode ser usada\n" +
                "sem problemas num slot AGP Pro, mas não o contrário.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AGP 8X");
        p.setDescription_words("Esta é a versão mais recente do barramento AGP, que apesar de manter a frequência de\n" +
                "operação de 66 MHz passou a ser capaz de realizar 8 transferências por ciclo, atingindo incríveis\n" +
                "2133 MB/s. Apesar desta velocidade não ser comparável com a da memória de vídeo das placas\n" +
                "mais atuais, que não vão demorar muito para romper a barreira dos 10 GB/s, esta nova versão\n" +
                "do AGP significa um grande ganho de desempenho para as placas de vídeo onboard, que\n" +
                "utilizam memória RAM compartilhada como memória de vídeo.\n" +
                "Um dos primeiros chipsets a utilizar o AGP 8X foi o nVidia nForce, onde ele é usado para\n" +
                "alimentar o chipset de vídeo GeForce MX integrado. Um adendo é que para o AGP 8X fazer\n" +
                "sentido é necessário que a placa mãe utilize memórias DDR ou Rambus, pois memórias PC-133\n" +
                "não são capazes de atender todo o potencial nem mesmo do AGP 4X. No caso do nForce a\n" +
                "solução para alimentar o chipset de vídeo foi o TwinBank, que permite combinar dois pentes de\n" +
                "memória DDR PC-2100, atingindo um barramento de dados (teórico) de 4.2 GB/s.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AGP 3.0");
        p.setDescription_words("Esta é uma nomenclatura alternativa para o AGP 8X. Neste caso, o AGP 1.x engloba as versões\n" +
                "1x e 2x, onde apesar da diferença na taxa de transferência de dados temos os mesmos\n" +
                "requisitos elétricos (tensão, capacidade de alimentação, etc.). O 2.x refere-se ao AGP 4x, onde\n" +
                "além de um novo aumento na taxa de transferência tivemos o estabelecimento de um padrão\n" +
                "elétrico mais rígido, que estabelece que a placa mãe deve ser capaz de fornecer estavelmente\n" +
                "uma quantidade maior de eletricidade para a placa de vídeo e a uma tensão mais baixa, apenas\n" +
                "1.5v, contra os 3.3v do padrão anterior.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AGP Led");
        p.setDescription_words("As placas mãe para Pentium 4 baseadas no chipset i845, i845D ou futuros lançamentos da Intel\n" +
                "baseados nestes dois projetos possuem um grave problema de compatibilidade com placas de\n" +
                "vídeo AGP que utilizam tensão de 3.3V (as placas atuais utilizam 1.5V) o problema é tão grave\n" +
                "que o simples fato de ligar o micro com uma destas placas pode queimar o controlador AGP,\n" +
                "inutilizando a placa.\n" +
                "Em teoria, apenas placas AGP antigas, 1X ou 2X podem utilizar 3.3V ou 1.5V, enquanto todas as\n" +
                "de 4X obrigatoriamente utilizariam 1.5V. Mas, placas com chipsets Riva TNT2 (Pro e Ultra),\n" +
                "GeForce256 DDR, GeForce2 Pro e GeForce2 Ultra podem utilizar 3.3V mesmo sendo vendidas\n" +
                "como placas AGP 4X. O AGP Led é uma novidade presente em muitas placas i845 recentes, onde um sistema de\n" +
                "segurança detecta a tensão utilizada pela placa de vídeo e paralisa a placa caso a placa utilize\n" +
                "3.3V, evitando qualquer dano. Um led, posicionado próximo ao conector da fonte acende,\n" +
                "avisando o usuário do problema.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Algoritmo");
        p.setDescription_words(" Algoritmo Ou Algorithm em Inglês. Um conjunto de cálculos matemáticos, usado para encriptar dados,\n" +
                "compactar arquivos, entre várias outras aplicações. Um arquivo compactado ou encriptado pode\n" +
                "ser usado apenas por quem tiver o algoritmo de desencriptação ou descompactação, que\n" +
                "permitirá reverter o processo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Alias");
        p.setDescription_words("Apelido, pode ser usado em várias áreas, como por exemplo no e-mail. Caso você tenha uma\n" +
                "conta, fulano@fulano.com, e um alias fulaninho@fulano.com, todos os e-mails endereçados ao\n" +
                "alias será encaminhados para a conta real. O alias é um dos comandos básicos do Unix, que\n" +
                "permite personalizar os comandos do sistema, digitando por exemplo \"on\" ao invés de \"mount /\n" +
                "mnt/cdrom\" por exemplo. No Linux é possível criar aliases editando o arquivo \".bashrc\",\n" +
                "presente no diretório de cada usuário, ou o arquivo /etc/bachrc, que vale para todos os usuários");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Alpha");
        p.setDescription_words("É ao mesmo tempo o nome de uma família de processadores RISC, quanto o nome dos sistemas\n" +
                "baseados nele, ambos desenvolvidos pela Dec. Os servidores Alpha fizeram sucesso durante\n" +
                "vários anos. Apesar de terem seu conjunto dei instruções próprio, os chips Alpha ganharam uma\n" +
                "versão do Windows NT e de várias versões do Linux. Os Alpha foram usados por exemplo no\n" +
                "Altavista.com.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ALU");
        p.setDescription_words("Arithmetic Logic Unit. Como o nome sugere, é a parte do processador principal encarregada de\n" +
                "processar os cálculos de ponto flutuante. O termo ALU, dependendo da conotação, pode ser tanto\n" +
                "usado em relação ao coprocessador aritmético como um todo, quanto em relação a apenas uma\n" +
                "das unidades de execução que formam os coprocessadores modernos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Altair 8080");
        p.setDescription_words("Lançado em 1974 é considerado por muitos o primeiro computador pessoal da história. O Altair\n" +
                "era baseado no 8080 da Intel e vinha com apenas 256 bytes de memória, realmente bem pouco,\n" +
                "mesmo para a época.\n" +
                "No modelo básico, o Altair custava apenas 439 dólares na forma de Kit, isso em 1975, quando\n" +
                "começou a ser comercializado, em valores de hoje este valor equivale a quase 4.000 dólares.\n" +
                "Parece bastante, mas na época esse valor foi considerado uma pechincha, tanto que foram\n" +
                "vendidas 4.000 unidades em 3 meses, depois de uma matéria da revista Popular Eletronics. Esse\n" +
                "\"modelo básico\" consistia nas placas, luzes, chips, gabinete, chaves e a fonte de alimentação,\n" +
                "junto claro com um manual que ensinava como montar o aparelho. Existia a opção de compra-lo\n" +
                "já montado, mas custava 182 dólares a mais. Pouco tempo depois começaram a surgir vários\n" +
                "acessórios para o Altair: um teclado que substituía o conjunto de chaves que serviam para\n" +
                "programar o aparelho, um terminal de vídeo (bem melhor que ver os resultados na forma de\n" +
                "luzes :-), um drive de disquetes (naquela época ainda se usavam disquetes de 8 polegadas),\n" +
                "placas de expansão de memória e até uma impressora, para quem tivesse muito dinheiro,\n" +
                "claro :-)\n" +
                "Até mesmo Bill Gates ajudou, desenvolvendo uma versão do Basic para o Altair. O Altair era\n" +
                "realmente um sistema muito simples, que não tinha muita aplicação prática, mas serviu para\n" +
                "demonstrar a grande paixão que a informática podia exercer e que, ao contrário do que diziam\n" +
                "muitos analistas da época, existia sim um grande mercado para computadores pessoais.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Altivec");
        p.setDescription_words("O conjunto de instruções especiais que equipa os processadores G4 da Motorola, usados nos\n" +
                "micros Macintosh. Este conjunto inclui tanto instruções 3D (como no 3D-Now! encontrado nos\n" +
                "processadores AMD), quanto instruções multimídia (como o MMX).");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AMD 760");
        p.setDescription_words("Este foi o primeiro chipset para Athlon a suportar memórias DDR e foi produzido pela própria\n" +
                "AMD. O AMD 760 é formado por dois chips, o AMD-761 (ponte norte) e o AMD-766 (ponte sul).\n" +
                "Este chipset suporta tanto memórias DDR PC-1600 quanto memórias DDR PC-2100 e pode\n" +
                "trabalhar tanto em conjunto com processadores que utilizam bus de 200 MHz quanto\n" +
                "processadores que utilizam bus de 266 MHz. Salvo limitações por parte do BIOS, as placas\n" +
                "baseadas neste chipset suportam todos os modelos do Athlon Thunderbird e Duron em formato\n" +
                "soquete A além do Athlon XP.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AMD 760MP");
        p.setDescription_words("Esta é uma variação do chipset AMD-760 que além do suporte a memórias DDR e outros\n" +
                "recursos do chipset original, oferece suporte a multiprocessamento. É possível utilizar tanto dois\n" +
                "processadores Athlon MP, quanto dois processadores Duron baseados no core Morgan (as\n" +
                "versões de 1.0 GHz em diante). As placas baseadas neste chipset trazem dois encaixes para\n" +
                "processadores e são um pouco mais caras.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AMD 760MPX");
        p.setDescription_words("Esta é uma versão atualizada do chipset 760MP, destinada principalmente a servidores, que traz\n" +
                "como novidade o suporte a slots PCI de 64 bits e/ou de 66 MHz proporcionado pelo uso de uma\n" +
                "nova ponte sul, composta pelo chip 768.\n" +
                "Os slots PCI de 64 bits são maiores que os comuns (que são slots de 32 bits e operam a 33 MHz,\n" +
                "proporcionando um barramento de dados de 133 MB/s) mas trazem a vantagem de transferirem\n" +
                "64 bits de dados por vez, o suficiente para dobrar a velocidade de transferência de dados,\n" +
                "atingindo 266 MB/s. Os slots de 66 MHz novamente dobram a velocidade, atingindo 533 MB/s.\n" +
                "Estes slots mais rápidos são importante em servidores que utilizam placas SCSI, Gigabit Ethernet\n" +
                "ou outros tipos de periféricos muito rápidos. No futuro teremos o PCI-X, capaz de atingir\n" +
                "velocidades ainda mais altas.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AMR");
        p.setDescription_words("A sigla AMR é a abreviação de \"Audio Modem Riser\". Este é um padrão de barramento que\n" +
                "permite o encaixe de placas de som e modems controlados via software.\n" +
                "O slot AMR se parece com um slot AGP, mas tem apenas 1/3 do tamanho deste. O objetivo é\n" +
                "permitir a criação de componentes extremamente baratos para serem usados em micros de\n" +
                "baixo custo.\n" +
                "A vantagem é claro, o preço, já que uma placa de som ou modem AMR não custam mais de 5 ou\n" +
                "7 dólares para o fabricante (um pouco mais para o consumidor final naturalmente). A\n" +
                "desvantagem, por sua vez, é o fato destes componentes serem controlados via software, o que\n" +
                "consome recursos do processador principal, tornando o micro mais lento. Usando ao mesmo\n" +
                "tempo modem e placa de som AMR num Pentium III 800, a queda de performance é de mais de\n" +
                "10%. Claro que existe a opção de desprezar o slot AMR e utilizar componentes tradicionais.\n" +
                "Como o chip controlador é embutido no próprio chipset, as placas de som e modems AMR contém\n" +
                "um número extremamente reduzido de componentes, basicamente as entradas e saídas de som,\n" +
                "o CODEC e, no caso dos modems, o Relay (o componente que permite o acesso à linha\n" +
                "telefônica).\n" +
                "Apesar disso, o AMR não chegou a fazer muito sucesso, pois não oferece suporte a Plug-andplay, o que dificulta a instalação dos dispositivos por parte dos usuários e suporta apenas placas\n" +
                "de som e modems, deixando de fora as placas de rede e outros dispositivos comuns atualmente.\n" +
                "Pensando em resolver estas limitações vários fabricantes se reuniram para desenvolver o ACR,\n" +
                "um padrão aberto que substitui o AMR com várias vantagens, mantendo o baixo-custo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Analogue Video");
        p.setDescription_words("Vídeo Analógico, vídeo transmitido ou gravado na forma de sinais analógicos, como na TV ou\n" +
                "numa fita de vídeo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Anamorphic");
        p.setDescription_words("Este termo é usado em relação aos filmes em DVD. No cinema as telas são mais largas do que\n" +
                "uma tela de TV. Para que seja possível assistir os filmes numa TV comum, os cantos da imagem\n" +
                "devem ser cortados. O termo se refere a um vídeo que passou por essa formatação.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Anisotropic Filtering");
        p.setDescription_words("O anisotropic filtering melhora a qualidade das texturas aplicadas sobre superfícies inclinadas, o\n" +
                "exemplo mais clássico é o texto de abertura dos filmes do StarWars. Em geral o efeito é melhor\n" +
                "percebido em jogos de primeira pessoa, nas paredes e objetos mais próximos. Pense no\n" +
                "Anisotropic Filtering como uma espécie de evolução dos velhos bilinear e trilinear filtering que\n" +
                "encontramos nas configurações de quase todos os games.\n" +
                "Essa imagem da ATI mostra bem o conceito, do lado esquerdo temos o texto aplicado usando o\n" +
                "velho trilinear filtering e do lado direito temos o mesmo feito com nível máximo de qualidade do\n" +
                "anisotropic filtering o que tornou o texto um pouco mais legível:\n" +
                "A perda de desempenho é mais difícil de avaliar, pois os algoritmos usados tanto das placas da\n" +
                "nVidia quanto nas placas da ATI são adaptativos, ou seja, eles utilizam um número de amostras\n" +
                "proporcional ao ganho que pode ser obtido em cada cena. Isso faz com que a perda de\n" +
                "desempenho seja maior nos jogos em que existe maior ganho de qualidade.\n" +
                "É difícil traçar um padrão pois a perda de desempenho varia muito de game para game. Pode ser\n" +
                "de 10% ou de 50% dependendo do título. A melhor técnica é simplesmente experimentar ativar\n" +
                "o recurso e ver se você percebe uma melhora na qualidade ou perda perceptível no desempenho\n" +
                "e depois pesar as duas coisas na balança.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Anodo");
        p.setDescription_words("Um dos componentes dos monitores CRT. Consiste em um eletrodo carregado com cargas\n" +
                "positivas, que atraí cargas negativas, no caso os elétrons usados para criar a imagem.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Anonymous");
        p.setDescription_words("Nome normalmente utilizado para o login num servidor FTP, e indica tratar-se de um usuário\n" +
                "anônimo, ou seja, não cadastrado na máquina em questão. A password a fornecer em seguida\n" +
                "deve ser o e-mail do usuário. Em geral, usuários anônimos tem acesso a apenas alguns arquivos\n" +
                "do servidor e não são todos os servidores que permitem o acesso.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ANSI");
        p.setDescription_words("American National Standards Institute, uma associação voluntária, formada por mais de 1.300\n" +
                "membros, entre eles várias grande companhias. A ANSI se encarrega de estabelecer padrões\n" +
                "para a indústria, compatibilizando linguagens de programação, protocolos de rede,\n" +
                "especificações elétricas de vários componentes, etc. Entre as obras da ANSI está o padrão de caracteres ASCII.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Answer Mode");
        p.setDescription_words("Modo de resposta. Quando colocado neste modo, o modem é capaz de atender chamadas\n" +
                "telefônicas, seja para receber faxes ou funcionar como uma secretária eletrônica, dependendo\n" +
                "do programa instalado.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Anti-Aliasing");
        p.setDescription_words("Esta técnica permite suavizar os contornos em imagens, adicionando pontos de cores\n" +
                "intermediários. O Anti-Aliasing é um recurso cada vez mais utilizado nos jogos 3D, com o\n" +
                "objetivo de melhorar a qualidade de imagem, sobretudo ao se utilizar baixas resoluções. As\n" +
                "placas da nVidia por exemplo oferecem o recurso de FSAA, que ao ser ativado, faz com que a\n" +
                "placa renderize uma imagem 2 ou 4 vezes maior do que a que será exibida no monitor e em\n" +
                "seguida diminua seu tamanho, aplicando um algoritmo de anti-aliasing, antes de exibí-la. Com\n" +
                "isto as imagens ganham muito em qualidade.\n" +
                "Usando FSAA 4x, é possível ter imagens a 640 x 480 com uma qualidade visual superior à obtida\n" +
                "a 800 x 600 no mesmo jogo. Em compensação, como é preciso renderizar uma imagem 4 vezes\n" +
                "maior, o desempenho da placa, e consequentemente o FPS cai a apenas um quarto do que seria\n" +
                "obtido com o recurso desabilitado. Existem outras tecnologias que seguem o mesmo princípio,\n" +
                "como por exemplo a SmootVision da ATI.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Apache");
        p.setDescription_words("O apache é um servidor Web extremamente popular, usado principalmente no Linux. A dupla é\n" +
                "bastante popular em servidores de páginas desde a popularização da Internet em 95 e segundo\n" +
                "muitas estatísticas é a mais usada em servidores Web atualmente, superando o Windows.\n" +
                "O Apache acompanha praticamente todas as distribuições Linux atuais. Uma vez instalado, basta\n" +
                "ativar o serviço \"httpd\" através do ntsysv, linuxconf, mcc, ou outra ferramenta disponível na\n" +
                "sua distribuição. Você pode usar ainda o comando \"/etc/rc.d/init.d/httpd start\".\n" +
                "A maior parte da configuração do Apache pode ser feita através de um único arquivo, o\n" +
                "httpd.conf, que pode ser encontrado no diretório \"/etc/httpd/conf/\" ou \"/etc/apache\". A\n" +
                "configuração mais importante neste arquivo é a porta TCP a ser usada pelo servidor, o default é\n" +
                "a porta 80.\n" +
                "O Apache também possui uma versão for Windows, que pode ser usada em substituição ao IIS\n" +
                "da Microsoft. Porém, devido à maneira como o Windows gerencia a geração de novos processos,\n" +
                "e threads, o desempenho da versão Windows do Apache não é o mesmo da versão for Windows.\n" +
                "As primeiras versões chegavam até mesmo a perder para o IIS em desempenho, mas os\n" +
                "desenvolvedores vêm fazendo um grande esforço para melhorar seu desempenho em ambiente\n" +
                "Windows. As versões atuais já são muito mais rápidas (embora ainda sejam mais lentas que no\n" +
                "Linux) e possuem uma segurança muito boa. Mesmo no Windows, o Apache é uma solução\n" +
                "muito interessante para quem quer fugir dos problemas de segurança do IIS e ao mesmo tempo\n" +
                "procura um servidor Web rápido. Você pode baixar o Apache for Windows no O Apache é compatível com PHP, Perl, CGI e até mesmo ASP, bastando para isso instalar os\n" +
                "módulos adequados. No caso do ASP é preciso utilizar o chiliasp, disponível em\n" +
                "http://www.chiliasp.com\n" +
                "O mais interessante é que apesar de todos os recursos o Apache é distribuído sobre a licença\n" +
                "GNU, ou seja, além de ser gratuíto, o código fonte está disponível para quem quiser estudar, ou\n" +
                "mesmo alterar o programa. http://www.apache.org/");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Aperture Grill");
        p.setDescription_words("Nos monitores CRT tradicionais é utilizada uma folha de metal com vários orifícios, chamada\n" +
                "shadow mask, que tem a função de isolar as células de fósforo, impedindo que o feixe do canhão\n" +
                "de elétrons destinada a cada célula atinja também as células vizinhas, o que deixaria a imagem\n" +
                "borrada. No monitores Sony Trinitron é utilizado um outro método de separação, chamado de\n" +
                "aperture grill. Ao invés de uma grade, temos vários fios metálicos verticais, presos entre sí nas\n" +
                "bordas e por dois fios horizontais posicionados de forma a dividir a área em três partes iguais e\n" +
                "evitar que os fios vibrem com facilidade, o que causaria distorções na imagem.\n" +
                "Esta tecnologia permite que esta série de monitores tenham uma tela 100% plana, mas em\n" +
                "compensação traz um pequeno inconveniente: os dois fios horizontais criam duas sombras\n" +
                "bastante discretas que dividem a imagem em três partes. É possível notá-las facilmente\n" +
                "colocando o brilho e contraste no máximo e visualizando uma imagem clara. Muitos não se\n" +
                "importam com as sombras, mas outros não conseguem conviver com elas.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("API");
        p.setDescription_words("Application Programming Interface, um conjunto de funções e sub-rotinas usadas pelos\n" +
                "programas que informam ao sistema operacional como executar determinada tarefa. Por\n" +
                "exemplo, os jogos 3D são construídos com base no D3D, OpenGL ou Glide. De forma\n" +
                "semelhante, qualquer programa for Windows, escrito em C++ ou qualquer outra linguagem,\n" +
                "pode usar qualquer uma das mais de 1000 funções que abrem janelas, abrem ou gravam\n" +
                "arquivos, e outras tarefas semelhantes. É o fato de usarem APIs diferentes que fazem os\n" +
                "programas serem incompatíveis com outros sistemas operacionais.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Apollo");
        p.setDescription_words("Uma série de chipsets fabricados pela Via, que engloba chipsets destinados a vários\n" +
                "processadores. O Apollo original era um chipset destinado ainda ao Pentium 1, pouco depois\n" +
                "surgiu o Apollo Pro, destinado a placas para processadores Pentium II e Celeron. A série\n" +
                "destinada a processadores Pentium III é composta pelos chipsets Apollo Pro 133, 133A e 266\n" +
                "(com suporte a memórias DDR), com o reforço dos chipsets Apollo KX 266 e KT 266, destinados\n" +
                "aos processadores Athlon e Duron, da AMD.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Appaloosa");
        p.setDescription_words("Esta será a terceira geração do AMD Duron, construída numa arquitetura de 0.13 mícron. A\n" +
                "primeira geração foi o Duron Spitfire, que foi substituído pelo Duron Morgan, que trouxe suporte\n" +
                "às instruções SSE e outras melhorias no desempenho, além de um consumo elétrico mais baixo.\n" +
                "A terceira versão trará um consumo ainda mais baixo e será capaz de atingir frequências mais\n" +
                "altas, próximas dos 2.0 GHz, graças à arquitetura de 0.13 mícron. Especula-se que a AMD\n" +
                "poderá aproveitar para aumentar o cache do Duron para 256 KB, o que traria também um\n" +
                "grande ganho de desempenho. O Duron Appaloosa será lançado na segunda metade de 2002.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Apple I");
        p.setDescription_words("A Apple foi fundada em 1976, depois que o projeto do Apple I foi recusado pela Atari e pela HP.\n" +
                "Uma frase de Steve Jobs descreve bem a história: \"Então fomos à Atari e dissemos \"Ei, nós\n" +
                "desenvolvemos essa coisa incrível, pode ser construído com alguns dos seus componentes, o que\n" +
                "acham de nos financiar?\" Podemos até mesmo dar a vocês, nós só queremos ter a oportunidade\n" +
                "de desenvolvê-lo, paguem-nos um salário e podemos trabalhar para vocês. Eles disseram não,\n" +
                "fomos então à Hewlett-Packard e eles disseram \"Nós não precisamos de vocês, vocês ainda nem\n" +
                "terminaram a faculdade ainda\". O Apple I não foi lá um grande sucesso de vendas, vendeu\n" +
                "pouco mais de 200 unidades, mas abriu caminho para o lançamento de versões mais poderosas.\n" +
                "O Apple I usava um processador da Motorola, o 6502, que operava a apenas 1 MHz. O Apple I\n" +
                "vinha com 4 KB de memória, e saídas para teclado, terminal de vídeo e para uma unidade de\n" +
                "fita. Existia também um conector reservado para expansões futuras.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Apple II");
        p.setDescription_words("Apesar do começo difícil, o Apple I foi logo aperfeiçoado. Surgiu então o Apple II, lançado no\n" +
                "final da década de 70. Este sim fez um certo sucesso, apesar do preço salgado para a época,\n" +
                "US$ 1298, que equivalem a quase 9.000 dólares em valores corrigidos. O Apple II vinha com 4\n" +
                "KB de memória, como o primeiro modelo, a novidade foi uma ROM de 12 KB, que armazenava\n" +
                "uma versão da Basic. A memória RAM podia ser expandida até 52 KB, pois o processador\n" +
                "Motorola 6502 era capaz de endereçar apenas 64 KB de memória, e 12 KB já correspondiam à\n" +
                "ROM embutida. Um dos \"macetes\" naquela época era uma placa de expansão, fabricada pela\n" +
                "Microsoft (sim, eles já existiam naquela época :-), que permitia desabilitar a ROM e usar 64 KB\n" +
                "completos de memória. O Apple II já vinha com teclado e usava uma televisão como monitor. O\n" +
                "aparelho já vinha com uma unidade de fita K7, mas era possível adquirir separadamente uma\n" +
                "unidade de disquetes. Uma variação do Apple II, o Apple IIc, lançado em 79, é considerado por\n" +
                "muitos o primeiro computador portátil da história, pois tinha até um monitor de LCD como\n" +
                "opcional. Só faltavam mesmo as baterias");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Appliance");
        p.setDescription_words("A tradução mais simples para este tema é simplesmente \"ferramenta\". No mundo da\n" +
                "informática, as Appliances são computadores pré-configurados para executar uma tarefa\n" +
                "específica, como servir para compartilhar a conexão com a Web ou como um firewall para a\n" +
                "rede, como um kiosque multimídia, como um sistema de caixa registradora e leitor de código de\n" +
                "barras, um centro de multimídia, um centro de controle de um sistema de automatização\n" +
                "doméstica e assim por diante. As possibilidades são quase infinitas.\n" +
                "A chave para desenvolver uma boa Appliance é a facilidade de uso. É o tipo de dispositivo que\n" +
                "deve ser o mais parecido possível com um eletrodoméstico, do tipo que o usuário simplesmente\n" +
                "liga na tomada (ou na rede) e sai usando, sem precisar de nenhuma configuração complicada\n" +
                "nem de treinamento. Esta é a diferença básica entre uma Appliance e um PC: o PC pode fazer\n" +
                "muitas coisas, mas é complicado de usar, enquanto a Appliance é fácil de usar mas por outro\n" +
                "lado só faz uma coisa.\n" +
                "Ao contrário do que pode parecer, as Appliances nem sempre são dispositivos complicados de\n" +
                "construir. Pelo contrário, na maioria das vezes temos um PC comum, montado em algum tipo de\n" +
                "gabinete especial, acoplado num leitor de código de barras ou o que mais for necessário para\n" +
                "executar suas tarefas, rodando uma instalação personalizada do Linux. Muitas mantém um\n" +
                "servidor Apache ativo, para que o usuário possa fazer toda a administração via rede.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Applet");
        p.setDescription_words("Um pequeno programa que executa algumas tarefas numa Web Page. Os Applets podem ser\n" +
                "feitas em várias linguagens, mas a mais utilizada é o Java. Estes pequenos programas são\n" +
                "automaticamente instalados ao se acessar a página.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AppleTalk");
        p.setDescription_words("Um padrão primitivo de redes desenvolvido pela Apple para equipar o Macintosh original, na\n" +
                "década de 80, mas que mais tarde acabou sendo usado em toda a sua linha de produtos. As\n" +
                "interfaces AppleTalk eram muito baratas, mas em compensação transmitiam a apenas 230\n" +
                "Kbits, o que era pouco até mesmo para a época. Em compensação existia uma grande\n" +
                "versatilidade, já que as interfaces podiam ser utilizadas para ligar os Macs em rede sem custos\n" +
                "adicionais. Atualmente os Macs incluem interfaces de rede Ethernet, o que permite ligá-los aos\n" +
                "PCs mais facilmente.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("APM");
        p.setDescription_words("Advanced Power Management. Sistema avançado de gerenciamento de energia que permite\n" +
                "diminuir o consumo elétrico do computador desligando o monitor e o HD sempre que o PC ficar\n" +
                "ocioso durante o tempo mínimo configurado. Hoje em dia temos à disposição o ACPI, um modo\n" +
                "de economia que oferece muito mais recursos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Archie");
        p.setDescription_words("Este é um serviço de busca de arquivos armazenados em servidores FTP. Os arquivos podem ser\n" +
                "localizados por nome ou por uma palavra chave contida no arquivo (no caso de documentos de texto ou html). Foi importante no início da Internet, mas é um serviço pouco utilizado\n" +
                "atualmente.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Arcnet");
        p.setDescription_words("A Arcnet é uma arquitetura de rede antiga, que existe desde a década de 70. É claro que de lá\n" +
                "pra cá houveram avanços, mas não o suficiente para manter as redes Arcnet competitivas frente\n" +
                "às redes Ethernet e outras tecnologias modernas. Para você ter uma idéia, as redes Arcnet são\n" +
                "capazes de transmitir a apenas 2.5 mbps e quase não existem drivers for Windows para as\n" +
                "placas de rede. Os poucos que se aventuram a usá-las atualmente normalmente as utilizam em\n" +
                "modo de compatibilidade, usando drivers MS-DOS antigos.\n" +
                "Atualmente as redes Arcnet estão em vias de extinção, você não encontrará placas Arcnet à\n" +
                "venda e mesmo que as consiga, enfrentará uma via sacra atrás de drivers para conseguir fazêlas funcionar, isso se conseguir.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Argon");
        p.setDescription_words("Este é mais um nome exótico e pouco conhecido, mas é o nome código do projeto da AMD que\n" +
                "atingiu maior sucesso até hoje, nada menos que o Athlon. O Argon, ou Athlon, divide-se em três\n" +
                "arquiteturas, K7, K75 e Thunderbird.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Arpanet");
        p.setDescription_words("ARPA vem de Advanced Research Project Agency, uma instituição militar Americana que na\n" +
                "década de 50 abraçou um projeto ambicioso: interligar os computadores de várias bases\n" +
                "militares, centros de pesquisa e universidades. Nos primórdios da rede eram utilizados modems\n" +
                "e linhas telefônicas convencionais e a primeira comunicação bem sucedida foi conseguida\n" +
                "apenas em 69, com um simples \"LO\" (um hello incompleto). a partir daí o sistema passou a\n" +
                "evoluir cada vez mais rápido, tornando-se o embrião da Internet atual.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ARJ");
        p.setDescription_words("Um formato de compactação de arquivos bastante conhecido, mas não tão utilizado quando o\n" +
                "ZIP. Alguns programas suportam ambos os formatos, é o caso por exemplo do Power Archiver,\n" +
                "um programa gratuíto que permite compactar e descompactar arquivos em vários formatos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Artefact");
        p.setDescription_words("\"Sujeiras\" que aparecem em imagens escaneadas, filmes digitalizados, música, ou em qualquer\n" +
                "processo que exija uma conversão de analógico para digital. Além das interferências do\n" +
                "ambiente, existe o problema da falta de fidelidade do aparelho digitalizador, já que sempre\n" +
                "existe alguma perda na conversão.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Article");
        p.setDescription_words("Artigo, é geralmente usado em relação a uma mensagem postada em um grupo de discussão\n" +
                "(newsgroup).");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASCII");
        p.setDescription_words("American Standard Code for Information Interchange, é ainda o código de caracteres de texto\n" +
                "mais usado. Cada caractere de texto ASCII ocupa 8 bits de dados (1 byte), o suficiente para 256\n" +
                "combinações diferentes, que incluem caracteres, números e símbolos diversos. Na gíria, \"ASCII\"\n" +
                "também é usado em relação a um arquivo de texto puro, sem formatação. Mais detalhes sobre\n" +
                "o padrão ASCII podem ser vistos em: http://www.jimprice.com/jim-asc.htm O padrão mais atual\n" +
                "que vem substituindo o ASCII gradualmente é o Unicode, onde são usados 2 bytes para cada\n" +
                "caracter, permitindo o suporte a 65.000 caracteres e símbolos diferentes. A vantagem do\n" +
                "Unicode é conter caracteres de várias línguas: Japonês, Chinês, etc.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASCII Terminal");
        p.setDescription_words("Este é outro nome para os antigos terminais burros, que exibiam apenas texto, conectados a um\n" +
                "servidor central, quase sempre rodando alguma versão do Unix. Geralmente a conexão era feita\n" +
                "através de uma placa multiserial, já que uma porta serial é capaz de atender com folga a banda\n" +
                "necessária para enviar texto para cada terminal. Apesar desta solução ainda ser suportada pelo\n" +
                "Linux, não é vantajoso utiliza-la, já que por quase o mesmo valor poderíamos ligar os PCs em\n" +
                "rede através de placas Ethernet e cabos de par trançado e ter terminais leves capazes de rodar\n" +
                "aplicativos gráficos com um bom desempenho.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASIC");
        p.setDescription_words("Application Specific Integrated Circuit, um processador construído para executar uma tarefa\n" +
                "específica, ou seja, um processador dedicado. Exemplos de processadores dedicados são os\n" +
                "coprocessadores aritméticos e os chipsets de vídeo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASP");
        p.setDescription_words("Active Server Pages, linguagem de programação para a Internet, que vem sendo bastante\n" +
                "usada, por ter bons recursos e ser fácil de aprender se comparado a outras linguagens como o C.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASP (2)");
        p.setDescription_words("Application Service Provider, empresa que vende softwares ou soluções para pequenas, médias e\n" +
                "grandes empresas. Em alguns casos, um ASP também pode ser um órgão governamental ou mesmo uma entidade sem fins lucrativos, dedicada a dar suporte às empresas.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASP +");
        p.setDescription_words("Também conhecida como Asp.Net, será a próxima geração da linguagem ASP. O .Net indica que\n" +
                "a linguagem visa criar uma plataforma de desenvolvimento para os serviços .Net com os quais a\n" +
                "Microsoft pretende aumentar sua participação na área de serviços ia Web. O ASP + possui vários\n" +
                "recursos entre eles o suporte a código escrito em outras linguagens, como o Visual Basic, C++ e\n" +
                "Perl. Os scripts em ASP + não são compatíveis com os em ASP, mas nada impede de rodar os\n" +
                "dois tipos no mesmo servidor. A extensão dos arquivos ASP + é .ASPX");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ASPI");
        p.setDescription_words("Advanced SCSI Protocol Interface, interface desenvolvida pela Adaptec que se tornou padrão\n" +
                "para placas SCSI. Não confundir com ASP, que é uma linguagem de programação para páginas\n" +
                "Web.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Assembly");
        p.setDescription_words("O Assembly foi provavelmente a primeira linguagem de programação da história, surgida na\n" +
                "década de 50, época em que os computadores ainda usavam válvulas. A idéia do assembly é\n" +
                "usar um comando em substituição a cada instrução de máquina. A lógica continua sendo\n" +
                "basicamente a mesma, a vantagem é usar comandos amigáveis ao invés de endereços binários.\n" +
                "Outra facilidade trazida pelo assembly é o uso de variáveis, onde uma certo espaço de memória\n" +
                "é reservado para um certo dado. É possível por exemplo criar a variável \"Valor1\", reservando 16\n" +
                "bits da memória e armazenar nela um número qualquer. Durante o programa, sempre que\n" +
                "desejar usar este número, basta chamar a variável Valor1 anteriormente criada. Como o\n" +
                "compilador utiliza instruções específicas para o processador da máquina, é preciso desenvolver\n" +
                "uma versão diferente da linguagem para cada sistema onde ela for ser utilizada.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Assembler");
        p.setDescription_words("Montador. Este é o programa que transforma o código escrito na linguagem Assembly em\n" +
                "linguagem de máquina, substituindo as instruções, variáveis pelos códigos binários e endereços\n" +
                "de memória correspondentes. Os compiladores de várias linguagens de alto nível fazem a\n" +
                "compilação dos programas em duas etapas, na primeira transformando o código fonte em código\n" +
                "Assembly e em seguida gerando o binário com a ajuda de um Assembler.\n" +
                "Um erro comum é usar o termo Assembler em substituição do Assembly, o que ocorre muito\n" +
                "freqüentemente, devido à semelhança dos termos. \"Assembler\" soa como uma tradução de\n" +
                "\"Assembly\" mas na verdade ambos são termos estrangeiros, com significados diferentes.\n" +
                "O termo também pode ser usado em relação a um \"montador\" de micros. Um \"PC Assembler\"\n" +
                "pode não ser um programa, mas sim um técnico de carne e osso (nem sempre bem pago :-) que\n" +
                "trabalha para algum integrador de PCs. ");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Assíncrono (Asynchronous)");
        p.setDescription_words("Transferências de dados em que os dispositivos envolvidos não são sincronizados. Exemplos são\n" +
                "as antigas memórias EDO e FPM, que utilizavam tempos de espera para poderem acompanhar a\n" +
                "placa mãe. Na prática, a velocidade da memória continuava sendo a mesma, apenas o módulo\n" +
                "passava a responder a cada dois ou três ciclos ao responder a cada um. Atualmente este termo\n" +
                "é usado também em relação a chips sem sinal de clock. Veja: Chips assíncronos");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AT");
        p.setDescription_words("Advanced Tecnology, como era chamado o 286 lançado pela IBM em 84 (na época fazia\n" +
                "sentido :-) Hoje é mais usado para se referir a gabinetes que não usam fonte ATX.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATA");
        p.setDescription_words("Esta é a especificação para as interfaces e discos rígidos IDE. O primeiro padrão foi o ATA-1, que\n" +
                "incluía as interfaces PIO Mode 0, 1 ou 2, usadas em micros 386 e 486. O ATA-2 já incluía as\n" +
                "interfaces PIO Mode 3 e PIO Mode 4, além de suportar o multiword DMA, que embora ainda não\n" +
                "tão eficiente quanto o Ultra DMA suportado pelos HDs atuais, já agilizava a transferência de\n" +
                "dados. As interfaces ATA-2 também são chamadas de EIDE ou Fast ATA.\n" +
                "O ATA-3 foi uma revisão do ATA-2, que corrigiu alguns problemas e melhorou um pouco o\n" +
                "desempenho do multiword DMA. Este padrão inclui as interfaces IDE Pio Mode 4 mais recentes,\n" +
                "usadas as últimas placas 486 e nas primeiras placas para Pentium.\n" +
                "O ATA 4 equivale ao Ultra DMA 33, o ATA 5 equivale ao UDMA 66 enquanto o ATA 6 equivale ao\n" +
                "UDMA 100. Os três padrões também são chamados de respectivamente Ultra ATA 2, Ultra ATA 4\n" +
                "e Ultra ATA 5.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATA 33");
        p.setDescription_words("É o mesmo que UDMA 33, Ultra ATA 2 ou ainda ATA 4. São as interfaces IDE capazes de\n" +
                "transmitir dados a 33 MB/s. Na prática as taxas máximas são um pouco menores, pois estes 33\n" +
                "MB/s incluem sinais de modulação, controle e retransmissões, mas a grosso modo estas\n" +
                "interfaces, geralmente encontradas em placas mãe fabricadas entre 97 e 99 são suficientes para\n" +
                "utilizar HDs de 20 ou 30 GB sem perda de performance. Naturalmente é possível utilizar HDs\n" +
                "maiores e mais rápidos, mas nestes casos a interface pode representar um gargalo,\n" +
                "principalmente ao utilizar dois HDs na mesma interface IDE ou vários HDs ligados em RAID.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATA 66");
        p.setDescription_words("O mesmo que UDMA 66, Ultra ATA 4 ou ainda ATA 5. Estas interfaces já são capazes de\n" +
                "transmitir dados a 66 MB/s (um pouco menos na prática) e são geralmente encontradas em\n" +
                "placas mãe fabricadas em 2000 e 2001. O desempenho é suficiente para os HDs fabricados até\n" +
                "2001 e nos modelos de baixo/médio custo fabricados em 2002, mas pode ser um gargalo nos\n" +
                "HDs topo de linha. Para ativar o ATA 66 é preciso que tanto o HD quanto a placa mãe suportem este modo e é\n" +
                "necessário utilizar um cabo IDE de 80 vias. Caso um destes requisitos não seja cumprido, o HD\n" +
                "operará em modo ATA 33.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATA 100");
        p.setDescription_words("Este é o padrão de interfaces IDE predominante no final de 2001. O desempenho é suficiente\n" +
                "mesmo para os HDs topo de linha atuais mas, claro, fatalmente vai tornar-se um gargalo nos\n" +
                "HDs do futuro. Atualmente poucos HDs conseguem superar a marca de 30 MB de transferência\n" +
                "interna (quando os dados são lidos pelas cabeças de leitura e transferidos), mas a taxa pode\n" +
                "subir bastante ao ser utilizado cache de disco, onde uma pequena quantidade de dados é\n" +
                "transferida na velocidade máxima suportada pela interface. É por isso que existe sempre algum\n" +
                "ganho (apesar de muito pequeno) ao utilizar interfaces ATA 100 mesmo em HDs relativamente\n" +
                "lentos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATA 133");
        p.setDescription_words("Este é um novo padrão de interfaces IDE que vem sendo adotado por vários fabricantes\n" +
                "(liderados pela Maxtor), onde a interface IDE é capaz de transferir dados a 133 MB/s. Assim\n" +
                "como no ATA 66 e ATA 100 é preciso usar um cabo IDE de 80 vias, caso contrário a interface\n" +
                "passa a operar em modo ATA 33. Estes cabos acompanham as placas mãe atuais e também\n" +
                "podem ser comprados avulsos, por isso não são mais um problema. Algumas placas mãe e HDs\n" +
                "fabricados partir do final de 2001 já oferecem suporte a este padrão, apesar do ganho de\n" +
                "desempenho (por enquanto) ser mínimo ou nenhum.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATAPI");
        p.setDescription_words("Advanced Technology Packet Interface, padrão que permite instalar CD-ROMs, Zips, drives de\n" +
                "fita e outros periféricos em interfaces IDE, que originalmente foram projetadas para acomodar\n" +
                "apenas discos rígidos. Um \"ATAPI CD-ROM\" nada mais é do que um drive de CD-ROM IDE.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Atary 800");
        p.setDescription_words("Este é mais um computador pessoal lançado no final da década de 70. Apesar de ser mais\n" +
                "vendido como um video-game, o Atari 800 também podia ser usado como um computador\n" +
                "relativamente poderoso, chegou a ser usado em algumas universidades.\n" +
                "O Atary 800 foi o antecessor do Atari 2600, conhecido por aqui. Ele vinha de fábrica com 16 KB\n" +
                "de memória RAM, que podiam ser expandidos para até 48 KB, com mais 10 KB de memória\n" +
                "ROM. O sistema operacional era o Atari-OS, uma versão do Basic. Originalmente, o sistema\n" +
                "vinha apenas com a entrada para os cartuchos, com o sistema operacional ou jogos, mas era\n" +
                "possível adquirir separadamente uma unidade de disquetes e um teclado, que o transformavam\n" +
                "num computador completo. Não existiram muitos programas para o Atari, o foco foram sempre\n" +
                "os jogos, o principal uso do Atari como computador era de poder programar em Basic, por isso\n" +
                "seu uso em escolas.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Atenuação (de sinal)");
        p.setDescription_words("A atenuação ocorre com qualquer sinal, tanto digital quanto analógico, transmitido através de\n" +
                "cabos. Quanto maior for o comprimento do cabo, maior é a atenuação, até o ponto do sinal\n" +
                "tornar-se fraco a ponto de não ser mais entendido pelo destinatário. De uma forma geral, os\n" +
                "sinais analógicos podem ser transmitidos a distâncias mais altas que os digitais, pois utilizam\n" +
                "uma grande gama de frequências, enquanto os sinais digitais trabalham apenas com dois sinais\n" +
                "distintos (os bits 1 e 0, representados por diferentes tensões elétricas). Isso explica por que nas\n" +
                "redes Ethernet, onde são usados cabos próprios para redes a distância máxima é de 100 metros\n" +
                "(usando cabos de par trançado) ou 185 metros (usando cabos coaxiais) enquanto em\n" +
                "tecnologias como o ADSL, onde os sinais são modulados e transmitidos na forma de um sinal\n" +
                "analógico é possível atingir distâncias de vários quilômetros, mesmo usando fios telefônicos\n" +
                "comuns, de qualidade muito mais baixa que os cabos de rede.\n" +
                "Em compensação, o ADSL é uma tecnologia muito mais cara que o padrão Ethernet e a\n" +
                "velocidade de transmissão é de apenas 8 megabits a até 300 metros ou 2 megabits a até 3 KM,\n" +
                "enquanto as redes Ethernet já ensaiam a migração do Gigabit para o 10 Gigabit Ethernet.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Athlon");
        p.setDescription_words("Do K6 ao K6-3, pouca coisa mudou na arquitetura dos processadores AMD. O K6-2 trouxe as\n" +
                "instruções 3D-Now! Enquanto o K6-3 ganhou um cache L2 que trabalha na mesma frequência do\n" +
                "processador e passou a utilizar o cache encontrado na placa mãe aproveitado na forma de um\n" +
                "cache L3.\n" +
                "Foram melhoradas também as técnicas de produção, o que permitiu o lançamento de\n" +
                "processadores trabalhando à frequências mais altas. O núcleo do processador, assim como o\n" +
                "coprocessador aritmético porém, não foram mudados em praticamente nada. Basicamente foram\n" +
                "adicionados apenas alguns \"acessórios\" ao K6, que o tornaram mais rápido.\n" +
                "Durante muito tempo, a AMD prometeu um novo processador, onde fosse solucionado o velho\n" +
                "problema de desempenho dos processadores AMD em aplicativos gráficos e que finalmente fosse\n" +
                "capaz de apresentar um desempenho igual ou superior a um processador Intel equivalente em\n" +
                "todos os aplicativos. Quando finalmente foi lançado, o K7 como era chamado até então passou a\n" +
                "ser chamado de Athlon.\n" +
                "O Athlon é seguramente o projeto mais bem sucedido da AMD e passou por uma grande\n" +
                "evolução desde a primeira versão. A primeira geração ainda era fabricada numa técnica de 0.25\n" +
                "mícron e usava cache L2 externo. A segunda geração, chamada K75 já utilizava uma técnica de\n" +
                "0.18 mícron e foi capaz de atingir frequências de até 1.0 GHz. A terceira geração é o Athlon\n" +
                "Thunderbird, onde o cache L2 foi incorporado ao processador. A geração atual é o Athlon\n" +
                "Palomino que incorporou mais alguns recursos que melhoraram o desempenho do processador e\n" +
                "diminuíram seu consumo elétrico. O core Palomino é utilizado nos processadores Athlon XP,\n" +
                "Athlon MP e Athlon 4 (para notebooks). A próxima geração será o Athlon Thoroughbred, que será\n" +
                "produzido numa arquitetura de 0.13 mícron, seguido pelo Athlon Barton.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Athlon 4");
        p.setDescription_words("Esta é uma versão de baixo consumo do Athlon XP destinada a notebooks. A arquitetura é\n" +
                "exatamente a mesma (core Palomino, 0.18 mícron), mas o processador opera a frequências mais baixas, utiliza tensão mais baixa e possui o sistema PowerNow!, que ajusta dinâmicamente\n" +
                "a frequência de operação do processador de acordo com a demanda dos aplicativos, tudo para\n" +
                "economizar o máximo possível de energia.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Athlon 64");
        p.setDescription_words("Esta é a versão desktop do Hammer, o processador de 64 bits da AMD que será o sucessor do\n" +
                "Athlon. Embora seja um processador de 64 bits, o Athlon 64 mantém compatibilidade com os\n" +
                "aplicativos de 32 bits atuais, basicamente o Athlon 64 é um processador de 32 bits, com uma\n" +
                "arquitetura semelhante à do Athlon, com registradores e instruções extras, que o transformam\n" +
                "num processador de 64 bits completos. Estas partes extras podem ser ativadas ou desativadas\n" +
                "de acordo com o software que estiver sendo utilizado no momento.\n" +
                "Ao rodar aplicativos de 32 bits ele oferece um desempenho um pouco superior ao de um Athlon\n" +
                "do mesmo clock, graças ao controlador de memória integrado e outras otimizações. O Hammer\n" +
                "possui dois estágios de pipeline a mais que o Athlon, o que permite que ele atinja frequências de\n" +
                "operação um pouco mais altas. Ou seja, ao rodar aplicativos de 32 bits ele é um passo\n" +
                "evolucionário, não uma revolução.\n" +
                "As possibilidades de ganhos de desempenho mais expressivos surgem ao rodar aplicativos de 64\n" +
                "bits. Neste caso o programa passa dispor de mais registradores (áreas de memória ultra rápida\n" +
                "dentro do processador, uma espécie de cache nível 0) e possibilidade de endereçar quantidades\n" +
                "muito maiores de memória RAM.\n" +
                "Naturalmente estas vantagens não se aplicam a todos os tipos de programas de forma uniforme.\n" +
                "Um bando de dados de grande por pode ter um ganho de desempenho fabuloso, enquanto um\n" +
                "aplicativo de escritório pode apresentar um desempenho pouco superior ao de sua versão de 32\n" +
                "bits.\n" +
                "A aposta do Athlon 64 é oferecer uma plataforma que possa ao mesmo tempo rodar os\n" +
                "aplicativos de hoje com um desempenho competitivo quanto rodar os aplicativos de 64 bits de\n" +
                "amanhã. É uma vantagem estratégica sobre o Pentium 4, que apesar de atingir clocks mais\n" +
                "altos, continua sendo um processador de 32 bits.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Athlon MP");
        p.setDescription_words("Esta é a série do Athlon baseada no core Palomino que oferece suporte a multiprocessamento.\n" +
                "Na verdade, o Athlon XP também suporta multiprocessamento, mas a AMD incluiu uma trava\n" +
                "nestes processadores que impede que sejam usados em sistemas SMP, para evitar que\n" +
                "prejudicassem as vendas do Athlon MP, que é consideravelmente mais caro. Apesar disso, os\n" +
                "Duron com core Morgan (que é baseado no Palomino) não possuem a trava, o que permite usálos em sistemas dual de baixo custo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Athlon XP");
        p.setDescription_words("Uma versão do Athlon baseada no core Palomino, lançada pela a AMD em Outubro de 2001. O\n" +
                "XP vem de \"Extreme Performance\", mas ficou óbvio que a idéia era pegar carona no lançamento\n" +
                "do Windows XP da Microsoft. O Athlon XP marcou a volta do índice de desempenho nos\n" +
                "processadores AMD. Apesar do motivo ser justo, já que o Pentium 4 é capaz de operar a\n" +
                "frequências muito mais altas que o Athlon, apesar de acabar perdendo na maioria dos casos, a\n" +
                "iniciativa causou uma certa polêmica entre os usuários. As versões iniciais do Athlon XP foram: 1500+ (1.33 GHz), 1600+ (1.4 GHz), 1700+ (1.46 GHz),\n" +
                "1800+ (1.5 GHz) e 1900+ (1.6 GHz). Por ser baseado no core Palomino o Athlon XP é mais\n" +
                "rápido que um Athlon Thunderbird da mesma frequência, um XP de 1.33 GHz ganha facilmente\n" +
                "de um Thunderbird de 1.4 GHz por exemplo.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATM");
        p.setDescription_words("Uma tecnologia de transmissão de dados que divide o fluxo de dados a serem transmitidos em\n" +
                "pequenos blocos de 53 bytes cada um. Estes blocos são chamados de células, e podem ser\n" +
                "processados de forma assíncrona. Entre várias outras aplicações, o ATM é usado nos sistemas\n" +
                "ISDN e ADSL de acesso rápido à Internet. No Speedy, o serviço de acesso via ADSL oferecido\n" +
                "pela Telefonica, o termo ATM ganha um outro significado, pois é usado em relação às instalações\n" +
                "antigas, onde cada cliente possui um IP fixo. Nas instalações mais recentes, o sistema passou a\n" +
                "ser chamado de \"megavia\" e os usuários passaram a utilizar IP dinâmico, mas em compensação\n" +
                "podem escolher entre um número maior de provedores.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATX");
        p.setDescription_words("O padrão de design para as placas e gabinetes modernos, prevê medidas definidas para as\n" +
                "placas mães, gabinetes e modificações na fonte de alimentação. Atualmente, quase todos os\n" +
                "gabinetes e fontes vendidos são ATX. Uma placa mãe ATX não pode ser instalada em um\n" +
                "gabinete AT antigo. Existem ainda as placas Mini-ATX e Flex-ATX");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("ATX12V");
        p.setDescription_words("Este é um novo padrão de fontes de alimentação desenvolvido pela Intel para uso em conjunto\n" +
                "com o Pentium 4. As fontes ATX12V possuem em conector adicional de 4 pinos, que deve ser\n" +
                "encaixado na placa mãe, junto com o conector de força principal. Este segundo conector reforça\n" +
                "a saída de 12V da fonte, assegurando que o processador sempre tenha energia suficiente para\n" +
                "funcionar com estabilidade, mas ao mesmo tempo impede que sejam utilizadas fontes ATX\n" +
                "comuns.\n" +
                "A Asus e a Tyan (seguidos por outros fabricantes) apareceram então com um padrão alternativo,\n" +
                "onde a placa mãe traz um conector para um dos plugs de alimentação da fonte (os mesmos\n" +
                "utilizados pelo HD e CD-ROM) que pode ser usado no lugar do conector ATX12V, permitindo que\n" +
                "os usuários utilizem fontes ATX comuns em conjunto com suas placas para P4, se necessário.\n" +
                "Mais recentemente a Tyan começou a produzir algumas placas que dispensam completamente o\n" +
                "segundo conector, operando apenas com o conector ATX padrão.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AU");
        p.setDescription_words("Formato de arquivo de som sem compressão tradicionalmente usado por programas UNIX/Linux,\n" +
                "mas também adotado como formato de áudio padrão para a linguagem Java. Os arquivos AU (de\n" +
                "audio) utilizam a extensão .au.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AUI");
        p.setDescription_words("Este é um conector de 15 pinos, semelhante ao conector do joystick da placa de som,\n" +
                "encontrado em algumas placas de rede antigas. Este conector se destina à conexão com cabos\n" +
                "coaxiais 10Base5, um padrão anterior aos atuais cabos 10Base2, onde o cabo é mais grosso com\n" +
                "quase 1 centímetro de diâmetro e as estações são conectadas através de transceptores. Este tipo\n" +
                "de rede, camada Thicknet não é mais utilizada atualmente, pois é uma arquitetura cara e pouco\n" +
                "eficiente.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("AVI");
        p.setDescription_words("É a extensão usada por vários formatos de vídeo. A sigla vem de \"Audio Video Interleave\". Os\n" +
                "arquivos AVI podem conter vídeo e áudio em vários formatos, que vão de vídeo sem compressão\n" +
                "ao Divx, passando pelo MPEG 2 e outros formatos. Além do vídeo, o áudio também pode ser compactado, em MP3 por exemplo. Para assistir o vídeo, é necessário ter instalado o codec\n" +
                "adequado, mas normalmente os players suportam vários formatos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Avatar");
        p.setDescription_words("Um personagem que representa você em um meio digital qualquer, como num jogo ou mesmo\n" +
                "num chat com este recurso. A palavra vêm do Sânscrito.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("B2B");
        p.setDescription_words("Business to Business, negócios entre empresas, envolvendo produtos, serviços ou parcerias. Este\n" +
                "termo é mais usado em relação aos sites que promovem este tipo de comércio, oferecendo toda\n" +
                "a praticidade e infra-estrutura necessária, cobrando em troca uma mensalidade ou comissão\n" +
                "sobre as transações.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("B2C");
        p.setDescription_words("Back to Mon (de volta pra mamãe), gozação que descreve o triste fim de muitas empresas\n" +
                "pontocom depois que a bolha especulativa finalmente estourou.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BABT");
        p.setDescription_words("British Approval Board for Telecommunications, um selo de aprovação para modems que existe\n" +
                "na Inglaterra, uma espécie de controle de qualidade, como o selo de pureza do café que temos\n" +
                "por aqui ");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Backbone");
        p.setDescription_words("Links de alta velocidade, usados geralmente como a espinha dorsal de grandes redes. A Internet\n" +
                "é formada por inúmeros backbones que interligam as redes de universidades, empresas,\n" +
                "provedores de acesso, etc. A organização lembra muito nosso sistema circulatório, onde as veias\n" +
                "e artérias (backbones) se dividem em vários capilares. Estas divisões são feitas através de\n" +
                "roteadores, que dividem o link do backbone em vários links mais estreitos (conexões Ethernet de\n" +
                "100 megabits por exemplo) que podem novamente ser divididas através de novos roteadores, ou\n" +
                "dispositivos mais baratos, como hubs. Na outra ponta está o usuário, que geralmente recebe um\n" +
                "link de 256 kb, ou mesmo uma simples conexão via modem.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Backdoor");
        p.setDescription_words("Porta dos fundos. É uma porta aberta no sistema, não documentada, que permite ao criador ter\n" +
                "acesso a ele (legitimamente ou não). As backdoors podem ser criadas tanto pelo responsável,\n" +
                "como um meio de acesso emergêncial ao sistema, quanto por alguém interessado em invadi-lo,\n" +
                "roubar informações etc. Neste último caso, o meio mais usado é convencer algum usuário do\n" +
                "sistema a executar o programa que abrirá a backdoor, enviando-o via e-mail com algum\n" +
                "estratagema, uma comunicação do chefe, um jogo, etc.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Background Process");
        p.setDescription_words("É usado em relação a um programa que está sendo executado em segundo plano, sem receber\n" +
                "comandos do usuário. Este recurso é muito usado quando se opera o Linux em modo texto. É\n" +
                "possível deixar a compactação de um grande arquivo, ou outra tarefa demorada sendo\n" +
                "executada em background enquanto trabalha-se em outra coisa. Alguns processos ficam em\n" +
                "background sem nunca solicitar comandos ao usuário (alguns daemons por exemplo), enquanto\n" +
                "a maioria fica em background apenas temporariamente");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Backlight");
        p.setDescription_words("Encontrada em monitores LCD, e telas de cristal líquido em geral é uma fonte de luz nos cantos\n" +
                "ou atrás da tela, que permite ver a imagem no escuro, além de melhorar bastante o contraste e\n" +
                "brilho da imagem.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Back Office");
        p.setDescription_words("Uma suíte de aplicativos da Microsoft voltada para o mercado empresarial. Não confundir com o\n" +
                "Trojam Back Orifice.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Back-Orifice");
        p.setDescription_words("Trojan bastante famoso, que uma vez instalado no micro da vítima, abre a máquina a acesso\n" +
                "externo, permitindo quase tudo, até mesmo ejetar CDs ou resetar o micro remotamente. O BackOrifice opera de uma forma muito semelhante aos programas de administração remota, com\n" +
                "possibilidade de alterar a porta TCP escutada pelo programa, ou mesmo estabelecer uma senha\n" +
                "de acesso, tanto que algumas pessoas chegam a utiliza-lo para tal. O problema é que o BO não\n" +
                "dá nenhum aviso ou advertência ao usuário e é difícil de detectar uma vez ativo. A menos que o\n" +
                "executável seja alterado, ele aceitará comunicações de qualquer um através da porta 31337. Ou\n" +
                "seja, basta que alguém mal intencionado faça uma varredura de portas em algumas centenas de\n" +
                "micros para encontrar alguns com o BO server ativo e começar a brincar, ou então enviar o\n" +
                "executável, que possui pouco mais de 100 kb para algumas vítimas escolhidas, usando um\n" +
                "estratagema qualquer e esperar que algumas executem o arquivo.\n" +
                "O programa foi desenvolvido por um grupo de crackers chamado Cult of the Dead Cow\n" +
                "Communications, encontrado no endereço http://www.cultdeadcow.com/");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Backslash");
        p.setDescription_words("Barra invertida, a tecla \\ do teclado. \"Slash\" é a barra comum, usada em urls e na estrutura de\n" +
                "diretório do linux, \"coma\" é um espaço e \"dot\" é um ponto. \"Dot slash\" é o \"./\", usado para\n" +
                "executar arquivos no prompt do Linux.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Backup");
        p.setDescription_words("Cópia de segurança. Copiar dados em um meio separado do original, de forma a protegê-los de\n" +
                "qualquer eventualidade. Essencial para dados importantes.\n" +
                "Os backups podem ser feitos em vários tipos de mídias, incluindo CDs graváveis ou regraváveis,\n" +
                "fitas DAT, ou até mesmo um segundo HD. Cada tecnologia oferece seus prós e contras, as fitas\n" +
                "DAT por exemplo oferecem uma grande capacidade e um custo por megabyte muito baixo, mas\n" +
                "em compensação o drive é muito caro, os CDs são muito baratos, mas não armazenam uma\n" +
                "grande quantidade de dados e assim por diante. A melhor opção varia de acordo com a\n" +
                "quantidade de dados, a regularidade dos backups, o nível de confiabilidade necessário e o\n" +
                "quanto pode ser investido.\n" +
                "Além do backup total, simplesmente copiar todos os dados, existe o backup incremental, que\n" +
                "consiste em copiar apenas os arquivos que foram alterados desde o último. Praticamente todos\n" +
                "os programas de backup suportam esse recurso, descobrindo quais arquivos foram alterados\n" +
                "através do número de bytes ou dos atributos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Backside Bus");
        p.setDescription_words("É o barramento rápido que conecta o núcleo do processador ao cache L2 em processadores que\n" +
                "trazem cache L2 incluído no cartucho do processador, mas composto de chips separados, como\n" +
                "nos processadores Pentium II e nos processadores Pentium III e Athlon em formato de cartucho.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Balanceamento de carga (load balancing)");
        p.setDescription_words("Hoje em dia, praticamente todos os grandes sites e portais armazenam suas páginas em algum\n" +
                "tipo de sistema de banco de dados, que monta as páginas dinâmicamente, sempre que\n" +
                "solicitadas pelos clientes, juntando um conjunto de registros. Enquanto o site tiver pouco\n" +
                "tráfego, digamos umas 20 ou 30 mil pageviews por dia, provavelmente um único servidor, de\n" +
                "configuração média dará conta do recado sozinho. Mas, imagine que derrepente a audiência\n" +
                "deste site aumentou muito, foi para 5 milhões de pageviews por dia, que é o que um grande\n" +
                "portal costuma ter. Provavelmente, um único servidor, mesmo que tenha 2 ou 4 processadores,\n" +
                "não vai dar conta de todo este tráfego.\n" +
                "Entra em cena então a idéia de balanceamento de carga, onde vários servidores ligados em rede\n" +
                "dividem entre sí as requisições. Temos então uma ou várias máquinas que cuidam de repartir as\n" +
                "requisições entre os servidores, de modo que cada um cuida de parte das requisições e envia de\n" +
                "volta as páginas prontas, que serão enviadas aos usuários.\n" +
                "Todos os servidores mantém uma cópia integral de todos os dados do site, já que de qualquer\n" +
                "forma cada servidor precisará de todos os dados para atender as requisições que chegarem até\n" +
                "ele. Um software de controle se encarrega então de sincronizar os dados entre os servidores\n" +
                "automaticamente. Caso algum dos servidores precise ser desligado, seja por alguma falha, ou então para algum tipo de manutenção, os outros continuam trabalhando normalmente. Ao\n" +
                "voltar, o programa de controle sincroniza o servidor com os demais e ele volta à ativa.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bandwidth");
        p.setDescription_words("Largura de banda, se refere à capacidade de transmissão de uma rede ou um tipo qualquer de\n" +
                "conexão. A largura de banda de uma conexão via modem é de 56 Kbits :-) Este termo pode ser\n" +
                "usado também com relação à quantidade de dados que podem ser transferidos através de uma\n" +
                "interface num determinado período de tempo. Por exemplo, um slot AGP 1X trabalha a 66 MHz e\n" +
                "32 Bits por transferência, resultando numa banda de 266 MB por segundo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Banias");
        p.setDescription_words("Apesar do nome exótico, o Banias vem sendo levado bastante a sério pelos projetistas da Intel.\n" +
                "Todos os chips Intel atuais, Pentium III, Pentium 4 e Celeron são chips destinados a apresentar\n" +
                "um bom desempenho, sem muita preocupação com o consumo elétrico. Esta é uma boa\n" +
                "estratégia quando se está desenvolvendo processadores para micros de mesa, onde um bom\n" +
                "cooler resolve, mas é uma grande desvantagem em se tratando de notebooks, que são\n" +
                "alimentados por baterias e devem ser o mais compactos possível.\n" +
                "A idéia do Banias é um chip que concorra diretamente com o Crusoé da Transmeta e o C3 da\n" +
                "Via, impedindo que eles abocanhem uma parte muito grande de um mercado que hoje é\n" +
                "dominado pela Intel.\n" +
                "Inicialmente acreditava-se que o Banias seria um projeto novo, desenvolvido com o objetivo de\n" +
                "apresentar uma melhor relação consumo/desempenho, mas recentemente a Intel divulgou que\n" +
                "desistiu da idéia e resolveu construí-lo com base na arquitetura do Pentium III. O projeto ainda\n" +
                "está em estágios iniciais, por isso o chip será lançado apenas em 2003.\n" +
                "É complicado pensar com um ano e meio de antecedência, mas imaginando o mercado a que o\n" +
                "chip se destina, é compreensível que a Intel aproveite a arquitetura do Pentium III. Veja que o\n" +
                "Banias é um chip destinado a notebooks ultra compactos, onde é mais importante um\n" +
                "processador econômico e que dissipe pouco calor do que um monstro de 5 GHz. Fora o Crusoé e\n" +
                "o Cyrix C3, qual é o processador mais econômico atualmente? Se respondeu que é o mobile\n" +
                "Pentium III (ou mobile Celeron, já que a arquitetura é a mesma) você acertou.\n" +
                "Um problema é que a arquitetura do Pentium III não oferece uma elasticidade tão grande em\n" +
                "termos de frequência de operação quanto o Pentium 4 ou o Athlon, mas novamente, voltamos ao\n" +
                "ponto do baixo consumo elétrico, que é a prioridade neste caso, aliado a um custo de\n" +
                "desenvolvimento igualmente baixo, já que estão reciclando e não criando nada novo.\n" +
                "Este chip coexistirá com a versão mobile do Pentium 4, que será lançada futuramente.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Banner");
        p.setDescription_words("Faixa. Atualmente é usado com relação às propagandas encontradas na Internet. Uma imagem\n" +
                "retangular que quando clicada leva ao site do anunciante. Antigamente os banners eram aqueles\n" +
                "impressos com letras garrafais, impressos em folhas de formulário contínuo, gerados por alguns\n" +
                "programas.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Barton");
        p.setDescription_words("O AMD Barton, que deverá ser lançado no final de 2002 será um Athlon Turbinado, que graças\n" +
                "ao uso do SOI provavelmente chegará perto da casa dos 3.5 GHz, produzido numa técnica de\n" +
                "0.13 mícron. O SOI é uma tecnologia desenvolvida pela IBM, que permite usar uma camada\n" +
                "mais fina de silício na produção dos transístores do processador, o que melhora a estabilidade\n" +
                "dos sinais elétricos e diminuir a resistência elétrica dos materiais. Isso se traduz num menor\n" +
                "consumo elétrico e na possibilidade do processador trabalhar com estabilidade a frequências\n" +
                "mais altas.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bash");
        p.setDescription_words("O bash é um dos interpretadores de comandos do Linux. A sigla vem de \"Bourne Again Shell\",\n" +
                "enfatizando que o Bash é uma versão aperfeiçoada do interpretador Bourne. Um interpretador\n" +
                "de comandos é pequeno um programa que interpreta os comandos dados pelo usuário e os\n" +
                "executa. No MS-DOS por exemplo, o interpretador de comandos é o Command.com. Apesar do\n" +
                "Bash ser atualmente o interpretador de comandos para Linux mais usado, ele não é o único.\n" +
                "Existem vários outros interpretadores, com pequenas diferenças nos recursos, comandos ou nas\n" +
                "sintaxes.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BASIC");
        p.setDescription_words("Beginner's All-purpose Symbolic Instruction Code. O BASIC é uma linguagem de programação\n" +
                "voltada para principiantes, desenvolvida durante os anos 60. Praticamente todos os primeiros\n" +
                "computadores pessoais lançados durante a década de 70 traziam compiladores BASIC. Os\n" +
                "programas em BASIC são construídos através da combinação de comandos simples, baseados\n" +
                "em palavras do Inglês e rodam linha a linha, à medida que são \"traduzidos\" para linguagem de\n" +
                "máquina pelo interpretador. Os compiladores BASIC atuais são bem mais rápidos e mais flexíveis\n" +
                "que os desta primeira geração e, apesar de ainda não serem tão rápidos quanto programas em\n" +
                "C, já são capazes de fazer praticamente tudo que é possível em outras linguagens Um exemplo\n" +
                "de linguagem popular atualmente que é baseada no BASIC é o Visual Basic da Microsoft.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Baud");
        p.setDescription_words("Este é mais um termo relacionado a modems, que indica o número de vezes que o tom muda\n" +
                "numa ligação via modem. Os primeiros modems, de até 1.200 bips, trabalhavam com apenas\n" +
                "duas tonalidades, um som mais alto representava um bit 1, enquanto um som mais baixo\n" +
                "representava um bit 0. Nestes modems, o número de bauds representava o número de bits que\n" +
                "era possível transmitir por segundo. Naquela época, dizer \"modem de 1200 bips\" ou \"modem de\n" +
                "1200 bauds\" era a mesma coisa. Atualmente, os modems utilizam uma modulação muito mais\n" +
                "sofisticada, transmitindo vários bits em cada baud. Os modems de 14.400 bips por exemplo,\n" +
                "transmitem a apenas 2.400 bauds.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Baud Rate");
        p.setDescription_words("Uma medida de velocidade para modems. Indica o número de bauds, ou seja de sinais sonoros\n" +
                "transmitidos por segundo. Não corresponde à taxa de transmissão em bits, pois nos modems\n" +
                "atuais cada baud transporta vários bits.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BBUL");
        p.setDescription_words("Este é um novo encapsulamento para processadores desenvolvido pela Intel. O nome vem de\n" +
                "\"Bumpless Build-Up Layer\", uma designação que enfatiza a principal característica, que é a\n" +
                "inexistência de pontos de solda (bumps) entre o processador e o encapsulamento.\n" +
                "Nos encapsulamentos atuais, o waffer de silício (onde é construído o processador) é montado\n" +
                "sobre uma camada de cerâmica, metal ou mesmo algum tipo de plástico resistente. O objetivo\n" +
                "do encapsulamento é naturalmente proteger o processador e tornar seus contatos acessíveis.\n" +
                "Porém, por melhor que seja o encapsulamento, ele sempre aumenta a distância entre o\n" +
                "processador e o chipset, adiciona instabilidade na forma de pontos de contato imperfeitos, e\n" +
                "assim por diante.\n" +
                "Atualmente, tanto a Intel quanto a AMD (a partir do Athlon XP) utilizam o encapsulamento OLGA\n" +
                "em seus processadores, onde é usado um tipo de plástico ultra-resistente ao invés de cerâmica.\n" +
                "Como o plástico é um material muito mais fácil de trabalhar, é possível produzir um\n" +
                "encapsulamento \"sob-medida\" parta o processador, com um nível de imperfeições reduzido ao\n" +
                "mínimo. Estima-se que graças à nova estrutura o Athlon XP será capaz de atingir frequências\n" +
                "até 20% maiores do que seria possível com o encapsulamento antigo, de cerâmica.\n" +
                "A Intel pretende agora dar o próximo passo, com o BBUL. A idéia é que ao invés de \"encaixar\" o\n" +
                "processador no encapsulamento, o encapsulamento \"cresça\" em torno do processador, criando\n" +
                "uma estrutura virtualmente perfeita, como se ambos formassem uma única estrutura, com a\n" +
                "vantagem adicional de ser muito mais flexível, permitindo criar encapsulamentos com vários\n" +
                "processadores, entre outras possibilidades. Seria um sistema parecido com o que o nosso\n" +
                "organismo usa para construir e reparar nossos ossos, ir depositando pequenas quantidades de\n" +
                "cálcio até ter um osso completo.\n" +
                "Segundo a Intel, com a ajuda da nova tecnologia será possível produzir processadores com mais\n" +
                "de 1 bilhão de transístores, que serão até 10 vezes mais rápidos que os processadores atuais,\n" +
                "considerando dois chips do mesmo clock, sem falar das possibilidades de produzir processadores\n" +
                "operando à frequências mais altas, que surgirá com o avanço da tecnologia. O primeiros\n" +
                "processadores com o novo encapsulamento estão previstos para 2006 ou 2007.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BBS");
        p.setDescription_words("Bulletin Board Service. Os primeiros serviços online, bem antes da Internet, onde a conexão era\n" +
                "feita via modem, na época ainda modelos de 1200 ou 2400 bips. Os servidores eram em geral\n" +
                "PCs comuns, com algumas poucas linhas de telefone que mantinham um grupo de discussão,\n" +
                "arquivos para downloads e jogos online no caso dos maiores. Alguns BBS chegaram a ter mais\n" +
                "de 5.000 usuários, como no caso do Mandic e do STI. Mas, mesmo nestes casos bem sucedidos,\n" +
                "os BBSs formavam comunidades isoladas e por isso entraram em extinção quando o acesso à\n" +
                "Internet começou a tornar-se popular.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BBS (2)");
        p.setDescription_words("BIOS Boot Specification. Este é um recurso suportado por praticamente todos os BIOS\n" +
                "encontrados nas placas mãe atuais. Através do BBS é possível estabelecer no Setup a ordem em\n" +
                "que BIOS procurará o sistema operacional, ordenando todos os dispositivos disponíveis, como\n" +
                "HD, CD-ROM, rede, disquete, Zip, etc. A vantagem deste sistema sobre a antiga seleção de ordem de procura do boot que tínhamos à\n" +
                "disposição desde os antigos 386 é que caso o carregamento do sistema operacional encontrado\n" +
                "no primeiro dispositivo (o HD por exemplo) falhe por qualquer motivo o BIOS assumirá de volta\n" +
                "o controle e tentará carregar o sistema a partir do segundo dispositivo da lista (o CD-ROM por\n" +
                "exemplo) e assim por diante, até que consiga carregar algum sistema operacional ou caso as\n" +
                "opções acabem.\n" +
                "Graças ao BBS o sistema não fica mais travado tentando carregar o sistema a partir do disquete\n" +
                "ou CD-ROM quando a mídia não possui sistema operacional algum.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BEDO");
        p.setDescription_words("Lançadas depois das memórias EDO, mas antes das SDRAM usadas atualmente, as memórias\n" +
                "BEDO utilizam uma espécie de Pipeline para permitir acessos mais rápidos. Em um Bus de 66\n" +
                "MHz, as memórias BEDO são capazes de funcionar com temporização de 5-1-1-1, quase 30%\n" +
                "mais rápido que as memórias EDO convencionais, que trabalham a 5-2-2-2. O mais interessante\n" +
                "é que o custo de produção das memórias BEDO era praticamente o mesmo das memórias EDO e\n" +
                "FPM. O maior impedimento à popularização das memórias BEDO foi a falta de suporte por parte\n" +
                "dos chipsets Intel, que suportavam apenas memórias EDO e SDRAM. No final, as sucessoras das\n" +
                "memórias EDO acabaram sendo as memórias SDRAM, que apesar de um pouco mais caras,\n" +
                "oferecem uma performance levemente superior às BEDO e desfrutam de compatibilidade com\n" +
                "todos os chipsets modernos. Na verdade, as BEDO nunca foram utilizadas em larga escala.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Benchmark");
        p.setDescription_words("Medidor de desempenho. São programas usados para medir o desempenho de um computador,\n" +
                "seja em processamento bruto, como por exemplo o número de instruções de ponto flutuante que\n" +
                "são processadas por segundo, quanto o desempenho dentro de algum aplicativo em especial.\n" +
                "Existem atualmente inúmeros programas de benchmark como o SPECmark, Linpack, etc. Alguns\n" +
                "benchmarks de boa qualidade para medir o desempenho de micros PC podem ser baixados em:\n" +
                "http://www.ziffdavis.com/");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BeOS");
        p.setDescription_words("O BeOS é um sistema operacional desenvolvido pela Be Inc. desde o início da década de 90. A\n" +
                "idéia foi desde o início desenvolver o sistema a partir do zero, sem nenhum tipo de software de\n" +
                "legado que pudesse atrapalhar o desempenho ou a estabilidade do sistema, como temos por\n" +
                "exemplo no Windows 95/98/SE/ME, que ainda mantém uma grande quantidade de código de 16\n" +
                "bits herdado do Windows 3.1.\n" +
                "Com esta diretriz, os desenvolvedores ficaram livres para explorar novas idéias e acrescentar\n" +
                "recursos inéditos ao sistema, que tornou-se uma plataforma bastante sólida para aplicativos\n" +
                "multimídia, com um bom gerenciamento de memória, um sistema de arquivos capaz de\n" +
                "gerenciar partições de vários terabytes e um bom desempenho.\n" +
                "Inicialmente o BeOS rodava no BeBox, uma plataforma proprietária que logo foi descontinuada,\n" +
                "conforme o BeOS foi portado primeiro para os Macs e em seguida para micros PC.\n" +
                "O grande problema do BeOS foi sempre a falta de aplicativos, o que manteve o sistema restrito a\n" +
                "um pequeno grupo de usuários. Para tentar impulsionar a popularização do sistema, a Be\n" +
                "começou a oferecê-lo gratuitamente para uso pessoal, mas nem mesmo isso deu muito resultado, pois já existiam então concorrentes livres como o Linux e o Free BSD, que já\n" +
                "possuíam uma lista de aplicativos bem mais extensa que a do BeOS.\n" +
                "A Be acabou sendo comprada pela Palm em 2001, que está utilizando a tecnologia no\n" +
                "desenvolvimento do PalmOS 5, que será utilizado na próxima geração de Palms, que serão bem\n" +
                "maios poderosos e baseados em chips ARM.\n" +
                "Apesar disso, o BeOS ainda conta com muitos usuários fiéis, que prometem manter o\n" +
                "desenvolvimento do sistema.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Beowulf");
        p.setDescription_words("Os Clusters Beowulf são formados por vários computadores interligados em rede. Não é\n" +
                "necessário nenhum hardware sofisticado, um grupo de PCs de configuração mediana ligados\n" +
                "através de uma rede Ethernet de 100 megabits já são o suficiente para montar um cluster\n" +
                "beowulf capaz de rivalizar com muitos supercomputadores em poder de processamento. A idéia\n" +
                "é criar um sistema de baixo custo, que possa ser utilizado por universidades e pesquisadores\n" +
                "com poucos recursos.\n" +
                "O primeiro cluster beowulf foi criado em 1994 na CESDIS, uma subsidiária da NASA e era\n" +
                "formado por 16 PCs 486 DX-100 ligados em rede. Para manter a independência do sistema e\n" +
                "baixar os custos, os desenvolvedores optaram por utilizar o Linux.\n" +
                "Estes clusters não servem para processar dados em tempo real (um game qualquer por\n" +
                "exemplo), mas apenas para processar grandes quantidades de dados, que podem ser quebrados\n" +
                "em pequenas partes e divididos entre os vários computadores. Uma área onde são populares é\n" +
                "na aplicação de efeitos especiais e renderização de imagens para filmes de cinema. Há inclusive\n" +
                "casos de filmes como Shrek e Final Fantasy que foram feitos inteiramente em clusters beowulf.\n" +
                "Veja também: Cluster ");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bezel");
        p.setDescription_words("Termo em Inglês, usado para descrever o painel de plástico frontal, encontrado em drives de\n" +
                "disquetes, CD-ROMs e outros drives que são encaixados nas baias do gabinete.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BGA");
        p.setDescription_words("Ball Grid Array. Este é um tipo de conexão de microchips muito usado atualmente, onde o chip\n" +
                "possui pequenos pontos de solda na sua parte inferior, que são soldados diretamente na placa\n" +
                "mãe. O chip é encaixado e a solda é feita numa câmara de vapor a aproximadamente 180\n" +
                "graus, temperatura em que a solta de funde mas que ainda não é suficiente para derreter os\n" +
                "demais componentes da placa mãe, incluindo os conectores plásticos e os chips, que suportam\n" +
                "temperaturas um pouco mais altas. O BGA é utilizado por vários componentes, entre eles\n" +
                "chipsets e chips de memória, destinados principalmente a portáteis. Existe ainda uma série do\n" +
                "processador C3 da Via que utiliza este tipo de conexão como forma de cortar custos. As placas\n" +
                "mãe já vem com os processadores soldados, mas existe o inconveniente de não ser possível\n" +
                "atualizar o processador. A Via chama o C3 neste formato de \"EBGA\", onde o \"E\" vem de\n" +
                "\"Enhanced\". ");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Big Drive");
        p.setDescription_words("Na história do PC já existiram vários limites para o tamanho máximo de HD suportados pela\n" +
                "placa mãe. Na época dos 486 tivemos o limite de 504 MB, que foi superado graças ao LBA. Mais\n" +
                "tarde tivemos os limites de 8 e 32 GB que ainda atingem muitas placas mãe em uso.\n" +
                "A \"última fronteira\" é o limite de 128 GB (ou 137 GB, se você considerar um GB como\n" +
                "1.000.000.000 de bytes como fazem os fabricantes de HDs) que afeta as placas mãe que não\n" +
                "sofrem mais dos limites anteriores. Este limite surge por que o BIOS reserva apenas 28 bits para\n" +
                "o endereçamento do HD, o que permitem endereçar até 268.435.456 setores de 512 bytes cada.\n" +
                "O padrão Big Drive desenvolvido pela Maxtor em parceria com outros fabricantes, soluciona o\n" +
                "problema, reservando 48 bits, suficientes para endereçar HD's de até 144 petabytes, capacidade\n" +
                "que só será atingida daqui a algumas décadas.\n" +
                "Quase todas as placas mãe novas à venda atualmente já são compatíveis com a tecnologia.\n" +
                "Muitas placas antigas podem ser atualizadas através de um upgrade de BIOS.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bigfoot");
        p.setDescription_words("Uma família de HDs produzidos pela Quantum, que utilizam discos de 5 ¼, bem maiores que os\n" +
                "discos rígidos de 3 ½ que usamos atualmente. Além de pesados, estes HDs ocupavam uma das\n" +
                "baias de 5 ¼ do gabinete, o espaço de um CD-ROM. Apesar do tamanho, estes HDs eram muito\n" +
                "lentos e pouco confiáveis se comparados com outros modelos da época, mas pelo menos eram\n" +
                "relativamente baratos. Fizeram um certo sucesso até serem substituídos pelos Quantum LCT, a atual família de HDs de baixo custo da Quantum, que continua apresentando um desempenho\n" +
                "apenas medíocre. LCT vem de \"Low Cost Technology\".");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Big Water");
        p.setDescription_words("Este é um padrão de formato de placa mãe que está sendo desenvolvido pela Intel para\n" +
                "substituir o ATX. Segundo a Intel o padrão é \"revolucionário\", mas pouco foi divulgado sobre ele\n" +
                "até agora.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bimar");
        p.setDescription_words("Este é um verbo genuinamente Brasileiro. Eu bimo, tu bimas, ele bima... Bimar significa\n" +
                "transferir informações usando o infravermelho do Palm ou de outros portáteis. Graças à\n" +
                "facilidade de uso e a popularização destes aparelhos, bimar está se tornando comum em muitos\n" +
                "círculos, onde a moda é simplesmente bimar seu cartão de visitas para o Palm do interessado,\n" +
                "ao invés de entregar aquela velha folha de cartolina. O termo vem de \"beam\" ou raio de luz,\n" +
                "neste caso de luz infravermelha");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Binary");
        p.setDescription_words("Binário, sistema numérico usado em computação que consiste em apenas dois valores, 1 e 0.\n" +
                "Todas as operações que são possíveis no sistema decimal, assim como processamento de texto,\n" +
                "sons, imagens e outros dados analógicos podem ser feitos usando o sistema digital.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Biochip");
        p.setDescription_words("Os biochips são personagens importantes na engenharia genética. Basicamente, são microchips\n" +
                "especialmente desenvolvidos para detectar reações químicas, que vêm ajudando enormemente\n" +
                "vários projetos, entre eles o mapeamento do genoma humano.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BIOS");
        p.setDescription_words("Basic Input / Output System, sistema básico de entrada e saída. A primeira camada de software\n" +
                "do sistema, responsável por \"dar a partida\" no micro. O BIOS fica armazenado em um chip na\n" +
                "placa mãe.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("B.I.O.S.");
        p.setDescription_words("(Bicho ignorante operando o sistema) - Termo pejorativo usado em relação à dummies. Mais\n" +
                "uma daquelas piadinhas de técnico e bem velha por sina");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bit");
        p.setDescription_words("Qualquer circuito eletrônico é baseado em transístores, componentes extremamente simples,\n" +
                "que permitem apenas dois estados: podem estar ligados ou desligados. Já que todo tipo de dado\n" +
                "a ser processado precisa ser codificado em seqüências destes dois valores, foi criado o sistema binário, que permite representar qualquer tipo de informação, ou de operação aritmética através\n" +
                "da combinação dos números 1 e 0, chamados de bit. Um único bit permite apenas duas\n" +
                "combinações (1 ou 0), dois bits permitem 4 combinações, 3 bits permitem 8 combinações e\n" +
                "assim por diante. Com 8 bits, temos o suficiente para um caracter de texto no sistema ASCII,\n" +
                "com 24 bits temos o suficiente para um ponto numa imagem true-color, com 128 bits, temos o\n" +
                "suficiente para gerar uma sofisticada chave de encriptação, e por aí vai");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bit Depth");
        p.setDescription_words("Número de bits usados para representar cada ponto de uma imagem digitalizada. Quanto mais\n" +
                "bits por ponto, mais cores e melhor será a fidelidade da imagem, porém, maior será o arquivo\n" +
                "gerado. Por exemplo, uma imagem de 1000 x 1000 pixels com 8 bits de cor ocupa pouco menos\n" +
                "de 1 MB em disco, enquanto a mesma imagem, digitalizada com 24 bits de cor ocupará quase 3\n" +
                "MB. Para diminuir isto, existem os formatos de compressão, como o JPG, que consegue diminuir\n" +
                "quase que indefinidamente o espaço em disco ocupado pela imagem em troca de uma perda\n" +
                "progressiva da qualidade e o PNG, que oferece uma redução de espaço limitada, mas não causa\n" +
                "perda de qualidade.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bit-rate");
        p.setDescription_words("Num arquivo de áudio ou vídeo, o Bit-rate é o número de bits usados por segundo, para\n" +
                "representar o conteúdo a ser exibido. Quanto maior for o bit-rate, maior será a qualidade, assim\n" +
                "como o tamanho do arquivo. No MP3 por exemplo, o bit-rate padrão para ter uma qualidade\n" +
                "próxima à do CD é 128 kbits, para qualidade de rádio são necessário 64 kbits, enquanto para ter\n" +
                "qualidade de telefone são necessários apenas 32 kbits. O mesmo se aplica aos formatos de\n" +
                "vídeo. Existem formatos com bit-rate fixo, e também de bit-rate variável, onde o bit-rate muda\n" +
                "de acordo com o trecho, respeitando um limite estabelecido. Assim, num vídeo em Divx,\n" +
                "podemos ter um bit-rate de 1000 kbits numa cena com pouca movimentação, e 6000 kbits numa\n" +
                "cena de ação, com mudanças de tela mais rápidas. Veja também: VBR.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bitmap");
        p.setDescription_words("Formato onde cada ponto da imagem é representado por um certo número de bits, sem\n" +
                "compactação. Em um bitmap com 24 bits de cor, cada ponto consumirá 3 bytes de memória. O\n" +
                "oposto é uma imagem vetorial, onde a imagem é formada por formas geométricas. A diferença\n" +
                "básica entre os dois formatos é que uma imagem de bitmap não pode ser ampliada sem perda\n" +
                "de qualidade, já que os pontos estouram, enquanto uma imagem vetorial pode ser ampliada ou\n" +
                "reduzida indefinidamente, pois bastará que o programa gráfico refaça os cálculos que formam a\n" +
                "imagem a cada alteração.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Blade Server");
        p.setDescription_words("Este é um tipo especial de servidor, constituído por uma única placa, que contém um ou mais\n" +
                "processadores, memória RAM, HDs e outros periféricos e pode ser encaixada num único rack,\n" +
                "junto com vários outros servidores similares. Os vários servidores são interligados através de\n" +
                "algum tipo de barramento rápido (geralmente alguma tecnologia proprietária) e podem ser\n" +
                "configurados para oferecerem recursos como tolerância à falhas, balanceamento de carga, etc.\n" +
                "Este tipo de servidor é projetado para ocupar pouco espaço e consumir pouca energia. Como os\n" +
                "servidores ficam ligados continuamente, por anos à fio, um baixo consumo elétrico representa uma grande economia à longo prazo e o fato de ocuparem pouco espaço diminui os custos de\n" +
                "hospedagem em data centers.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Blower");
        p.setDescription_words("Este é um tipo de cooler geralmente utilizado em gabinetes 1U e 2U, destinados a servidores,\n" +
                "que puxa o ar frio de fora e o joga diretamente sobre o processador e demais componentes,\n" +
                "montado sempre na horizontal. Como estes modelos de gabinete são baixos demais para os\n" +
                "coolers atuais, é usado apenas um dissipador no processador e de um a quatro blowers, que\n" +
                "jogam o ar frio, substituindo ao mesmo tempo o exaustor da entrada frontal e o fan do\n" +
                "processador.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bluecurve");
        p.setDescription_words("Este é o desktop padrão do Red Hat Linux, incluído a partir da versão 8.0. O objetivo do\n" +
                "Bluecurve é resolver os problemas de compatibilidade entre o KDE e o Gnome, fazendo com que\n" +
                "os dois gerenciadores e seus respectivos aplicativos tenham uma aparência semelhante, que a\n" +
                "área de transferência funcione entre os dois sem problemas e assim por diante. A idéia é que o\n" +
                "sistema funcione da mesma forma, seja qual for o gerenciador escolhido.\n" +
                "O Bluecurve gerou uma certa resistência entre os desenvolvedores ligados ao KDE, pois na\n" +
                "realidade o KDE foi suprimido, tendo parte de suas bibliotecas reduzidas ou substituídas em favor das bibliotecas do Gnome, que são a base do Bluecurve. \"O Red Hat está castrando o KDE\"\n" +
                "disse um desenvolvedor.\n" +
                "Apesar disso, o Bluecurve fez sucesso entre os usuários, pois realmente facilita as coisas,\n" +
                "principalmente para quem está começando no Linux. O visual também é bastante polido, com\n" +
                "antialising de fontes, ícones bem feitos e um conjunto de aplicativos bem escolhido.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Blue Screen of Death");
        p.setDescription_words("A mundialmente conhecida tela azul do Windows, que fez sua aparição mais famosa durante\n" +
                "uma apresentação do Windows 98, feita por Bill Gates durante a Comdex (a Americana) de\n" +
                "1998. A causa mais comum da tela azul são erros de GPF, que ocorrem com frequência ao\n" +
                "utilizar programas de 16 bits, nativos do Windows 3.x no Windows 95, 98, Se ou ME. Os\n" +
                "sistemas baseados na família NT, como o NT 4, 2000 e XP rodam os programas de 16 bits numa\n" +
                "máquina virtual, por isso não padecem deste problema, embora tenham a desvantagem de não\n" +
                "rodarem vários programas que precisam se acesso direto ao hardware. Nestes sistemas a tela\n" +
                "azul ainda pode aparecer em algumas situações, como erros de hardware ou caso alguns bugs\n" +
                "específicos sejam explorados, mas elas são muito mais raras.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bluetooth");
        p.setDescription_words("O Bluetooth é uma tecnologia de transmissão de dados via sinais de rádio de alta freqüência,\n" +
                "entre dispositivos eletrônicos próximos. A distância ideal é de no máximo 10 metros e a distância\n" +
                "máxima é de 100 metros, atingida apenas em situações ideais. Um dos trunfos é o fato dos\n" +
                "transmissores serem baratos e pequenos o suficiente para serem incluídos em praticamente\n" +
                "qualquer tipo de dispositivo, começando por notebooks, celulares e micros de mão, passando\n" +
                "depois para micros de mesa, mouses, teclados, joysticks, fones de ouvido, etc. Já tem gente\n" +
                "imaginando um \"admirável mundo novo Bluetooth\" onde tudo estaria ligado entre sí e à\n" +
                "Internet, onde a cafeteira poderia ligar para o seu celular para avisar que o café acabou, ou a\n" +
                "geladeira te mandar um mail avisando que está sem gelo... sinceramente acho que existem usos\n" +
                "mais úteis para essa tecnologia, mas tem louco pra tudo... :-)\n" +
                "A maior ameaça para a popularização do Bluetooth são os transmissores 802.11b, outra\n" +
                "tecnologia de rede sem fio que transmite a 11 megabits (contra 1 megabit no Bluetooth) e tem\n" +
                "um alcance maior. O 802.11b é voltado para redes sem fio e é um padrão mais caro, embora os\n" +
                "preços estejam caindo para patamares próximos aos do Bluetooth.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BNC");
        p.setDescription_words("Vem de Baionet Naur Conector, que poderia ser traduzido para \"conector em forma de baioneta\".\n" +
                "É o conector usado em cabos de rede coaxiais, onde existe apenas um cabo de cobre, coberto\n" +
                "por camadas de isolamento e blindagem.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BNC (2)");
        p.setDescription_words("Um tipo de conector de vídeo encontrado em alguns monitores profissionais, onde existem cinco\n" +
                "cabos separados, três para os sinais de cor (verde, azul e vermelho) e dois para os sinais de\n" +
                "sincronismo horizontal e vertical. O objetivo de usar cabos separados é diminuir o nível de\n" +
                "interferência, obtendo a melhor qualidade de imagem possível.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BogoMIPS");
        p.setDescription_words("MIPS falsos. Esta expressão aparece nas relas de login de algumas distribuições do Linux,\n" +
                "indicando o número de MIPS do processador usado na máquina. MIPS são milhões de instruções\n" +
                "por segundo. Um 486 de 100 MHz processa uma instrução por ciclo, então tem 100 MIPS. Um\n" +
                "Pentium III de 500 MHz processa (teoricamente) duas instruções por ciclo então tem 1000 MIPS\n" +
                "e assim por diante.\n" +
                "Como este número não indica o desempenho real do processador, já que isso depende da\n" +
                "quantidade de cache, etc. usam o \"BogoMIPS\" para indicar que o usuário não deve dar muita\n" +
                "importância ao número.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Book A");
        p.setDescription_words("Como é conhecido o documento que contém as especificações físicas do DVD, padronizado em\n" +
                "1996. Pouco tempo depois, sugiram o Book B (com as especificações para o DVD-Video), o Book\n" +
                "C (com as especificações do DVD-Audio), Book D (DVD-R, ou DVD gravável) e finalmente o Book\n" +
                "E (DVD-RAM, ou DVD regravável).");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Boot");
        p.setDescription_words("Bootstrap. É o processo de inicialização do micro, onde é lido primeiramente o BIOS e em\n" +
                "seguida carregado o sistema operacional e programas. O termo bootstrap poderia ser traduzido\n" +
                "para o Português como \"levantar-se puxando as próprias botas\". A idéia tem uma certa\n" +
                "semelhança com o processo de boot de um PC, onde ele se inicializa sozinho.\n" +
                "Durante o Boot, são checados os componentes instalados no PC, contada a memória RAM,\n" +
                "realizados testes rápidos para verificar se tudo está funcionando adequadamente e se não\n" +
                "existem conflitos de Hardware, etc. Terminados os testes, o BIOS irá procurar o sistema\n" +
                "operacional, na ordem estabelecida na opção \"Boot Sequence\" do Setup. A lista inclui o drive de\n" +
                "disquetes, o HD, o CD-ROM, ou mesmo boot através do chip de Boot da placa de rede (caso\n" +
                "tenha). Ao localizar o sistema operacional o BIOS executa os arquivos que iniciam seu carregamento e dá lugar a ele. A partir daí é com a Janela, o Pingüin, o Diabinho ou que mais\n" +
                "esteja instalado no PC");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Boot Drive");
        p.setDescription_words("Drive de boot, a unidade de disco usada para dar boot no micro. Normalmente é o disco rígido,\n" +
                "mas pode ser um disquete, CD-ROM, Zip, ou qualquer outra unidade de armazenamento de\n" +
                "dados. Existe ainda a opção de dar boot através da placa de rede, neste caso é preciso gravar\n" +
                "uma ROM com o software necessário e encaixa-la no soquete disponível da placa de rede. Neste\n" +
                "caso, o PC dará boot utilizando os arquivos disponibilizados por outro PC da rede.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Boot Manager");
        p.setDescription_words("Um pequeno programa, instalado no setor de boot do HD, que permite instalar vários sistemas\n" +
                "operacionais no mesmo micro. Toda vez que o micro for ligado, o Boot manager será carregado\n" +
                "e perguntará qual dos sistemas operacionais deve ser carregado. Exemplos de Boot Managers\n" +
                "são o lilo do Linux, o NTBoot do Windows NT e 2000 e o Boot Magic do Partition Magic.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Boot ROM");
        p.setDescription_words("Um chip de memória ROM instalado na placa de rede, que permite à estação acessar o servidor\n" +
                "de arquivos da rede e a partir dele baixar o software necessário para o boot. Quase todas as\n" +
                "placas de rede vêm com um soquete para encaixar o chip de boot, que geralmente é vendido\n" +
                "separadamente.\n" +
                "Como as estações dão boot através da rede, não são necessários os HDs, o que permite\n" +
                "economizar algum dinheiro. Apesar de terem estado fora de moda durante muito tempo, as\n" +
                "estações diskless estão voltando a fazer algum sucesso, em conjunto com servidores Linux.\n" +
                "Neste caso, deve ser instalado no servidor um software como o LTSP (http://www.ltsp.org) e as\n" +
                "estações devem usar placas de rede com ROMs gravadas com o software do http://rom-omatic.com ambas as soluções são gratuitas.\n" +
                "Com isto, os terminais podem rodar todos os aplicativos gráficos instalados no servidor com um\n" +
                "bom desempenho. Esta solução, assim como outras similares oferece seus prós e contras.\n" +
                "Os prós são a economia, a possibilidade de centralizar todos os aplicativos e arquivos no\n" +
                "servidor, o que facilita a tarefa de configuração e backups do sistema. Os contras são que as\n" +
                "estações passam a ser inteiramente dependentes do servidor e da rede, de modo que qualquer\n" +
                "problema em um dos componentes da rede ou uma pane no servidor paralisaria o trabalho em\n" +
                "todas as estações.\n" +
                "O mais comum atualmente, principalmente nos ambientes dominados pelo Windows é cada\n" +
                "estação ter seu HD e os softwares necessários e baixar apenas arquivos através da rede.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Boot Sequence ");
        p.setDescription_words("Seqüência de Boot. É uma opção encontrada no Setup, que permite definir a ordem em que o\n" +
                "BIOS procurará o sistema operacional a ser inicializado. Estão disponíveis opções como \"A, C\",\n" +
                "onde será acessado primeiro o drive de disquetes e em seguida o disco rígido, \"C,A, CD-ROM\"\n (primeiro o disco rígido, em seguida o drive de disquetes, por último o CD-ROM), e assim por\n" +
                "diante. Os BIOS mais recentes suportam também boot através de discos Zip, LS-120 e até\n" +
                "mesmo cartões de memória Flash.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Boot Sector");
        p.setDescription_words("Também chamado de trilha MBR, ou trilha zero, o setor de boot do HD armazena informações\n" +
                "sobre o sistema operacional instalado, quais arquivos devem ser carregados para inicializar o\n" +
                "sistema etc.\n" +
                "O BIOS é muito limitado neste sentido, embora seja capaz de contar a memória e reconhecer os\n" +
                "periféricos instalados (via plug-and-play) o BIOS não tem a mínima idéia do que fazer em\n" +
                "seguida. O setor de boot funciona como um ponto de partida, assim que o POST é concluído, o\n" +
                "BIOS lê o setor de boot e segue as instruções que estiverem gravadas nele, que iniciarão o\n" +
                "carregamento do sistema operacional.\n" +
                "Geralmente o boot é feito através do HD, mas de acordo com o que for configurado na opção\n" +
                "\"Boot Sequence\" no Setup o BIOS pode procurar o boot também no disquete, no CD-ROM, num\n" +
                "disco Zip ou até mesmo tentar dar boot através da rede.\n" +
                "Caso o setor de boot seja danificado por qualquer motivo, não será mais possível dar boot pelo\n" +
                "HD. Ao instalar qualquer sistema operacional, este irá reescrever o setor de boot, deixando as\n" +
                "instruções que permitirão ao BIOS carregá-lo. É possível instalar mais de um sistema\n" +
                "operacional no mesmo HD usando um gerenciador de boot (como o lilo do Linux) que é um\n" +
                "programinha que ficará encarregado de lhe perguntar, a cada boot, qual sistema operacional\n" +
                "deve ser carregado.\n" +
                "Para limpar o setor de boot do HD, você pode dar boot usando um disquete de boot do Windows\n" +
                "95 ou 98 e usar o comando \"FDISK /MBR\".\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bot");
        p.setDescription_words("Vem de \"robot\", ou robô. Um bot é um programa que vasculha a Internet em busca de\n" +
                "informações, com pouca ou nenhuma intervenção do usuário. Os bots também são muito\n" +
                "populares nos canais de IRC, onde podem automatizar muitas operações. É possível programas o\n" +
                "boot para automaticamente enviar uma mensagem sempre que entrar em um canal, enviar\n" +
                "respostas automáticas para frases pré programadas, automatizar o envio e recebimento de\n" +
                "arquivos, etc.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BPI");
        p.setDescription_words("Bits per Inch ou bits por polegada. É uma medida de densidade para fitas destinadas à\n" +
                "armazenar dados, como as famosas fitas DAT. Quanto mais bits por polegada, maior será a\n" +
                "capacidade de armazenamento por fita");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bps");
        p.setDescription_words("Bits per second, é usada para medir a velocidade de modems e redes em geral. Refere-se ao\n" +
                "números de bits transmitidos por segundo, lembrando que 8 bits equivalem a 1 byte. Um\n" +
                "modem de 56 k atinge no máximo pouco mais de 8 KB/s.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bridge");
        p.setDescription_words("Ponte, serve para conectar duas redes distintas, permitindo comunicações entre elas. O bridge\n" +
                "pode ser um dispositivo dedicado ou então um PC com duas placas de rede, configurado para\n" +
                "executar esta função.\n" +
                "À primeira vista pode parecer que o bridge tem a mesma função de um hub comum, mas as\n" +
                "aplicações são bem diferentes. Um hub permite conectar vários PCs, que passam a fazer parte\n" +
                "de um único segmento de rede, onde todos os dados transmitidos por um PC são transmitidos a\n" +
                "todos, o que diminui o desempenho da rede conforme aumenta o tráfego de dados e a\n" +
                "quantidade de PCs. O Bridge permite unir dois ou mais hubs, transformando-os em uma única\n" +
                "rede, onde os PCs conectados a cada hub tornam-se um segmento de rede distinto. Isso faz toda\n" +
                "a diferença, pois o bridge é capaz de examinar os pacotes e transmitir os pacotes apenas ao\n" +
                "destinatário correto, isso previne a saturação da rede, mesmo que existam muitos PCs. As\n" +
                "limitações são que o bridge pode conectar apenas redes que utilizem a mesma arquitetura\n" +
                "(Ethernet por exemplo) e que utilizem o mesmo protocolo de rede (TCP/IP por exemplo). No\n" +
                "máximo é possível juntar uma rede que utilize cabos de par trançado com outra que utilize\n" +
                "cabos coaxiais.\n" +
                "Os switches, seguidos pelos roteadores são os próximos degraus da escala evolutiva.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Brightness");
        p.setDescription_words("O ajuste de brilho do monitor. Nos monitores CRT, o brilho é ajustado através da variação da\n" +
                "intensidade do feixe de elétrons que forma a imagem, quanto mais potente o feixe, mais brilho.\n" +
                "Nos monitores LCD o brilho é ajustado variando a intensidade dos LEDs ou das lâmpadas que\n" +
                "iluminam a tela.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Broadband");
        p.setDescription_words("Banda Larga, uma forma qualquer de acesso rápido à Internet, como acesso via cabo, ADSL,\n" +
                "satélite, etc.\n" +
                "Já existem várias tecnologias de acesso rápido disponíveis. O ADSL e o acesso via cabo são sem\n" +
                "dúvida as duas tecnologias mais difundidas, mas ambas possuem seus problemas. O ADSL\n" +
                "oferece um custo de implementação muito alto, que acaba tendo de ser financiado pela\n" +
                "operadora. Com isso, apensar de em teoria todos que possuem uma linha telefônica poderem\n" +
                "utilizar o ADSL, o serviço está disponível em poucas áreas. O acesso via cabo também é caro e\n" +
                "está limitado às áreas cobertas pelas redes de TV a cabo.\n" +
                "Um terceiro meio é o acesso via satélite, que se divide em duas modalidades. O unidirecional,\n" +
                "onde a banda larga é apenas para download e continua sendo necessário um modem para fazer\n" +
                "o upload e o acesso bidirecional, onde os dados são transmitidos nos dois sentidos. O acesso via satélite está disponível em praticamente todas as regiões, já que a área de cobertura dos\n" +
                "satélites é muito grande, mas esbarra novamente no custo da infra-estrutura, ainda mais cara\n" +
                "que o ADSL. Uma quarta tecnologia é o acesso via rede elétrica, que novamente tem potencial\n" +
                "para atingir todas as casas, mas que assim como o ADSL é muito caro.\n" +
                "A solução definitiva para o problema do acesso rápido seria levar uma rede de fibra óptica a\n" +
                "todas as casas, o que permitiria velocidades de acesso muito mais altas, com possibilidade de\n" +
                "expansão quase indefinida no futuro, aproveitando os mesmas casos. Mas, este é um sonho que\n" +
                "ainda deve demorar várias décadas para se concretizar, novamente por causa do problema do\n" +
                "custo.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Broadcast");
        p.setDescription_words("Este termo costuma ser traduzido como \"radio difusão\", apesar de atualmente este termo ter\n" +
                "ganho novos significados. Um sinal de broadcast é irradiado para uma grande área geográfica,\n" +
                "um bom exemplo são os sinais de TV. Numa rede de computadores, um sinal de broadcast é um\n" +
                "aviso enviado simultâneamente para todos os micros da rede. Existem vários exemplos de sinais\n" +
                "de broadcast, como por exemplo os avisos de colisões de pacotes enviados pelas placas ou\n" +
                "(numa rede onde é usado um servidor DHCP e as estações são configuradas para obter o\n" +
                "endereços IP automaticamente) os sinais enviados pelas estações quando se conectam à rede\n" +
                "para entrar em contato com o servidor DHCP. Todas as estações recebem este sinal, mas apenas\n" +
                "o servidor DHCP responde.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Browser");
        p.setDescription_words("O mesmo que Navegador, programas usados para visualizar páginas Web, como o Internet\n" +
                "Explorer, Netscape, Opera, Konqueror, etc. No início os navegadores eram meros visualizadores\n" +
                "de páginas em html, mas eles foram evoluindo e incorporando novas funções. Hoje em dia um\n" +
                "navegador como o Internet Explorer é quase um sistema operacional completo, capaz de rodar\n" +
                "aplicativos (Java, XML, Active-X, etc.) entre muitas outras funções. É por isso que tornou-se tão\n" +
                "complexo desenvolver um navegador e torna-lo compatível com todas as tecnologias. É muita\n" +
                "coisa a ser implementada.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("BTW");
        p.setDescription_words("By the Way, é uma abreviação geralmente usada em grupos de discussão: \"A propósito\",\n" +
                "\"Falando nisso...\" etc.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bubble Jet");
        p.setDescription_words("Esta é a tecnologia utilizada nas impressoras jato de tinta da Canon. A tinta é aquecida, parte se\n" +
                "evapora, formando bolhas, que expiram tinta no papel, permitindo a impressão. O nome \"bubble\n" +
                "jet\" é marca registrada da Canon. As impressoras jato de tinta da HP usam um sistema\n" +
                "parecido, mas chamado de Ink Jet.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Budget");
        p.setDescription_words("\"Orçamento\". Este termo é usado em várias situações. Por exemplo, um \"budget PC\" é um PC de\n" +
                "baixo custo, montado ou comprado por quem tem um orçamento apertado. Outro exemplo é o\n" +
                "\"Power budget\" é a quantidade de energia que um novo processador deve consumir de modo a\n" +
                "atender aos interesses do mercado; afinal, muitos torcem o nariz para comprar um processador\n" +
                "que esquente muito ou que obrigue a levar junto um cooler monstruoso.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Buffer");
        p.setDescription_words("Uma pequena área de memória ultra-rápida usada para melhorar a velocidade de acesso a um\n" +
                "determinado dispositivo. É encontrado em HDs, gravadores de CD, modems, e muitos outros.\n" +
                "Apesar de serem sinônimos, o termo \"buffer\" é mais usado em relação aos dispositivos\n" +
                "anteriormente citados enquanto o termo \"cache\" é mais usado com relação aos processadores e\n" +
                "memória RAM.\n" +
                "Embora não seja errado dizer \"tenho um gravador com 2 MB de cache\", é mais elegante usar o\n" +
                "termo buffer, assim como soa estranho dizer \"tenho um processador com 512 KB de buffer\" ao\n" +
                "invés de usar o termo cache.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Buffer Overflow");
        p.setDescription_words("Os Buffers são áreas de memória criadas pelos programas para armazenar dados que estão\n" +
                "sendo processados. Cada buffer tem um certo tamanho, dependendo do tipo e quantidade de\n" +
                "dados que ele irá armazenar.\n" +
                "Um buffer overflow ocorre quando o programa recebe mais dados do que está preparado para\n" +
                "armazenar no buffer. Se o programa não foi adequadamente escrito, este excesso de dados pode\n" +
                "acabar sendo armazenado em áreas de memória próximas, corrompendo dados ou travando o\n" +
                "programa, ou mesmo ser executado, que é a possibilidade mais perigosa. Se um programa\n" +
                "qualquer tivesse uma vulnerabilidade no sistema de login por exemplo, você poderia criar um\n" +
                "programa que fornecesse caracteres de texto até completar o buffer e depois enviasse um\n" +
                "executável, que acabaria rodando graças à vulnerabilidade.\n" +
                "Um caso famoso foi descoberto ano passado (2000) no Outlook Express. Graças à uma\n" +
                "vulnerabilidade, era possível fazer com que um e-mail executasse arquivos apenas por ser\n" +
                "aberto! Bastava anexar um arquivo com um certo número de caracteres no nome, que ele seria\n" +
                "executado ao ser aberta a mensagem. Naturalmente, a Microsoft se apressou em lançar um\n" +
                "patch e alertar os usuários para o problema. Felizmente, pelo menos por enquanto, não foi\n" +
                "descoberta mais nenhuma vulnerabilidade tão perigosa no Outlook. Semanalmente são\n" +
                "descobertas vulnerabilidades de buffer overflow em vários programas. Algumas são quase\n" +
                "inofensivas, enquanto outras podem causar problemas sérios. O próprio Codered se espalhou tão\n" +
                "rapidamente explorando uma vulnerabilidade do IIS da Microsoft. Com isto, o worm podia\n" +
                "contaminar servidores desprotegidos simplesmente enviando o código que explora o bug, sem\n" +
                "que ninguém executasse nenhum arquivo.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Buffer Underrun");
        p.setDescription_words("A gravação de um CD é um processo razoavelmente lento que não pode ser interrompido de\n" +
                "maneira alguma, caso contrário a mídia que está sendo gravada será perdida. O problema que mais atormenta os usuários de gravadores de CD é o famoso “Buffer Underrun”, uma situação\n" +
                "onde a gravação é interrompida por falta de dados.\n" +
                "Todo gravador de CD possui um pequeno buffer, de 2 ou 4 MB nos drives mais recentes e 1 MB\n" +
                "ou 512 KB em gravadores mais antigos ou de baixa qualidade. Este buffer funciona como uma\n" +
                "“poupança” guardando dados que serão usados caso haja qualquer interrupção momentânea no\n" +
                "fornecimento de dados para o gravador, evitando a perda da mídia. Assim que o gravador volta\n" +
                "a receber dados, o buffer é novamente preenchido, mais ou menos como a represa de uma usina\n" +
                "hidrelétrica.\n" +
                "O Buffer underrun ocorre justamente quando o buffer do gravador se esvazia e a gravação é\n" +
                "abortada por falta de dados. A solução neste caso é gravar novamente o CD numa velocidade\n" +
                "mais baixa, ou tentar descobrir a causa do problema.\n" +
                "Sistemas operacionais com o Windows 95/98/SE/ME, que não possuem um bom suporte à\n" +
                "multitarefa são muito mais sucesptíveis a este tipo de problema, neles você deve tomar o\n" +
                "cuidado de desativar protetores de tela, antivírus ou qualquer outro programa residente e ainda\n" +
                "evitar executar tarefas pesadas no PC enquanto estiver gravando.\n" +
                "No Windows 2000 e principalmente no Linux o cenário já é muito mais tranquilo, pois a\n" +
                "multitarefa real proporcionada pelos dois sistemas permite usar o micro quase que normalmente\n" +
                "sem perder mídias, desde que claro o HD seja capaz de fornecer a quantidade de dados\n" +
                "necessária com uma certa folga.\n" +
                "Lembre-se que apesar de atingirem 30, até 40 MB/s de taxa de transferência contínua, os HDs\n" +
                "atuais ainda ficam na casa dos 5 a 6 MB/s ao transferir arquivos fragmentados, ou pequenos\n" +
                "arquivos espalhados em áreas não contínuas do HD, que é o cenário mais comum na gravação\n" +
                "de CDs. Desfragmentar o HD antes da gravação ajuda a diminuir o problema.\n" +
                "A maioria dos gravadores de 16X em diante já são compatíveis com o Burn-Proof, um recurso\n" +
                "que permite “paralisar” a gravação do CD quando o buffer se esvazia e recomeçar do mesmo\n" +
                "ponto quando mais dados estiverem disponíveis. Este sistema resolve de uma vez por todas o\n" +
                "problema, perimtindo gravar sempre na velocidade máxima perimtida pelo gravador\n" +
                "(respeitando o suportado pela mídia) sem se preocupar com a velociade do HD ou com o sistema\n" +
                "operacional usado.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bug");
        p.setDescription_words("Inseto em inglês, é usado com relação a qualquer tipo de falha de programação num programa.\n" +
                "O termo surgiu na década de 40, quando um inseto entrou nos circuitos de um computador\n" +
                "causando um curto circuito. Existem várias versões sobre quando, onde e qual foi o inseto que\n" +
                "entrou para a história, mas segundo o http://ei.cs.vt.edu o inseto era uma traça, que foi\n" +
                "encontrada por Grace Murray Hopper no Mark II em 1944. Naquela época os defeitos eram muito\n" +
                "comuns, pois os computadores eram formados por válvulas que se queimavam com muita\n" +
                "facilidade, mas este foi um caso tão peculiar que Grace \"anexou\" o inseto ao seu diário:");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Burn-in");
        p.setDescription_words("Um tipo de teste onde são executadas tarefas que visam exigir o máximo do sistema durante\n" +
                "longos períodos, de forma a testar sua estabilidade. Este tipo de teste é muito comum em\n" +
                "reviews de placas mãe, feitos por vários sites e é extremamente válido, pois a maior parte dos\n" +
                "problemas de placas mãe e processadores só se manifesta em situações de uso intenso e\n" +
                "prolongado. Em geral se aceita que uma placa mãe trave no máximo uma vez num teste de\n" +
                "Burn-in de 24 horas, que equivale a algumas semanas de uso normal do sistema.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Burn-Proof");
        p.setDescription_words("Uma tecnologia desenvolvida pela Sanyo que aumenta a segurança na gravação de CDs. Ao\n" +
                "ocorrer algum erro inesperado, um problema de buffer underrun, etc. a gravação é\n" +
                "automaticamente interrompida. A grande vantagem, é que ao invés da mídia ser inutilizada,\n" +
                "como aconteceria normalmente, é possível terminar a gravação ao ser solucionado o problema.\n" +
                "Esta tecnologia é suportada por muitos gravadores de CD, que gravam a 12x ou mais, já que\n" +
                "quanto mais alta a taxa de gravação, maior é a possibilidade de surgirem problemas de buffer\n" +
                "underrun ou outros erros.\n" +
                "Tudo é feito automaticamente pelo gravador, sem intervenção do usuário. No caso de um buffer\n" +
                "underrum por exemplo o gravador paralisaria a gravação, esperaria até que o buffer estivesse\n" +
                "cheio e então continuaria do ponto onde parou, como se nada tivesse acontecido.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Burst Mode");
        p.setDescription_words("Modo de acesso suportado por vários tipos de memória e cache que consiste em vários acessos\n" +
                "seqüenciais, realizados antes que o anterior termine. Isto permite melhorar bastante a\n" +
                "velocidade dos acessos.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bus");
        p.setDescription_words("Barramento, meio de transmissão de dados entre dois ou mais componentes. Exemplos são os\n" +
                "barramentos PCI, AGP e ISA da placa mãe, que ligam os periféricos ao chipset e\n" +
                "consequentemente ao processador.\n" +
                "Os barramentos se dividem em duas grandes categorias, os barramento seriais e os barramentos\n" +
                "paralelos. Os barramentos seriais transmitem dados através de um único par de fios (um para\n" +
                "enviar, outro para receber) de forma serial, onde um bit trafega de cada vez. Exemplos são as\n" +
                "portas seriais, portas USB e o novíssimo Serial ATA desenvolvido pela Intel, para substituir as\n" +
                "interfaces IDE, capaz de transmitir a 150 MB/s logo em sua primeira versão. Os barramentos paralelos por sua vez utilizam um número maior de fios para transmitir vários\n" +
                "bits de cada vez. Nas portas paralelas por exemplo temos 8 bits por transferência, no\n" +
                "barramento PCI temos 32 bits e assim por diante.\n" +
                "As duas tecnologias possuem seus prós e contras. Os barramentos seriais são mais baratos e\n" +
                "sofrem menos com o problema de interferência, mas em compensação são mais lentos do que\n" +
                "poderiam ser caso fossem utilizados vários pares de fios em conjunto com a mesma tecnologia.\n" +
                "Apesar disso alguns barramentos seriais são muito rápidos, como é o caso do Serial ATA e\n" +
                "também do USB 2.0, capaz de transmitir a 400 megabits");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Bus Mastering");
        p.setDescription_words("É uma característica suportada por alguns tipos de barramento, entre elas as portas IDE da\n" +
                "placa mãe, que permite que a controladora conectada ao mesmo se comunique diretamente com\n" +
                "outros dispositivos do barramento sem passar pelo processador.\n" +
                "Um HD com os drivers de Bus Mastering instalados é capaz de acessar diretamente a memória,\n" +
                "sem ter que recorrer ao processador, o que além de melhorar o desempenho, não consome\n" +
                "tempo de processamento, deixando o processador livre para fazer outras coisas. HDs UDMA\n" +
                "utilizam o Ultra DMA, enquanto HDs Pio Mode 4 utilizam o Mult. Word DMA 2. Em ambos os\n" +
                "casos é necessário instalar os drivers de Bus Mastering que acompanham sua placa mãe a fim\n" +
                "de ativar este recurso. O Windows 98/SE/ME, além do 200 e do XP já possuem drivers de Bus\n" +
                "Mastering para a grande maioria das placas mãe, dispensando a instalação dos drivers do\n" +
                "fabricante.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Byte");
        p.setDescription_words("É uma unidade de armazenamento de dados. Cada byte é formado por 8 bits e é suficiente para\n" +
                "256 combinações diferentes. É por isso que no sistema de caracteres ASCII é usado um byte\n" +
                "para representar cada caracter. Com 256 combinações é possível incluir todas as letras,\n" +
                "números e ainda um punhado de caracteres especiais e símbolos. No conjunto Unicode, onde são\n" +
                "incluídos também caracteres do Japonês, Chinês, Árabe e outras línguas são usados 2 bytes para\n" +
                "cara caracter, o que permite 65 mil caracteres diferentes.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("C");
        p.setDescription_words("O C foi desenvolvido durante a década de 70, mas ainda é largamente utilizado. A grande\n" +
                "vantagem do C é permitir escrever tanto programas extremamente otimizados para a máquina,\n" +
                "como seria possível apenas em Assembly, e ao mesmo tempo vir com várias funções prontas,\n" +
                "como uma linguagem de alto nível, que podem ser utilizadas quando não for necessário gerar\n" +
                "um código tão otimizado. Esta flexibilidade, permitiu que o C fosse usado para desenvolver a\n" +
                "maioria dos sistemas operacionais, como o Unix, Linux e o próprio Windows. Usando o\n" +
                "compilador adequado, o C pode ser usado para desenvolver programas para várias plataformas\n" +
                "diferentes.\n" +
                "A maior parte dos aplicativos para Linux são escritos em C e compilados usando o compilador\n" +
                "GCC, desenvolvido pela Free software Fundation. Programas gráficos utilizam bibliotecas como o\n" +
                "GTK, que permite criar janelas, botões, etc. Como a grande maioria dos programas têm seu\n" +
                "código aberto (uma inesgotável fonte de estudos) e praticamente todas as distribuições Linux\n" +
                "incluem o GCC, editores como o Emacs e o Vi, além de outras ferramentas necessárias, acaba\n" +
                "sendo bem mais fácil aprender C no Linux do que em outras plataformas. Existem ainda\n" +
                "ferramentas de programação visual baseadas no C, como o Kdevelop, também disponível na\n" +
                "maioria das distribuições Linux.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("C++");
        p.setDescription_words("O C++ mantém os recursos do C original, mas traz muitos recursos novos, como recursos\n" +
                "orientados a objetos, sendo também bem mais fácil de utilizar. O C++ é bastante usado\n" +
                "atualmente para desenvolver muitos programas para várias plataformas.");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("C2C");
        p.setDescription_words("Consumer to Consumer. Este é mais um dos termos da moda nos negócios on-line e aplica-se a\n" +
                "sites que promovem negócios entre os próprios usuários, como sites de classificados e os\n" +
                "tradicionais sites de leilões, como o Arremate, Mercado Livre, etc. que são o exemplo mais rico.\n" +
                "Outras siglas semelhantes são B2B (negócios entre empresas) e B2C (vendas diretas ao\n" +
                "consumidor).");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("C5X");
        p.setDescription_words("Este é mais um processador da Via/Cyrix, que será o sucessor do Erza (veja neste mesmo\n" +
                "dicionário). O C5X será produzido numa arquitetura de 0.13 mícron e trará um processador\n" +
                "aritmético melhorado. A versão inicial será lançada na segunda metade de 2002 e operará a 1.1\n" +
                "GHz, com a promessa de uma versão de 1.3 GHz até o final do mesmo ano. O C5X usará uma\n" +
                "arquitetura diferente da do Erza, com mais unidades de execução (mais desempenho) mas ao\n mesmo tempo mais estágios de pipeline (menor desempenho por ciclo em troca da possibilidade\n" +
                "de atingir frequências de operação mais altas), um total de 16, contra os 12 do Erza. Outra\n" +
                "novidade será a inclusão de um cache L2 de 256 KB (o Erza tem apenas 64 KB).");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("C5XL");
        p.setDescription_words("Será uma versão simplificada do C5XC, que trará apenas metade das unidades de execução e\n" +
                "apenas 64 KB de cache L2. Este processador será bem mais barato e será capaz de operar a\n" +
                "frequências mais altas, até 1.5 GHz segundo a Cyrix. Em compensação o desempenho não será\n" +
                "dos melhores. Será uma alternativa de baixo custo e baixo consumo, que tem a chance de fazer\n" +
                "algum sucesso nos notebooks ou talvez até nos handhelds e outros portáteis");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("C5YL");
        p.setDescription_words("Será uma versão ainda mais simplificada do C5X, provavelmente sem o cache L2. Este\n" +
                "processador provavelmente será destinado a micros de mão e outros dispositivos portáteis, já\n" +
                "que o desempenho será muito fraco para ser usado em PCs.\n");
        modelPlantsMedicals.add(p);

        p = new Model_Dictionary_Words();
        p.setTitle_words("Cache");
        p.setDescription_words("Memória ultra rápida que armazena os dados e instruções mais utilizadas pelo processador,\n" +
                "permitindo que estas sejam acessadas rapidamente. O cache passou a ser utilizado a partir dos\n" +
                "micros 386, quando os processadores começaram a tornar-se mais rápidos que a memória RAM.\n" +
                "Quanto maior a quantidade, ou quanto maior a velocidade, maior será a eficiência do cache.\n" +
                "Geralmente o cache é divido em dois níveis, chamados de cache L1 (level 1) e cache L2. Um\n" +
                "Pentium III Coppermine, por exemplo, tem 32 KB de cache L1 e 256 KB de cache L2, ambos\n" +
                "operando na freqüência do processador. Alguns processadores, como o K6-3 e o Pentium 4 Xeon\n" +
                "utilizam também cache L3.");
        modelPlantsMedicals.add(p);


        return modelPlantsMedicals;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        if (id == R.id.app_bar_search){
        }
        return super.onOptionsItemSelected(item);
    }
}
