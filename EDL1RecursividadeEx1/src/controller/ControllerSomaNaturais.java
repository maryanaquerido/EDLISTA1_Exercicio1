package controller;

public class ControllerSomaNaturais {
	public ControllerSomaNaturais(){
		super ();
	}
	
	public int SomaNaturais (int num) {
		if (num == 0) {
			return 0;
			
		}
		else {
			return num + SomaNaturais(num-1);
		}
	}
}

