package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songID;
    private String songName;
    private String descriptions;
    private String singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song(){}

    public Song(String songID, String songName, String descriptions, String singer, String songWriter, Date createdDate, boolean songStatus) {
        this.songID = songID;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongID() {
        return songID;
    }

    public void setSongID(String songID) {
        this.songID = songID;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songID='" + songID + '\'' +
                ", songName='" + songName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", singer='" + singer + '\'' +
                ", songWriter='" + songWriter + '\'' +
                ", createdDate=" + createdDate +
                ", songStatus=" + songStatus +
                '}';
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã bài hát (4 ký tự bắt đầu bằng S): ");
        String songId = scanner.nextLine();
        while (songId.length() != 4 || !songId.startsWith("S")) {
            System.out.println("Mã bài hát không hợp lệ. Vui lòng nhập lại.");
            songId = scanner.nextLine();
        }

        System.out.print("Nhập tên bài hát: ");
        String songName = scanner.nextLine();
        while (songName.isEmpty()) {
            System.out.println("Tên bài hát không được để trống. Vui lòng nhập lại.");
            songName = scanner.nextLine();
            }

        System.out.print("Nhập mô tả bài hát: ");
        String descriptions = scanner.nextLine();

        System.out.println("nhập tên ca sĩ");
        String singer = scanner.nextLine();
        while (singer == null){
            System.out.println("tên ca sĩ không được để trống");
            singer = scanner.nextLine();
        }

        System.out.println("nhập tên người sáng tác");
        String songWriter = scanner.nextLine();
        while(songWriter.isEmpty()){
            System.out.println("tên người saáng tác không được để trống");
            songWriter = scanner.nextLine();
        }

        System.out.println("nhập trạng thái bài hát");
        boolean songStatus = Boolean.parseBoolean(scanner.nextLine());


//        System.out.println("nhập ID ca sĩ:");
//        int id = scanner.nextInt();
//        if (singer.isEmpty()) {
//            System.out.println("không tìm thấy qua ID: " + id);
//            System.out.println("hãy nhạp tên ca sĩ");
//        } else {
//            System.out.println("tìm thấy:");
//            for (int i = 0; i < Singer.getsingerID().length ; i++) {
//                System.out.println(singer.getSingerID() + ": " + singer.getSingerName());
//            }
//        }
    }
    public void displayData(){
        System.out.println("Song{" +
                "songID='" + songID + '\'' +
                ", songName='" + songName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", songWriter='" + songWriter + '\'' +
                ", createdDate=" + createdDate +
                ", songStatus=" + songStatus +
                '}');
    }
}
