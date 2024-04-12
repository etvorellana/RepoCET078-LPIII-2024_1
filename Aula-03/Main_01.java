public class Main_01 {
    public static void main(String[] args) {
        MinhaData data1 = new MinhaData();
        System.out.println(data1);
        data1.setAno((short) 2020);
        data1.setMes((byte) 2);
        data1.setDia((byte) 29);
        System.out.println(data1);
        MinhaData data2 = data1;
        if(data1 == data2){
            System.out.println("data1 == data2");
        } else {
            System.out.println("data1 != data2");
        }
        System.out.println(data2);
        data2.setDia((byte)15);
        System.out.println(data1);
        System.out.println(data2);
        data1 = new MinhaData(data2);
        System.out.println(data1);
        data1.setMes((byte) 7);
        System.out.println(data1);
        System.out.println(data2);
        data1.setData((byte) 28, (byte) 9, (short) 1972);
        data2.setAno((short)1972);
        data2.setMes((byte)9);
        data2.setDia((byte)28);
        System.out.println(data1);
        System.out.println(data2);
        if(data1 == data2){
            System.out.println("data1 == data2");
        } else {
            System.out.println("data1 != data2");
        }

    }
}
