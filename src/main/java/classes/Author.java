package classes;

public class Author {
    private String nationality;
    private String surname;
    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getNationality() {
        return this.nationality;
    }
    public String getSurname() {
        return this.surname;
    }
}