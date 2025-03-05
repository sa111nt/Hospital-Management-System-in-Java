[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/b7QIWzDa)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=12483584&assignment_repo_type=AssignmentRepo)
<header>

<!--
  <<< Author notes: Course header >>>
  Read <https://skills.github.com/quickstart> for more information about how to build courses using this template.
  Include a 1280×640 image, course name in sentence case, and a concise description in emphasis.
  In your repository settings: enable template repository, add your 1280×640 social image, auto delete head branches.
  Next to "About", add description & tags; disable releases, packages, & environments.
  Add your open source license, GitHub uses the MIT license.
-->
# Tsimafei Kotski 158740
# Hospital Management System in Java

In this readme file, a Java program is discussed to manage the Hospital Management System. Given data of Hospitals with the name of hospital, contact and doctors and patients below are the functionalities that needed to be implemented:

</header>

<!--
  <<< Author notes: Step 1 >>>
  Choose 3-5 steps for your course.
  The first step is always the hardest, so pick something easy!
  Link to docs.github.com for further explanations.
  Encourage users to open new tabs for steps!
  TBD-step-1-notes.
-->

## Principles:
<!--
_Welcome to "TBD-course-name"! :wave:_

TBD-step-1-information

**What is _TBD-term-1_**: TBD-definition-1

### :keyboard: Activity: TBD-step-1-name
-->
Description of the relationships between the classes in the project:

The project consists of several classes, including 'Hospital', 'Contact', 'Patient', 'Doctor', 'HospitalManagementSystem' and 'HospitalSystem'.

The class Contact serves as a superclass for Doctor, Patient and Hospital, establishing an inheritance relationship.
This latter three classes inherit fields from the Contact class such as "Name" and "Contact".

In terms of aggregation, the Hospital class plays a pivotal role by containing lists of objects from the Patient and Doctor classes. 
This implies that a hospital can be associated with multiple patients and doctors.
Additionally, the HospitalManagementSystem class includes lists of objects from the Doctor, Patient, and Hospital classes.
This reflects an aggregation relationship as well, signifying that the management system is composed of and manages instances of doctors, patients and hospitals.

## Main options:
1. Create a new Patient - addPatinet();
2. Create a new Doctor - addDoctor();
3. Create a new Hospital - addHospital();
4. Show info about all Patients - getPatientsData();
5. Show info about all Doctors - getDoctorsData();
6. Show info about all Hospitals - getHospitals();
7. Sort Hospitals by Names and show it - sortHospitalsByNames();
8. Sort Hospitals by Rating and show it - sortHospitalsByRating();
9. Sort Hospitals by Reviews and show it - sortHospitalsByReviews();
10. Sort Hospitals by City and show it - sortHospitalsByCity();
11. Sort Hospitals by Available Beds and show it - sortHospitalsByAvailableBeds();
12. Sort Hospitals by Beds Price and show it - sortHospitalsByBedsPrice();
13. Sort Hospitals by Number of Doctors and show it - sortHospitalsByNumberOfDoctors();
14. Sort Hospitals by Number of Patients and show it - sortHospitalsByNumberOfPatients();
15. Sort Patients by Name and show it - sortPatientsByNames();
16. Sort Doctors by Name and show it - sortDoctorsByNames() 
17. Sort Patients by Disease and show it - sortPatientsByDisease(); 
18. Sort Doctors by Specialization and show it - sortDoctorsBySpecialization(); 
19. Show info about a certain Patient - (patient).toString();
20. Show info about a certain Doctor - (doctor).toString();
21. Show info about a certain Hospital - (hospital).toString();
22. Add a doctor or a patient to a certain Hospital - addDoctor(); addPatient();
23. Show all doctors or all patients of a certain Hospital - getDoctors(); getPatients();
24. Exit



<footer>

<!--
  <<< Author notes: Footer >>>
  Add a link to get support, GitHub status page, code of conduct, license link.
-->
<p align="center"><img align="center" src="https://github.com/dataproctech/long-term-project-c-sa111nt/blob/main/HospitalSystem.png?raw=true" height="800" width="600" /></p>
---

Get help: [TBD-support](TBD-support-link) &bull; [Review the GitHub status page](https://www.githubstatus.com/)

&copy; 2023 TBD-copyright-holder &bull; [Code of Conduct](https://www.contributor-covenant.org/version/2/1/code_of_conduct/code_of_conduct.md) &bull; [MIT License](https://gh.io/mit)

</footer>
