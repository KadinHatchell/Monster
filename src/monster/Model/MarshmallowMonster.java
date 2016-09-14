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
	
	public String toString()
	{
		String description = "Name is " + this.name;
		
		return description;
	}
	public String getName()
	{
		return name;
	}
	public double antennaCount()
	{
		return antennaCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public boolean hasBellyButton()
	{
		return hasBellyButton;
	}
	public int armCount()
	{
		return armCount;
	}
	public int noseCount(){
		return noseCount;
	}

}
