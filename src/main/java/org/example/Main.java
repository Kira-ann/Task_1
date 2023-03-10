package org.example;

public class Main {
    private final int column;
    private final int line;
    private char[][] status;

    public Main(int line, int column) {
        this.line = line;
        this.column = column;
        char[][] status = new char[line][column];
        for (int i = 0; i < status.length; i++) {
            for (int j = 0; j < status[i].length; j++) {
                status[i][j] = ' ';
            }
        }
        this.status = status;
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
    public int diagonalLength(char chip){//метод для нахождения самой длинной последовательности по диагонали
        int maximum = 0;
        int ans = 0;
        for (int i = 0; i < status.length; i++) {
            if (status[i][i] == chip) {
                ans++;
                maximum = Math.max(maximum, ans);
            }
            else ans = 0;
        }
        ans = 0;
        for (int i = 0; i < status.length; i++) {
            if (status[i][column - i - 1] == chip) {
                ans++;
                maximum = Math.max(maximum, ans);
            }
            else ans = 0;
        }
        return maximum;
    }
    public int lineVertical(char chip){
        int maximum = 0;
        for(int i = 0; i < column; i++){
            int ans = 0;
            for(int j = 0; j < line; j++){
                if (status[j][i] == chip) {
                    ans ++;
                    maximum = Math.max(maximum, ans);
                }
                else ans = 0;
            }
        }
        return maximum;
    }
    public char getStatus(int a, int b) {
        return status[a][b];
    }
    @Override
    public String toString(){
        String temp = "";
        for (int i = 0; i < status.length; i++) {
            for (int j = 0; j < status[i].length; j++) {
                temp = temp + status[i][j] + " ";
            }
            temp = temp + "\n";
        }
        return temp;
    }
}

