//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Robocop", new AgressiveBehaviour());
        robot.move();

        robot.setBehaviour(new DefensiveBehaviour());
        robot.move();

        robot.setBehaviour(new NormalBehaviour());
        robot.move();

        //utilisation du constructeur par copie

        Robot robot2 = robot;
        Robot robot3 = new Robot(robot);


    }
}