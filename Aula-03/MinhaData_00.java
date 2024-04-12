public class MinhaData_00 {
    //Atributos da Classe
    private byte dia;
    private byte mes;
    private short ano;
    //Métodos da Classe
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
}


