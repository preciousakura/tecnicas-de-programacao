public abstract class Contas {
  double saldo;
  public abstract void creditar(int id, double valor);
  public abstract void debitar(int id, double valor);
  double consultarSaldo(){
    return this.saldo;
  }
}