package Dio_OrangeTech_Projeto_Singleton;

/*
 Projeto Singleton
 Código Singleton preguiçoso
 --- O que é um Singleton Preguiçoso ---
 -- é um Singleton que no primeiro momento não disponibiliza a instacia para o usuário --
 */
public class SingletonLazy {
    // criando uma instancia dele mesmo.

    private static SingletonLazy instancia;

    // para garantir que ninguém vai instanciar precisa criar um construtor.
    // E para o Singleton o construtor tem que ser privado.
    // E ai vai garantir que ninguém externamente consiga instanciar esse padrão de projeto.
    private SingletonLazy() {
        super();
    }

    // Para garantir que seja exposta para quem está chamando.
    // precisa criar um método público e estático.
    // ele vai retornar uma instancia dele mesmo.

    public static SingletonLazy getInstancia() {
        // vai retornar a instancia que existe estaticamente.
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
// assim garantimos que ninguém fora dessa classe ninguém possa instanciar
// e ela controla a própria instancia
// tem um método que expõe isso de maneira pública
// Padrão de implementação de um Singleton no modo Lazy.
