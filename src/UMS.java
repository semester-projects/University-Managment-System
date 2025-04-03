import java.util.Scanner;

public class UMS {
  private static boolean checkRang(int ch){
    return ch >= 0 && ch < 8;
  };

  public static void main(String[] args) {

    Uni u = new Uni("Comsats University Isb");
    Scanner s = new Scanner(System.in);
    int ch;
    while (true) {
      System.out.println("\n--- University Course Management System ---");
      System.out.println("1. Add Department");
      System.out.println("2. Remove Department");
      System.out.println("3. Add Course to Department");
      System.out.println("4. Remove Course from Department");
      System.out.println("5. Assign Professor to Course");
      System.out.println("6. Display All Departments and Courses");
      System.out.println("7. Display University Statistics");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");

      ch = s.nextInt();
      while(!checkRang(ch)){
        System.out.print("Atleast one in life time do something correct, ENTER A VALID NUMBER: ");
        ch = s.nextInt();
      }
      s.nextLine();

      switch (ch) {
        case 1:
          System.out.print("Enter department name: ");
          String deptName = s.nextLine();
          u.addDep(new Depart(deptName));
          break;
        case 2:
          System.out.print("Enter department name to remove: ");
          String deptToRemove = s.nextLine();
          u.removeDep(deptToRemove);
          break;

        case 3:
          System.out.print("Enter department name: ");
          String deptForCourse = s.nextLine();
          System.out.print("Enter course code: ");
          int courseCode = s.nextInt();
          s.nextLine();
          System.out.print("Enter course name: ");
          String courseName = s.nextLine();
          u.addCour(new Cour(courseName, courseCode), deptForCourse);
          break;

        case 4:
          System.out.print("Enter department name: ");
          String deptForRemoveCourse = s.nextLine();
          System.out.print("Enter course code to remove: ");
          int courseToRemove = s.nextInt();
          s.nextLine();
          u.removCour(courseToRemove, deptForRemoveCourse);
          break;

        case 5:
          System.out.print("Enter department name: ");
          String deptForAssignProf = s.nextLine();
          System.out.print("Enter course code: ");
          int courseForProf = s.nextInt();
          s.nextLine();
          System.out.print("Enter professor name: ");
          String profName = s.nextLine();
          System.out.print("Enter professor employee ID: ");
          int profId = s.nextInt();
          s.nextLine();
          u.assProf(new Prof(profName, profId), deptForAssignProf, courseForProf);
          break;

        case 6:
          u.displayAll();
          break;

        case 7: 
          Uni.displayUniversityStats();
          break;

        case 0:
          s.close();
          System.exit(0);

        default:
          System.out.println("Failure! Failure! System Halting");
          s.close();
          System.exit(0);
      }
    }
  }
}
