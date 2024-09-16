class mobile {
    int price;
    String name;
    static int duration;

    public void show() {
        System.out.println(price + ":" + name + ":" + duration);
    }

    public static void show1(mobile obj) {
        System.out.println(obj.price + ":" + obj.name + ":" + duration);
    }
}

class demo {
    public static void main(String a[]) {
        mobile obj1 = new mobile();
        obj1.price = 1500;
        obj1.name = "Apple";
        mobile.duration = 12;

        mobile obj2 = new mobile();
        obj2.price = 1590;
        obj2.name = "Samsung";
        mobile.duration = 10;

        obj1.show();
        obj2.show();
        mobile.show1(obj1);
    }
}