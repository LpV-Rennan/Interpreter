
public class Funcionario {
    private double horasExtras;
    private double salarioBase;

    public Funcionario(double horasExtras, double salarioBase) {
        this.horasExtras = horasExtras;
        this.salarioBase = salarioBase;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return RH.calcularSalario(this.horasExtras, this.salarioBase);
    }
}
