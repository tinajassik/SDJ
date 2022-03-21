public class Brain
{

  private String[] memory;

  public Brain(int numberOfItems) {
    memory = new String[numberOfItems];

    for (int i = 0; i < memory.length; i++) {
      memory[i] = "";
    }
  }

  public boolean isBrainDamaged() {

    for (int i = 0; i < memory.length; i++) {

      if(memory[i] == null) return true;
    }

    return false;
  }

  public void remember(String info) {

    for (int i = memory.length -1 ;  i > 0; i--) {
      memory[i] = memory[i-1];
    }
    memory[0] = info;
  }

public int getIQ() {

    int highest = memory[0].length();
    int lowest = memory[0].length();

    for (int i = 0; i < memory.length; i++) {

      // null

      if (memory[i].length() > highest)
        highest = memory[i].length();

      if (memory[i].length() < lowest)
        lowest = memory[i].length();

    }

    if (highest > 20 && lowest > 10)
      return 130;
    else if (lowest > 10)
      return 100;
    else return 70;
}

  public void refreshMemory(String info) {

    int position = 0;

    for (int i = 0; i < memory.length; i++) {

      if (memory[i].equals(info)) position = i;
    }

    for (int i = position; i > 0; i--) {
      memory[i] = memory[i-1];
    }
    memory[0] = info;

    }

    public boolean recall(String info) {

    for (int i = 0; i < memory.length; i++) {

      if (memory[i].equals(info)) {
        return true;
      }
    }
    return false;
  }

  public String recall() {
    return memory[0];
  }

  public String toString() {
    String str = "Brain memory ";

    for (int i = 0; i< memory.length; i++) {
      str += "[" + memory[i] + "], ";
    }

    return str;
  }

  public boolean equals(Object obj) {

    if (!(obj instanceof Brain)) return false;

    Brain other = (Brain)obj;

    if (memory.length != other.memory.length)
      return false;

    else {

      for (int i = 0; i < memory.length; i++) {

        if (memory[i] == null && other.memory != null)
          return false;

        else if (memory[i] != null) {
          if (!memory[i].equals(other.memory[i])) return false;
        }
      }
    } return true;

  }
  
}
