package entidades;



public class Cliente extends PessoaFisica {

   private int scoreCredito;

   public Cliente(String cpf){
        super (cpf);
   }

   public int getScoreCredito() {
       return scoreCredito;
   }

   public void setScoreCredito(int scoreCredito){
       this.scoreCredito = scoreCredito;
   }
  
}
