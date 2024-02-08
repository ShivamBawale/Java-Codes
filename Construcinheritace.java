
package construcinheritace;



    
    class account
    {
        public long balance;
        public String accno;
        public String name;
        public String address;
        public String phono;
        public String dob; 
    }
    
    public account(String acc,Stirng n,String add,String phono,String dob)
    {
        accno=acc;
        name=n;
        address=add;
        this.phono =phono;
        this.dob=dob;
    }
    
    public double getbalance()
    {
        return balance;
    }
    public double getaccno()
    {
        return accno;
    }
    public String getname()
    {
        return name;
    }
    public String getaddress()
    {
        return address;
    }
    public double phono()
    {
        return phono;
    }
    public String getdob()
    {
        return dob;
    }
    
  
   public void setaddress(String add)
   {
       address=add;
   }
    
    public void setphono(double phono)
    {
        this.phono =phono;
    }
    
    
    class savingaccount extends account
    {
        public void deposite(long amt)
        {
            balance+=amt;
        }
        public void withdrawal(long amt)
        {
            balance-=amt;
        }
        
    }
    
    class Loanaccount extends account
    {
        public void payemi(long amt)
        {
            balance-=amt;
        }
        public void repay(long amt)
        {
            if(balance==amt)
                balance=0;
        }
    }
    
    
    
   public class Construcinheritace 
   {

   
    public static void main(String[] args) {
        
        
    }
    
}
