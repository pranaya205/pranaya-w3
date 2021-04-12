class MTThread extends Thread
{
int n;
MTThread(int n)
{
this.n=n;
}
public void run()
{
try
{
for( int i=1;i<=10;i++)
{
System.out.println(i+"*"+n+"="+(i*n));
Thread.sleep(6000);
}
}
catch(InterruptedException e)
{}
}
public static void main(String[] args)
{
MTThread t1=new MTThread(6);
t1.start (  );
}
}
