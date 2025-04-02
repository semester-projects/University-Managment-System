/**
 * Cour
 */
public class Cour extends Object {
  static int count = 0;
  private String courName;
  private int courId;
  private Prof assignProf;

  Cour(){
    courName = "Peace";
    courId = 1;
    assignProf = new Prof();
  }

  Cour(String courName, int courId, Prof assignProf){
    this.courId = courId;
    this.courName = courName;
    this.assignProf = assignProf;
    count++;
  }

  Cour(String courName, int courId){
    this.courId = courId;
    this.courName = courName;
    this.assignProf = new Prof();
    count++;
  }

  public String getCourName() {
    return courName;
  }

  public void setCourName(String courName) {
    this.courName = courName;
  }

  public int getCourId() {
    return courId;
  }

  public void setCourId(int courId) {
    this.courId = courId;
  }

  public Prof getAssignProf() {
    return assignProf;
  }

  public static int getCount() {
    return count;
  }
  public void setAssignProf(Prof assignProf) {
    this.assignProf = assignProf;
  }

  @Override
  public String toString(){
    String professorInfo = (assignProf != null) ? ", Assigned Professor: " + assignProf.getName() : ", No professor assigned";
    return "Course Id: " + courId + ", Name: " + courName + professorInfo;
  }
}
