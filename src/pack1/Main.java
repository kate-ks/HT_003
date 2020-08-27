package pack1;

public class Main {
    public static void main(String[] args) {

    ExcellentPupil excellentPupil= new ExcellentPupil();
    GoodPupil goodPupil= new GoodPupil();
    BadPupil badPupil= new BadPupil();

    ClassRoom classRooms= new ClassRoom(excellentPupil, goodPupil,badPupil);
    excellentPupil.read();
    goodPupil.read();
    badPupil.read();
    }
}
