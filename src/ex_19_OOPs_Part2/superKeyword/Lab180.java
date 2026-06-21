package ex_19_OOPs_Part2.superKeyword;

public class Lab180 {
    public static void main(String[] args) {
        baseClass b1 = new baseClass("chrome");
        System.out.println(b1.getBrowser());
        System.out.println(b1.setBrowser("edge", false));
        b1.openBrowser();

        testCase tc1= new testCase("safari");
        System.out.println(tc1.getBrowser());

    }
}

class baseClass{
    private String browser;

    public baseClass(String browser){
        this.browser= browser;
    }

    public String getBrowser() {
        return browser;
    }

    public boolean setBrowser(String browser, boolean admin) {

        if(admin){
            this.browser = browser;
        }else {
            System.out.println("Change browser Not allowed, Not a Admin");
        }
        return admin;

    }
    void openBrowser() {
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }

    void bhk3(){}
}

class testCase extends baseClass{
    String browser;

    public void tc(){}

    public testCase(String browser) {
        super(browser);
        super.getBrowser();
        super.openBrowser();
        super.closeBrowser();

        this.tc();

    }
}

