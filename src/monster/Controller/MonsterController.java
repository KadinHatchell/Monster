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
	}

}
