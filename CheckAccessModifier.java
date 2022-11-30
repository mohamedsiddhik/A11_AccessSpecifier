
package  ACOutsidePackage;

import AccessSpecifier2.AccessModifiers;

public  class CheckAccessModifier extends AccessModifiers{
    public static void main(String[] args) {
        CheckAccessModifier c = new CheckAccessModifier();
        //Calling protected method outside package
        c.checkProtectedMethod();
//        c.checkPublicMethod();



        //Calling public method
        AccessModifiers a = new AccessModifiers();
//        a.checkPublicMethod();

    }
}