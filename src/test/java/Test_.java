import org.junit.jupiter.api.Test;
import org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_ {
    @Test
    public void destruction() {
        Main task = new Main(3,3);
        task.create(0, 0, 'o');
        assertEquals (task.getStatus(0,0), 'o');
        task.delete(0,0);
        assertEquals (task.getStatus(0,0), ' ');
    }
    @Test
    public void existence() {
        Main task = new Main(3,3);
        task.create(2, 0, 'x');
        assertEquals (task.getStatus(2,0), 'x');
    }
    @Test
    public void horizont() {
        Main task = new Main(4,4);
        task.create(0, 0, 'o');
        task.create(1, 0, 'x');
        task.create(0, 1, 'o');
        task.create(1, 1, 'x');
        task.create(0, 2, 'o');
        assertEquals (task.lineHorizontal('o'), 3);
    }
    @Test
    public void mainDiagonal() {
        Main task = new Main(3,3);
        task.create(0, 0, 'o');
        task.create(1, 0, 'x');
        task.create(1, 1, 'o');
        task.create(2, 2, 'o');
        assertEquals (task.diagonalLength('o'), 3);
    }
    @Test
    public void saidDiagonal() {
        Main task = new Main(3,3);
        task.create(0, 2, 'o');
        task.create(1, 0, 'x');
        task.create(1, 1, 'o');
        task.create(2, 0, 'o');
        System.out.println(task);
        assertEquals (task.diagonalLength('o'), 3);
    }
    @Test
    public void verticallyFirst() {
        Main task = new Main(3,3);
        task.create(0, 2, 'o');
        task.create(1, 0, 'x');
        task.create(1, 2, 'o');
        task.create(2, 0, 'x');
        System.out.println(task);
        assertEquals (task.lineVertical('o'), 2);
    }
    @Test
    public void vertically() {
        Main task = new Main(5,5);
        task.create(0, 1, 'o');
        task.create(0, 3, 'x');
        task.create(1, 1, 'o');
        task.create(1, 3, 'x');
        task.create(1, 4, 'o');
        task.create(2, 0, 'x');
        task.create(2, 1, 'o');
        task.create(2, 2, 'x');
        task.create(2, 3, 'o');
        task.create(2, 4, 'x');
        task.create(3, 1, 'x');
        task.create(3, 2, 'o');
        task.create(3, 3,'x');
        task.create(4, 1, 'o');
        assertEquals (task.lineVertical('o'), 3);
        assertEquals (task.lineVertical('x'), 2);
    }
}

