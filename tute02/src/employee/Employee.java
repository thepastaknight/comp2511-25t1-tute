package employee;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     * 
     * @param name   The full name of the employee.
     * @param salary The employee's yearly salary in dollars.
     */

    /**
     * This is what my constructor is doing.
     * 
     * @param name
     * @param salary
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns the employee's name
     * 
     * @return The full name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name
     * 
     * @param name The employee's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     * 
     * @return The employee's yearly salary in dollars.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the employee's salary.
     * 
     * @param salary The employee's yearly salary in dollars.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Object e1 = new Employee(null, 0);
        Manager m1 = new Manager(null, 0);
        System.out.println(m1);
        // Object e2 = new Employee(null, 0);
        // System.out.println(e1.equals(e2));

        // String s1 = "string";
        // String s2 = "string";
        // System.out.println(s1 == s2);
    }
}