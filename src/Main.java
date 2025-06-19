public class Main {
    public static void main(String[] args) {
        Fighter Khamzat = new Fighter("Khamzat", 15, 100, 90, 0);
        Fighter McConor = new Fighter("McConor", 10, 95, 100, 0);

        Match match = new Match(Khamzat,McConor,90,100);
        match.run();
    }
}