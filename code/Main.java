public class Main {

    public static void main(String[] args) {
        //コメントと追加
        Item item = new Item("みかん", 200);
        System.out.println(item);
        item.setName("ばなな");
        item.setPrice(150);
        System.out.println(item);
    }

}