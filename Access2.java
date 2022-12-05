

package accessSpecifier3;

public class Access2
{
    public static void main(String[] args) {
        Access1 ac1 = new Access1();

        //Default Access Specifier within a package class we're access
        System.out.println("------------------------default-------------------------");
        System.out.println("Default within a package Today Date : " + ac1.date);
        System.out.println("Default within a package Today Month : " + ac1.month);
        System.out.println("Default within a package Today Year : " + ac1.year);
        System.out.println("-----------------------protect----------------------------------");
        //we're not access private access specifier within a package
//        System.out.println();


        //protect access specifier.
//        Access1 acProtect2 = new Access1();
        System.out.println("Protected within a package Date : " + ac1.protectDate);
        System.out.println("Protected within a package Month : "+ ac1.protectMonth);
        System.out.println("Protected within a package Year : "+ ac1.protectYear);

        System.out.println(ac1.protectDate);
        System.out.println("--------------------------------public----------------------");
        System.out.println("Public within a package Date : " +ac1.publicDate);
        System.out.println("Public within a package Month : " + ac1.publicMonth);
        System.out.println("public within a package Year : " + ac1.publicYear);



    }
}