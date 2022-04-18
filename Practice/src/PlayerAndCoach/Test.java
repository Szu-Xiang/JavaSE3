package PlayerAndCoach;

public class Test {

    public static void main(String[] args) {

        //创建对象
        pingpongPlayer ppp = new pingpongPlayer("王皓", 34);
        System.out.println(ppp.getName() + ", " +ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.studyEnglish();

        basketballPlayer bp = new basketballPlayer("姚明", 35);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.eat();
        bp.study();
    }
}
