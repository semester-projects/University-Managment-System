/**
 * Depart
 */
public class Depart extends Object{
  private String depName;
  private Cour[] courses;
  private int maxCourses = 10; 
  private int currCount = 0;


  Depart(){
    depName = "Germany";
    courses = null; 
    maxCourses = 0;
  }

  Depart(String depName){
    this.depName = depName;
    courses = new Cour[maxCourses];
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  public Cour[] getCourses() {
    return courses;
  }

  public void setCourses(Cour[] courses) {
    this.courses = courses;
  }

  public int getMaxCourses() {
    return maxCourses;
  }
  
  public void setMaxCourses(int maxCourses) {
    this.maxCourses = maxCourses;
  }
  
  public void addCour(Cour course){
    if(currCount < maxCourses){
      courses[currCount++] = course;
    } else{
      System.out.println("Do u really wanna blast that thing, Its full my guy!!!!!!!!!");
    }
  }

  public void removeCour(int course){
    for(int i = 0; i < currCount; i++){
      if(course == courses[i].getCourId()){
        for(int j = i; j < currCount - 1; j++){
          courses[j] = courses[j - 1];
        }    
        courses[--currCount] = null;
        return;
      }
    }

    System.out.println("Damn! Mothing found there, u must be tripping");
  }

  public Cour findCour(int courId){
    for(int i = 0; i < currCount; i++){
      if(courses[i] != null && courses[i].getCourId() == courId){
         return courses[i];
      }
    }

    System.out.println("No such course");
    return null;
  }

  @Override
  public String toString() {
    if(courses != null){
      StringBuilder sb = new StringBuilder("Course in " + depName + ":\n");
      for(int i = 0; i < currCount; i++){
        sb.append(" -" + depName + courses[i].getCourId() + " ("+ courses[i].getAssignProf() + ")\n"); 
         
      }
      return sb.toString();
    }else {
      return "No courses in this department.";
    }
  }

}
