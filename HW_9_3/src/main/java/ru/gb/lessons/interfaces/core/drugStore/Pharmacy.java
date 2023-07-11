package HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private List<Component> components;
    private int componentsCount;
    private int id;

    public Pharmacy() {

    }

    public int getid() { return id; }
    public void setId() { this.id = id; }

    public Pharmacy(int id) {
        this.id = id;
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }
    public Pharmacy addComponent (Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "id=" + getid() +
                "components=" + components +
                ", index=" + componentsCount +
                '}'+"Total power = "+getPower(this)+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<Component>() { //Анонимный класс
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//        };
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int result;
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        result = Integer.compare(pow1, pow2);
            if (Integer.compare(pow1, pow2) == 0){
                String str1 = getStr(this);
                String str2 = getStr(o);
                result = CharSequence.compare(str1,str2);
            }
        return result;
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }
    private int getPower (Pharmacy pharm) {
        int result = 0;
        for (Component elem: pharm.getComponents()) {
            result += elem.getPower();
        }
        return result;
    }

    private String getStr (Pharmacy o) {
        String str = "";
        for (Component el: o.getComponents()){
            str += el.getName();
        }
        return str;
    }

    @Override
    public boolean equals (Pharmacy obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Pharmacy chmcl = (Pharmacy) obj;
        return getid() == chmcl.getid();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getid());
    }

}
