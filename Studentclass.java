
package studentclass;

class student
{
    public int rollnumber;
    public String name;
    public String course;
    public int m1,m2,m3;
    
    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String detail()
    {
        return "roll no:"+rollnumber+"\n"+"Name:"+name+"\n"+"course:"+course+"\n";
    }
}

public class Studentclass {

    
    public static void main(String[] args) {
      student s=new student();
      
      s.rollnumber=1;
      s.name="shivam";
      s.course="cse";
      s.m1=80;
      s.m2=90;
      s.m3=87;
      
      System.out.println("total :"+s.total());
      System.out.println("average:"+s.average());
      
   System.out.println("details: \n"+s.detail());  
        
        
    }
    
}
