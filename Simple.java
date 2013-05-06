class Simple 
{
static int field1;
static Simple field2;
static int field3;
public static void foo() {}
public static void
main(String args[]) 
{
int i = args.length;
int j = 1000027;
field1 = i+j;
field2 = null;
foo();
}
}

