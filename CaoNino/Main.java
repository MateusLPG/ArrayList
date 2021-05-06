package CaoNino;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main{    
    public static void main(String[] args) throws ParseException {

        int opc3;
        String saudeCachorro;
        double peso;                    

        

        ArrayList<Adoções> adoções = new ArrayList<Adoções>();
        ArrayList<Canino> caes = new ArrayList<Canino>();
        ArrayList<Pessoa> adotante = new ArrayList<Pessoa>();
        ArrayList<FichaAdoção> ficha = new ArrayList<FichaAdoção>();
        ArrayList<Gerencia> gerencia = new ArrayList<Gerencia>();

        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);
        
        /*0*/caes.add(new Canino("Kate", "12/06/2009", "Vira-Lata", "Preta", 35));
        /*1*/caes.add(new Canino("Pitty", "02/03/2007", "Pitbull", "Branca", 38));
        /*2*/caes.add(new Canino("Kelly", "08/05/2001", "Vira-Lata", "Amarela", 35));
        /*3*/caes.add(new Canino("Peixe", "09/11/2008", "Vira-Lata", "Amarela", 20));
        /*4*/caes.add(new Canino("Geazi", "12/12/2012", "Pastor", "Amarela", 18));
        /*5*/caes.add(new Canino("Bob", "09/10/2010", "Bulldog", "Preta", 22));

        //ficha.add(new FichaAdoção(cao, pessoa, data, tempoAdotado, raça))
        ficha.add(new FichaAdoção(caes.get(0), new Pessoa("Diana", "Rua Endereço", 11111111, "email@email.com", "f", caes.get(0).getNome()), "24/12/2010", 560, "Vira-Lata" ));
        ficha.add(new FichaAdoção(caes.get(1), new Pessoa("Louis", "endereço", 22222222, "email@email.com", "m", caes.get(1).getNome()), "20/03/2011", 1479, "Pitbull"));
        ficha.add(new FichaAdoção(caes.get(2), new Pessoa("Bruce", "endereço", 33333333, "email@email.com", "m", caes.get(2).getNome()), "18/06/2007", 100, "Vira-Lata"));
        ficha.add(new FichaAdoção(caes.get(3), new Pessoa("Clark", "endereço", 4444444, "email@email.com", "m", caes.get(3).getNome()), "01/09/2002", 100, "Vira-Lata"));

        System.out.println("\n1 - Adotar Cão\n2 - Ver todos os cães\n3 - Substituir adotante\n4 - Checar se existe cachorro com o nome\n5 - Cachorro mais pesado\n6 - Cachorro com mais tempo adotado\nEscolha sua opção: ");
        int opc1 = teclado2.nextInt();

        while (opc1 != 7){
            //switch(opc1){

                if (opc1 ==1) {

                    System.out.println("Insira o seu nome: ");
                    String nomeP = teclado.nextLine();

                    System.out.println("Insira o seu endereço: ");
                    String endP = teclado.nextLine();

                    System.out.println("Insira o seu telefone: ");
                    long telP = teclado2.nextLong();

                    System.out.println("Insira o seu email: ");
                    String emailP = teclado.nextLine();

                    System.out.println("Insira o seu sexo: (m/f)");
                    String sexoP = teclado.nextLine(); 

                    System.out.println("\n" + "Cães disponíveis para adoção:");
                    
                    for (int i = 0; i < caes.size(); i++){
                        
                        boolean contains = false;

                        for (int j = 0; j < ficha.size(); j++){
                            if (caes.get(i).getNome() == ficha.get(j).getCao().getNome()){
                                contains = true;
                                break;
                            }
                        }
                        if (contains == false){
                            System.out.println(i + " - " + caes.get(i).getNome());
                        }
                    }
            
                    System.out.println("Escolha o número do cachorro: ");
                    int opc = teclado2.nextInt();

                    System.out.println("Data de adoção: ");
                    String dataAdoção = teclado.nextLine();

                    //pegando as datas em String e transformando em Date
                    Date dateAgora = new Date();
                    Date dateEntradaNova = new SimpleDateFormat("dd/MM/yyyy").parse(caes.get(opc).getEntrada());
                    Date dateAdocao = new SimpleDateFormat("dd/MM/yyyy").parse(dataAdoção);
                
                    //Convertendo de Date para LocalDate para assim poder ver o periodo usando DAYS.between
                    LocalDate localDateAgora = dateAgora.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    LocalDate localDateEntrada = dateEntradaNova.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                    LocalDate localDateAdocao = dateAdocao.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                    
                    //Armazenando diferença de dias
                    long periodoAdoção = ChronoUnit.DAYS.between(localDateAdocao, localDateAgora);
                    long periodoONG = ChronoUnit.DAYS.between(localDateEntrada, localDateAdocao);

                    if (dateAdocao.before(dateEntradaNova)){
                        System.out.println("Data de adoção inválida.");
                        break;
                    }
                    else {
                        //Criando objeto FichaAdoção, com o cachorro e quem está adotando.
                        ficha.add(new FichaAdoção(caes.get(opc), new Pessoa(nomeP, endP, telP, emailP, sexoP, caes.get(opc).getNome()), dataAdoção, periodoAdoção, caes.get(opc).getRaca()));
                    }
                    //Criando objeto Pessoa, no caso a pessoa a adotar o doguinho
                    adotante.add(new Pessoa(nomeP, endP, telP, emailP, sexoP, caes.get(opc).getNome()));              
                            
                    System.out.println("Você adotou o: " + caes.get(opc).getNome());
                    System.out.println("Sua ficha: " + ficha.get(ficha.size() - 1));

                    peso = caes.get(opc).getPeso();
                    
                    if(peso <= 20){
                        saudeCachorro = "Desnutrido";
                    }
                    else if(peso > 21 && peso <= 30){
                        saudeCachorro = "Normal";
                    }
                    else {
                        saudeCachorro = "Obeso";
                    }
                    
                    //Guarda informações da gerencia
                    gerencia.add(new Gerencia(caes.get(opc), periodoONG, saudeCachorro, periodoAdoção));

                    for(Gerencia g : gerencia){
                        System.out.println(g);
                    }   
                    
                    adoções.add(new Adoções(caes.get(opc).getNome(), periodoAdoção, caes.get(opc).getRaca()));

                    System.out.println("\n1 - Adotar Cão\n2 - Ver todos os cães\n3 - Substituir adotante\n4 - Checar se existe cachorro com o nome\n5 - Cachorro mais pesado\n6 - Cachorro com mais tempo adotado\nEscolha sua opção: ");
                    opc1 = teclado2.nextInt();

                    
                }//opc1 == 1

                else if (opc1 == 2){

                    for (Canino c : caes){
                        System.out.println("Nome: " + c);
                    }

                    System.out.println("\n1 - Adotar Cão\n2 - Ver todos os cães\n3 - Substituir adotante\n4 - Checar se existe cachorro com o nome\n5 - Cachorro mais pesado\n6 - Cachorro com mais tempo adotado\nEscolha sua opção: ");
                    opc1 = teclado2.nextInt();

                }//opc1 == 2

                else if (opc1 == 3){

                    System.out.println("Substituir nome");
                    System.out.println("Selecione o número da ficha: ");
                    for (int i = 0; i < ficha.size(); i++){
                        System.out.println(i +" - "+ ficha.get(i));
                    }
                    System.out.println("selecione o número da ficha: ");
                    opc3 = teclado2.nextInt();

                    System.out.println("Insira o novo nome: ");
                    String novoNome = teclado.nextLine();

                    System.out.println("Novo endereço: ");
                    String novoEnd = teclado.nextLine();

                    System.out.println("Novo número: ");
                    long novoTel = teclado2.nextLong();

                    System.out.println("Novo email: ");
                    String emailNovo = teclado.nextLine();

                    System.out.println("Sexo: m/f ");
                    String novoSexo = teclado.nextLine();

                    ficha.get(opc3).setPessoa(new Pessoa(novoNome, novoEnd, novoTel, emailNovo, novoSexo, ficha.get(opc3).getCao().getNome()));

                    System.out.println("Cadastro atualizado: " + ficha.get(opc3));

                    System.out.println("\n1 - Adotar Cão\n2 - Ver todos os cães\n3 - Substituir adotante\n4 - Checar se existe cachorro com o nome\n5 - Cachorro mais pesado\n6 - Cachorro com mais tempo adotado\nEscolha sua opção: ");
                    opc1 = teclado2.nextInt();
                }//opc1 == 3

                else if (opc1 == 4){
                    System.out.println("Insira o nome do cachorro a ser pesquisado: ");
                    String nomePesquisa = tecladoString.nextLine().toUpperCase();

                    for (int i = 0; i < caes.size(); i++){
                        
                        if (caes.get(i).getNome().toUpperCase().equals(nomePesquisa.toUpperCase().trim())){
                            System.out.println(nomePesquisa + " existe nos nossos registros.");
                            break;
                        }
                        else{
                            System.out.println(nomePesquisa + " NÃO existe nos nossos registros.");
                            break;
                        }
                    }  
                }//opc1 == 4

                else if (opc1 == 5){
                    
                    double maiorPeso = 0;
                    int index = 0;

                    for (int i = 0; i < caes.size(); i++){

                        if(caes.get(i).getPeso() > maiorPeso){

                            maiorPeso = caes.get(i).getPeso();
                            index = i;
                        }
                    }

                    System.out.println(caes.get(index).getNome() +" - " + maiorPeso + "\n");
                    System.out.println("\n1 - Adotar Cão\n2 - Ver todos os cães\n3 - Substituir adotante\n4 - Checar se existe cachorro com o nome\n5 - Cachorro mais pesado\n6 - Cachorro com mais tempo adotado\nEscolha sua opção: ");
                    opc1 = teclado2.nextInt();
                }//opc1 == 5

                else if(opc1 == 6){

                    System.out.println("Cachorro com mais tempo de adotado:");

                    int index = 0;
                    long diasMaior = 0;

                    for (int i = 0; i < ficha.size(); i++){

                        if (ficha.get(i).getTempoAdotado() > diasMaior){

                            diasMaior = ficha.get(i).getTempoAdotado();
                            index = i;

                        }
                        
                    }
                    
                    System.out.println("O cão adotado adotado há mais tempo é " + ficha.get(index).getCao().getNome() + ", " + diasMaior + " dias");


                    System.out.println("\n1 - Adotar Cão\n2 - Ver todos os cães\n3 - Substituir adotante\n4 - Checar se existe cachorro com o nome\n5 - Cachorro mais pesado\n6 - Cachorro com mais tempo adotado\nEscolha sua opção: ");
                    opc1 = teclado2.nextInt();
                    
                }
                    
        }//while
 
        System.out.println("Encerrando.");

    
    }//main
}//class
