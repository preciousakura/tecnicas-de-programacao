class Basic extends Contas{
  int id;
  
  Basic(int id){
    this.id = id;
    this.saldo = 0;
  }

  public void debitar(int identificador, double valor){
    this.setSaldo(this.saldo - valor);
  }

  public void creditar(int identificador, double valor) { 
    this.setSaldo(valor); 
  }
  void setSaldo(double saldo){
    this.saldo = saldo;
  }
  public String toString() {
    return "("+"Tipo: Basic | Id:"+ this.id +" | Saldo:"+ this.saldo+")"; 
  } 

}