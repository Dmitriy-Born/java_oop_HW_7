public abstract class Phone  {
    private String phoneNumber;
    private TypePhone typePhone;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public TypePhone getTypePhone() {
        return typePhone;
    }

    public void setTypePhone(TypePhone typePhone) {
        this.typePhone = typePhone;
    }

    public Phone(String phoneNumber, TypePhone typePhone) {
        this.phoneNumber = phoneNumber;
        this.typePhone = typePhone;
    }

    public abstract void call();
    public abstract void answer();
}
