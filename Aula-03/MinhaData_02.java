

public class MinhaData {
    private byte dia = 1;
    private byte mes = 1;
    private short ano = 1970;

    public boolean setData(byte dia, byte mes, short ano) {
        if (setAno(ano) && setMes(mes) && setDia(dia))
            return true;
        else
            return false;
    }

    public int getDia() {
        return dia;
    }

    public boolean setDia(byte dia) {
        if (mes == 1 || mes == 3 || mes == 5 || 
            mes == 7 || mes == 8 || mes == 10 || mes == 12)
            if (dia > 0 && dia <= 31) {
                this.dia = dia;
                return true;
            } else {
                return false;
            }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            if (dia > 0 && dia <= 30) {
                this.dia = dia;
                return true;
            } else {
                return false;
            }
        else if (mes == 2)
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
                if (dia > 0 && dia <= 29) {
                    this.dia = dia;
                    return true;
                } else {
                    return false;
                }
            else
                if (dia > 0 && dia <= 28) {
                    this.dia = dia;
                    return true;
                } else {
                    return false;
                }
        else
            return false;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(byte mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
            this.dia = 1;
            return true;
        } else {
            return false;
        }
    }

    public int getAno() {
        return ano;
    }

    public boolean setAno(short ano) {
        if (ano > 0) {
            this.ano = ano;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public static long data2mili(MinhaData_01 data) {
        long mili = 0;
        if (data.getAno() < 1970)
            return -1;
        for (int i = 1970; i < data.getAno(); i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
                mili += 366 * 24 * 60 * 60 * 1000;
            else
                mili += 365 * 24 * 60 * 60 * 1000;
        }
        for (int i = 1; i < data.getMes(); i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                mili += 31 * 24 * 60 * 60 * 1000;
            else if (i == 4 || i == 6 || i == 9 || i == 11)
                mili += 30 * 24 * 60 * 60 * 1000;
            else if (data.getAno() % 4 == 0 && data.getAno() % 100 != 0 || data.getAno() % 400 == 0)
                mili += 29 * 24 * 60 * 60 * 1000;
            else
                mili += 28 * 24 * 60 * 60 * 1000;
        }
        mili += (data.getDia() - 1) * 24 * 60 * 60 * 1000;
        return mili;
    }

    public static MinhaData_01 mili2data(long mili){
        MinhaData_01 data = new MinhaData_01();
        int dias = (int) (mili / (24 * 60 * 60 * 1000));
        int anos = 0;
        while (dias >= 365) {
            if (anos % 4 == 0 && anos % 100 != 0 || anos % 400 == 0)
                dias -= 366;
            else
                dias -= 365;
            anos++;
        }
        data.setAno((short) (1970 + anos));
        int mes = 1;
        while (dias >= 28) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                dias -= 31;
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                dias -= 30;
            else if (data.getAno() % 4 == 0 && data.getAno() % 100 != 0 || data.getAno() % 400 == 0)
                dias -= 29;
            else
                dias -= 28;
            mes++;
        }
        data.setMes((byte) mes);
        data.setDia((byte) (dias + 1));
        return data;
    }

}