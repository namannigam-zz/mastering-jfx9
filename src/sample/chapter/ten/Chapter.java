package sample.chapter.ten;

public class Chapter {

    private final String title;
    private final int number;

    public Chapter(int number, String title) {
        this.title = title;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

}