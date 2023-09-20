public class Moto {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;

public Moto(String marca, String modelo, String placa, String cor) {
    setMarca(marca);
    setModelo(modelo);
    setPlaca(placa);
    setCor(cor);
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

public String getModelo() {
    return this.modelo;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public String getPlaca() {
    return this.placa;
}

public void setCor(String cor) {
    this.cor = cor;
}

public String getCor(){
    return this.cor;
}

public static void Acelerar (int acelerar) {
System.out.printf("A aceleração é:");
        acelerar = (5);
}
}