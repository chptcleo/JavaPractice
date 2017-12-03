package com.wenum;

import java.util.Random;

public class Meal {

	interface Food {
		enum Appetizer implements Food {
			SALAD, SOUP, SPRING_ROLLS;
		}

		enum MainCourse implements Food {
			LASGANE, BURRITO, PADtHAR;
		}

		enum Dessert implements Food {
			FRUIT, CREME, GELATO;
		}

		enum Coffee implements Food {
			LATTE, TEA, ESPRESSO;
		}
	}

	enum Course {

		APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), Dessert(
				Food.Dessert.class), COFFEE(Food.Coffee.class);

		private Food[] values;

		private Course(Class<? extends Food> kind) {
			values = kind.getEnumConstants();
		}

		Random random = new Random(47);

		Food randomSelection() {
			return values[random.nextInt(values.length)];
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			for (Course course : Course.values()) {
				Food food = course.randomSelection();
				System.out.println(food);
			}
			System.out.println("-------");
		}
	}

}
