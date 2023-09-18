package Veiculos;
class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    public void frear() {
        System.out.println("O veículo está freando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    public Carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    public Moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está ganhando velocidade.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está diminuindo a velocidade.");
    }
}

public class veiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022);
        Moto moto = new Moto("Honda", "CBR 600", 2021);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Mountain Bike", 2020);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        carro.acelerar();
        carro.frear();

        System.out.println("Moto: " + moto.getMarca() + " " + moto.getModelo());
        moto.acelerar();
        moto.frear();

        System.out.println("Bicicleta: " + bicicleta.getMarca() + " " + bicicleta.getModelo());
        bicicleta.acelerar();
        bicicleta.frear();
    }
}
