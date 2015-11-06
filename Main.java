


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("");
        StringBuffer e[][] = new StringBuffer[5][3];
         for(int m=0;m<5;m++)
         {
             for(int n=0;n<3;n++)
             {
                 e[m][n] = new StringBuffer("q");
             }
         }
         Scanner s1 = new Scanner(System.in);
         System.out.println("1. To Enter Employee Details\n2. To Modify Employee Details\n3. To delete "
                                    + "the Employee Details\n4. Display the Employee Table\n5. Exit");
         System.out.println("");
         int ch = s1.nextInt();
         while(ch<6 || ch>0)
         {
            switch(ch)
            {
                case 1:
                          int i=0;
                          while(i<5)
                          {
                                        int j=0;
                                        Scanner s2 = new Scanner(System.in);
                                        System.out.println("Enter user id");
                                        String id1 = s2.next();
                                        for(int q=0;q<5;q++)
                                        {
                                            if(id1.equals(e[q][0].toString()))
                                            {
                                                System.out.println("No Duplicate Values Allowed");
                                                System.out.println("");
                                                System.exit(0);
                                            }
                                        }
                                        System.out.println("Enter user name");
                                        Scanner s3 = new Scanner(System.in);
                                        String name1 = s3.next();
                                        int len_id = e[i][j].length();
                                        e[i][j] = e[i][j].replace(0, len_id, id1);
                                        int len_name = e[i][j+1].length();
                                        e[i][j+1] = e[i][j+1].replace(0, len_name, name1);
                                        System.out.println("Enter user designation");
                                        Scanner s10 = new Scanner(System.in);
                                        String desig = s10.next();
                                        int len_desig = e[i][j+2].length();
                                        e[i][j+2] = e[i][j+2].replace(0, len_desig, desig);
                                        System.out.println("1. To Enter Employee Details\n2. To Modify Employee Details\n3. "
                                                + "To Delete the Employee Details\n4. Display the Employee Table\n5. Exit");
                                        Scanner s4 = new Scanner(System.in);
                                        ch = s4.nextInt();
                                        if(ch>4||ch<1)
                                            System.exit(0);
                                        if(ch==2 || ch==3 || ch==4)
                                            break;
                                        if(ch==1)
                                            i++;
                                        if(i==5)
                                        {
                                            System.out.println("");
                                            System.out.println("No More Employee Details can be Filled");
                                            System.out.println("");
                                            System.out.println("EID\t\tName\t\tDesignation\n-------------------------------------------\n");
                                            for(i=0;i<5;i++)
                                            {
                                                System.out.println(e[i][0] + "\t\t" + e[i][1] + "\t\t" + e[i][2]);
                                            }
                                            System.out.println("");
                                            System.out.println("2. To Modify Employee Details\n3. To Delete the "
                                                        + "Employee Details\n4. Display the Employee Table\n5. Exit");
                                            System.out.println("");
                                            Scanner s5 = new Scanner(System.in);
                                            ch = s5.nextInt();
                                            if(ch>4||ch<1)
                                            System.exit(0);
                                        }
                            }
                case 2:
                            if(ch==2)
                            {
                                Scanner s6 = new Scanner(System.in);
                                System.out.println("Enter the Employee ID to modify the details");
                                String value = s6.next();
                                String comp[] = new String[5];
                                for(int p=0;p<5;p++)
                                {
                                    comp[p] = e[p][0].toString();
                                    if(comp[p].equals(value))
                                    {
                                          System.out.println("Enter the new name");
                                          Scanner s7 = new Scanner(System.in);
                                          String name = s7.next();
                                          int len = e[p][0+1].length();
                                          e[p][0+1] = e[p][0+1].replace(0, len, name);
                                          System.out.println("Enter the employee designation");
                                          Scanner s5 = new Scanner(System.in);
                                          String desig = s5.next();
                                          int desig_len = e[p][0+2].length();
                                          e[p][0+2] = e[p][0+2].replace(0, desig_len, desig);
                                    }
                                }
                                System.out.println("");
                                System.out.println("1. To Enter Employee Details\n2. To Modify Employee Details\n3. "
                                        + "To Delete the Employee Details\n4. Display the Employee Table\n5. Exit");
                                Scanner s7 = new Scanner(System.in);
                                ch = s7.nextInt();
                                System.out.println("");
                                break;
                            }
                case 3:
                          if(ch==3)
                          {
                             Scanner s8 = new Scanner(System.in);
                             System.out.println("Enter the Employee ID to delete the details");
                             String del_val = s8.next();
                             int check=0;
                             for(int j=0;j<5;j++)
                             {
                                 if(del_val.equals(e[j][0].toString()))
                                 {
                                     e[j][0] = e[j][0].delete(0, e[j][0].length());
                                     e[j][1] = e[j][1].delete(0, e[j][1].length());
                                     e[j][2] = e[j][2].delete(0, e[j][2].length());
                                     System.out.println("Successfully Deleted");
                                     check=1;
                                 }
                             }
                             if(check==0)
                                System.out.println("Not an Valid Employee ID");

                             System.out.println("1. To Enter Employee Details\n2. To Modify Employee Details\n3. "
                                     + "To Delete the Employee Details\n4. Display the Employee Table\n5. Exit");
                              System.out.println("");
                             Scanner s9 = new Scanner(System.in);
                             ch = s9.nextInt();
                             break;
                          }
                case 4:
                           if(ch==4)
                           {
                                System.out.println("");
                                System.out.println("EID\t\tName\t\tDesignation\n----------------------------------------------\n");
                                for(i=0;i<5;i++)
                                {
                                    if(e[i][0].toString().equals("q"))
                                    {

                                    }
                                    else
                                        System.out.println(e[i][0] + "\t\t" + e[i][1] + "\t\t" + e[i][2]);
                                }
                                System.out.println("");
                                System.out.println("1. To Enter Employee Details\n2. To Modify Employee Details\n3. "
                                         + "To Delete the Employee Details\n4. Display the Employee Table\n5. Exit");
                                System.out.println("");
                                Scanner s9 = new Scanner(System.in);
                                 ch = s9.nextInt();
                                 break;
                           }
                case 5:
                            System.exit(0);

            }
        }
    }
}
