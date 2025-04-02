/**
 * Prof
 */
public class Prof extends Object {

  private String name;
  private double age;
  private double income;
  private int empId;
  
  Prof(){
    name = "Hitler";
    age = 136;
    income = 1e10;
    empId = 01;
  };

  Prof(String name, double age, double income, int empId){
    this.name = name;
    this.age = age;
    this.income = income;
    this.empId = empId;
  }

  Prof(String name, int empId){
    this.name = name;
    this.empId = empId;
    income = -1;
    age = -1;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }

  public double getIncome() {
    return income;
  }

  public void setIncome(double income) {
    this.income = income;
  }

  public double getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  @Override
  public String toString(){
    return "Professor: " + name + " (ID: " + empId + ")";}
}
