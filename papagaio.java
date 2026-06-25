public class papagaio extends animal {
    private String bico;
    private String pena;
    private String asa;

public papagaio(String Nome,String Especie,int Idade,String bico,String pena,String asa){
    super(nome,Especie,idade);
    this.bico = bico;
    this.pena = pena;
    this.asa = asa;

@Override
public void exibirInformacoes(){
    System.out.println("====PAPAGAIO====");
    System.out.println("NOME:"+ Nome);
    System.out.println("Especie:"+ Especie);
    System.out.println("Idade:"+ Idade);
    System.out.println("Bico:"+ bico);
    System.out.println("Pena:"+ pena);

    
}
}
