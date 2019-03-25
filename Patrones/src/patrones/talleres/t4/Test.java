package patrones.talleres.t4;

public class Test{
	private Objeto_Proxy persona;

	public Test(){
		persona = new Objeto_Proxy();
		persona.saludar();
		persona.decirEstado();
		persona.despedirse();
	}
        
        public static void main(String[] args){
		Test test = new Test();
                
	}
}