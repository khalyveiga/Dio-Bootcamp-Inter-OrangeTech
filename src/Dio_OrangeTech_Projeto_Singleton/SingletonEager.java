package Dio_OrangeTech_Projeto_Singleton;
/*
  Singleton Apressado
  --- Diferença do Singleton preguiçoso ---
  -- Logo quando a variavel estatica é criada ele já atribui a instancia.
 */
public class SingletonEager {
    // aqui está a diferença quando a classe for chamada por alguém ela automaticamente já instancia.

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        // E aqui já estará pronta pra ser chamada.
        return instancia;
    }
}

