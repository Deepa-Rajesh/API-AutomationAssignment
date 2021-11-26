package PetStroreApiAutomation;
public class UserDetail {
   // Declaring private variables
    private String id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String userStatus;

// method to set the user values
        public void setId(String id) { this.id = id; }
        public void setUserName(String name) { this.userName = userName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public void setEmail(String email) { this.email = email; }
        public void setPassword(String password) { this.password = password; }
        public void setPhonenum(String phone) { this.phone = phone; }
        public void setUserStatus(String userStatus) { this.userStatus = userStatus; }

// method to get user values
        public String getId() {return id;}
        public String getUserName() {return userName;}
        public String getFirstName() {return firstName;}
        public String getLastName() {return lastName;}
        public String getEmail() {return email;}
        public String getPassword() {return password;}
        public String getPhoneNum() {return phone;}
        public String getUserStatus() {return userStatus;}



    }

