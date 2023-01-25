public class Student{
	
	public static void main(String[] args){
		
	}
	
	public void saveMethod(){
		
	}

	public void saveMethod1(){
		System.out.pritln("git stash example");
	}
	
	
	public int subject1,subject2,subject3;
	public int total,gained,percentage;
	public void  decideResult(){
		total=300;
		gained=subject1+subject2+subject3;
		percentage=gained/total*100;
		if(percentage>=85)
		{
			System.out.println("Distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("First Class");
		}
		esle if(percentage==35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}