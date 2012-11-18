package TestClass;
import Model.Email;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    
    public void testIsSabado(){

        //Representa a data da atividade
        Calendar dataAtividade = new GregorianCalendar(2012,11 - 1,17);      
        Email email = new Email();
        email.setDataAtual(dataAtividade);
        assertEquals(email.isSabado(), 7);
    }
    
    public void testIsDomingo(){

        //Representa a data da atividade
        Calendar dataAtividade = new GregorianCalendar(2012,11 - 1,21);      
        Email email = new Email();
        email.setDataAtual(dataAtividade);
        assertEquals(email.isDomingo(), 1);
    }
    
    public void testEnviarLembreteDiaHoraEspecifico(){
        
        Calendar dataAtual    = Calendar.getInstance();
        Email email           = new Email();
        
        //Representa a data e hora da atividade
        dataAtual.set(2012,11,18 , 11,00,00);
        
        email.setDataAtual(dataAtual);
        assertTrue(email.enviaDiaHoraEspecifica()== true);
    }
}

