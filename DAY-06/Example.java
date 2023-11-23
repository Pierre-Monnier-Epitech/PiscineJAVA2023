
public class Example {
    public static void main(String[] args) {
	// ====== Exo 1 ====== //
//	Character perso = new TestCharacter("Jean-Luc");
//	System.out.println(perso.getName());
//	System.out.println(perso.getLife());
//	System.out.println(perso.getAgility());
//	System.out.println(perso.getStrength());
//	System.out.println(perso.getWit());
//	System.out.println(perso.getRPGClass());
//	perso.attack("my weapon");
	// ====== Exo 2 ====== //
//	Character warrior = new Warrior("Jean-Luc");
//	Character mage = new Mage("Robert");
//	warrior.attack("hammer");
//	mage.attack("magic");
	// ====== Exo 3 ====== //
//	Character test = new Warrior("Wario");
//	test.moveRight();
//	test.moveLeft();
//	test.moveForward();
//	test.moveBack();
	// ====== Exo 4 ====== //
	Warrior warrior = new Warrior("Jean-Luc");
	Mage mage = new Mage("Robert");
	warrior.moveRight();
	warrior.moveLeft();
	warrior.moveBack();
	warrior.moveForward();
	mage.moveRight();
	mage.moveLeft();
	mage.moveBack();
	mage.moveForward();
	// ====== Exo 5 ====== //
	// Character test = new Warrior("Bobby");
	// test.unsheathe();
    // }
}
}