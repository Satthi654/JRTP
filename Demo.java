public class Demo{
	Connection con;
	CallableStatement cst;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	
	public void init(){
		try
		{
		
		}
		catch(Exception e)
		{
			FaceseMessage message=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR","Error is"+e.getLocalizedMessage());
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
	
}