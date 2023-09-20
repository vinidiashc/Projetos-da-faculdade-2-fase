public class Onibus{
    private String marca;
    private String empresa;
    private String placa;
    private int qtDeAssentos;


public Onibus (String marca, String empresa, String placa, int qtDeAssentos) {
    setMarca(marca);
    setEmpresa(empresa);
    setPlaca(placa);
    setQtDeAssentos(qtDeAssentos);
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getMarca() {
    return this.marca;
}

public void setEmpresa(String empresa) {
    this.empresa = empresa;
}

public String getEmpresa() {
    return this.empresa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public String getPlaca() {
    return this.placa;
}

public void setQtDeAssentos(int qtDeAssentos) {
    this.qtDeAssentos = qtDeAssentos;
}

public int getQtDeAssentos() {
    return this.qtDeAssentos;
}

public static void Acelerar (int acelerar) {
System.out.printf("A aceleração é:");
        acelerar = (2);
}
}