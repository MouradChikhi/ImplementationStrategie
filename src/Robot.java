public class Robot {
    String name;
    IBehaviour behaviour;

    public Robot(String name, IBehaviour behaviour) {
        this.name = name;
        this.behaviour = behaviour;
    }
    //Constructeur par defauit
    public Robot(){
        this.name = "anonyme";
    }

    //Constructeur par copie
    public Robot(Robot other){
        this.name = other.name;
        this.behaviour = other.behaviour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IBehaviour getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    //Methode move
    public void move(){
        this.behaviour.move();
    }

    //
}
