class Main
{

  public static void main(String args[])
  {
    Pessoa p1 = new Pessoa("Ana",29);
    //p1.setNome("Ana");
    Pessoa p2 = new Pessoa("João",25);
    //p2.setNome("João");
    //p1.setIdade(22);
    //p2.setIdade(23);

    System.out.println("Nome 1 : "+p1.getNome());
    System.out.println(p2.getNome());
    System.out.println("Idade 1: "+p1.getIdade());
    System.out.println("Idade 2: "+p2.getIdade());


  }
}