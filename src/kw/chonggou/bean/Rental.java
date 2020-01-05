package kw.chonggou.bean;

public class Rental {
    private Movie _movie;
    private int _daysRented;
    public Rental(Movie movie,int daysRented){
        _movie = movie;
        _daysRented = daysRented;
    }

    public int get_daysRented() {
        return _daysRented;
    }

    public Movie get_movie() {
        return _movie;
    }

    public int amountFor(){
        int thisAmount = 0;
        switch (get_movie().get_priceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (get_daysRented() > 2) {
                    thisAmount += (get_daysRented() - 2) * 1.5F;
                    break;
                }
                break;
            case Movie.NEW_RELEASE:
                thisAmount += get_daysRented()+2;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5F;
                if (get_daysRented() > 1) {
                    thisAmount += (get_daysRented()-3) * 1.5F;
                    break;
                }
                break;
        }
        return thisAmount;
    }

    public int fre(){
        int frequentRenterPoints = 0;
        frequentRenterPoints++;
        if ((get_movie().get_priceCode() == Movie.NEW_RELEASE)&&
                get_daysRented()>1){
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
