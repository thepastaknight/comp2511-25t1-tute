package employee;

public class Manager extends Employee {
    private int hireDate;

    public Manager(String name, int salary, int hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public Manager(String name, int salary) {
        this(name, salary, 0);
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Manager other = (Manager) obj;
        if (hireDate != other.hireDate)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Manager [hireDate=" + hireDate + "]" + super.toString();
    }
}
