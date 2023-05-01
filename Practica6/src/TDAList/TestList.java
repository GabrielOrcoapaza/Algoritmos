/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDAList;



/**
 *
 * @author Gabriel
 */


public class TestList {
    public static void main(String[] args) {
        
        /*ListArray<Integer> intList = new ListArray<>();
        ListArray<String> strList = new ListArray<>();

        // Prueba de la lista de enteros
        System.out.println("Int List:");
        System.out.println("Is Empty? " + intList.isEmptyList());
        System.out.println("Length: " + intList.length());

        intList.insertLast(5);
        intList.insertLast(10);
        intList.insertLast(15);
        intList.insertFirst(0);
        System.out.println("After Insertions:");
        System.out.println("Is Empty? " + intList.isEmptyList());
        System.out.println("Length: " + intList.length());
        System.out.println("Search 10: " + intList.search(10));
        System.out.println("Search 20: " + intList.search(20));
        intList.removeNode(10);
        System.out.println("After Removal:");
        System.out.println("Is Empty? " + intList.isEmptyList());
        System.out.println("Length: " + intList.length());
        System.out.println("Search 10: " + intList.search(10));

        // Prueba de la lista de cadenas de texto
        System.out.println("\nString List:");
        System.out.println("Is Empty? " + strList.isEmptyList());
        System.out.println("Length: " + strList.length());

        strList.insertLast("Hello");
        strList.insertLast("World");
        strList.insertFirst("Start");
        System.out.println("After Insertions:");
        System.out.println("Is Empty? " + strList.isEmptyList());
        System.out.println("Length: " + strList.length());
        System.out.println("Search World: " + strList.search("World"));
        System.out.println("Search Goodbye: " + strList.search("Goodbye"));
        strList.removeNode("World");
        System.out.println("After Removal:");
        System.out.println("Is Empty? " + strList.isEmptyList());
        System.out.println("Length: " + strList.length());
        System.out.println("Search World: " + strList.search("World"));*/
        
        
          // Crear una lista enlazada de enteros
        /*ListLinked<Integer> intList = new ListLinked<Integer>();
        intList.insertFirst(3);
        intList.insertFirst(2);
        intList.insertFirst(1);
        intList.insertLast(4);
        System.out.println("Lista de enteros: " + intList.toString());
        intList.removeNode(2);
        System.out.println("Lista de enteros después de remover el elemento 2: " + intList.toString());

        // Crear una lista enlazada de cadenas de caracteres
        ListLinked<String> stringList = new ListLinked<String>();
        stringList.insertFirst("hola");
        stringList.insertLast("mundo");
        System.out.println("Lista de cadenas: " + stringList.toString());
        System.out.println("La cadena 'hola' está en la posición " + stringList.search("hola"));

        // Crear una lista enlazada de objetos de una clase personalizada
        ListLinked<Person> personList = new ListLinked<Person>();
        personList.insertFirst(new Person("Juan", 25));
        personList.insertFirst(new Person("Ana", 30));
        System.out.println("Lista de personas: " + personList.toString());*/
        
        // Crear objeto de la clase ListArray<Person>
        /*ListArray<Person> arrayPersonList = new ListArray<>();

        // Crear objeto de la clase ListLinked<Person>
        ListLinked<Person> linkedPersonList = new ListLinked<>();

        // Crear objetos Person
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("Jane", "Doe", 25);
        Person person3 = new Person("Bob", "Smith", 40);

        // Insertar objetos Person en ambas listas
        arrayPersonList.insertFirst(person1);
        arrayPersonList.insertLast(person2);
        arrayPersonList.insertLast(person3);

        linkedPersonList.insertFirst(person1);
        linkedPersonList.insertLast(person2);
        linkedPersonList.insertLast(person3);

        // Imprimir la lista Array y Linked
        System.out.println("Array List: " + arrayPersonList.toString());
        System.out.println("Linked List: " + linkedPersonList.toString());

        // Buscar un objeto Person en ambas listas
        System.out.println("Index of John Doe in Array List: " + arrayPersonList.search(person1));
        System.out.println("Index of John Doe in Linked List: " + linkedPersonList.search(person1));

        // Eliminar un objeto Person de ambas listas
        arrayPersonList.removeNode(person2);
        linkedPersonList.removeNode(person2);

        // Imprimir la lista Array y Linked después de eliminar un objeto
        System.out.println("Array List after removing Jane Doe: " + arrayPersonList.toString());
        System.out.println("Linked List after removing Jane Doe: " + linkedPersonList.toString());*/
        
        
         // Lista de enteros
        OrdenListLinked<Integer> intList = new OrdenListLinked<>();
        intList.insert(5);
        intList.insert(2);
        intList.insert(7);
        System.out.println(intList); // debería imprimir: 2 5 7

        // Lista de cadenas
        OrdenListLinked<String> strList = new OrdenListLinked<>();
        strList.insert("hola");
        strList.insert("adiós");
        strList.insert("casa");
        System.out.println(strList); // debería imprimir: adiós casa hola

        // Lista de personas
        
        
        OrdenListLinked<Person> person = new OrdenListLinked<>();
        person.insert(new Person("Juan", "Pérez", 35));
        person.insert(new Person("María", "Gómez", 28));
        person.insert(new Person("Pedro", "López", 42));
        System.out.println(person);

    }
}

/*class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + " años)";
    }
}*/
