class Student extends Person {
	
	private String status;
	
	public Student(String name, String address, 
			String phoneNumber, String emailAddress) {
		
		super(name, address, phoneNumber, emailAddress);
    }
	
	public String getStatus() {
		
		return this.status;
    }
	
	public void setStatus(String status) {
		
		this.status = status;
	}
	
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString()+"\n");
		sb.append("\tStatus:").append(status).append("\n");  
		
		return sb.toString();
	}
}
