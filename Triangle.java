public class Triangle {

	public static void main(String[] args) {
		String etoile=" ";
		for (int i=0;i<8;i++){
			int espace=8-i;
			for (int j=0;j<espace;j++){
				System.out.print(" ");
			}
			etoile=etoile+"* ";
			System.out.println(etoile);
		}

	}
}

/*c'est bon le pg fonctionne*/
