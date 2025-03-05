//class with main methods (prints, sorts)
class HospitalManagementSystem {

    //lists, which contain all objects
    static List<Doctor> allDoctors = new ArrayList<>();
    static List<Patient> allPatients = new ArrayList<>();
    static List<Hospital> allHospitals = new ArrayList<>();

    //getters and sorts
    static void getHospitalsData() {
        for (Hospital hospital : allHospitals) {
            System.out.println(hospital.toString());
        }
    }

    static void getPatientsData() {
        for (Patient patient : allPatients) {
            System.out.println(patient.toString());
        }
    }

    static void getDoctorsData() {
        for (Doctor doctor : allDoctors) {
            System.out.println(doctor.toString());
        }
    }

    static void sortHospitalsByNames() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getName));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByRating() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getRating));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByReviews() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getReviews));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByCity() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getCity));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByBedsAvailable() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getAvailableBeds));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByBedsPrice() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getBedsPriceInDollars));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByNumberOfDoctors() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getNumberOfDoctors));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }

    static void sortHospitalsByNumberOfPatients() {
        Collections.sort(allHospitals, Comparator.comparing(Hospital::getNumberOfPatients));
        HospitalManagementSystem.getHospitalsData();
        System.out.println("\n");
    }


    static void sortPatientsByNames() {
        Collections.sort(allPatients, Comparator.comparing(Patient::getName));
        HospitalManagementSystem.getPatientsData();
        System.out.println("\n");
    }


    static void sortDoctorsByNames() {
        Collections.sort(allDoctors, Comparator.comparing(Doctor::getName));
        HospitalManagementSystem.getDoctorsData();
        System.out.println("\n");
    }

    static void sortPatientsByDisease() {
        Collections.sort(allPatients, Comparator.comparing(Patient::getPatientDisease));
        HospitalManagementSystem.getPatientsData();
        System.out.println("\n");
    }

    static void sortDoctorsBySpecialization() {
        Collections.sort(allDoctors, Comparator.comparing(Doctor::getDoctorSpecialization));
        HospitalManagementSystem.getDoctorsData();
        System.out.println("\n");
    }

    //creators of objects in main program
    void createPatient(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Contact(XXX-XX-XX): ");
        String contact = scanner.next();

        System.out.print("Disease: ");
        String disease = scanner.next();

        Patient NewPatient = new Patient(name, contact, disease);

    }

    void createDoctor(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Contact(XXX-XX-XX): ");
        String contact = scanner.next();

        System.out.print("Specialization: ");
        String specialization = scanner.next();

        Doctor NewDoctor = new Doctor(name, contact, specialization);
    }

    void createHospital(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Contact(XXX-XX-XX): ");
        String contact = scanner.next();

        System.out.print("Bed's price in dollars: ");
        int bedsPriceInDollars = scanner.nextInt();

        System.out.print("The number of available beds: ");
        int availableBeds = scanner.nextInt();

        System.out.print("Rating[0-5]: ");
        float rating;
        while (true) {
            rating = scanner.nextFloat();
            if (rating < 0 && rating > 5) {
                System.out.println("Wrong number. Enter the number in the range from 0 to 5");
                continue;
            }
            break;
        }

        System.out.print("Reviews: ");
        String reviews = scanner.next();

        System.out.print("City: ");
        String city = scanner.next();

        Hospital NewHospital = new Hospital(name, contact, bedsPriceInDollars, availableBeds, rating, reviews, city);
    }

    //finders of objects to check availability of object
    static Patient findPatient(String searchname) {
        for (Patient patient : allPatients) {
            if (patient.getName().equals(searchname)) {
                return patient;
            }
        }
        return null;
    }

    static Doctor findDoctor(String searchdoctor) {
        for (Doctor doctor : allDoctors) {
            if (doctor.getName().equals(searchdoctor)) {
                return doctor;
            }
        }
        return null;
    }

    static Hospital findHospital(String searchhospital) {
        for (Hospital hospital : allHospitals) {
            if (hospital.getName().equals(searchhospital)) {
                return hospital;
            }
        }
        return null;
    }

    //showing the menu of options
    static void printMenu() {
        System.out.println("Hospital Management System Menu:");
        System.out.println("1. Create a new Patient");
        System.out.println("2. Create a new Doctor");
        System.out.println("3. Create a new Hospital");
        System.out.println("4. Show info about all Patients");
        System.out.println("5. Show info about all Doctors");
        System.out.println("6. Show info about all Hospitals");
        System.out.println("7. Sort Hospitals by Names and show it");
        System.out.println("8. Sort Hospitals by Rating and show it");
        System.out.println("9. Sort Hospitals by Reviews and show it");
        System.out.println("10. Sort Hospitals by City and show it");
        System.out.println("11. Sort Hospitals by Available Beds and show it");
        System.out.println("12. Sort Hospitals by Beds Price and show it");
        System.out.println("13. Sort Hospitals by Number of Doctors and show it");
        System.out.println("14. Sort Hospitals by Number of Patients and show it");
        System.out.println("15. Sort Patients by Name and show it");
        System.out.println("16. Sort Doctors by Name and show it");
        System.out.println("17. Sort Patients by Disease and show it");
        System.out.println("18. Sort Doctors by Specialization and show it");
        System.out.println("19. Show info about a certain Patient");
        System.out.println("20. Show info about a certain Doctor");
        System.out.println("21. Show info about a certain Hospital");
        System.out.println("22. Add a doctor or a patient to a certain Hospital");
        System.out.println("23. Show all doctors or all patients of a certain Hospital");
        System.out.println("24. Exit");

        System.out.print("Enter your choice (1-24): ");
    }


    //methods that assert that there is no objects
    static void noPatient() {
        System.out.println("There is no patients yet. Add some patients first");
    }

    static void noDoctor() {
        System.out.println("There is no doctors yet. Add some doctors first");
    }
    static void noHospital() {
        System.out.println("There is no hospitals yet. Add some hospitals first");
    }



    //method that asserts that there is no object with entered name
    static String noSuchObject(Scanner scanner, String name) {
        System.out.println("There is no " + name + " with this name.");
        System.out.println("If you want to try again, enter 'continue', if you want to return to other options, enter 'exit'.");
        System.out.print("Enter 'exit' or 'continue': ");
        String result = scanner.next().toLowerCase();
        while (true) {
            if (result.equals("exit")) {
                return "exit";
            } else if (result.equals("continue")) {
                return "continue";
            } else {
                System.out.print("Wrong word. Enter 'exit' or 'continue': ");
                result = scanner.next();
            }
        }
    }


    //methods that check of the doctor or the patient is already in another hospital
    static boolean checkDoctor(Doctor doctor) {
        for (Hospital hospital : allHospitals) {
            if (hospital.doctors.contains(doctor)) {
                return true;
            }
        }
        return false;
    }

    static boolean checkPatient(Patient patient) {
        for (Hospital hospital : allHospitals) {
            if (hospital.patients.contains(patient)) {
                return true;
            }
        }
        return false;
    }



}
