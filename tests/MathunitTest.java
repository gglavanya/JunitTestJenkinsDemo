import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class MathunitTestcase {
    MathUtils  mu = new MathUtils();
	@Test
	public void add()
	{
		 assertEquals(5,mu.add(3,2));
	}
	
	@Test
	public void subtract()
	{
		 assertEquals(1,mu.subtract(3, 2));
	}
	
	@Test
	public void multiply()
	{
		 assertEquals(6,mu.multiply(3, 2));
	}
	
	@Test
	public void divide()
	{
		 assertEquals(2.0, mu.divide(6, 3),0.001);
		 assertEquals(-1.0, mu.divide(1, 0),0.01);
	}
	
}
	
  
