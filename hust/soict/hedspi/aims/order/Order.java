package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {

    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;
    public static int nbOrders = 0;
    private DigitalVideoDisc[] itemsOrders = null;
    public int qtyOrdered;
    private MyDate dateOrdered;

    public MyDate getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(MyDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public DigitalVideoDisc[] getItemsOrders() {
        return itemsOrders;
    }

    public void setItemsOrders(DigitalVideoDisc[] itemsOrders) {
        this.itemsOrders = itemsOrders;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public Order() {
        if (nbOrders >= MAX_LIMITED_ORDERS) {
            System.out.println("Qua so luong");
        } else {
            this.dateOrdered = new MyDate();
            this.itemsOrders = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
            nbOrders++;
            this.qtyOrdered = 0;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc _disc) {
        if (this.itemsOrders == null) {
            System.out.println("loi khi add");
        } else {
            if (this.qtyOrdered >= MAX_NUMBERS_ORDERED) {
                System.out.println("The order is almost full");
            } else {
                this.itemsOrders[this.qtyOrdered] = _disc;
                this.qtyOrdered += 1;
                System.out.println("The disc has been added");
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (this.itemsOrders == null) {
            System.out.println("loi khi add 2");
        } else {
            if (dvdList.length + qtyOrdered > MAX_NUMBERS_ORDERED) {
                System.out.println("Surpass full order");
            } else {
                for (DigitalVideoDisc disc : dvdList) {
                    this.itemsOrders[this.qtyOrdered] = disc;
                    this.qtyOrdered += 1;
                    System.out.println("New order has been added");
                }
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc _disc1, DigitalVideoDisc _disc2) {
        if (this.itemsOrders == null) {
            System.out.println("loi khi add 3");
        } else {
            if (this.qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
                System.out.println("The order is almost full");
            } else {
                this.itemsOrders[this.qtyOrdered] = _disc1;
                this.qtyOrdered += 1;
                this.itemsOrders[this.qtyOrdered] = _disc2;
                this.qtyOrdered += 1;
                System.out.println("2 disc have been added");
            }
        }
    }

    public float totalCoins() {
        float result = 0;
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrders[i] != null)
                result += this.itemsOrders[i].getCost();
        }
        return result;
    }

    public void showOrder() {
        System.out.println("Date: " + this.dateOrdered.getDay() + " " + this.dateOrdered.getMonth() + " " + this.dateOrdered.getYear());
        System.out.println("Ordered Items: ");
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrders[i] != null)
                this.itemsOrders[i].showDigitalVideoDisc();
        }
        System.out.println("Total Coins: " + this.totalCoins());
    }

    private int findIndex(String _title) {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if (this.itemsOrders[i].getTitle().compareTo(_title) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void removeDigitalVideoDisc(String _title) {
        int check = 0;
        int indexRemove = this.findIndex(_title);
        if (indexRemove != -1) {
            this.itemsOrders[indexRemove] = null;
            for (int i = 0; i < this.qtyOrdered; i++) {
                if (check == 1) {
                    this.itemsOrders[i - 1] = this.itemsOrders[i];
                    this.itemsOrders[i] = null;
                }
                if (this.itemsOrders[i] == null) {
                    check = 1;
                }
            }
            this.qtyOrdered -= 1;
            System.out.println("The disc have been removed");
        } else {
            System.out.println("Not having a disc which you wanna remove");
        }
    }

    public DigitalVideoDisc getaALuckyItem()
    {
        if (this.qtyOrdered != 0) {
            int index = ((int) (Math.random() * 100)) % this.qtyOrdered;
            System.out.println(index);
            return this.itemsOrders[index];
        }
        else
        {
            return null;
        }
    }
}
