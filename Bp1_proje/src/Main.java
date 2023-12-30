import java.util.Scanner;

public class Main {
    static char[][] labirent = {{'#', '!', '.', '.', 'R', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.'}, {'.', '.', '#', '.', '.', '.', '#', '.', 'H', '.', '.', '.', '.', '.', '!'}, {'F', '.', '.', '.', '#', '.', '!', '.', '.', 'R', '.', '.', '#', '#', '.'}, {'.', '.', '#', '.', '.', '#', '.', '.', '.', '.', 'F', '.', '.', '.', '.'}, {'.', '!', '.', '.', '#', '.', '#', '.', '#', '.', '.', '#', '.', '.', '.'}, {'.', '.', 'H', '.', '.', '!', '.', '.', 'H', '.', '.', 'F', '.', '.', 'R'}, {'#', '#', '#', '#', '.', '.', '#', '.', '.', '.', 'T', '.', '.', '.', 'E'}, {'.', '.', '#', '.', 'F', '.', '#', '#', '.', '#', '#', '#', '#', '.', '.'}, {'.', '#', '.', '.', '.', '.', '!', '.', '#', '.', '.', '.', '#', '.', '.'}, {'.', 'T', 'T', '.', '#', '#', '.', '.', '.', '.', 'T', '.', '.', '.', 'R'}, {'.', '.', '.', '#', '.', '.', '.', '#', '.', '#', '.', '#', '.', 'T', '.'}, {'B', '.', '#', '.', '.', '!', '.', '!', '.', '.', '.', '.', '.', '.', '#'}, {'.', '.', '.', 'F', '!', '.', '.', '.', 'H', '.', '.', 'R', '.', '.', '.'}, {'.', '.', 'H', '.', '.', '.', '!', '.', '.', '.', '#', '.', '.', '#', '.'}, {'.', '.', '.', '#', '.', '.', '#', '.', '#', '.', '#', '.', '.', '#', '#'}};
    static int start_row = 0;
    static int start_col = 0;
    static int counter = 0;
    static Scanner input = new Scanner(System.in);
    static String yon;
    static int[] bonuslar = new int[4];

    /**
     * @file Bp1_Project
     * @description İçerisinde engeller ve bonuslar bulunan başlangıçtan itibaren bu engeller ve bonusları kullanarak bitişe ulaşmaya çalışılan bir labirent oyunudur.
     * @assignment 1. proje
     * @date 30.11.2023
     * @author Ümit Özteker umit.ozteker@stu.fsm.edu.tr
     */


    public static void printerr() {
        counter--;
        System.out.println("Lütfen geçerli sınırlar içerisinde hareket ediniz." + "\n" + loc_message());
    }


    public static String loc_message() {
        return "Yeni konumunuz: " + " " + "{" + start_row + "," + " " + start_col + "}" + " " + "\nHamle sayınız: " + counter + "\n" + "(W: Yukarı, S: Aşağı ,A: Sola, D: Sağa, +: Bonus kullanımı, exit: Çıkış):";
    }

    public static void printarr() {
        for (char[] chars : labirent) {
            for (char Char : chars) {
                System.out.print(Char);
            }
            System.out.println();
        }
    }

    public static void movement() {
        for (int row = 0; row < labirent.length; row++) {
            for (int col = 0; col < labirent[row].length; col++) {
                if (labirent[row][col] == 'B') {
                    start_row = row;
                    start_col = col;
                }
            }
        }
        System.out.println("Lütfen bir yöne gidiniz(W: Yukarı, S: Aşağı ,A: Sola, D: Sağa, +: Bonus kullanımı, exit: Çıkış): ");
        while (true) {
            if (labirent[start_row][start_col] == 'E') {
                System.out.println("Tebrikler oyunu bitirdiniz. \nHamle Sayınız:" + counter);
                break;
            }
            yon = input.next();
            counter++;
            yon = yon.toLowerCase();
            if (yon.equals("exit")) {
                System.out.println("Oyun sonlandırıldı.");
                break;
            } else {
                switch (yon) {
                    case "w":
                        if (start_row != 0) {
                            start_row--;
                            System.out.println("Yukarı gittiniz, " + loc_message());
                        } else {
                            printerr();
                        }
                        break;
                    case "s":
                        if (start_row != labirent.length - 1) {
                            start_row++;
                            System.out.println("Aşağı indiniz, " + loc_message());
                        } else {
                            printerr();
                        }
                        break;
                    case "a":
                        if (start_col != 0) {
                            start_col--;
                            System.out.println("Sola gittiniz, " + loc_message());
                        } else {
                            printerr();
                        }
                        break;
                    case "d":
                        if (start_col != labirent[start_row].length - 1) {
                            start_col++;
                            System.out.println("Sağa gittiniz, " + loc_message());
                        } else {
                            printerr();
                        }
                        break;
                    case "+":
                        counter--;
                        bonus();
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir karakter giriniz");
                        break;
                }
            }
            engeller();
            bonuslar();
            random();
        }
    }


    public static void bonuslar() {
        if (labirent[start_row][start_col] == 'T') {
            bonuslar[0]++;
            labirent[start_row][start_col] = '.';
            System.out.println("T:" + bonuslar[0]);
        } else if (labirent[start_row][start_col] == 'R') {
            labirent[start_row][start_col] = '.';
            bonuslar[1]++;
            System.out.println("R:" + bonuslar[1]);
        } else if (labirent[start_row][start_col] == 'H') {
            bonuslar[2]++;
            labirent[start_row][start_col] = '.';
            System.out.println("H:" + bonuslar[2]);
        } else if (labirent[start_row][start_col] == 'F') {
            bonuslar[3]++;
            labirent[start_row][start_col] = '.';
            System.out.println("F:" + bonuslar[3]);
        }
    }

    public static void bonus() {
        boolean outer_loop = true;
        boolean inner_loop = true;
        while (outer_loop) {
            if (outer_loop = false) {
                break;
            }
            System.out.println("Lütfen Kullanmak istediğiniz bonusu seçiniz(T:Işınlanma bonusu,H: Yapılan hamle sayısını azaltma bonusu,exit: bonus kullanımından ayrılma):");
            String bonus = input.next();
            bonus = bonus.toUpperCase();
            if (bonus.equals("EXİT")) {
                System.out.println("Bonus kullanım ekranı kapatıldı.\n(W: Yukarı, S: Aşağı ,A: Sola, D: Sağa, +: Bonus kullanımı, exit: Çıkış):");
                break;
            } else {
                switch (bonus) {
                    case "T":
                        if (bonuslar[0] > 0) {
                            System.out.println("Işınlanma bonusu kullandınız");
                            while (inner_loop) {
                                if (!inner_loop) {
                                    break;
                                } else {
                                    System.out.println("Lütfen gitmek istediğiniz satırın ve sütünün numarasını yazınız:");
                                    String girdi1 = input.next();
                                    String girdi2 = input.next();
                                    if (Character.isDigit(girdi1.charAt(0)) && Character.isDigit(girdi2.charAt(0))) {
                                        int teleport_row = Integer.parseInt(girdi1);
                                        int teleport_col = Integer.parseInt(girdi2);
                                        if (teleport_row < 0 || teleport_row > labirent.length - 1 || teleport_col < 0 || teleport_col > labirent[start_row].length - 1) {
                                            System.out.println("Lütfen geçerli alanlar içerisinde bir değer belirleyiniz.");
                                            outer_loop = true;
                                        } else if (labirent[teleport_row][teleport_col] == '#' || labirent[teleport_row][teleport_col] == '!') {
                                            System.out.println("Gittiğiniz yerde duvar veya mayın var.");
                                            outer_loop = true;
                                        } else {
                                            start_row += (teleport_row - start_row);
                                            start_col += (teleport_col - start_col);
                                            System.out.println(loc_message());
                                            bonuslar[0]--;
                                            outer_loop = false;
                                            inner_loop = false;
                                        }
                                    } else {
                                        System.out.println("Lütfen Integer değerler giriniz.");
                                        outer_loop = true;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Elinizde T bonusu bulunmamaktadır");
                            break;
                        }
                        break;
                    case "H":
                        if (bonuslar[2] > 0) {
                            bonuslar[2]--;
                            counter -= 2;
                            System.out.println("Yapılan hamle sayısını azaltma bonusunu kullandınız \nyeni hamle sayınız:" + " " + counter);
                            outer_loop = false;
                        } else {
                            System.out.println("Elinizde H bonusu bulunmamaktadır.");
                            outer_loop = true;
                            break;
                        }
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir bonus giriniz");
                        outer_loop = true;
                        break;
                }
            }
        }
    }


    public static void engeller() {
        if (labirent[start_row][start_col] == '#') {
            System.out.println("Duvara çarptınız");
            if (bonuslar[1] > 0) {
                labirent[start_row][start_col] = '.';
                System.out.println("Elinizde Duvar kırma bonusu bulunmaktadır. Bu konuma ilerleyebilirsiniz" + loc_message());
                bonuslar[1]--;
            } else {
                System.out.println("Elinizde duvar kırma bonusu bulunmamaktadır. Lütfen başka bir konuma ilerleyiniz.");
                switch (yon) {
                    case "w" -> start_row++;
                    case "s" -> start_row--;
                    case "a" -> start_col++;
                    case "d" -> start_col--;
                }
                System.out.println(loc_message());
            }
        } else if (labirent[start_row][start_col] == '!') {
            System.out.println("Mayına bastınız.");
            if (bonuslar[3] > 0) {
                bonuslar[3]--;
                labirent[start_row][start_col] = '.';
                System.out.println("Elinizde mayın çözme bonusu bulunmaktadır. Bu konuma ilerleyebilirsiniz." + " " + loc_message());
            } else {
                counter += 5;
                System.out.println("Elinizde mayın çözme bonusu bulunmamaktadır. Hamle sayınız 5 arttırılmıştır");
                System.out.println("Anlık Hamle sayınız: " + counter);
            }
        }
    }

    public static void random() {
        char[] bonus_random = {'T', 'R', 'F', 'H'};
        char temp = ' ';
        int randomRow;
        int randomCol;
        while (counter % 5 == 0 && counter > 0) {
            for (int row = 0; row < labirent.length; row++) {
                for (int col = 0; col < labirent[row].length; col++) {
                    randomRow = (int) (Math.random() * labirent.length);
                    randomCol = (int) (Math.random() * labirent[row].length);
                    for (char c : bonus_random) {
                        if (labirent[randomRow][randomCol] != 'B' && labirent[randomRow][randomCol] != 'E' && labirent[randomRow][randomCol] != '#') {
                            if (labirent[row][col] == '!' && labirent[randomRow][randomCol] == '.') {
                                temp = labirent[row][col];
                                labirent[row][col] = labirent[randomRow][randomCol];
                                labirent[randomRow][randomCol] = temp;
                            } else if (labirent[row][col] == c && labirent[randomRow][randomCol] != c || labirent[row][col] == c && labirent[randomRow][randomCol] != '#') {
                                temp = labirent[row][col];
                                labirent[row][col] = labirent[randomRow][randomCol];
                                labirent[randomRow][randomCol] = temp;
                            }
                        }
                    }
                }
            }
            System.out.println("Yeni Labirent: \n");
            printarr();
            break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Labirent Oyunu");
        printarr();
        movement();
        bonuslar();
        random();
    }
}