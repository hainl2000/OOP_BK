package hust.soict.hedspi.Lab03;

public class Order1 {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc[] itemsOrders = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    int qtyOrdered = 0;
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


    public void addDigitalVideoDisc(DigitalVideoDisc _disc)
    {
        if(this.qtyOrdered >= MAX_NUMBERS_ORDERED)
        {
            System.out.println("The order is almost full");
        }
        else{
            this.itemsOrders[this.qtyOrdered] = _disc;
            this.qtyOrdered += 1;
            System.out.println("The disc has been added");
        }
    }

    public float totalCoins(){
        float result = 0;
        for (int i=0;i<this.qtyOrdered;i++)
        {
            if (this.itemsOrders[i] != null)
                result += this.itemsOrders[i].getCost();
        }
        return result;
    }

    public void showOrder()
    {
        for (int i=0;i<this.qtyOrdered;i++)
            if (this.itemsOrders[i] != null)
                this.itemsOrders[i].showDigitalVideoDisc();
    }

    private int findIndex(String _title)
    {
        for (int i=0;i<this.qtyOrdered;i++)
        {
            if(this.itemsOrders[i].getTitle().compareTo(_title) == 0)
            {
                return i;
            }
        }
        return -1;
    }

    public void removeDigitalVideoDisc(String _title)
    {
        int i=findIndex(_title);
//        int check = 0;
//        int indexRemove = this.findIndex(_title);
//        if (indexRemove != -1)
//        {
//            this.itemsOrders[indexRemove] = null;
//            for (int i=0;i<this.qtyOrdered;i++)
//            {
//                if (check == 1)
//                {
//                    this.itemsOrders[i-1] = this.itemsOrders[i];
//                    this.itemsOrders[i] = null;
//                }
//                if (this.itemsOrders[i] == null)
//                {
//                    check = 1;
//                }
//            }
//            this.qtyOrdered -= 1;
//            System.out.println("The disc have been removed");
//        }
//        else {
//            System.out.println("Not having a disc which you wanna remove");
//        }
        System.arraycopy(this.itemsOrders, i+1, this.itemsOrders, i , this.qtyOrdered-- - i);
    }
}
