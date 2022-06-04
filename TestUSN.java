
public class TestUSN {
    static void validate(String USN)
    {
        int flag=0;
        if(USN.length()==10)
        flag=1;
        for(int i=0;i<USN.length();i++)
        {
            char ch=USN.charAt(i);
            if(Character.isUpperCase(ch))
            flag=1;
        }
         if (Character.isDigit(USN.charAt(0)) && (USN.charAt(0) == '1'
                || USN.charAt(0) == '2')) 
            {
                flag=1;
            }
            char ch1=USN.charAt(5);
            char ch2=USN.charAt(6);
            if(Character.isUpperCase(ch1) && Character.isUpperCase(ch2))
            flag=1;
                    if((USN.substring(5,7)=="CS")||(USN.substring(5,7)=="IS")||(USN.substring(5,7)=="EC")||(USN.substring(5,7)=="ME"))
                    flag=1;
            char c1=USN.charAt(7);
            char c2=USN.charAt(8);
            char c3=USN.charAt(9);
            if((Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3)) && (c1>='0' && c1<='9') &&(c2>='0' && c2<='9') && (c3>='0' && c3<='9'))
            flag=1;
            if(flag==1)
            {
                System.out.println("==========");
            System.out.println("SUCCESS");
            System.out.println("==========");
            }
            else
            System.out.println("FAILURE");
}
public static void main(String[] args)
{
     String USN="1DS09CS010";
     validate(USN);
}
}
