package kw.chonggou.bean.after;

import kw.chonggou.bean.Movie;
import kw.chonggou.bean.Rental;

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
            frequentRenterPoints = each.fre();
          //  thisAmount = each.amountFor();

            result += "\t"+each.get_movie().get_title()+"  "+String.valueOf(each.amountFor());
            totalAmount += thisAmount;
        }
        result  += "Amm";
        return  result;
    }


}
