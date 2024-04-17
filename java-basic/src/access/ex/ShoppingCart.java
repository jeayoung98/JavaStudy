package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;



    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    private int totalPrice(){
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total += item.totalPrice();
        }
        return total;
    }

    public void displayItems(){
        System.out.println("장바구니 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + " , 합계 : " + item.totalPrice());
            System.out.println("총가격 : " + totalPrice());
        }
    }

}
