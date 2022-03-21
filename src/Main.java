public class Main {
    public static void main(String[] args) {

        ModArrayList modArrayList = new ModArrayList();

        modArrayList.add(0, 1);
        modArrayList.add(1, 3);
        modArrayList.add(2, 5);

        System.out.println(modArrayList.getUsingMod(3));
        System.out.println(modArrayList.getUsingMod(-2));

    }
}
