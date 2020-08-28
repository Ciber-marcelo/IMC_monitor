class TesteSimples {

  public void executar(){

  Atleta atleta = new Atleta();
  atleta.setNome("Poderoso Castiga");
  atleta.setIdade(40);

  System.out.println("Nome = " + atleta.getNome());
  System.out.println("Idade = " + atleta.getIdade());

  }
}