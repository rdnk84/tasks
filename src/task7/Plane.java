package task7;

public class Plane {

    private class Wing {

        int wingWeight;

        public int wingInfo(int wing) {

            System.out.println("крыло весит " + wing);
            return wing;
        }
    }

    public void showWingInfo(int wingInf) {
        Wing wing = new Wing();
        wing.wingInfo(wingInf);
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        plane1.showWingInfo(500);
        plane2.showWingInfo(700);

    }
}
