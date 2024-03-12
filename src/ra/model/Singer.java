package ra.model;

import java.util.Scanner;

public class Singer {
    private int singerID;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer(){}

    public Singer(int singerID, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerID = singerID;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerID() {
        return singerID;
    }

    public void setSingerID(int singerID) {
        this.singerID = singerID;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "singerID=" + singerID +
                ", singerName='" + singerName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", genre='" + genre + '\'' +
                '}';
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã ca sĩ");
        singerID = Integer.parseInt(scanner.nextLine());
        System.out.println("mời nhập tên ca sĩ");
        singerName = scanner.nextLine();
        System.out.println("mời nhập tuổi");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("mời nhập quốc tịch");
        nationality = scanner.nextLine();
        System.out.println("mời nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("mời nhập thể loại");
        genre = scanner.nextLine();
    }

    public void displayData(){
        System.out.println("Singer{" +
                "singerID=" + singerID +
                ", singerName='" + singerName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + gender +
                ", genre='" + genre + '\'' +
                '}');
    }
}

