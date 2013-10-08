package hq;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;


public class AppTest {

	@Test
	public void test1()
    {
		App sut = new App();
		int act = sut.sum(10, 20);
		assertThat(act, is(30));
    }

	@Test
	public void test2()
    {
		App sut = new App();
		int act = sut.sum(1, 2);
		assertThat(act, is(3));
    }
}
