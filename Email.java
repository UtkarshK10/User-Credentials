package emailapp;
import java.util.*;
public class Email {
     private String firstName;
     private String lastName;
     private String password;
     private String department;
     private String email;
     private int mailboxcapacity=5;
     private int defaultPasswordLength=10;
     private String alternateEmail;
     private String joinyear="2020";
     private String collegeSuffix="education.ac.in";
     
     //constructor to receive the first name and last name
     public Email(String fname,String lname)
     {
    	 this.firstName=fname;
    	 this.lastName=lname;
    	 
    	 // call for a method asking department - return the department
    	 String arr[]=setDepartment();
    	 this.department=arr[0];
    	 
    	 // call a method that returns random password
    	 this.password=randomPassword(defaultPasswordLength);
    	
    	 //combine elements to generate email
    	 email=fname.toLowerCase()+"."+lname.toLowerCase()+joinyear+"@"+arr[1]+"."+collegeSuffix;
    	 
     }
     //Ask for department
     private String[] setDepartment() {
    	 System.out.print("School Codes:\n1 for SITE\n2 for SENSE\n3 for SELECT\n4 for SCOPE\n5 for OTHERS \nEnter School Code:");
    	 String arr[]=new String[2];
    	 Scanner sc=new Scanner(System.in);
    	 int choice=sc.nextInt();
    	 int branch;
    	 switch(choice) {
    	 case 1:
    		 arr[0]="SITE";
    		 System.out.print("Branch Names:\n1 IT\n2 BCA\n3 MCA\nEnter Branch:");
    		 branch=sc.nextInt();
    		 switch(branch)
    		 {
    		 case 1:
    			 arr[1]="IT";
    			 break;
    		 case 2:
    			 arr[1]="BCA";
    			 break;
    		 case 3:
    			 arr[1]="MCA";
    			 break;
    		 default:
    			 arr[1]="BRANCH NOT PRESENT";
    			 break;
    		 }
    		 break;
    		 
    	 case 2:
    		 arr[0]="SENSE";
    		 System.out.print("Branch Names:\n1 EEE\n2 BML\nEnter Branch:");
    		 branch=sc.nextInt();
    		 switch(branch)
    		 {
    		 case 1:
    			 arr[1]="EEE";
    			 break;
    		 case 2:
    			 arr[1]="BML";
    			 break;
    		 default:
    			 arr[1]="BRANCH NOT PRESENT";
    			 break;
    		 }
    		 break;
    	 case 3:
    		 arr[0]="SELECT";
    		 System.out.print("Branch Names:\n1 ECE\n2 EIOT\nEnter Branch:");
    		 branch=sc.nextInt();
    		 switch(branch)
    		 {
    		 case 1:
    			 arr[1]="ECE";
    			 break;
    		 case 2:
    			 arr[1]="EIOT";
    			 break;
    		 default:
    			 arr[1]="BRANCH NOT PRESENT";
    			 break;
    		 }
    		 break;
    	 case 4:
    		 arr[0]="SCOPE";
    		 System.out.print("Branch Names:\n1 CSE\n2 CSI\n3 CSB\nEnter Branch:");
    		 branch=sc.nextInt();
    		 switch(branch)
    		 {
    		 case 1:
    			 arr[1]="CSE";
    			 break;
    		 case 2:
    			 arr[1]="CSI";
    			 break;
    		 case 3:
    			 arr[1]="CSB";
    			 break;
    		 default:
    			 arr[1]="BRANCH NOT PRESENT";
    			 break;
    		 }
    		 break;
    	 case 5:
    		 arr[0]="CORE";
    		 System.out.print("Branch Names:\n1 ME\n2 CE\n3 CME\nEnter Branch:");
    		 branch=sc.nextInt();
    		 switch(branch)
    		 {
    		 case 1:
    			 arr[1]="ME";
    			 break;
    		 case 2:
    			 arr[1]="CE";
    			 break;
    		 case 3:
    			 arr[1]="CME";
    			 break;
    		 default:
    			 arr[1]="BRANCH NOT PRESENT";
    			 break;
    		 }
    	    break;	 
    	 default:
    		 arr[0]="SCHOOL NOT PRESENT";
    		 arr[1]="admin";
    		 break;
    	 }
    	 
    	 return arr;
     }
     
     //Generate a random password
     private String randomPassword(int length)
     {
    	 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%";
    	 char[] password=new char[length];
    	 for(int i=0;i<length;i++)
    	 {
    		 int rand=(int)(Math.random()*passwordSet.length());
    		 password[i]=passwordSet.charAt(rand);
    	 }
    	 return new String(password);
     }
     
     //Set the mailbox capacity
     public void setMailBoxCapacity(int capacity)
     {
    	 this.mailboxcapacity=capacity;
     }
     
     //Set the alternate email
     public void setAlternateEmail(String email)
     {
    	 this.alternateEmail=email;
     }
     //Change the password
     public void changePassword(String password)
     {
    	 this.password=password;
     }
     //get methods
     public int getMailBoxCapacity() {return mailboxcapacity;}
     public String getAlternateEmail() {return alternateEmail;}
     public String getPassword() {return password;}
     
     //show info:
     public String showInfo() {
    	 if(department=="SCHOOL NOT PRESENT") {
    		 return "Employee Name:"+firstName+" "+lastName+ "\n"+
        			 "Employee Email:"+email+"\n"+
        			 "Password:"+password+"\n"+
        			 "Mail Box Capacity: "+mailboxcapacity+"gb";
    	 }
    	 else {
    		 return "Student Name:"+firstName+" "+lastName+ "\n"+
        			 "Student Email:"+email+"\n"+
        			 "Password:"+password+"\n"+
        			 "School: "+department+"\n"+
        			 "Mail Box Capacity: "+mailboxcapacity+"gb"; 
    	 } 	 
     }
     
}
