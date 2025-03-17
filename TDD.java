import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        long a,b;
        if(!x.hasNextLong()) 
        {
            System.out.print("give only the number");
            return;
        }
        a=x.nextLong();
        if(!x.hasNextLong())
        {
            System.out.print("give only the number");
            return;
        }
        b=x.nextLong();
        char o=x.next().charAt(0);
        if(o!='+'&&o!='-'&&o!='*'&&o!='/'&&o!='%')
        {
            System.out.print("give only the operator");
            return;
        }
        if(o=='+')
        {
            System.out.print(a+b);
        }
        else if(o=='-')
        {
            System.out.print(a-b);
        }
        else if(o=='*')
        {
            System.out.print(a*b);
        }
        else if(o=='/')
        {
            if(b==0)
            {
                System.out.print("denominator not be zero");
                return;
            }
            System.out.print(a/b);
        }
        else
        {
            System.out.print(a%b);
        }
    }
}
