public class UniversitySystem {
    public static void main(String[] args) {
        // Create Leaf Entities
        Teacher t1 = new Teacher("Prof. Smith", "Computer Science", 50000);
        Student s1 = new Student("Alice", "2024-001", 15000);
        Student s2 = new Student("Bob", "2024-002", 15000);

        // Create Department and add members
        CompositeUnit csDept = new CompositeUnit("Computer Science", "Department");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        // Create College and add Department
        CompositeUnit coe = new CompositeUnit("College of Engineering", "College");
        coe.add(csDept);

        // Root University
        CompositeUnit neu = new CompositeUnit("New Era University", "University");
        neu.add(coe);

        // Output Requirements
        System.out.println("--- University Structure ---");
        neu.displayDetails(""); // [cite: 26]

        System.out.println("\nTotal Students in University: " + neu.getStudentCount()); // [cite: 27]
        System.out.println("Total Budget for University: " + neu.getBudget()); // [cite: 28]
    }
}