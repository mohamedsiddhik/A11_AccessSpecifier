

package accessSpecifier3;

public  class Access1
{
     //Default , public, private , protected
    int date = 05;
    int month = 12;
    int year = 2022;
    private  int privateDate = 05;
    private  int privateMonth = 12;
    private  int privateYear = 2022;

    protected int protectDate = 05;
    protected int protectMonth = 12;
    protected int protectYear = 2022;

    public int publicDate = 05;
    public  int publicMonth = 12;
    public  int publicYear = 2022;

    public static void main(String[] args) {
        Access1 ac2 = new Access1();
        //Default access specifier within a class
        System.out.println("------------------Default-------------------------");
        System.out.println("Default within a class Date : " + ac2.date);
        System.out.println("Default within a class Month : " + ac2.month);
        System.out.println("Default within a class Date : " + ac2.year);
        System.out.println("------------------private----------------------------------");

        Access1 acPrivate = new Access1();
        //Private Access specifier within a class
        System.out.println("Private within a class Date : " + acPrivate.privateDate);
        System.out.println("Private within a class Month : " + acPrivate.privateMonth);
        System.out.println("Private within a class Year : " + acPrivate.privateYear);
        System.out.println("--------------------protect---------------------------------");

        Access1 acProtect = new Access1();
        //Protected Access Specifier within a class
        System.out.println("Protected within a class Date : " + acProtect.date);
        System.out.println("Protected within a class Month : " + acProtect.month);
        System.out.println("Protected within a class Year : " + acProtect.year);
        System.out.println("---------------------public-------------------------------");

        Access1 acPublic = new Access1();
        System.out.println("Public within a class Date : " + acPublic.publicDate);
        System.out.println("Public within a class Month : " + acPublic.publicMonth);
        System.out.println("Public within a class Year : " + acPublic.publicYear);






    }
}