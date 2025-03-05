import java.util.*;


class HospitalSystemProject {
    public static void main(String[] args) {
        System.out.println("Welcome to our Hospital Management System! Choose the option below");
        
//implementing all options
        outerLoop:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            midderLoop:
            while (true) {
                HospitalManagementSystem.printMenu();
                int choice = scanner.nextInt();

                HospitalManagementSystem HospitalSystem = new HospitalManagementSystem();

                while (true) {
                    if (choice >= 1 && choice <= 24) {
                        break;
                    }
                    System.out.print("Wrong number. Enter a number in the range from 1 to 24: ");
                    choice = scanner.nextInt();
                }

                switch (choice) {
                        
//Create a new Patient
                    case 1:
                        HospitalSystem.createPatient(scanner);
                        System.out.println("You created a new Patient.");
                        break midderLoop;
                        
//Create a new Doctor
                    case 2:
                        HospitalSystem.createDoctor(scanner);
                        System.out.println("You created a new Doctor.");
                        break midderLoop;
                        
//Create a new Hospital
                    case 3:
                        HospitalSystem.createHospital(scanner);
                        System.out.println("You created a new Hospital.");
                        break midderLoop;
                        
//Show info about all Patients
                    case 4:
                        if (HospitalManagementSystem.allPatients.isEmpty()) {
                            HospitalManagementSystem.noPatient();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.getPatientsData();
                            break midderLoop;
                        }
                        
//Show info about all Doctors
                    case 5:
                        if (HospitalManagementSystem.allDoctors.isEmpty()) {
                            HospitalManagementSystem.noDoctor();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.getDoctorsData();
                            break midderLoop;
                        }
                        
//Show info about all Hospitals
                    case 6:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.getHospitalsData();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Names and show it
                    case 7:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByNames();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Rating and show it
                    case 8:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByRating();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Reviews and show it
                    case 9:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByReviews();
                            break midderLoop;
                        }
                        
//Sort Hospitals by City and show it
                    case 10:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByCity();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Available Beds and show it
                    case 11:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByBedsAvailable();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Beds Price and show it
                    case 12:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByBedsPrice();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Number of Doctors and show it
                    case 13:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByNumberOfDoctors();
                            break midderLoop;
                        }
                        
//Sort Hospitals by Number of Patients and show it
                    case 14:
                        if (HospitalManagementSystem.allHospitals.isEmpty()) {
                            HospitalManagementSystem.noHospital();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortHospitalsByNumberOfPatients();
                            break midderLoop;
                        }
                        
//Sort Patients by Names and show it
                    case 15:
                        if (HospitalManagementSystem.allPatients.isEmpty()) {
                            HospitalManagementSystem.noPatient();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortPatientsByNames();
                            break midderLoop;
                        }
                        
//Sort Doctors by Name and show it
                    case 16:
                        if (HospitalManagementSystem.allDoctors.isEmpty()) {
                            HospitalManagementSystem.noDoctor();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortDoctorsByNames();
                            break midderLoop;
                        }
                        
//Sort Doctors by Disease and show it
                    case 17:
                        if (HospitalManagementSystem.allPatients.isEmpty()) {
                            HospitalManagementSystem.noPatient();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortPatientsByDisease();
                            break midderLoop;
                        }
                        
//Sort Doctors by Specialization and show it
                    case 18:
                        if (HospitalManagementSystem.allDoctors.isEmpty()) {
                            HospitalManagementSystem.noDoctor();
                            break midderLoop;
                        }
                        else {
                            HospitalManagementSystem.sortDoctorsBySpecialization();
                            break midderLoop;
                        }
                        
//Show info about a certain Patient
                    case 19:
                        case19Loop:
                        while (true) {
                            System.out.print("Enter patient name: ");
                            String name = scanner.next();
                            var patient = HospitalManagementSystem.findPatient(name);
                            if (patient == null) { // there is no patient with this name
                                String result;
                                result = HospitalManagementSystem.noSuchObject(scanner, "patient");
                                    if (result.equals("exit")) {
                                        break midderLoop;
                                    }
                                    else {
                                        continue case19Loop;
                                }
                            } else {
                                System.out.println(patient.toString());
                                break midderLoop;
                            }
                        }
                        
//Show info about a certain Doctor
                    case 20:
                        case20Loop:
                        while (true) {
                            System.out.print("Enter doctor name: ");
                            String name = scanner.next();
                            var doctor = HospitalManagementSystem.findDoctor(name);
                            if (doctor == null) { // there is no doctor with this name
                                String result;
                                result = HospitalManagementSystem.noSuchObject(scanner, "doctor");
                                    if (result.equals("exit")) {
                                        break midderLoop;
                                    }
                                    else {
                                        continue case20Loop;
                                    }
                                }
                            else {
                                System.out.println(doctor.toString());
                                break midderLoop;
                            }
                        }
                        
//Show info about a certain Hospital
                    case 21:
                        case21Loop:
                        while (true) {
                            System.out.print("Enter hospital name: ");
                            String name = scanner.next();
                            var hospital = HospitalManagementSystem.findHospital(name);
                            if (hospital == null) { // there is no hospital with this name
                                String result;
                                result = HospitalManagementSystem.noSuchObject(scanner, "hospital");
                                if (result.equals("exit")) {
                                    break midderLoop;
                                }
                                else {
                                    continue case21Loop;
                                }
                            }
                             else {
                                System.out.println(hospital.toString());
                                break midderLoop;
                            }
                        }
                        
//Add a doctor or a patient to a certain Hospital
                    case 22:
                        case22Loop:
                        while (true) {
                            System.out.print("Enter hospital name: ");
                            String name = scanner.next();
                            var hospital = HospitalManagementSystem.findHospital(name);
                            if (hospital == null) { // there is no hospital with this name
                                String result;
                                result = HospitalManagementSystem.noSuchObject(scanner, "hospital");
                                if (result.equals("exit")) {
                                    break midderLoop;
                                }
                                else {
                                    continue case22Loop;
                                }
                            }
                            else {
                                System.out.print("If you want to add doctor to this hospital, enter 'doctor'" +
                                        ", if you want to add patient to this hospital, enter 'patient': ");
                                String person = scanner.next();
                                while (true) {
                                    if (person.equals("doctor")) {
                                        System.out.print("Enter doctor name: ");
                                        name = scanner.next();
                                        var doctor = HospitalManagementSystem.findDoctor(name);
                                        if (doctor == null) { // there is no doctor with this name
                                            String result;
                                            result = HospitalManagementSystem.noSuchObject(scanner, "doctor");
                                            if (result.equals("exit")) {
                                                break midderLoop;
                                            }
                                            else {
                                                continue case22Loop;
                                            }

                                        } else {
                                            if (HospitalManagementSystem.checkDoctor(doctor)) {
                                                System.out.println("This doctor is already in another hospital");
                                                break case22Loop;
                                            }
                                            hospital.addDoctor(doctor);
                                            System.out.println("You added the doctor to the hospital.");
                                            break midderLoop;
                                        }
                                    } else if (person.equals("patient")) {
                                        System.out.print("Enter patient name: ");
                                        name = scanner.next();
                                        var patient = HospitalManagementSystem.findPatient(name);
                                        if (patient == null) { // there is no patient with name
                                            String result;
                                            result = HospitalManagementSystem.noSuchObject(scanner, "patient");
                                            if (result.equals("exit")) {
                                                break midderLoop;
                                            }
                                            else {
                                                continue midderLoop;
                                            }

                                        } else {
                                            if (HospitalManagementSystem.checkPatient(patient)) {
                                                System.out.println("This patient is already in another hospital");
                                                break midderLoop;
                                            }
                                            hospital.addPatient(patient);
                                            System.out.println("You added the patient to the hospital.");
                                            break midderLoop;
                                        }
                                    } else {
                                        System.out.print("Wrong word. Enter 'doctor' or 'patient': ");
                                        person = scanner.next();
                                    }
                                }
                            }
                        }
                        
//Show all doctors or all patients of a certain Hospital
                    case 23:
                        case23Loop:
                        while (true) {
                            System.out.print("Enter hospital name: ");
                            String name = scanner.next();
                            var hospital = HospitalManagementSystem.findHospital(name);
                            if (hospital == null) { // there is no hospital with this name
                                String result;
                                result = HospitalManagementSystem.noSuchObject(scanner, "hospital");
                                if (result.equals("exit")) {
                                    break midderLoop;
                                }
                                else {
                                    continue case23Loop;
                                }

                            } else {
                                System.out.print("If you want to get all doctors of the hospital, enter 'doctors'," +
                                        " if you want to get all patients of the hospital, enter 'patients': ");
                                String listof = scanner.next().toLowerCase();
                                while (true) {
                                    if (listof.equals("doctors")) {
                                        if (hospital.getNumberOfDoctors() == 0) {
                                            HospitalManagementSystem.noDoctor();
                                            break midderLoop;
                                        } else {
                                            System.out.println(hospital.getDoctors());
                                            break midderLoop;
                                        }

                                    } else if (listof.equals("patients")) {
                                        if (hospital.getNumberOfPatients() == 0) {
                                            HospitalManagementSystem.noPatient();
                                            break midderLoop;
                                        } else {
                                            System.out.println(hospital.getPatients());
                                            continue midderLoop;
                                        }
                                    } else {
                                        System.out.print("Wrong word. Enter 'doctors' or 'patients': ");
                                        listof = scanner.next();
                                    }
                                }

                            }
                        }
//Exit
                    case 24:
                        System.out.println("Thank you for managing. See you next time, good luck!");
                        break outerLoop;
                }

            }


            System.out.print("If you want to continue managing the Hospital System, enter 'YES', if you don't, enter 'NO': ");
            String word = scanner.next().toLowerCase();
            while (true) {
                if (word.equals("yes")) {
                    System.out.println("Enjoy managing!");
                    continue outerLoop;
                } else if (word.equals("no")) {
                    System.out.println("See you next time, good luck!");
                    return;
                } else {
                    System.out.print("Wrong word, enter 'YES' or 'NO': ");
                    word = scanner.next().toLowerCase();
                }
            }
        }
    }
}



