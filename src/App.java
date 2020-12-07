public class App {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        Command moveUp = new MoveUpCommand(screen);
        Command moveDown = new MoveDownCommand(screen);
        WallButton buttonUp = new WallButton(moveUp);
        WallButton buttonDown = new WallButton(moveDown);

        buttonUp.push();
        buttonDown.push();
    }
}
