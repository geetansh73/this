class co
{
int x;
co()
{
this(2,5);
System.out.print("default");
}
co(int a)
{
this();
x=a;
System.out.print(x);
}
co(int x,int y)
{
System.out.print(x+y);
}
public static void main(String arg[])
{
co obj=new co(20);
}
}
