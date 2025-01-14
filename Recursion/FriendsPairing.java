public class FriendsPairing {
    public static int friendsPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendsPairing(n - 1); 
        int fnm2 = friendsPairing(n - 2);
        int pairways = fnm2 + (n - 1);

        int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
}
