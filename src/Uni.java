/**
 * Uni
 */
public class Uni{
  private String uniName;
  private Depart[] deps;
  private int maxDep = 10;
  private int currCount = 0;

  public Uni(){
    uniName = "Bonjour";
    deps = null;
  }

  public Uni(String uniName){
    this.uniName = uniName;
    deps = new Depart[maxDep];
  }

  public String getUniName() {
    return uniName;
  }

  public void setUniName(String uniName) {
    this.uniName = uniName;
  }

  public Depart[] getDeps() {
    return deps;
  }

  public void setDeps(Depart[] deps) {
    this.deps = deps;
  }

  public int getMaxDep() {
    return maxDep;
  }

  public void setMaxDep(int maxDep) {
    this.maxDep = maxDep;
  }

  public int getCurrCount() {
    return currCount;
  }

  public void setCurrCount(int currCount) {
    this.currCount = currCount;
  }

  public void addDep(Depart d){
    if(currCount < maxDep){
      deps[currCount++] = d;
      System.out.println("Department added");
    } else {
      System.out.println("The dumbest person i have seen in my whole life 🫵, Its is full.");
    }
  } 

  public void removeDep(String depName){
    for(int i = 0; i < currCount; i++){
      if(deps[i] != null && deps[i].getDepName().equalsIgnoreCase(depName)){
        for(int j = 1; j < currCount - 1; j++){
          deps[j] = deps[j - 1];
        }
        
        System.out.println("Successfully bomed the " + depName + " Department.");
        deps[--currCount] = null;
        return;
      }
    }


    System.out.println("Beggers can be choosers");
  }

  public Depart findDep(String depName){
    for (int i = 0; i < currCount; i++) {
      if (deps[i].getDepName().equalsIgnoreCase(depName)) {
        return deps[i];
      }
    }

    System.out.println("Are u sure there was such a department.");
    return null;
  }

  public void addCour(Cour c, String depName){
    Depart d = findDep(depName);
    if(d != null){
      d.addCour(c);

      System.err.println("Added u're desired code.");
    } else{
      System.out.println("No such departmentai");
    }
  }

  public void removCour(int cour, String depName){
    Depart d = findDep(depName);
    if(d != null){
      d.removeCour(cour);
      System.out.println("Remove the headache Successfully");
    } else{
      System.out.println("Removing an unremoveable object thats clever my guy");
    }
  }

  public void assProf(Prof p, String depName, int cour){
    Depart d = findDep(depName);
    if(d != null){
      Cour c = d.findCour(cour);
      if(c != null){
        c.setAssignProf(p);
        System.out.println("Poff was assigned successfully.");
      } else{
        System.out.println("No such corr");
      }
    } else{
      System.out.println("No such dep");
    }
  }

  public static void displayUniversityStats() {
    System.out.println("\n--- University Statistics ---");
    System.out.println("Total Number of Courses: " + Cour.getCount());
  }

  public void displayAll(){
    if(currCount > 0){
      System.out.println("----------All Departments------------");
      for(int i = 0; i < currCount; i++){
        System.out.println(deps[i].toString());
      }
    } else {
      System.out.println("Nothing in the University excepts ghosts.");
    }
  }
}
