public class Vocalist extends Musician{
    String influencedBy;

    public Vocalist(String firstMame,
                    String lastName,
                    String country,
                    String style,
                    String timePeriod,
                    String influencedBy) {
        super(firstMame, lastName, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }

    @Override
    public void show(){
        super.show();
        System.out.println("Influenced by: " + influencedBy);
    }
}
