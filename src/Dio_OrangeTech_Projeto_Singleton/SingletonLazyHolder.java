package Dio_OrangeTech_Projeto_Singleton;
/*
 Tem uma otimização de memória melhor!
 Ele encapsula a instancia em uma classe estatica interna.
 */
public class SingletonLazyHolder {

    // classe que encapsula a instancia.
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        // aqui não retorna a instancia diretamente chama a classe.instancia.
        return InstanceHolder.instancia;
    }
}


