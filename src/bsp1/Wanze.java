package bsp1;

public class Wanze {
    public static void main(String[] args) {
        String mauer = "Auf der Mauer";
        mauer +=", auf der Lauer";
        mauer +=", sitzt 'ne kleine Wanze ";

        //System.out.println(mauer);
        for (int i = mauer.length()-1; i > 0; i--) {
            mauer=mauer.substring(0,i);
            System.out.println(mauer);
        }
    }
}
