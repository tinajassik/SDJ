public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades) {
    grades = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades() {
    return grades.length;
  }

  public Grade getGrade(int index) {

    return grades[index];

  }

  public void setGrade(Grade grade, int index) {
    grades[index] = grade;
  }

  public double getAverage() {

    int total = 0;

    for (int i = 0; i < grades.length; i++) {
      total += grades[i].getGrade();
    }

    return (double)total/grades.length;
  }

  public String toString() {

    String str = "";

    for (int i = 0; i< grades.length; i++) {
      str += grades[i] + "\n";
    }

    return str;
  }
}
