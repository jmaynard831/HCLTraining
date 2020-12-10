package dec10;

@FunctionalInterface
public interface intFunction {
    void applyAsDouble(int i);
    
   public default void test() {
    	System.out.println("DEFAULT");
    }
}
