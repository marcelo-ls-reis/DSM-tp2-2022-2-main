package entidades;

public class Contato{
    private String email;
    private String fixo;
    private String celular;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFixo() {
        return fixo;
    }
    public void setFixo(String fixo) {
        this.fixo = fixo;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    // public String toString(){
    //     return "{\"celular\":" + "\"" + getCelular() + "\"" + "," +
    //     "\"Fixo\":" + "\"" + getFixo() + "\"" + "," +
    //     "\"Email\":" + "\"" + getEmail() + "\"}";
    // }

    @Override
    public String toString(){
        return "{'Celular':'" + getCelular() + 
               "','Fixo':'" + getFixo() + 
               "','Email':'" + getEmail()+"'}"; 
    }    

}
