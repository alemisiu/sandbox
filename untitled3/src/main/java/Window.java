public class Window {
    boolean open;
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }


    Window(boolean open, int width, int height){
        this.open = open;
        this.width = width;
        this.height = height;
    }
}


class MyStart {
    public static void main(String[] args) {
        var v1 = new Window(true, 1, 2);
        var v2 = new Window(false, 2, 3);

        v1.setWidth(7);
        System.out.println(v1.getWidth());

    }
}