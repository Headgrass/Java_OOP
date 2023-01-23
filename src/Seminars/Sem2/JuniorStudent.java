package Seminars.Sem2;

public class JuniorStudent extends Student implements Player, Extender {
    private Boolean Extended;

    public boolean isExtended() {
        return this.Extended;
    }

    public JuniorStudent(String name, int mark, int classNumber, boolean isExtended) {
        super(name, mark, classNumber);
        this.Extended = isExtended;
    }
    public JuniorStudent(String name, int mark, int classNumber) {
        super(name, mark, classNumber);
    }



    @Override
    public void play() {
        System.out.println("Я играю в игрушки");
    }

    @Override
    public void study() {
        System.out.println("Я люблю школу");
    }

    @Override
    public void toExtendedGroup() {
        this.Extended = true;
    }

    @Override
    public String toString() {
        return String.format("%s, isExtended: %b", super.toString(), this.isExtended());
    }
}
