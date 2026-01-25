class Solution {

    static int a = 0;

    public int solution(int n, String control) {
        a = n;

        for (int i = 0; i < control.length(); i++) {
            function(n, control.charAt(i));
        }

        return a;
    }

    static void function(int n, char c) {
        switch (c) {
            case 'w':
                a += 1;
                break;
            case 's':
                a -= 1;
                break;
            case 'd':
                a += 10;
                break;
            case 'a':
                a -= 10;
                break;
        }
    }
}