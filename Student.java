public class Student {
    private int prn;
    private String name;
    private String branch;
    private String batch;
    private float cgpa;

    public Student(int prn, String name, String branch, String batch, float cgpa) {
        this.prn = prn;
        this.name = name;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    public int getPrn() { return prn; }
    public String getName() { return name; }
    public String getBranch() { return branch; }
    public String getBatch() { return batch; }
    public float getCgpa() { return cgpa; }

    @Override
    public String toString() {
        return "PRN: " + prn + ", Name: " + name + ", Branch: " + branch + ", Batch: " + batch + ", CGPA: " + cgpa;
    }
}
