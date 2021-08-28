package pl.winiarczyk.lesson4.hospitalExample;


public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("kids","12341");
        doctor.name = "Daniel";
        doctor.surname = "Winiarczyk";
//        doctor.specialization = "bla";
//        doctor.license = "12341";

        Nurse nurse = new Nurse();
        nurse.name = "Helena";
        nurse.surname = "Basen";
        nurse.level = "Salowa";

        //klasa emplayee jest abstrakcyjna i nie potrzebuję juz tego obiektu \/
//        Employee employee = new Employee();
//        employee.name = "Janusz";
//        employee.surname = "Nosacz";


        System.out.println(doctor.getLicense());
        doctor.setLicense("111");
        System.out.println(doctor.getLicense());

    }
}
