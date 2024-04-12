
public class Main_00 {
    public static void main(String[] args) {
        MinhaData_00 data = new MinhaData_00();
        System.out.println(data);
        data.setData((byte) 31, (byte) 12, (short) 2020);
        System.out.println(data);
        data.setDia((byte) 32);
        System.out.println(data);
        data.setDia((byte) 3);
        System.out.println(data);
        data.setMes((byte) 13);
        System.out.println(data);
        data.setMes((byte) 9);
        System.out.println(data);
    }
}


