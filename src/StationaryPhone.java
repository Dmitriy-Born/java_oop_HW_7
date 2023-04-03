public class StationaryPhone extends Phone implements WiredInternet{
    private String locationInHouse;

    public StationaryPhone(String phoneNumber, TypePhone typePhone, String locationInHouse) {
        super(phoneNumber, typePhone);
        this.locationInHouse = locationInHouse;
    }

    @Override
    public void call() {
        System.out.println("Выполнение вызова с телефона " + getPhoneNumber());
    }

    @Override
    public void answer() {
        System.out.println("Ответ на вызов");
    }

    @Override
    public void setupInternetFromTelephone() {
        System.out.println("Настройка проводной сети от телефона"); // у родителей в деревне до сих пор такой интернет
    }
}
