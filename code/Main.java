public class Main {

    public static void main(String[] args) {
        Item item = new Item("りんご", 200);
        System.out.println(item);
        item.setName("ばなな");
        item.setPrice(150);
        System.out.println(item);
    }
}