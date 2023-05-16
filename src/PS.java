import org.testng.annotations.Test;

@Test
public class PS {

	public void testrun() {
		int a=3;
		PS1 ps=new PS1(3);
		System.out.println(ps.increment());
		System.out.println(ps.decrement());
		System.out.println(ps.multiplytwo());
		System.out.println(ps.multiplythree());
		
	}

}
