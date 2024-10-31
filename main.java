package taller;

public class main {

    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro perro1 = new Perro("Firulais", 3);
        Perro perro2 = new Perro("Rex", 4);
        Gato gato1 = new Gato("Miau", 2);
        Gato gato2 = new Gato("Nieve", 1);

        // Crear un zoológico y agregar animales
        Zoologico zoologico = new Zoologico();
        zoologico.agregarAnimal(perro1);
        zoologico.agregarAnimal(perro2);
        zoologico.agregarAnimal(gato1);
        zoologico.agregarAnimal(gato2);

        // Mostrar los sonidos de todos los animales en el zoológico
        zoologico.mostrarSonidos();
        
        // Mostrar la información de ambos animales
        System.out.println(perro1.getNombre() + " tiene " + perro1.getEdad() + " años.");
        System.out.println(perro2.getNombre() + " tiene " + perro2.getEdad() + " años.");
        System.out.println(gato1.getNombre() + " tiene " + gato1.getEdad() + " años.");
        System.out.println(gato2.getNombre() + " tiene " + gato2.getEdad() + " años.");


        // Mostrar el conteo por tipo de animal
        zoologico.mostrarConteoPorTipo();
    }
}
