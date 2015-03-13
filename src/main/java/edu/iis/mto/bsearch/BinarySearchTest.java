package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void binarySearch_search_oneElement_inSeq() {
		int[] seq = {5};
		
		SearchResult result = BinarySearch.search(5, seq);		
		assertThat(result.getPosition(), is(1));
		
	}
	
	@Test
	public void binarySearch_search_oneElement_notInSeq() {
		int[] seq = {2};
		
		SearchResult result = BinarySearch.search(5, seq);		
		assertThat(result.getPosition(), is(-1));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_firstInSeq() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(2, seq);		
		assertThat(result.getPosition(), is(1));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_lastInSeq() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(10, seq);		
		assertThat(result.getPosition(), is(seq.length));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_middleInSeq() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(8, seq);		
		assertThat(result.getPosition(), is(2));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_notInSeq() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(3, seq);		
		assertThat(result.getPosition(), is(-1));
		
	}

}
