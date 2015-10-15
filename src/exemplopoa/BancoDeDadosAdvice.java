package exemplopoa;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//O ASPECTO em Java pode ser definido através classe anotada com @Aspect
@Aspect()
public class BancoDeDadosAdvice {
    
    //@Before - ADVICE executado antes do Join Point
    //Definição do POINTCUT ("execution(public void inserirClientes*(..))")
    @Before("execution(public void inserirClientes*(..))")
    public void antesDoPointcut(){
        System.out.println("ABRIR conexão com o Banco de Dados");
    }
    //@After - ADVICE executado após o Join Point
    //Definição do POINTCUT ("execution(public void inserirClientes*(..))")
    @After("execution(public void inserirClientes*(..))")
    public void depoisDoPointcut(){
        System.out.println("FECHAR conexão com o Banco de Dados");
    }
    
}
