
package  AccessSpecifier2;

public  class AccessModifiers
{
    private   void  checkPrivateMethod(){
        System.out.println("Private Method");
    }
    public  void checkPublicMethod(){
        System.out.println("Public Method");
    }
    protected void  checkProtectedMethod(){
        System.out.println("Protected Method");
    }
    void checkDefaultMethod(){
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();
//        a.checkPrivateMethod();
        a.checkPublicMethod();
//        a.checkProtectedMethod();
//        a.checkDefaultMethod();

    }
}
