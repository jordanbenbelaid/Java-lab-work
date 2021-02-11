
public class Main {

	public static void main(String[] args) {
		
		// object Animal passing through object lumbs with value, so can straight away use get methods
		Animal a = new Animal(new Limbs(4));
		a.getLimbs().getNumOfLimbs();
		System.out.println(a.getLimbs().getNumOfLimbs());
		
		
		//making variable a3 of object Animal, and setting limbs
		Animal a3 = new Animal();
		a3.setLimbs(new Limbs(4));

		
		
		//2 different ways of setting limbs to 4 and then calling to get limbs from animals
		Limbs l = new Limbs(4);
		Animal a2 = new Animal(l);
		
		Limbs l2 = a.getLimbs();
		
		System.out.println(l.getNumOfLimbs());
		System.out.println(l2.getNumOfLimbs());
		
		
	}

}
