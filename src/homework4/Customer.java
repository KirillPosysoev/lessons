package homework4;

public class Customer {
    private String firstName;
    private String secondName;
    private String middleName;
    private Date birthDay;

    public Customer(String firstName, String secondName, String middleName, Date birthDay) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.birthDay = birthDay;
    }

    public Customer(String firstName, String secondName, Date birthDay) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDay = birthDay;
        this.middleName = "отсутствует";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Фамилия: " + secondName +
                "\nИмя: " + firstName +
                "\nОтчетство: " + middleName +
                "\nДата рождения: " + birthDay.toString();
    }

}
