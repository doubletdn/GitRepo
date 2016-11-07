package Sample;


public class abc {

	 public static void main(String[] args) throws Exception {
	 abc dongVat = new abc();
	 String[] tiengKeu = dongVat.getTiengKeu();
	 for (String keu : tiengKeu) {
	 System.out.println(keu);
	 }
	
	 }
	
	 public String[] getTiengKeu() {
	 return new String[] { "gau gau", "meo meo" };
	 }

//	public static void main(String[] args) throws Exception {
//		WebElement t = Interfaces.if_adminstratorLogin.getUsernameTextbox();
		
//		System.out.println(t.toString());
		
		
//	}
}
