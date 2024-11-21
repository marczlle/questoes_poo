package teste;

//instrução:
//Write a new class called MovableRectangle, which composes two MovablePoints (representing the top-left and bottom-right corners) 
//and implementing the Movable Interface. Make sure that the two points has the same speed.


//criando a classe pedida na questão com os métodos e implements baseados no diagrama de classes oferecido na questão
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

//resposta a pergunta:
//"What is the difference between an interface and an abstract class?"

//Uma interface tem um contrato apenas com métodos abstratos,
//enquanto uma classe abstrata pode ter métodos abstratos, concretos, e atributos.
