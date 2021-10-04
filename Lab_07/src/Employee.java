class Employee extends Person {
 private String office;
 private double salary;
 private String hireDate;
 
 public Employee(String name, String address, String phoneNumber, String emailAddress) {
  super(name, address, phoneNumber, emailAddress);
 }
 public String getOffice() {
  return this.office;
 }
 public void setOffice(String office) {
  this.office = office;
 }
 public double getSalary() {
  return this.salary;
 }
 public void setSalary(double salary) {
  this.salary = salary;
 }
 public String getHireDate() {
  return this.hireDate;
 }
 public void setHireDate(String hireDate) {
  this.hireDate = hireDate;
 }
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append(super.toString()+"\n");
  sb.append("\tOffice:").append(office).append("\n");
  sb.append("\tSalary:").append(salary).append("\n");
  sb.append("\tHire Date:").append(hireDate).append("\n"); 
  
  return sb.toString();
 }
}
