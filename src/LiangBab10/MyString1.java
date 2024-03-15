package LiangBab10;

class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }

        int length = end - begin;
        char[] subChars = new char[length];

        for (int i = begin; i < end; i++) {
            subChars[i - begin] = chars[i];
        }

        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch + 'a' - 'A');
            temp[i] = ch;
        }
        return new MyString1(temp);
    }

    public boolean equals(MyString1 s) {
        int i = 0;
        if (chars.length != s.length())
            return false;
        for (;;) {
            if (i >= chars.length)
                break;
            if (chars[i] != s.charAt(i++))
                return false;
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(Integer.toString(i).toCharArray());
    }

    public String toString() {
        return new String(chars);
    }

}