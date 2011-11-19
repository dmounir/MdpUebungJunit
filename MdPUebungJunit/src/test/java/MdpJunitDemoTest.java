import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MdpJunitDemoTest {
	
	MdpJunitDemo demo;

	@Before
	public void setUp() throws Exception {
		demo = new MdpJunitDemo();
	}

	@Test
	public void testIsEmpty() {
		assertTrue(demo.isEmpty(""));
		assertTrue(demo.isEmpty(null));
		assertFalse(demo.isEmpty("ein string"));
	}

	@Test
	public void testCapitalize() {
		assertEquals("Gugus", demo.capitalize("gugus"));
		assertEquals("", demo.capitalize(""));
		assertEquals("Gugus", demo.capitalize("GUGUS"));
	}

	@Test
	public void testReverse() {
		assertEquals("dcba", demo.reverse("abcd"));
	}
	
	@Test(expected=NullPointerException.class)
	public void testReverse2() {
		demo.reverse(null);
	}

	@Test
	public void testJoin() {
		assertEquals("a b c d", demo.join("a", "b", "c", "d"));
		
	}

}
