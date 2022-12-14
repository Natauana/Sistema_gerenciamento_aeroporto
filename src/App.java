import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Pessoa pe = new Pessoa();
        Funcionario fun = new Funcionario();
        Passageiro passg = new Passageiro();
        Endereco ende = new Endereco();
        Endereco_Origem  end_ori = new Endereco_Origem();
        Endereco_Destino  end_des = new Endereco_Destino();
        Aeroporto aerop = new Aeroporto ();
        Voo  vo = new Voo ();
        Aviao  avi1 = new Aviao();
        Piloto pilo = new Piloto();
        Agencia  ag = new Agencia();
        //Passagem pass = new Passagem();
        ClasseEconomica classeco = new ClasseEconomica();
        ClasseExecutiva classexe = new ClasseExecutiva();
        PrimeiraClasse priclass = new PrimeiraClasse();

        //int op = 0;
        Scanner op = new Scanner(System.in);
        int opcao=0;
        Scanner oop = new Scanner(System.in);
        int opcao1=0;
        Scanner opilo = new Scanner(System.in);
        int opcao2 = 0;
     


        while(opcao!=3)
        {
            System.out.println("Escolha uma opção no qual voce se encaixa: \n 1-Passageiro \n 2-Funcionario \n 3-Sair");
            opcao = op.nextInt();
            

            if(opcao == 1 )
            {

                System.out.println("Informe o id do passageiro: ");
                passg.setId_pessoa(sc.nextInt());

                System.out.println("Informe CPF o passageiro: ");
                passg.setCpf(sc.nextInt());

                sc.nextLine();
                System.out.println("Informe o Nome  do passageiro: ");
                passg.setNome(sc.nextLine());
                
                System.out.println("Informe o numero do cartão do passageiro: ");
                passg.setNumero_cartao(sc.nextInt());
            
                sc.nextLine();
                System.out.println("Escreva o numero do Passaporte: ");
                passg.setPassaporte(sc.nextLine()); 
            }
            if(opcao==2)
            {
                System.out.println("Informe o id do funcionario: ");
                fun.setId_pessoa(sc.nextInt());

                System.out.println("Informe CPF o funcionario: ");
                fun.setCpf(sc.nextInt());

                sc.nextLine();
                System.out.println("Informe o Nome  do funcionario: ");
                fun.setNome(sc.nextLine());

                System.out.println("Informe as horas trabalhadas desse funcinario: ");
                fun.setHoras_trabalho(sc.nextDouble()); 

                while(opcao2 != 2){

                    System.out.println("Informe se voce é piloto ou não? \n 1-Sim \n 2-Não");
                    opcao2 = opilo.nextInt();
                    
                    if(opcao2 == 1){
                        sc.nextLine();
                        System.out.println("Informe o codigo do piloto: ");
                        pilo.setCod_piloto(sc.nextLine());

                    }
                    if(opcao2 == 2){
                        System.exit(0);
                    }
                }

            }
            if(opcao==3){
                System.exit(0);
            }
        }

                //ENDERECO

                System.out.println("Informe o seu numero da casa: ");
                ende.setCasa_numero(sc.nextInt());
        
                sc.nextLine();
                System.out.println("Informe o nome da Rua onde a pessoa reside: ");
                ende.setRua(sc.nextLine());
        
                sc.nextLine();
                System.out.println("Informe o nome da Rua onde a pessoa reside: ");
                ende.setBairro(sc.nextLine());

            
            //ENDEREÇO DE ORIGEM
            
            sc.nextLine();
            System.out.println("Informe a origem da viagem: ");
            end_ori.setOrigem(sc.nextLine());

            //ENDEREÇO DE DESTINO
            
            sc.nextLine();
            System.out.println("Informe O destino da viagem: ");
            end_des.setDestino(sc.nextLine());
            
                //CLASESSSS

            while(opcao1 != 4)
                {
                System.out.println("Qual é sua classe da passagem? \n 1-Classe Economica \n 2-Classe Ececutiva \n 3-Primeira Classe \n 4-Sair");
                opcao1 = oop.nextInt();

                if(opcao1 == 1){
                    System.out.println("Informe o ID da sua passagem: ");
                    classeco.setId(sc.nextInt());
                
                    System.out.println("Informe o numero da sua passagem: ");
                    classeco.setNum_passagem(sc.nextInt());
                
                    sc.nextLine();
                    System.out.println("Informe o numero do seu assento: ");
                    classeco.setAssento(sc.nextLine());
    
                    System.out.println("Qual é a data da viagem: ");
                    classeco.setDt_viagem(sc.nextDouble());
                
                    System.out.println("Escreva o valor da passagem:  ");
                    classeco.setPreco(sc.nextDouble());
                  
                    System.out.println("Por ser da classe economica vc terar desconto de 20% a cada compra da passagem de origem e destino");

                }
                if(opcao1 == 2){

                    System.out.println("Informe o ID da passagem: ");
                    classeco.setId(sc.nextInt());
                
                    System.out.println("Informe o numero da passagem: ");
                    classeco.setNum_passagem(sc.nextInt());
                
                    sc.nextLine();
                    System.out.println("Informe o numero do seu assento: ");
                    classeco.setAssento(sc.nextLine());
    
                    System.out.println("Qual é a data da viagem: ");
                    classeco.setDt_viagem(sc.nextDouble());
                
                    System.out.println("Escreva o valor da passagem:  ");
                    classeco.setPreco(sc.nextDouble());
            
                    System.out.println("Por ser da classe executiva vc terar desconto de 10% a cada compra da passagem de ida e vinda do mesmo destino e acesso a pelo menos 2 bebidas e uma refeição durante o voo. ");


                if(opcao1== 3){

                    System.out.println("Informe o ID da passagem: ");
                    priclass.setId(sc.nextInt());
                
                    System.out.println("Informe o numero da passagem: ");
                    priclass.setNum_passagem(sc.nextInt());
                
                    sc.nextLine();
                    System.out.println("Informe o numero do seu assento: ");
                    priclass.setAssento(sc.nextLine());
    
                    System.out.println("Qual é a data da viagem: ");
                    priclass.setDt_viagem(sc.nextDouble());
                
                    System.out.println("Escreva o valor da passagem:  ");
                    priclass.setPreco(sc.nextDouble());
                
                System.out.println("Por ser da primeira classe vc terar desconto de 5% a cada compra da passagem de ida e vinda, e acesso a open bar do voo");

                }

                if(opcao1 == 4)
                {

                   System.exit(0); 
                }
                }

        

        }
        //AEROPORTO

                sc.nextLine();
                System.out.println("Informe o nome do Aeroporto: ");
                aerop.setNomeAeroprto(sc.nextLine());
            
                sc.nextLine();
                System.out.println("Informe o Codigo do Aeroporto: ");
                aerop.setCodAeroporto(sc.nextLine());

                System.out.println("Qual é o telefone do Aeroporto: ");
                aerop.setTelefoneAeroporto(sc.nextInt());

        //VOO
                System.out.println("Informe o dia do voo: ");
                vo.setDiaVoo(sc.nextDouble());

                System.out.println("Informe o horário do Voo:");
                vo.setHorarioVoo(sc.nextDouble());

                System.out.println("Informe o horario de pouso do voo: ");
                vo.setHorarioPouso(sc.nextDouble());

        //AVIAO

        System.out.println("Qual é o id do Avião: ");
        avi1.setId(sc.nextInt());

        sc.nextLine();
        System.out.println("Informe o codigo do Avião: ");
        avi1.setCod_aviao(sc.nextLine());

        System.out.println("Informe a carga Avião: ");
        avi1.setCarga(sc.nextDouble());

        sc.nextLine();
        System.out.println("Qual é o nome da companhia aerea: ");
        avi1.setCia_aerea(sc.nextLine());

        sc.nextLine();
        System.out.println("Informe o numero de poltronas do avião: ");
        avi1.setPoutronas(sc.nextLine());

        System.out.println("Informe o numero de poltronas do avião ocupadas: ");
        avi1.setPoltronas_ocupadas(sc.nextInt());

        System.out.println("Informe o numero de poltronas do avião vazias: ");
        avi1.setPoltronas_vazias(sc.nextInt());

        //AGENCIA

        sc.nextLine();
        System.out.println("Informe o nome da Agencia: ");
        ag.setNomeAgencia(sc.nextLine());

        System.out.println("Informe o codigo da Agencia: ");
        ag.setCodAgencia(sc.nextInt());


    
}
}
