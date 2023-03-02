package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {

        float sec = minutes * 60;
        System.out.println(sec);
    }

    public static void main(String[] args) {

        TimeConvertor sec = new TimeConvertor();
        sec.convert(10);


    }

}


