public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            // Başlangıç sırasını rastgele belirle
            boolean f1Starts = Math.random() < 0.5;
            System.out.println("İlk vuruşu yapacak dövüşçü: " + (f1Starts ? f1.name : f2.name));

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("====== NEW ROUND ======");

                if (f1Starts) {
                    f2.health = f1.hit(f2);
                    if (isWin()) break;

                    f1.health = f2.hit(f1);
                    if (isWin()) break;
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) break;

                    f2.health = f1.hit(f2);
                    if (isWin()) break;
                }

                printScore();
            }

        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) &&
                (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println(f2.name + " the winner!");
            return true;
        } else if (f2.health <= 0) {
            System.out.println(f1.name + " the winner!");
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("====== Current Score ======");
        System.out.println(f1.name + " Health: " + f1.health);
        System.out.println(f2.name + " Health: " + f2.health);
    }
}
