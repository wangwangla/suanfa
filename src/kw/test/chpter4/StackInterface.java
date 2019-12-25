package kw.test.chpter4;

public abstract class StackInterface {
    int N = 100;
    protected String [] stack = new String[N];
    protected int length;
    protected int top = -1;
    public abstract void push(String str);
    public abstract String pop();
    public abstract int getLength();
}
