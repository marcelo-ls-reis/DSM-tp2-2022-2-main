import entidades.*;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente obj1 = new Cliente("000000000-00");
        obj1.setNome("Joaquim");
        obj1.getDocumento().setRg("123456789");
        obj1.getDocumento().setCnh("789456123");
        obj1.getContato().setCelular("5555-66666");

        Funcionario fun1 = new Funcionario("000000000-00");
        fun1.setNome("Severino");
       
        // System.out.println("---Funcionario---");
        // Util.info(fun1);

        System.out.println("---Cliente---");
        Util.info(obj1);
    }
    
}
