package password_generator;

public class generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char password[] = new char[10];
		for(int i = 0; i < password.length; i++) {
			password[i] = rand();
			System.out.print(password[i]);
		}
		
	}

	private static char rand() {
		int i = (int)(Math.random() * 62);
		if(i <= 9)
			return (char)(i + 48);
		else if(i <= 35) 
			return (char)(i - 10 + 65);
		else 
			return (char)(i - 36 + 97);
	}

}
