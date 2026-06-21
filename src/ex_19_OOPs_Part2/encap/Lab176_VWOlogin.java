package ex_19_OOPs_Part2.encap;

public class Lab176_VWOlogin {
    public static void main(String[] args) {
        vwologin01 vw1= new vwologin01("vikash", "abc@123");
        System.out.println(vw1.username);
        System.out.println(vw1.password);
        System.out.println("--------");
        vw1.username = "vikas";
        vw1.password = "kaj@123";
        System.out.println(vw1.username);
        System.out.println(vw1.password);

        goodVwoLoginPage goodlogin = new goodVwoLoginPage("john", "john@123");
        System.out.println(goodlogin.username);
        System.out.println(goodlogin.password);
        System.out.println("-----");

        goodlogin.username = "sam";
        goodlogin.password = "sam@123";
        System.out.println(goodlogin.username);
        System.out.println(goodlogin.password);
//        System.out.println(goodlogin.setPassword("ram@123", true));
//        System.out.println(goodlogin.password);
//
//        System.out.println(goodlogin.setPassword("wick@123", false));
//        System.out.println(goodlogin.password);
//
        System.out.println(goodlogin.getUsername());
        System.out.println(goodlogin.getPassword());
        System.out.println(goodlogin.setPassword("111", true));
        System.out.println(goodlogin.setPassword("99999", false));
//        System.out.println(goodlogin.setPassword("1111", true));
        System.out.println(goodlogin.getPassword());

    }
}

class vwologin01{
    public String username;
    public String password;

    public vwologin01(String username, String password){
        this.username = username;
        this.password = password;
    }

}

class goodVwoLoginPage {
    public String username;
    public String password;

    public goodVwoLoginPage(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String setUsername() {
        return username;
    }

    public boolean setPassword(String password, boolean admin) {
        if (admin) {
            this.password = password;

        } else {
            System.out.println("Unauthorised");
        }
        return admin;
    }
}