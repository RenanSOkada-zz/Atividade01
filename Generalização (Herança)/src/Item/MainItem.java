package Item;

public class MainItem {

	public static void main(String[] args) {
		
		Item i = new Item( 123456789 , "Produtos Industriai");
		
		System.out.println(i);
		System.out.println("\n");		

		Livro l = new Livro (987654321, "bens de conveniência", "Machado de Assis");
		
		System.out.println(l);
		System.out.println("\n");
		
		Midia m = new Midia (121212121, "bens de conveniência", "Mk musicas", 4.20f);
		
		System.out.println(m);
		System.out.println("\n");
		
		CD cd = new CD(918273645, "bens de conveniência", "Sun Records", 41.44f, 13, "Johnny Cash" , "American Recordings");
		
		System.out.println(cd);
		System.out.println("\n");
		
		VHS vhs = new VHS(918371746 , "bens de conveniência", "-Sem gravadora-", 21.7f, "VHS Collection");
		
		System.out.println(vhs);
		System.out.println("\n");
	}

}
