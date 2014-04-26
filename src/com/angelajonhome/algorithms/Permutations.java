package com.angelajonhome.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


/**
 * 
 * 
 * @param <enumeration>
 */
public class Permutations<T> implements Iterable<List<T>>, Iterator<List<T>> {  

	private final List<T> inputSet;
	private final int inputSetSize;

	public Permutations( Set<T> set ) {
		// FIXME Handle a null input set.
		this.inputSet = new ArrayList<T>( set );
		this.inputSetSize = set.size();
	}

	public Permutations( List<T> set ) {
		// TODO Filter null values and dupe values.
		if ( set instanceof ArrayList ) { 
			this.inputSet = set;			
		} else { 
			this.inputSet = new ArrayList<T>( set );			
		}
		this.inputSetSize = set.size();
	}

	public Permutations( T[] enumeration ) {
		// FIXME Handle a null input set.
		List<T>set = new ArrayList<T>( Arrays.asList( enumeration ) );
		this.inputSet = set;			
		this.inputSetSize = set.size();
	}

	@Override
	public Iterator<List<T>> iterator() {		

		if ( inputSet == null || !(inputSetSize > 0) ) { 
			return new ArrayList<List<T>>().iterator();
		}

		// Return this instance as the iterator. We'll calculate the permutations one at a time.
		return this;		
	}

	private int currentPathIndex = -1;

	public List<T> next() { 
		return generateNextPermutation(++currentPathIndex, null, null, -1);
	}
	
	public boolean hasNext() {
		// consider storing this internally, if the calculation is expensive.
		return ( currentPathIndex < factorial(inputSetSize) -1 );
	}
	
	public void remove() { 
		throw new UnsupportedOperationException("The Permutations class doesn't support modifications to the source set or the calculated permutations."); 
	}
	
	private List<T> generateNextPermutation( int pathIndexToBuild, List<T> currentPath, LinkedList<T> available, int remainder ) {

		if ( currentPath == null || available == null ) {
			currentPath = new ArrayList<T>( inputSetSize );
			available = new LinkedList<T>( inputSet );
			remainder = pathIndexToBuild;
		}
		
		if ( available.size() == 1 ) { 
			currentPath.add( available.get(0) );
			return currentPath;
		}

		int levelWidth = factorial( available.size() - 1);
		int levelShift = (int) Math.floor( remainder / levelWidth );

		currentPath.add( available.remove(levelShift) );

		return generateNextPermutation(pathIndexToBuild, currentPath, available, remainder - (levelShift*levelWidth) );
	}

	protected int factorial( int inputSetSize ) {
		int result = inputSetSize;
		for ( int i = inputSetSize -1; i > 1; i-- ) { 
			result *= i;
		}
		return result;
	}

}

