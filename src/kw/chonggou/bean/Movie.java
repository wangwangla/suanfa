package kw.chonggou.bean;

public class Movie {
    //影片类型
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;
    public Movie(String title,int priceCode){
        _title = title;
        _priceCode = priceCode;
    }

    public int get_priceCode() {
        return _priceCode;
    }

    public void set_priceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_title() {
        return _title;
    }
}
