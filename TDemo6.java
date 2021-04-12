class T1 extends Thread
{
public void run( )
{
for (int i=1;i<=5;i++)
{
System.out.println("Thread 1");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
}
}
}
}
class R1 implements Runnable
{
public void run( )
{
for (int i=1;i<=5;i++)
{
System.out.println("Runnable  R1");
try{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
}
}
}
}
class TDemo4
{
public static void main(String a[])
{
T1 t1=new T1( );
t1.start( );
R1 R=new R1( );
Thread t2=new Thread(R);
t2.start( );
}
}
