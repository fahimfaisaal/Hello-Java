package AccessModifer;

public class Modifier {
    /**
     * There are total four modifiers
     * Default Modifier
     * Public Modifier
     * Private Modifier
     * Protected Modifier
     */

    String defaultVariable = "Hello, I'm default variable";
    public String publicVariable = "Hello, I'm public variable";
    private String privateVariable;
    protected String protectedVariable = "Hello, I'm protected variable";

    // this is default method
    String defaultMethod() {
        return "Hello, I'm default method";
    }

    // this is public method
    public String publicMethod() {
        return "Hello, I'm public method";
    }

    // this is private method
    private void privateMethod() {
        System.out.println("Hello, I'm private method");
    }

    // this is protected method
    protected void protectedMethod() {
        System.out.println("Hello, I'm protected method");
    }

    // get and set private method and variable

    // get private variable
    public String getPrivateVariable() {
        // default variable can use in class method only
        System.out.println(defaultVariable);

        return this.privateVariable;
    }

    // get private method
    public void getPrivateMethod() {
        this.privateMethod();
    }

    // set private variable
    public String setPrivateVariable(String description) {
        return this.privateVariable = description;
    }
}
