package kw.chonggou.bean;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rantals = new Vector();

    public Customer(Rental rental){
        _rantals.addElement(rental);
    }

    public String get_name(){
        return _name;
    }

    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rantals.elements();
        String result = "Rental Record for"+ get_name() + "\n";
        while (rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental)rentals.nextElement();

            switch (each.get_movie().get_priceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.get_daysRented() > 2) {
                        thisAmount += (each.get_daysRented() - 2) * 1.5F;
                        break;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.get_daysRented()+2;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5F;
                    if (each.get_daysRented() > 1) {
                        thisAmount += (each.get_daysRented()-3) * 1.5F;
                        break;
                    }
                    break;
            }
            frequentRenterPoints++;
            if ((each.get_movie().get_priceCode() == Movie.NEW_RELEASE)&&
            each.get_daysRented()>1){
                frequentRenterPoints++;
            }
            result += "\t"+each.get_movie().get_title()+"  "+String.valueOf(thisAmount);
            totalAmount += thisAmount;
        }
        result  += "Amm";
        return  result;
    }
}
