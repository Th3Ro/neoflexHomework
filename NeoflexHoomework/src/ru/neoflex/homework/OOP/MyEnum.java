package NeoflexHoomework.src.ru.neoflex.homework.OOP;

import java.util.ArrayList;

public class MyEnum {
    private String name;

    private MyEnum (String name) {
        this.name = name;
        values.add(this);
    }

    public static final ArrayList<MyEnum> values = new ArrayList<>();

    public static final MyEnum MONDAY = new MyEnum("monday");
    public static final MyEnum TUESDAY = new MyEnum("tuesday");
    public static final MyEnum WEDNESDAY = new MyEnum("wednesday");
    public static final MyEnum THURSDAY = new MyEnum("thursday");
    public static final MyEnum FRIDAY = new MyEnum("friday");
    public static final MyEnum SATURDAY = new MyEnum("saturday");
    public static final MyEnum SUNDAY = new MyEnum("sunday");

    public static MyEnum valueOf(String name) {
        for (MyEnum myEnum: values){
            if (myEnum.name.equalsIgnoreCase(name))
                return myEnum;
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }

    @Override
    public String toString() {
        return name;
    }
}
