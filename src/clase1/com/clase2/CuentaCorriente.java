package clase2;

public class CuentaCorriente {

    private Integer numeroCuenta;
    private String titular;
    private Double saldo;

    public CuentaCorriente() {
        this.numeroCuenta = 00000;
        this.titular = "";
        this.saldo= 0.0;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.numeroCuenta = cuentaCorriente.numeroCuenta;
        this.titular = cuentaCorriente.titular;
        this.saldo = cuentaCorriente.saldo;
    }

    public CuentaCorriente(Integer numeroCuenta, String titular, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void ingreso(Double dineroIngresado) {
        this.saldo += dineroIngresado;
    }

    public void egreso(Double dineroRetirado) {
        this.saldo -= dineroRetirado;
    }

    public void reintegro(Double reintegro) {
         ingreso(reintegro);
    }

    public void transferencia(CuentaCorriente destinatario, Double montoTransferido) {
        this.saldo -= montoTransferido;
        destinatario.saldo += montoTransferido;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
