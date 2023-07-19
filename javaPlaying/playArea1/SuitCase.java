
public class SuitCase {
    private String handle;
    private int wheels;

    public SuitCase(String handle, int wheels){ 
        // ^ this is the constructor
        this.handle = handle;
        this.wheels = wheels;
    }

    public String getHandle(){
        return this.handle;
    }

    public void setHandle(String nHandle){
        this.handle = nHandle;
    }

    public int getWheels(){
        return this.wheels;
    }

    public void setWheels(int nWheels){
        this.wheels = nWheels;
    }

    public String format(){
        return "[ Handle: "+getHandle()+"|| Wheels: "+getWheels()+"]";
    }
}
