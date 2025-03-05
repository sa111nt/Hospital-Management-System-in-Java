//class Patient
class Patient extends Account {
    private final String disease;

    //constructor
    Patient(String name, String contact, String disease) {
        this.name = name;
        this.contact = contact;
        this.disease = disease;
        HospitalManagementSystem.allPatients.add(this);
    }

    //method which gives clear info about the patient
    public String toString() {
        return "Patient: " +
                "name = " + name +
                ", contact = " + contact +
                ", disease = " + disease;
    }

    //getter
    String getPatientDisease() {
        return this.disease;
    }

}
