class Staff extends Employee {
	
	private String title;
	
	public Staff(String name, String address, 
			String phoneNumber, String emailAddress) {
		super(name, address, phoneNumber, emailAddress);
    }
	
	public String getTitle() {
		
		return this.title;
    }
	
	public void setTitle(String title) {
		
		this.title = title;
    }
	
	public String toString() {
		
		StringBuffer sb = new StringBuffer();
        sb.append(super.toString()+"\n");
        sb.append("\tTitle:").append(title).append("\n");
  
        return sb.toString();
    }
}
