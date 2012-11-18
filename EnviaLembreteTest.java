package TestClass;
import Model.Email;
import junit.framework.TestCase;

/**
 * Classe para testar o envio de lembretes
 * extende TestCase do JUNIT
 * @author L.B.O
 */
public class EnviaLembreteTest extends TestCase{
    
    public void testValidaEmail() throws Exception{
        Email email = new Email();  
        email.setNomeEmail("testehotmail.com");
        assertTrue(email.validaEmail() == true);
    }
}

