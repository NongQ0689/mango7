public interface Handler {
    public void setHandler(Handler nextHandler); //กำหนดว่า ถ้าทำไม่ได้จะส่งให้ใคร (nextHandler)
    public void process(File file);
    public String getName();
}