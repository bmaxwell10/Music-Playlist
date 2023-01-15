abstract public class Musician {
    String firstName;
    String lastName;
    String country;
    String style;
    String timePeriod;

    public Musician(String firstName,
                    String lastName,
                    String country,
                    String style,
                    String timePeriod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;
    }
    public void show() {
        System.out.println("First Name: " + firstName
                        + "\tLast Name: " + lastName
                + "\nCountry: "  + country
                + "\tStyle: " + style
                + "\t\tTime Period: "  + timePeriod);
    }
}