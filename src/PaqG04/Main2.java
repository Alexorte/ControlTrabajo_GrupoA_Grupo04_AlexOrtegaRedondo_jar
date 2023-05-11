package PaqG04;

public class Main2 {
    public static void main(String[] args) {
        Puerto puerto=new Puerto();
        Contenedor contenedor = new Contenedor(1,2,"f",true,1,"f","f","f");
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        puerto.apilar(contenedor);
        System.out.println(puerto.buscar(1));
    }
}
