package Model;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Class Email
 * @author L.B.O
 */
public class Email {
    
    private String nomeEmail;
    private Calendar dataAtual = Calendar.getInstance();

    public Calendar getDataAtual() {
        return dataAtual;
    }
    public void setDataAtual(Calendar dataAtual) {
        this.dataAtual = dataAtual;
    }
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
    
    /**
     * Retorna data com um dia antes da data atual
     * @return 
     */
    public Calendar enviaUmDiaAntes(){
        dataAtual.add(Calendar.DAY_OF_MONTH, -1);;
        return dataAtual;
    }
    
    public int isSabado(){
        int diaSemana = dataAtual.get(Calendar.DAY_OF_WEEK);
        return diaSemana;
    }
    
    public int isDomingo(){
        int diaSemana = dataAtual.get(Calendar.DAY_OF_WEEK);
        return diaSemana;
    }
    
    public boolean enviaDiaHoraEspecifica(){
        Calendar dataHoje = Calendar.getInstance();
        if(dataAtual == dataHoje )
            return true;
        return false;
    }
}



