package p1;

public class Cala implements Comparable<Cala> {
    private String owner;
    private int price;

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public int compareTo(Cala o){
        return this.getOwner().charAt(1)-o.getOwner().charAt(1);
    }
    Cala(){

    }
    public Cala(String owner, int price){
        setOwner(owner);
        setPrice(price);
    }

}
