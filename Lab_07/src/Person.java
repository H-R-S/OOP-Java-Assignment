class Person {
 private String name;
 private String address;
 private String phoneNumber;
 private String emailAddress;
 
 public Person(String name, String address, String phoneNumber, String emailAddress) {
  this.name = name;
  this.address = address;
  this.phoneNumber = phoneNumber;
  this.emailAddress = emailAddress;
 }
 
 public String getName() {
  return this.name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getAddress() {
  return this.address;
 }
 public void setAddress(String address) {
  this.address = address;
 }
 public String getPhoneNumber() {
  return this.phoneNumber;
 }
 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }
 public String getEmailAddress() {
  return this.emailAddress;
 }
 public void setEmailAddress(String emailAddress) {
  this.emailAddress = emailAddress;
 }
 public String toString() {
  StringBuffer sb = new StringBuffer();
  sb.append("\tName :").append(name).append("\n");
  sb.append("\tAddress :").append(address).append("\n");
  sb.append("\tPhone Number :").append(phoneNumber).append("\n");
  sb.append("\tEmail Address :").append(emailAddress).append("\n");
  
  return sb.toString();
 }
}
