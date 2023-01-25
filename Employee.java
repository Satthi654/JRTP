public class Employee{
	
	public static void main(String[] args){
		
	}
	
	boolean button=false;
	public boolean handleVisibility(){
		if(button==true)
		{
			return button=true;
		}
		else
		{
			return button=false;
		}
	}
	public void performSubmit(){
		if(con==nul)
		{
			initDb();
		}
		if(con!=null)
		{
			try
			{
				FacesMessage message=new FacesMessage("SUCCESS","Submitted Successfully");
				FacesContext.getCurrentInstance().addMessage(null, message);
			}
			catch(EXception e)
			{
				FacesContext.getCurrentInstance.addMessage(null,new FaceMessage(FacesMessage.SEVERITY_ERROR,"ERROR","Error is"+e.getLocalizedMessage());
			}
		}
	}
}