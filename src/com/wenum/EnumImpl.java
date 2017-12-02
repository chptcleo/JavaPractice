package com.wallace.wenum;

import java.util.Random;

public class EnumImpl {

	enum CartoonCharacter {
		SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOBO;
		Random random = new Random(47);

		CartoonCharacter next() {
			return values()[random.nextInt(values().length)];
		}
	}

	public static void main(String[] args) {
		CartoonCharacter cartoonCharacter = CartoonCharacter.NUTTY;
		for (int i = 0; i < 20; i++) {
			System.out.println(cartoonCharacter.next());
		}
	}

}
