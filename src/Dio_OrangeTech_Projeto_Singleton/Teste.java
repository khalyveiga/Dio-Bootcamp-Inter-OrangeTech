package Dio_OrangeTech_Projeto;

import Dio_OrangeTech_Projeto_Singleton.SingletonEager;
import Dio_OrangeTech_Projeto_Singleton.SingletonLazy;
import Dio_OrangeTech_Projeto_Singleton.SingletonLazyHolder;

/*
Para instanciar as classes Singleton não é possível chamar por new.
Precisa chamar pelo método.
 */
public class Teste {
    public static void main (String[] args){

        // Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        // vai imprimir o endereço de memória.
        System.out.println(lazy);
        // pegando uma nova instancia para ver o resultado
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        // Fazer o mesmo teste para as classes Eager e LazyHolder

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



    }
}
