public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.height = this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = this.width = height;
    }
}
