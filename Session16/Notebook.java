public class Notebook
{

  private int numberOfNotes;
  private Note[] notes;

  public Notebook(int maxNumberOfNotes) {
    notes = new Note[maxNumberOfNotes];
  }

  public int getNumberOfNotes() {
    return numberOfNotes;
  }

  public Note getNote(int index) {

    if (index >= 0 && index < notes.length && notes[index] != null)
      return notes[index].copy();

    return null;
  }

  public String getMessage(int index) {

    if (index >= 0 && index < notes.length && notes[index] != null)
      return notes[index].getMessage();

    else return "Message not found";

  }

  public void addNote(Note note) {

    if (note != null) {

      for (int i = 0; i < notes.length; i++) {

        if (notes[i] == null)
        {
          notes[i] = note.copy();
          numberOfNotes++;
          break;
        }
      }
    }

  }

  public void addNote(String message) {

    for (int i = 0; i < notes.length; i++) {

      if (notes[i] == null)
      {
        notes[i] = new Note(message);
        numberOfNotes++;
        break;
      }

    }
  }

  public void addHighPriorityNote(String message) {

    for (int i = 0; i < notes.length; i++) {

      if (notes[i] == null)
      {
        notes[i] = new Note(message);
        notes[i].setToHighPriority();
        numberOfNotes++;
        break;

      }

    }
  }

  public void removerNote(int index) {

    if (index >= 0 && index < notes.length)
    {
      notes[index] = null;
      numberOfNotes--;
    }

  }

  public Note[] getAllNotes() {

    Note[] temp = new Note[getNumberOfNotes()];
    int tempI = 0;

    for (int i = 0; i < notes.length; i++) {

      if (notes[i] != null) {

        temp[i] = notes[i];
        tempI++;

      }
    }
    return temp;
  }

  public int getNumberOfHighPriorityNotes() {

    int num = 0;

    for (int i = 0; i < notes.length; i++) {
      if (notes[i] != null)
      {
        if (notes[i].isHighPriority())
          num++;
      }
    }
    return num;

  }

  public Note[] getAllHighPriorityNotes() {

    Note[] temp = new Note[getNumberOfHighPriorityNotes()];
    int indexT = 0;

    for (int i = 0; i < notes.length; i++)
    {

      if (notes[i] != null)
      {

        if (notes[i].isHighPriority())
        {
          temp[indexT] = notes[i];
          indexT++;
        }
      }
    }

    return temp;

  }

  public String toString() {

    String str = "";

    for (int i = 0; i < notes.length; i++) {

      if (notes[i] != null) {
        str += notes[i] + "\n";
      }
    }

    return str;

  }





}
