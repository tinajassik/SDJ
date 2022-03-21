public class DriverExam
{
  private final char[] correct = {'B', 'D', 'A','A','C',
                                  'A','B', 'A', 'C','D',
                                  'B', 'C', 'D', 'A', 'D',
                                  'C', 'C','B','D','A'};

  private char[] student =  {'B', 'D', 'B','A','C',
                              'A','B', 'A', 'A','D',
                              'B', 'C', 'D', 'A', 'D',
                              'C', 'C','C','D','A'};

  public int totalCorrect() {
    int total = 0;
    for (int i = 0; i < student.length; i++) {
      if (student[i] == correct[i])  total++;
    }
    return total;
  }

  public int totalIncorrect() {
    int total = 0;
    for (int i = 0; i < student.length; i++) {
      if(student[i] != correct [i]) total++;
    }
    return total;
  }

  public boolean passed() {
    return (totalCorrect() >= 15);
  }

  public int[] missed() {

    int[] temp = new int[totalIncorrect()];
    int index = 0;

    for (int i = 0; i < student.length; i++) {

      if (student[i] != correct[i]) {
        temp[index] = student[i];
        index++;
      }
    }
    return temp;
  }


}
