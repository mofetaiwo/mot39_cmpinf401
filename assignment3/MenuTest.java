package edu.pitt.menumanagerv3;

/**
 * Class MenuTest
 * @author mofetaiwo
 * Created: 10/03/2022
 */
public class MenuTest {

	public static void main(String[] args) {
		Entree e1 = new Entree("Nuggets", "Bite-sized pieces of boneless chicken breast, seasoned to perfection, freshly breaded and pressure cooked in 100% refined peanut oil. ", 160, 1);
		Entree e2 = new Entree("Chicken Sandwich", "A boneless breast of chicken seasoned to perfection, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttered bun with dill pickle chips.", 440, 1);
		
		Side si1 = new Side("Fruit Cup", "A nutritious fruit mix made with chopped pieces of red and green apples, mandarin orange segments, fresh strawberry slices, and blueberries, served chilled.", 60, 1);
		Side si2 = new Side("Potato Chips", "Kettle-cooked waffle cut potato chips Sprinkled with Sea Salt.", 220, 1);
		
		Salad sa1 = new Salad("Cobb Salad", "Nuggets, freshly breaded and pressure-cooked, sliced and served on a fresh bed of mixed greens, topped with roasted corn kernels, a blend of shredded Monterey Jack and Cheddar cheeses, crumbled bacon, sliced hard-boiled egg and grape tomatoes. Prepared fresh daily. Served with Charred Tomato and Crispy Red Bell Peppers. Pairs well with Avocado Lime Ranch dressing.", 600, 1);
		
		Dessert d1 = new Dessert("Chocolate Cookie", "Cookies have both semi-sweet dark and milk chocolate chunks, along with wholesome oats.", 370, 1);
		
		Menu m1 = new Menu("Nugget Meal", e1, si1);
		Menu m2 = new Menu("Chicken Sandwich Meal", e2, si2, sa1, d1);
		
		System.out.println(m1.getName() + "\nThere are " + m1.totalCalories() + " calories in this meal" + "\n" + m1.description() + "\n");
		
		System.out.print(m2.getName() + "\nThere are " + m2.totalCalories() + " calories in this meal" + "\n" + m2.description());
	}
}