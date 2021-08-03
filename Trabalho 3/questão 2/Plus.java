class Plus extends Contas{   
  int id;
  
  Plus(int id){
    this.id = id;
    this.saldo = 0;
  }

  public void debitar(int identificador, double valor) { 
    this.setSaldo(this.saldo - valor); 
  }

  public void creditar(int identificador, double valor) { 
    this.setSaldo(valor + (0.5/100) * valor); 
  }

  void setSaldo(double saldo){
    this.saldo = saldo;
  }
  

  public String toString() {
    return "("+"Tipo: Plus | Id:"+ this.id +" | Saldo:"+ this.saldo+")"; 
  } 
}