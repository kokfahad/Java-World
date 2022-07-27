public enum Cereals {
    Cornflucks(80, 350),
    Kokocrunch(80, 350),
    Oats(50,270),
    Chocos(70, 330);

    int tasteLevel;
    int price;

    Cereals(int tasteLevel, int price){
        this.tasteLevel = tasteLevel;
        this.price = price;
    }
}
