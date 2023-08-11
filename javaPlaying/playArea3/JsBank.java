

public class JsBank{

    private String name;
    private String password;

    public JsBank (String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public String toString(){
        return "[ Name: "+getName()+" || Password: "+getPassword()+" ]";
    }

}