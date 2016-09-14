package monster.Model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;

	public MarshmallowMonster()
	{
		this.name = "no name here";
		this.antennaCount = -23423.131235;
		this.eyeCount = -2345678;
		this.hasBellyButton = false;
		this.armCount = -32436;
		this.noseCount = -7765;
	}

	public MarshmallowMonster(String name, Double antennaCount, int eyeCount, Boolean hasBellyButton, int armCount,
			int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;

	}
	/*
	 * name = Henry
	 * armcount = 2
	 * eyecount = 2
	 * hasbellybutton = false
	 * antennacount = 3
	 * nosecount= 0
	 */

}
