package Final;

public class FinalVariable {
	public final int constantA;
	public final float constantB;
	public final long constantC;
	public final String constantD;

	public FinalVariable() {
		constantA = 22;
		constantB = 22.5F;
		constantC = 222222222L;
		constantD = "Hello, I'm not changeable";
	}

	// final method can't be override
}
