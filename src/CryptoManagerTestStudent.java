import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CryptoManagerTestStudent {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("THIS TEST SHOULD SUCCEED"));
		assertFalse(CryptoManager.isStringInBounds("TEST SHOULD FAIL BECAUSE ~ IS OUTSIDE THE RANGE"));
		assertFalse(CryptoManager.isStringInBounds("This test should fail because of lowercase letters"));
	}

	@Test
	public void testcaesarEncryption() {
		assertEquals("WKLV#LV#DQRWKHU#WHVW",CryptoManager.caesarEncryption("THIS IS ANOTHER TEST", 3));
		assertEquals("DAHHK", CryptoManager.caesarEncryption("HELLO", 444));
	}
	
	@Test
	public void testcaesarDecryption() {
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.caesarDecryption("WKLV#LV#DQRWKHU#WHVW", 3));
		assertEquals("HELLO", CryptoManager.caesarDecryption("DAHHK", 444));
	}

	@Test
	public void testbellasoEncryption() {
		assertEquals("WU\\VR9F#N!RF88U-'HED", CryptoManager.bellasoEncryption("THIS IS ANOTHER TEST", "CMSC203"));
		                                                                                      
	}

	@Test
	public void testbellasoDecryption() {
		assertEquals("THIS IS ANOTHER TEST", CryptoManager.bellasoDecryption("WU\\VR9F#N!RF88U-'HED", "CMSC203"));

	}

}
