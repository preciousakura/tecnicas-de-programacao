class Conjunto {
  int[] conjunto;
  int tamanho;

  Conjunto(int[] vetor) { // cria o conjunto a partir de um vetor pre-definido
    CriarConjunto(vetor.length);
    for(int i = 0; i < vetor.length; i++) {
      inserirNoConjunto(vetor[i]);
    }
  }

  Conjunto(int n) { // cria o conjunto de tamanho n
    CriarConjunto(n);
  }

  int contar_elementos() { //conta os elementos do conjunto (elementos diferentes de -1)


    return this.tamanho;
  }

  int[] getConjunto() { // retorna o vetor dos conjuntos
    return this.conjunto;
  }

  void CriarConjunto(int n) { //cria conjunto de tamanho n e o preenche com -1
    this.conjunto = new int[n];
    this.tamanho = 0;
  }

  void inserirNoConjunto(int num){ // insere no conjunto um inteiro
    this.conjunto[this.tamanho] = num;
    this.tamanho++;
  }

  boolean verifPertinencia(int num){ // verifica a pertinencia de um elemento no conjunto
    for (int i = 0; i < this.tamanho; i++){
      if (this.conjunto[i] == num){
        return true;
      }
    }
    return false;
  }

  boolean subconjunto(Conjunto outro_conjunto){ // verifica se é subconjunto
    for (int i = 0; i < outro_conjunto.contar_elementos(); i++){
      if (!verifPertinencia(outro_conjunto.getConjunto()[i])){
        return false;
      }
    }
    return true;
  }
  
  boolean equivalencia(Conjunto outro_conjunto){ // verifica se os conjuntos são iguais
    for(int i = 0;i<outro_conjunto.contar_elementos();i++){
      if (!verifPertinencia(outro_conjunto.getConjunto()[i])){
        return false;
      }
    }
    return true;
  }


  Conjunto uniao(Conjunto outro_conjunto){ // uniao de dois conjuntos
    Conjunto uniao = new Conjunto(this.tamanho + outro_conjunto.contar_elementos());

    for(int i = 0; i < this.tamanho; i++){
      if(!uniao.verifPertinencia(this.conjunto[i])){
        uniao.inserirNoConjunto(this.conjunto[i]);
      }
    }

    for(int i = 0; i < outro_conjunto.contar_elementos();i++){
      if(!uniao.verifPertinencia(outro_conjunto.getConjunto()[i])){
        uniao.inserirNoConjunto(outro_conjunto.getConjunto()[i]);
      }
    }
    return uniao;
  }


  Conjunto intersecao(Conjunto outro_conjunto) { // intersecao de dois conjuntos
    Conjunto intersecao = new Conjunto(this.tamanho + outro_conjunto.contar_elementos());

    for(int i = 0; i < this.tamanho; i++) {
      for(int j = 0; j < outro_conjunto.contar_elementos(); j++) {
        if(this.conjunto[i] == outro_conjunto.getConjunto()[j] && !intersecao.verifPertinencia(this.conjunto[i])){
          intersecao.inserirNoConjunto(this.conjunto[i]);
        }
      }
    }
    return intersecao;
  }

  Conjunto diferenca(Conjunto outro_conjunto) { // diferenca entre conjuntos
    Conjunto intersecao = intersecao(outro_conjunto);
    Conjunto diferenca = new Conjunto(this.tamanho);

    for(int i = 0; i < this.tamanho; i++) {
      if(!intersecao.verifPertinencia(this.conjunto[i]))
        diferenca.inserirNoConjunto(this.conjunto[i]);
    }
    return diferenca;
  }
}
