package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void binarySearch_search_oneElement_inSeq_expectedTrue() {
		int[] seq = {5};
		
		SearchResult result = BinarySearch.search(5, seq);		
		assertThat(result.getPosition(), is(1));
		assertThat(result.isFound(), is(true));
		
	}
	
	@Test
	public void binarySearch_search_oneElement_notInSeq_expectedFalse() {
		int[] seq = {2};
		
		SearchResult result = BinarySearch.search(5, seq);		
		assertThat(result.getPosition(), is(-1));
		assertThat(result.isFound(), is(false));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_firstInSeq_expectedTrue() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(2, seq);		
		assertThat(result.getPosition(), is(1));
		assertThat(result.isFound(), is(true));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_lastInSeq_expectedTrue() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(10, seq);		
		assertThat(result.getPosition(), is(seq.length));
		assertThat(result.isFound(), is(true));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_middleInSeq_expectedTrue() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(8, seq);		
		assertThat(result.getPosition(), is(2));
		assertThat(result.isFound(), is(true));
		
	}
	
	@Test
	public void binarySearch_search_manyElement_notInSeq_expectedFalse() {
		int[] seq = {2,8,10};
		
		SearchResult result = BinarySearch.search(3, seq);		
		assertThat(result.getPosition(), is(-1));
		assertThat(result.isFound(), is(false));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void binarySearch_search_emptySeq_expectedIllegalArgumentException() {
		int[] seq = {};
		SearchResult result = BinarySearch.search(3, seq);	
	}

}
