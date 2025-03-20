import java.util.ArrayList;
import java.util.List;

// Clasa pentru reprezentarea unui cadou din wishlist
class Gift {
    private String name;
    private double price;
    private boolean isPurchased;

    public Gift(String name, double price) {
        this.name = name;
        this.price = price;
        this.isPurchased = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void purchaseGift() {
        if (!isPurchased) {
            isPurchased = true;
            System.out.println(name + " has been purchased.");
        } else {
            System.out.println(name + " was already purchased.");
        }
    }
}

// Clasa pentru Wishlist-ul unui utilizator
class Wishlist {
    private String owner;
    private List<Gift> gifts;

    public Wishlist(String owner) {
        this.owner = owner;
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
        System.out.println(gift.getName() + " has been added to " + owner + "'s wishlist.");
    }

    public void showWishlist() {
        System.out.println(owner + "'s Wishlist:");
        for (Gift gift : gifts) {
            System.out.println("- " + gift.getName() + " ($" + gift.getPrice() + ") " + (gift.isPurchased() ? "[Purchased]" : "[Available]"));
        }
    }
}

// Clasa principală pentru testarea funcționalității
public class PeerToPeerGifting {
    public static void main(String[] args) {
        Wishlist wishlist = new Wishlist("Alice");
        Gift gift1 = new Gift("Smartwatch", 199.99);
        Gift gift2 = new Gift("Wireless Earbuds", 79.99);

        wishlist.addGift(gift1);
        wishlist.addGift(gift2);

        wishlist.showWishlist();

        // Achiziționarea unui cadou
        gift1.purchaseGift();

        wishlist.showWishlist();
    }
}
