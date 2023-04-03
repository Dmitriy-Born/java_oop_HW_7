public class MobilePhone extends Phone implements Network, Message{
    private String model;

    public MobilePhone(String phoneNumber, TypePhone typePhone, String model) {
        super(phoneNumber, typePhone);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void sendMessage(String text) {
        System.out.println("Отправка сообщения с текстом " + text + "с телефона " + getPhoneNumber());
    }

    @Override
    public void acceptMessage() {
        System.out.println("Получение сообщения с телефона " + getPhoneNumber());
    }

    @Override
    public void workWithNetwork() {
        System.out.println("Работа с беспроводными сетями");
    }

    @Override
    public void call() {
        System.out.println("Выполнение вызова с телефона " + getPhoneNumber());
    }

    @Override
    public void answer() {
        System.out.println("Ответ на вызов");
    }
}
