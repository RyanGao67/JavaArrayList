package myArrayList;


interface Moveable
{
 	int AVG_SPEED=40;
 	void move();

}

// final variable has to be initialized
// 1. initialize when declaring public final int a =10
// 2. initialize in constructor(in all instructors)

//Methods inside Interface must not be static, final, native or strictfp.
//All variables declared inside interface are implicitly public static final variables(constants).
//All methods declared inside Java Interfaces are implicitly public and abstract, even if you don't use public or abstract keyword.
//Interface can extend one or more other interface.
//Interface cannot implement a class.
//Interface can be nested inside another interface.
class Testinterface implements Moveable
{
	public final int a;
	public Testinterface(){
		a = 10;
	}
 	public void move()
 	{
  		System.out.println("Average speed is"+AVG_SPEED);
 	}
 	public static void main (String[] arg)
 	{
  		Testinterface vc = new Testinterface();
  		vc.move();
 	}
}