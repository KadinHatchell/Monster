package monster.Controller;

import monster.Model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster Henry;

	public MonsterController()
	{
		Henry = new MarshmallowMonster("Henry", 3.4, 2, false, 2, 0 );
	}
	public void start()
	{
		System.out.println("Here is my first monster " + Henry);
		System.out.println("My monster has this many eyes: " + Henry.getEyeCount());
		if(Henry.getEyeCount()> 3)
		{
			System.out.println("Woah that's a lot of eyes!!!!!! - Scary");
		}
	}

}
