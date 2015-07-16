/**
 * Created by admin on 03.07.2015.
 */
public class Fruit {
    int ves;
    String sort;

    public Fruit(int ves, String sort) {
        this.ves = ves;
        this.sort = sort;
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int ves) {
        this.ves = ves;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "sort='" + sort + '\'' +
                '}';
    }

    public void one(){
        qaz();

    }
    public  void two(){
        qaz();
        int y =90;
    }

    private void qaz() {
        System.out.println(34);
    }

}

class Orange extends  Fruit{
String proizvoditel;

    public Orange(int ves, String sort) {
        super(ves, sort);
    }

   public void tree(){

   }

}
