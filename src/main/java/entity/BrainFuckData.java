package entity;


public class BrainFuckData {

    private char[] charArray;
    private int currentIndexInArray;

    public BrainFuckData() {
        this.charArray = new char[30000];
        this.currentIndexInArray = 0;
    }

    public char[] getCharArray() {
        return charArray;
    }

    public void setCharArray(char[] charArray) {
        this.charArray = charArray;
    }

    public int getCurrentIndexInArray() {
        return currentIndexInArray;
    }

    public void setCurrentIndexInArray(int currentIndexInArray) {
        this.currentIndexInArray = currentIndexInArray;
    }
}
