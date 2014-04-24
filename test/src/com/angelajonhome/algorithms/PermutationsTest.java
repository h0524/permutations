package com.angelajonhome.algorithms;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class PermutationsTest {

	@Test
	public void setEmptyTest() {
		Set<String> set = new HashSet<String>(4);
		
		Permutations<String> permutations = new Permutations<String>( set ); 

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}

		assertEquals(count, 0);
	}

	private enum fruit { APPLE, BANANA, CANTELOUPE } 

	@Test
	public void enum3Test() {
		
		Permutations<fruit> permutations = new Permutations<fruit>( fruit.values() ); 

		int count = 0;
		for ( List<fruit> permutation : permutations ) { 
			count++;
		}
	
	assertEquals(count, 6);  // 3! = 6
	}

	


	@Test
	public void list4Test() {
		List<String> set = new ArrayList<String>(4);
		set.add("apple");
		set.add("banana");
		set.add("canteloupe");
		set.add("durian");
		
		Permutations<String> permutations = new Permutations<String>( set );

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 24);  // 4! = 24
	}

	@Test
	public void list4OnDemandTest() {
		List<String> set = new ArrayList<String>(4);
		set.add("apple");
		set.add("banana");
		set.add("canteloupe");
		set.add("durian");

		Permutations<String> permutations = new Permutations<String>( set ); 
		permutations.generateOnDemand(true);

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			// TODO Confirm that all permutations are different, even when an unordered set is provided and the permutations are calculated on-demand.
			count++;
		}

		assertEquals(count, 24);  // 4! = 24
	}

	
		@Test
	public void list6Test() {
		// With more than 10-12 it will probably hit an OutOfMemoryError.
		List<String> items = new ArrayList<String>(6);
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");

		Permutations<String> permutations = new Permutations<String>( items );

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 720);  // 6! = 720
	}

		@Test
	public void list6OnDemandTest() {
		List<String> items = new ArrayList<String>(6);
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");

		Permutations<String> permutations = new Permutations<String>( items );
		permutations.generateOnDemand(true);

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 720);  // 6! = 720
	}

		@Test
		public void list8Test() {
			// With more than 10-12 it will probably hit an OutOfMemoryError.
			List<String> items = new ArrayList<String>(3);
			items.add("apple");
			items.add("banana");
			items.add("mango");
			items.add("pear");
			items.add("orange");
			items.add("cherry");
			items.add("kumquat");
			items.add("lychee");
		
			Permutations<String> permutations = new Permutations<String>( items );
		
			int count = 0;
			for ( List<String> permutation : permutations ) { 
				count++;
			}
			
			assertEquals(count, 40320);  // 8! = 40,320
		}


		@Test
		public void list8OnDemandTest() {
			// With more than 10-12 it will probably hit an OutOfMemoryError.
			List<String> items = new ArrayList<String>(3);
			items.add("apple");
			items.add("banana");
			items.add("mango");
			items.add("pear");
			items.add("orange");
			items.add("cherry");
			items.add("kumquat");
			items.add("lychee");
		
			Permutations<String> permutations = new Permutations<String>( items );
			permutations.generateOnDemand(true);
		
			int count = 0;
			for ( List<String> permutation : permutations ) { 
				count++;
			}
			
			assertEquals(count, 40320);  // 8! = 40,320
		}
		
		
	@Test
	public void list10Test() {
		// With more than 10-12 it will probably hit an OutOfMemoryError.
		List<String> items = new ArrayList<String>(3);
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");
		items.add("kumquat");
		items.add("lychee");
		items.add("melon");
		items.add("canteloupe");
		/*
		items.add("watermelon");
		items.add("strawberry");
		items.add("raspberry");
		items.add("blueberry");
		items.add("lemon");
		items.add("lime");
		items.add("blackberry");
		items.add("grape");
		items.add("avocado");
		items.add("guanabana");
		items.add("plantain");
		items.add("coconut");
		items.add("pineapple");
		items.add("kiwifruit");  */
	
		Permutations<String> permutations = new Permutations<String>( items );
	
		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 3628800);  // 10! = 3628800
	}

	@Test
	public void list10OnDemandTest() {
		List<String> items = new ArrayList<String>(3);
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");
		items.add("kumquat");
		items.add("lychee");
		items.add("melon");
		items.add("canteloupe");
		/*
		items.add("watermelon");
		items.add("strawberry");
		items.add("raspberry");
		items.add("blueberry");
		items.add("lemon");
		items.add("lime");
		items.add("blackberry");
		items.add("grape");
		items.add("avocado");
		items.add("guanabana");
		items.add("plantain");
		items.add("coconut");
		items.add("pineapple");
		items.add("kiwifruit");  */

		Permutations<String> permutations = new Permutations<String>( items );
		permutations.generateOnDemand(true);

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 3628800);  // 10! = 3628800
	}


	//@Test
	public void list12OnDemandTestHide() {
		// Too long to be part of manual unit test runs.
		List<String> items = new ArrayList<String>(3);
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");
		items.add("kumquat");
		items.add("lychee");
		items.add("melon");
		items.add("canteloupe");
		items.add("watermelon");
		items.add("strawberry");
/*		items.add("raspberry");
		items.add("blueberry");
		items.add("lemon");
		items.add("lime");
		items.add("blackberry");
		items.add("grape");
		items.add("avocado");
		items.add("guanabana");
		items.add("plantain");
		items.add("coconut");
		items.add("pineapple");
		items.add("kiwifruit");
 */
		Permutations<String> permutations = new Permutations<String>( items );
		permutations.generateOnDemand(true);

		long count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
//			System.out.print(count + ".");
		}

		assertEquals(count, 479001600L);  // 12! = 479,001,600 // 14! = 87,178,291,200
	}

	
	@Test
	public void set4Test() {
		Set<String> set = new HashSet<String>(4);
		set.add("apple");
		set.add("banana");
		set.add("canteloupe");
		set.add("durian");
		
		Permutations<String> permutations = new Permutations<String>( set );

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 24);  // 4! = 24
	}

	@Test
	public void set4OnDemandTest() {
		Set<String> set = new HashSet<String>(4);
		set.add("apple");
		set.add("banana");
		set.add("canteloupe");
		set.add("durian");

		Permutations<String> permutations = new Permutations<String>( set ); 
		permutations.generateOnDemand(true);

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			// TODO Confirm that all permutations are different, even when an unordered set is provided and the permutations are calculated on-demand.
			count++;
		}

		assertEquals(count, 24);  // 4! = 24
	}


	
	@Test
	public void set10Test() {
		// With more than 10-12 it will probably hit an OutOfMemoryError.
		Set<String> items = new HashSet<String>(3);
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");
		items.add("kumquat");
		items.add("lychee");
		items.add("melon");
		items.add("canteloupe");
		/*
		items.add("watermelon");
		items.add("strawberry");
		items.add("raspberry");
		items.add("blueberry");
		items.add("lemon");
		items.add("lime");
		items.add("blackberry");
		items.add("grape");
		items.add("avocado");
		items.add("guanabana");
		items.add("plantain");
		items.add("coconut");
		items.add("pineapple");
		items.add("kiwifruit");  */
	
		Permutations<String> permutations = new Permutations<String>( items );
	
		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 3628800);  // 10! = 3628800
	}

	@Test
	public void set10OnDemandTest() {
		Set<String> items = new HashSet<String>();
		items.add("apple");
		items.add("banana");
		items.add("mango");
		items.add("pear");
		items.add("orange");
		items.add("cherry");
		items.add("kumquat");
		items.add("lychee");
		items.add("melon");
		items.add("canteloupe");
		/*
		items.add("watermelon");
		items.add("strawberry");
		items.add("raspberry");
		items.add("blueberry");
		items.add("lemon");
		items.add("lime");
		items.add("blackberry");
		items.add("grape");
		items.add("avocado");
		items.add("guanabana");
		items.add("plantain");
		items.add("coconut");
		items.add("pineapple");
		items.add("kiwifruit");  */

		Permutations<String> permutations = new Permutations<String>( items );
		permutations.generateOnDemand(true);

		int count = 0;
		for ( List<String> permutation : permutations ) { 
			count++;
		}
		
		assertEquals(count, 3628800);  // 10! = 3628800
	}


}