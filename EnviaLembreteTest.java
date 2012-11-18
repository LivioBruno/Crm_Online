package TestClass;
import Model.Email;
import java.util.Calendar;
import junit.framework.TestCase;

/**
 * Classe para testar o envio de lembretes
 * extende TestCase do JUNIT
 * @author L.B.O
 */
public class EnviaLembreteTest extends TestCase{
    
    public void testValidaEmail() throws Exception{
        Email email = new Email();  
        email.setNomeEmail("teste@hotmail.com");
        assertTrue(email.validaEmail() == true);
    }
    
    public void testEnviarLembreteUmDiaAntes(){
        
        Calendar dataAtual    = Calendar.getInstance();
        Calendar dataEsperada = Calendar.getInstance();
        Email email           = new Email();
        
        //Representa a data e hora da atividade
        dataAtual.set(2012,11,18 , 11,00,00);
        //Atribuindo a tada e a hora
        dataEsperada.set(2012,11,17 , 11,00,00);
        
        email.setDataAtual(dataAtual);
        assertEquals(email.enviaUmDiaAntes(), dataEsperada);
    }
}

