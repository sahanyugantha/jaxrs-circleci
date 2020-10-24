package jaxrsci.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sahan.jaxrsci.dao.PostDao;

public class PostTest {
	
	@Test
	public void numOfPosts() {
		PostDao postDao = new PostDao();
		
		int expected = 3;
		int actual = postDao.fakeDbList().size();
		
		assertEquals(expected, actual);
		
	}

}
