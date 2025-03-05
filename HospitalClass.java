//class Hospital
class Hospital extends Account {
    private final int bedsPriceInDollars;
    private final int availableBeds;
    private final float rating;
    private final String reviews;
    private final String city;
    List<Doctor> doctors;
    List<Patient> patients;


    //constructor
    Hospital(String name, String contact, int bedsPriceInDollars, int availableBeds, float rating, String reviews, String city) {

        this.name = name;
        this.contact = contact;
        this.bedsPriceInDollars = bedsPriceInDollars;
        this.availableBeds = availableBeds;
        this.rating = rating;
        this.reviews = reviews;
        this.city = city;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        HospitalManagementSystem.allHospitals.add(this); //automatically adding to the list of all hospitals

    }

    //method which gives clear info about the hospital
    public String toString() {
        return "Hospital: " +
                "name = " + name +
                ", contact = " + contact +
                ", beds price in dollars = " + bedsPriceInDollars +
                ", available Beds = " + availableBeds +
                ", rating = " + rating +
                ", reviews = " + reviews +
                ", city = " + city +
                ", number of patients = " + patients.size() +
                ", number of doctors = " + doctors.size();
    }

    //getters
    int getBedsPriceInDollars() {
        return this.bedsPriceInDollars;
    }

    int getAvailableBeds() {
        return this.availableBeds;
    }

    float getRating() {
        return this.rating;
    }

    String getReviews() {
        return this.reviews;
    }

    String getCity() {
        return this.city;
    }
    List<Doctor> getDoctors() {
        return this.doctors;
    }

    List<Patient> getPatients() {
        return this.patients;
    }

    int getNumberOfDoctors() {
        return this.doctors.size();
    }

    int getNumberOfPatients() { return this.patients.size(); }

    //adding objects to the hospital
    void addDoctor(Doctor doctor) { this.doctors.add(doctor); }

    void addPatient(Patient patient) { this.patients.add(patient); }

}
