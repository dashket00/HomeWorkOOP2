public class MyCloneClass implements Cloneable {

    private String data;

    public MyCloneClass(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        MyCloneClass original = new MyCloneClass("Hello, World!");

        try {
            MyCloneClass clone = (MyCloneClass) original.clone();

            System.out.println("Original : " + original.getData());
            System.out.println("Clone : " + clone.getData());

            original.setData("New");

            System.out.println("Original after modification: " + original.getData());

            System.out.println("Clone after modification in original: " + clone.getData());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}