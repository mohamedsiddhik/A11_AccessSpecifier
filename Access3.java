
package accessSpecifier4;

import  accessSpecifier3.Access1;

public  class Access3 extends Access1{
    public static void main(String[] args) {
        Access3 acProtect = new Access3();
        System.out.println("-----------------------------protect---------------------------------");
        System.out.println("Protected within a outside package sub class only , Date  " + acProtect.protectDate);
        System.out.println("Protected within a outside package sub class only , Month " + acProtect.protectMonth);
        System.out.println("Protected within a outside package sub class only , Year " + acProtect.protectYear);
        System.out.println("------------------------------public-------------------------------------------");
        System.out.println("Public with in a outside package , Date : " + acProtect.publicDate);
        System.out.println("Public with in a outside package , Month : " + acProtect.publicMonth);
        System.out.println("Public with in a outside package , Year : " + acProtect.publicYear);

        System.out.println("------------------------------public outside package--------------------------");
        Access1 access1 = new Access1();
        Access1 accessProtected = new Access1();
        accessProtected.protect
        System.out.println("public Access Specifier outside package , Date " + access1.publicDate);
        System.out.println("public Access Specifier outside package , Month " + access1.publicMonth);
        System.out.println("public Access Specifier outside package , Year " + access1.publicYear);



    }
}
