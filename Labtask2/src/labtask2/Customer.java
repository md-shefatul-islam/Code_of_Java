
package labtask2;


public class Customer {

{

              int nid;

              String name;

              SavingsAccount sa;

              FixedAccount fa;

             

              Customer()

              {

              }

              Customer(int nid,String name,SavingsAccount sa,FixedAccount fa)

              {

                           this.nid=nid;

                           this.name=name;

                           this.sa=sa;

                           this.fa=fa;

              }

              public void setNid(int nid)

              {

                           this.nid=nid;

              }

              public void setName(String name)

              {

                           this.name=name;

              }

              public void setSavingsAccount(SavingsAccount sa)

              {

                           this.sa= sa;

              }

              public void setFixedAccount(FixedAccount fa)

              {

                           this.fa = fa;

              }

              public int getNid()

              {

                           return nid;

              }

              public String getName()

              {

                           return name;

              }

              public SavingsAccount getSavingsAccount()

              {

                           return sa;

              }

              public FixedAccount getFixedAccount()

              {

                           return fa;

              }

   
      

}
    

