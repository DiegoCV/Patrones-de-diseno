
package patrones.singleton;

public class Singleton {

    private static Singleton instance;
    
    private Singleton(){}
    
    //Si se trabaja dentro de un ambiente de multiprocesos es comveniente uitlizar el synchronized
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
