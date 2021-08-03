class Sistema {
  Contas contas[];
  int num_contas;

  Sistema() { // polimorfismo de sobrecarga
    this.contas = new Contas[100];
    this.num_contas = 0;
  }

  Sistema(int num) {
    this.contas = new Contas[num];
    this.num_contas = 0;
  }

  public void criarContaXPTOBasic(int id) {
    this.contas[id-1] = new Basic(id-1);
    this.num_contas++;
  }
  
  public void criarContaXPTOPlus(int id) {
    this.contas[id-1] = new Plus(id-1);
    this.num_contas++;
  }

  public void criarContaXPTOExtreme(int id) {
    this.contas[id-1] = new Extreme(id-1);
    this.num_contas++;
  }

  void creditar(int id, double valor) { // polimorfismo de inclusão
    contas[id-1].creditar(id, valor);
  }

  void debitar(int id, double valor) { // polimorfismo de inclusão
    contas[id-1].debitar(id, valor);
  }

  double consultarSaldo(int id) {
    return this.contas[id-1].consultarSaldo();
  }
}

