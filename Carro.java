public class Carro {

    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private int qtDePortas;
    

public Carro (String marca, String modelo, String cor, String placa, int qtDePortas) {
    setMarca(marca);
    setModelo(modelo);
    setCor(cor);
    setPlaca(placa);
    setQtDePortas(qtDePortas);
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getMarca() {
    return this.marca;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public String getmodelo() {
    return this.modelo;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getCor() {
    return this.cor;
}

public void setPlaca(String placa) {
    this.placa = placa;
}


public String getPlaca() {
    return this.placa;
}

public void setQtDePortas(int qtDePortas) {
    this.qtDePortas = qtDePortas;
}

public int getQtDePortas() {
    return this.qtDePortas;
}

public static void Acelerar (int acelerar) {
System.out.printf("A aceleração é:");
        acelerar = (10);
}
}