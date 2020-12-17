class Samsung
{
public static void main(String[] args)
{
Samsung sam = new Samsung();
int seconds = sam.call();
System.out.println(seconds);
}
public int call(int seconds)
{
System.out.println("calling");
return 11;
}
}

