import entidades.*;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente obj1 = new Cliente("000000000-00");
        obj1.setNome("Joaquim");
        obj1.getDocumento().setRg("123456789");
        obj1.getDocumento().setCnh("789456123");
        obj1.getContato().setCelular("5555-66666");
        obj1.getContato().setEmail("cliente@email.com");
        obj1.getContato().setFixo("2356-5698");
        obj1.getEndereco().setCidade("Fanca");
        obj1.getEndereco().setUf("SP");
        obj1.getEndereco().setBairro("Centro");
        obj1.getEndereco().setLogradouro("Rua das Candobas");
        obj1.getEndereco().setCep("14520-568");
        obj1.getEndereco().setNome("Casa dos pais");

        Funcionario fun1 = new Funcionario("000000000-00");
        fun1.setNome("Severino");
       
        // System.out.println("---Funcionario---");
        // Util.info(fun1);

        System.out.println("---Cliente---");
        Util.info(obj1);
    }
    
}
