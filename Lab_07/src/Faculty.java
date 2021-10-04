class Faculty extends Employee {
 private String officeHours;
 private String rank;
 public Faculty(String name, String address, String phoneNumber, String emailAddress) {
  super(name, address, phoneNumber, emailAddress);
 }
 public String getOfficeHours() {
  return this.officeHours;
 }
 public void setOfficeHours(String officeHours) {
  this.officeHours = officeHours;
 }
 public String getRank() {
  return this.rank;
 }
 public void setRank(String rank) {
  this.rank = rank;
 }
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append(super.toString()+"\n");
  sb.append("\tOffice Hours:").append(officeHours).append("\n");
  sb.append("\tRank:").append(rank).append("\n");
  return sb.toString();
 }
}
