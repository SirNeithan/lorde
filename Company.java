class Company{
    String empnames;
    String departments;
    String locations;
    String workschedules;
    String empresidences;
    int age;
    String jobtitles;
    String positions;
    public String getEmpnames() {
        return empnames;
    }
    public void setEmpnames(String empnames) {
        this.empnames = empnames;
    }
    public String getDepartments() {
        return departments;
    }
    public void setDepartments(String departments) {
        this.departments = departments;
    }
    public String getLocations() {
        return locations;
    }
    public void setLocations(String locations) {
        this.locations = locations;
    }
    public String getWorkschedules() {
        return workschedules;
    }
    public void setWorkschedules(String workschedules) {
        this.workschedules = workschedules;
    }
    public String getEmpresidences() {
        return empresidences;
    }
    public void setEmpresidences(String empresidences) {
        this.empresidences = empresidences;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJobtitles() {
        return jobtitles;
    }
    public void setJobtitles(String jobtitles) {
        this.jobtitles = jobtitles;
    }
    public String getPositions() {
        return positions;
    }
    public void setPositions(String positions) {
        this.positions = positions;
    }
    public Company(String empnames, String departments, String locations, String workschedules, String empresidences,
            int age, String jobtitles, String positions) {
        this.empnames = empnames;
        this.departments = departments;
        this.locations = locations;
        this.workschedules = workschedules;
        this.empresidences = empresidences;
        this.age = age;
        this.jobtitles = jobtitles;
        this.positions = positions;
    }
 public static void main(String[] args) {
    
 }
    
}
class Info extends Company{
    String records;

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }

    public Info(String empnames, String departments, String locations, String workschedules, String empresidences,
            int age, String jobtitles, String positions, String records) {
        super(empnames, departments, locations, workschedules, empresidences, age, jobtitles, positions);
        this.records = records;
    }
    
}

