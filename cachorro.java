public class cachorro extends animal{
    private String pelagem;
    private int patas;


public cachorro(String Nome,String Especie,int Idade,String pelagem,int patas){
    super(Nome, Especie, Idade);
    this.pelagem = pelagem;
    this.patas = patas;

    @Override
    public void exibirInformacoes(){
        System.out.println("==== CACHORRO====");
         System.out.println("Nome :"+ Nome);
        System.out.println("Especie:"+ Especie);
        System.out.println("Idade:"+Idade);
        System.out.println("tipo de pelagem:"+ pelagem);
        System.out.println("Quantidade de patas:"+patas);
        

    
}
    }