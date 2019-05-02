package abc;

public class StaticTest {
    public static void main(String[] args)
    {
        abc.Employee[] staff =new abc.Employee[3];
        staff[0]=new abc.Employee("Tom",40000);
        staff[1]=new abc.Employee("Dick",60000);
        staff[2]=new abc.Employee("Harry",65000);
        for(abc.Employee e :staff)
        {
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        int n= Employee.getNextId();
        System.out.println("Next available id="+n);
        
    }
}
class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        this.name = n;
        salary = s;
        id = ++nextId;
    }



    public String getName() {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
    public int getId()
    {
        return id;
    }


    public void setId()
    {
        id=nextId;
        nextId++;
    }
    public static int getNextId()
    {
        return nextId;
    }
    public static void main(String[] args)
    {
        Employee e=new Employee("Harry",5000);
        System.out.println(e.getName()+""+e.getSalary());

    }
        
}
