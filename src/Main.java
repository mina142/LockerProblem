import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       /* You have 100 closed lockers. Start with the first locker and for
        every locker open it. Now, starting with the second locker,
        for this locker and every second locker after that,
        if the locker is open, close it; if it is closed, open it.
        Then, starting with the third locker, for this locker and every third locker
        after that, if the locker is open, close it; if it is closed, open it.
        Continue with the nth locker changing the “position” of every nth
        locker until n = 100. Print out the locker numbers that remain open.
        What do you notice about the lockers that remain open?*/
        int nbLock = 100;
        boolean[] lock = new boolean[nbLock+1];
        for(int s = 1; s <= nbLock; ++s) {
            for(int j = s; j <= nbLock; j += s) {
                lock[j] = !lock[j];
            }


        } for(int i = 1; i < lock.length; ++i) {
            if(lock[i])
                System.out.print("open" + i + " ");
            else
                System.out.print("close" + i + " ");
        }
        System.out.println();


    }
}
