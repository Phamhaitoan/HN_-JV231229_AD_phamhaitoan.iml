package ra.run;


import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class MusicManagement {
    private static int singerCount = 0;
    private static int songCount = 0;

    MusicManagement[] musicManagements = new MusicManagement[100];
    static Singer[] singers = new Singer[100];
    static Song[] songs = new Song[100];
    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("************************MUSIC-MANAGEMENT*************************");
            System.out.println("1. Quản lý ca sĩ ");
            System.out.println("2. Quản lý bài hát ");
            System.out.println("3. Tìm kiếm bài hát ");
            System.out.println("4. Thoát ");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    singerManagement();
                    break;
                case 2:
                    songManagement();
                    break;
                case 3:
                    searchManagement();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn sai, mời nhập lại.");
            }
        } while (true);


    }

    private static void singerManagement() {


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********************SINGER-MANAGEMENT*************************");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới ");
            System.out.println("2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3.Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)");
            System.out.println("5.Thoát");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng ca sĩ cần thêm vào danh sách:");
                   int n = Integer.parseInt(scanner.nextLine());
                   for (int i = 0; i < n; i++) {
                        System.out.println("Mời nhập thông tin của ca sĩ thứ " + (i + 1));
                        Singer singer = new Singer();
                        singer.inputData();
                        singers[singerCount++] = singer;
                    }
                   break;
                case 2:
                    if (singerCount <= 0)
                    {
                        System.out.println("Hiện không có ca sĩ nào để hiển thị");
                        break;
                    }
                    for (int i = 0; i < singerCount; i++)
                    {
                        singers[i].displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã ca sĩ cân thay đổi thông tin : ");
                    int idSinger = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < singerCount; i++) {
                        if (singers[i].getSingerID() == idSinger){
                            singers[i].inputData();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập mã ca sĩ cần xóa:");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < singerCount; i++) {
                        if (singers[i].getSingerID() == deleteId){
                            for (int j = 0; j < singerCount-1; j++) {
                                singers[j]=singers[j+1];
                            }
                            singerCount--;
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
            }

        } while (true);

    } private static void songManagement(){
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("**********************Song-MANAGEMENT*************************");
                System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới  ");
                System.out.println("2.Hiển thị danh sách tất cả bài hát đã lưu trữ");
                System.out.println("3.Thay đổi thông tin bài hát theo mã id");
                System.out.println("4.Xóa bài hát theo mã id");
                System.out.println("5.Thoát");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println("Nhập số lượng  bài hát cần thêm : ");
                        int n = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < n; i++) {
                            Song song = new Song();
                            song.inputData();
                            songs[songCount++] = song;
                        }
                        break;
                    case 2:
                        for (int i = 0; i < songCount; i++) {
                            songs[i].displayData();
                        }
                        break;
                    case 3:
                        System.out.println("Nhập mã bài hát cân thay đổi thông tin : ");
                        String id = scanner.nextLine();
                        for (int i = 0; i < songCount; i++) {
                            if (songs[i].getSongID() == id){
                                songs[i].inputData();
                                break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Nhập mã bài hát cần xóa:");
                        String deleteId = scanner.nextLine();
                        for (int i = 0; i < songCount; i++) {
                            if (songs[i].getSongID() == deleteId){
                                for (int j = 0; j < songCount-1; j++) {
                                    songs[j]=songs[j+1];
                                }
                                songCount--;
                                break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Thoát chương trình.");
                        return;
                }

            } while(true);



    }
    private static void searchManagement() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********************SEARCH-MANAGEMENT*************************");
            System.out.println(" 1..Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại  ");
            System.out.println("2.Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4.Hiển thị 10 bài hát được đăng mới nhất ");
            System.out.println("5.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

            }

        } while (true);
    }
}









