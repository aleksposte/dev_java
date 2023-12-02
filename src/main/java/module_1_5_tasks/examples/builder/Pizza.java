package module_1_5_tasks.examples.builder;

public class Pizza {
    private Dough dough;
    private Filling filling;
    private String  sauce;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setFilling(Filling filling) {
        this.filling = filling;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", filling=" + filling +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
