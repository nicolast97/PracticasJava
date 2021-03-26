package clase2;

public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion b) {
        Fraccion c = new Fraccion(this.numerador * b.denominador + b.numerador * this.denominador,
              this.denominador * b.denominador);
        return c;
    }

    public Fraccion sumar(int entero) {
        Fraccion aux = new Fraccion(entero,1);
        return sumar(aux);
    }

    public Fraccion restar(Fraccion b) {
        Fraccion c = new Fraccion(this.numerador * b.denominador - b.numerador * this.denominador,
                this.denominador * b.denominador);
        return c;
    }

    public Fraccion restar(int entero) {
        Fraccion aux = new Fraccion(entero,1);
        return restar(aux);
    }

    public Fraccion multiplicar(Fraccion f) {
        Fraccion result = new Fraccion(this.numerador * f.numerador,
                this.denominador * f.denominador);
        return result;
    }

    public Fraccion multiplicar(int i) {
        Fraccion aux = new Fraccion(i,1);
        return multiplicar(aux);
    }

    public Fraccion dividir(Fraccion f) {
        Fraccion result = new Fraccion(this.numerador * f.denominador,
                this.denominador * f.numerador);
        return result;
    }

    public Fraccion dividir(int i) {
        Fraccion aux = new Fraccion(i,1);
        return dividir(aux);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void printResultado() {
        System.out.println(numerador + "/" + denominador);
    }
}
