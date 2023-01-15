public class TrumpetPlayer extends Musician {
    String trumpetType;

    public TrumpetPlayer(String firstName,
                         String lastName,
                         String country,
                         String style,
                         String timePeriod,
                         String trumpetType) {
        super(firstName, lastName, country, style, timePeriod);
        this.trumpetType = trumpetType;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Trumpet Type: " + trumpetType);
    }
}
