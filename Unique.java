class  Unique
{
	public static void main(String[] args) 
	{

		int num=126634;
		while (num!=0)
		{
			int temp=num;
			int last=temp%10;
			temp/=10;
			while (temp!=0)
			{
				if (last!=temp%10)
				{
					temp/=10;
				}
				else
				{
					break;
				}
			}
			if (temp!=0)
			{
				break;
			}
			num/=10;
		}
		if (num==0)
		{
			System.out.println("Unique Number");
		}
		else
		{
			System.out.println("Not a Unique Number");
		}
	}
}