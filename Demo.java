public class Demo{
	Connection con;
	CallableStatement cst;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	
	public static void main(String[] args){
		
	}
	
	public void init(){
		try
		{
			FacesContext.getCurrentInstance.addMessage(null , new FacesMessage("SUCCESS","Data Saved successfully."));
		}
		catch(Exception e)
		{
			FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR","Error is"+e.getLocalizedMessage());
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
	
	public void gitTestMethod(){
		FaceseMessage message=new FacesMessage("SUCCESS","Test Performed Sucessfully");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
