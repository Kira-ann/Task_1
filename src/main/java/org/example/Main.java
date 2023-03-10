package org.example;

public class Main {
    private final int column;
    private final int line;
    private char[][] status;

    Main(int line, int column) {
        this.line = line;
        this.column = column;
        char[][] status = new char[line][column];
        for (int i = 0; i < status.length; i++) {
            for (int j = 0; j < status[i].length; j++) {
                status[i][j] = ' ';
            }
        }
        System.out.println(status);
    }

    public void delete(int lineSecond, int columnSecond) {
        status[lineSecond][columnSecond] = ' ';
    }
    public void create(int lineSecond, int columnSecond, char chip) {
        status[lineSecond][columnSecond] = chip;
    }

    public int lineHorizontal(char chip){//метод для нахождения самой длинной последовательности по горизонтали
        int maximum = 0;
        for (int i = 0; i < status.length; i++) {
            int ans = 0;
            for (int j = 0; j < status[i].length; j++){
                if (status[i][j] == chip) {
                    ans++;
                    maximum = Math.max(maximum, ans);
                }
                else ans = 0;
            }
        }
        return maximum;
    }
    public char[][] getStatus() {
        return status;
    }
}

