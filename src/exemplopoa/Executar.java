package exemplopoa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executar {

    public static void main(String[] args) {
        //Recebe o contexto da aplicação baseado no XML de configuração
        ApplicationContext contexto = new 
        ClassPathXmlApplicationContext("exemplopoa/spring-aop-config.xml");
        CadastroClientes cadastroClientes = 
                (CadastroClientes) contexto.getBean("cadastroClientes");
        
        /*Devido ao método inserirClientes() estar mapeado como JOIN POINT
          Ao ser chamado ele executa os Advices correspondentes*/
        cadastroClientes.inserirClientes();
    }
    
}
