package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double cover(){
        if(feeding() < 30.00){
            return 4.00;
        }else{
            return 0.00;
        }
    }
    public double feeding(){
        return this.beer * 5 + this.barbecue * 7 + this.softDrink * 3;
    }
    public double ticket(){
        if(this.gender == 'F' || this.gender == 'f'){
            return 8.00;
        }else {
            return 10.00;
        }
    }
    public double total(){
        return feeding() + ticket() + cover();
    }
    public String toString(){
        return "Consumo = R$ "
                + String.format("%.2f%n", feeding())
                + (cover() != 0.00 ? String.format("Couvert = R$ %.2f", cover()): "Insento Couvert")
                + String.format("%nIngresso = R$ %.2f%n", ticket())
                + String.format("%nValor a pagar = R$ %.2f", total());
    }


}
