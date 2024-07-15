class Fruit{
    String name;
    String fruit;

    public Fruit(String name, String fruit){
        this.name = name;
        this.fruit = fruit;
    }

    @Override 
    public String toString(){
        return "toString 재정의";
    }
}

class Fruit_TEST {
    public static void main(String[] args) {
        Fruit Fruit_f1 = new Fruit("사과", "빨강");
        System.out.println(Fruit_f1);
    }
}