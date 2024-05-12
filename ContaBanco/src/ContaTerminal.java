public class ContaTerminal {
    private int Numero;
    private String Agencia;
    private String NomeCliente;
    private float Saldo;

    public ContaTerminal(){
    }

    public ContaTerminal(int Numero, String Agencia, String NomeCliente, float Saldo){
        this.Numero=Numero;
        this.Agencia=Agencia;
        this.NomeCliente=NomeCliente;
        this.Saldo=Saldo;
    }

    public int getNumero(){
        return Numero;
    }
    
    public void setNumero(int Numero){
        this.Numero=Numero;
    }

    public String getAgencia(){
        return Agencia;
    }

    public void setAgencia(String Agencia){
        this.Agencia=Agencia;
    }

    public String getNomeCliente(){
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente){
        this.NomeCliente=NomeCliente;
    }

    public float getSaldo(){
        return Saldo;
    }

    public void setSaldo(float Saldo){
        this.Saldo=Saldo;
    }
    
    public void imprimir(){
        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque.");
    }

}
