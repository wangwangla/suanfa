package kw.test.other.chpter4;

public class Stack extends StackInterface{

    @Override
    public void push(String str) {
        if (top<100){
            stack[++top] = str;
        }else {
            throw new IllegalArgumentException("栈已满！");
        }
    }

    @Override
    public String pop() {
        if (top != -1){
            return stack[top];
        }
        return null;
    }

    @Override
    public int getLength() {
        return top+1;
    }

}
