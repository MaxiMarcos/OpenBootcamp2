public class EjercicioTema8 {

    public static void main(String[] args) {

        Persona persona = new Persona(); {

            persona.setEdad(25);
            persona.setNombre("Lucia");
            persona.setTelefono(153485544);

            System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() + "\nTeléfono: " + persona.getTelefono());


        }
}

}

class Persona {

        private int edad;

        private String nombre;

        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return edad;
        }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }



}