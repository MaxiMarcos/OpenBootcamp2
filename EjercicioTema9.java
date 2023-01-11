public class EjercicioTema9 {

    public static void main(String[] args) {

        Cliente clienteNombre = new Cliente();

        clienteNombre.setNombre("Nombre: \n Pablo Juarez");

        System.out.println(clienteNombre.getNombre());

        Cliente clienteEdad = new Cliente();

        clienteEdad.setEdad(25);

        System.out.println("Edad: \n" + clienteEdad.getEdad());

        Cliente clienteTelefono = new Cliente();

        clienteTelefono.setTelefono(156784455);

        System.out.println("Telefono: \n" + clienteTelefono.getTelefono());

        Cliente clienteCredito = new Cliente();

        clienteCredito.setCredito(25000);

        System.out.println("Crédito requerido: \n" + clienteCredito.getCredito());

        Trabajador TrabajadorSalario = new Trabajador();

        TrabajadorSalario.setSalario(120000);

        System.out.println("Salario: \n" + TrabajadorSalario.getSalario());
    }

}

class Persona {

    public int edad;

    public String nombre;

    public int telefono;

}


class Cliente extends Persona {

    private int credito;

    public void setEdad (int edad) {

        this.edad = edad;
    }

    public int getEdad() {

        return edad;
    }

    public void setNombre (String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }

    public void setTelefono (int telefono) {

        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setCredito (int credito) {

        this.credito = credito;
    }

    public int getCredito() {

        return credito;
    }
}


class Trabajador extends Persona {

    private int salario;

    public void setSalario (int salario) {

        this.salario = salario;
    }

    public int getSalario() {

        return salario;
    }
}