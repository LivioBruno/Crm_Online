package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Class Email
 * @author L.B.O
 */
public class Email {
    
    private String nomeEmail;

    public String getNomeEmail() {
        return nomeEmail;
    }

    public void setNomeEmail(String nomeEmail) {
        this.nomeEmail = nomeEmail;
    }
    
    /**
     * Método para validar email
     * @return true caso email seja válido.
     */
    public boolean validaEmail(){

        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
        Matcher m = p.matcher(this.nomeEmail); 
        if (m.find()){
          return true;
        }
        else{
          return false;
        }  
    }
}



