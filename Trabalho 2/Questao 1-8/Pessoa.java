class Pessoa{
  String nome;
  int idade;

  Pessoa(String pnome, int idadep){
    setNome(pnome);
    setIdade(idadep);
  }
  
  void setNome(String pnome){
    nome = pnome;
  }
  String getNome(){
    return nome;
  }

  void setIdade(int idadep){
    idade = idadep;
  }

  int getIdade(){
    return idade;
  }
   
}