package entidades;

public class Contato {
    private String email;
    private String fixo;
    private String celular;

    public Contato(String celular){
        setCelular(celular);
    }
    
    public Contato(String email, String fixo, String celular) {
        this.setLogradouro(logradouro);
        this.setNome(nome);
        setNumero(numero);
        setCep(cep);
        this.setCidade(cidade);
        this.setUf(uf);
        this.setBairro(bairro);
    }

 
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

    public String toString(){
        return super.toString() + "\"celular\":" + "\"" + getCelular() + "\"";
    }
    
  

    
}
