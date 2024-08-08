package view;
import controller.ControllerSomaNaturais;
public class PrincipalSomaNaturais {
	public static void main (String [] args) {
		
		ControllerSomaNaturais m = new ControllerSomaNaturais();
		int num = 5;
		int resp = m.SomaNaturais(num);
		System.out.println (resp);
		}
	}
