package PetStroreApiAutomation;
// class for verifying response
public class ResponseUser {
// Declaring response variables
    private String code;
    private String type;
    private String message;
// Methods for setting response values
    public void setCode(String code) { this.code = code; }
    public void setType(String name) { this.type = type; }
    public void setMessage(String name) { this.message = message; }

// Methods for getting response values
    public String getCode(){return(code);}
    public String getType(){ return(type);}
    public String getMessage(){return(message);}
}
