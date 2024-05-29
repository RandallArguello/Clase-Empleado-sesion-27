public class App {
    public static void main(String[] args) throws Exception {
   

        Empleado[] empleados= new Empleado[3];

        empleados[0] = new EmpleadoTiempoCompleto("Robin", "2044-2377U", "Secretario", 60000);
        empleados[1] = new EmpleadoMedioTiempo("Glenn", "2033-2488U","Repartidor", 75.0, 20);
        empleados[2] = new EmpleadoMedioTiempo("Randall", "2024-1377U","Chofer", 95.0, 20);

        // imprimir con foreach
        // for (Empleado empleado : empleados){
        //     System.out.println("Empleado: " + empleado.getNombre() + " Salario Mensual: $" + empleado.calcularSalario());
        // }

        // imprimir con for
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: " + empleados[i].getNombre());
            System.out.println("Cargo: " + empleados[i].getCargo());
            System.out.println("Identificacion: " + empleados[i].getnumeroIdentificacion());
            System.out.println("Salario: $ " + empleados[i].calcularSalario());
            
        }

    }
}
