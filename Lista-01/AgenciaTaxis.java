public class AgenciaTaxis {
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi(5);
        Taxi taxi3 = new Taxi(3, 4);
        Taxi taxi4 = new Taxi(taxi3);
        System.out.println(taxi1.qualMeuId());
        System.out.println(taxi2.qualMeuId());
        System.out.println(taxi3.qualMeuId());
        System.out.println(taxi4.qualMeuId());
    }
}
