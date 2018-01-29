
package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
	List<String> ll = new ArrayList<>();
	ll.add("saaaaalaaaaam");

	for (String l:ll){
		System.out.println(">>>>"+l);
	}
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
    }
}
