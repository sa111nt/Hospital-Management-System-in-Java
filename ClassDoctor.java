//class Doctor
class Doctor extends Account {
    private final String specialization;

    //constructor
    Doctor(String name, String contact, String specialization) {

        this.name = name;
        this.contact = contact;
        this.specialization = specialization;
        HospitalManagementSystem.allDoctors.add(this); //automatically adding to the list of all doctors
    }

    //method which gives clear info about the doctor
    public String toString() {
        return "Doctor: " +
                "name = " + name +
                ", contact = " + contact +
                ", specialization = " + specialization;
    }

    //getter
    String getDoctorSpecialization() {
        return this.specialization;
    }
}
