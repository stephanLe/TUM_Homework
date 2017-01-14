import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

/**
 * Created by root on 06.01.2017.
 */
public class AnimalsMovementTest {
    Position positionT;
    @Before
    public void initialize(){
        positionT = new Position();
    }

    @Test
    public void ElephantMovementOnEmptyBoardFromE3() throws Exception {
        Elephant test = new Elephant(false);
        positionT.setMyAnimals(CreateAnimal(test, "e3"));
        Move expected[] = {new Move("e3e4"), new Move("e3e5"), new Move("e3e6"), new Move("e3e7"), new Move("e3e8"), new Move("e3e2"), new Move("e3e1"), new Move("e3d3"), new Move("e3c3"), new Move("e3b3"), new Move("e3a3"), new Move("e3f3"), new Move("e3g3"), new Move("e3h3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void ElephantMovementWithFriendOnE6FromE3() throws Exception {
        Elephant test = new Elephant(false);
        positionT.setMyAnimals(CreateAnimal( new Elephant(false), "e6"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3e5"), new Move("e3e2"), new Move("e3e1"), new Move("e3d3"), new Move("e3c3"), new Move("e3b3"), new Move("e3a3"), new Move("e3f3"), new Move("e3g3"), new Move("e3h3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void ElephantMovementWithFriendOnE6DeadOnE2FromE3() throws Exception {
        Elephant test = new Elephant(false);
        positionT.setMyAnimals(CreateAnimal( new Elephant(false), "e6"),
                CreateAnimal( new Elephant(true), "e2", false),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3e5"), new Move("e3e2"), new Move("e3e1"), new Move("e3d3"), new Move("e3c3"), new Move("e3b3"), new Move("e3a3"), new Move("e3f3"), new Move("e3g3"), new Move("e3h3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void ElephantMovementWithFriendOnE6AndB3FromE3() throws Exception {
        Elephant test = new Elephant(false);
        positionT.setMyAnimals(CreateAnimal( new Elephant(false), "e6"),
                CreateAnimal( new Elephant(false), "b3"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3e5"), new Move("e3e2"), new Move("e3e1"), new Move("e3d3"), new Move("e3c3"), new Move("e3f3"), new Move("e3g3"), new Move("e3h3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }



    @Test
    public void PenguinMovementOnEmptyBoardFromD1() throws Exception {
        Penguin test = new Penguin(false);
        positionT.setMyAnimals(CreateAnimal( test, "d1"));

        positionT.setMyAnimals(test);
        Move expected[] = {new Move("d1c1"), new Move("d1c2"), new Move("d1d2"), new Move("d1e2"), new Move("d1e1")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void PenguinMovementOnEmptyBoardFromE3() throws Exception {
        Penguin test = new Penguin(false);
        positionT.setMyAnimals(CreateAnimal( test, "e3"));

        positionT.setMyAnimals(test);
        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3f2"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3"), new Move("e3d4")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void PenguinMovementWithFriendOnD4FromE3() throws Exception {
        Penguin test = new Penguin(false);
        positionT.setMyAnimals(CreateAnimal( new Penguin(false), "d4"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3f2"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void PenguinMovementWithFriendOnD4AndDeadOnF2FromE3() throws Exception {
        Penguin test = new Penguin(false);
        positionT.setMyAnimals(CreateAnimal( new Penguin(false), "d4"),
                CreateAnimal(new Penguin(false), "f2", false),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3f2"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void PenguinMovementWithFriendOnD4AndF2FromE3() throws Exception {
        Penguin test = new Penguin(false);
        positionT.setMyAnimals(CreateAnimal( new Penguin(false), "d4"),
                CreateAnimal( new Penguin(false), "f2"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void PenguinMovementWithFriendOnD4AndF2AndB3FromE3() throws Exception {
        Penguin test = new Penguin(false);
        positionT.setMyAnimals(CreateAnimal( new Penguin(false), "d4"),
                CreateAnimal( new Penguin(false), "f2"),
                CreateAnimal( new Penguin(false), "b3"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void PenguinMovementWithFriendOnD4AndB3PreyOnF2FromE3() throws Exception {
        Penguin test = new Penguin(true);
        positionT.setMyAnimals(CreateAnimal( new Penguin(false), "d4"),
                CreateAnimal( new Rabbit(false), "f2"),
                CreateAnimal( new Penguin(false), "b3"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3"), new Move("e3f2")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void RabbitMovementOnEmptyBoardFromE3() throws Exception {
        Rabbit test = new Rabbit(false);
        positionT.setMyAnimals(CreateAnimal(test, "e3"));
        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3f2"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3"), new Move("e3d4")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void RabbitMovementWithFriendOnD4FromE3() throws Exception {
        Rabbit test = new Rabbit(false);
        positionT.setMyAnimals(CreateAnimal( new Rabbit(false), "d4"),
                CreateAnimal( test, "e3"));
        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3f2"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void RabbitMovementWithFriendOnD4AndDeadOnF2FromE3() throws Exception {
        Rabbit test = new Rabbit(false);
        positionT.setMyAnimals(CreateAnimal( new Rabbit(false), "d4"),
                CreateAnimal(new Rabbit(false), "f2", false),
                CreateAnimal( test, "e3"));
        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3f2"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void RabbitMovementWithFriendOnD4AndF2FromE3() throws Exception {
        Rabbit test = new Rabbit(false);
        positionT.setMyAnimals(CreateAnimal( new Rabbit(false), "d4"),
                CreateAnimal( new Rabbit(false), "f2"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void RabbitMovementWithFriendOnD4AndF2AndB3FromE3() throws Exception {
        Rabbit test = new Rabbit(false);
        positionT.setMyAnimals(CreateAnimal( new Rabbit(false), "d4"),
                CreateAnimal( new Rabbit(false), "f2"),
                CreateAnimal( new Rabbit(false), "b3"),
                CreateAnimal( test, "e3"));
        Move expected[] = {new Move("e3e4"), new Move("e3f4"), new Move("e3f3"), new Move("e3e2"), new Move("e3d2"), new Move("e3d3")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void HorseMovementWithFriendOnE4AndC5FromE3() throws Exception {
        Horse test = new Horse(false);
        positionT.setMyAnimals(CreateAnimal( new Horse(false), "c5"),
                CreateAnimal( new Horse(false), "e4"),
                CreateAnimal( test, "e3"));

        Move expected[] = {new Move("e3d3"), new Move("e3f3"), new Move("e3e2"), new Move("e3c1"), new Move("e3g1"), new Move("e3g5"), new Move("e3h6")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void LeopardMovementOnEmptyBoardFromE3() throws Exception {
        Leopard test = new Leopard(false);
        positionT.setMyAnimals(CreateAnimal( test, "e3"));

        positionT.setMyAnimals(test);
        Move expected[] = {new Move("e3e4"), new Move("e3e5"), new Move("e3e6"), new Move("e3e7"), new Move("e3e8"),
                new Move("e3e1"), new Move("e3e2"),
                new Move("e3f3"), new Move("e3g3"), new Move("e3h3"),
                new Move("e3d3"), new Move("e3c3"), new Move("e3b3"),new Move("e3a3"),
                new Move("e3d4"), new Move("e3c5"), new Move("e3b6"),new Move("e3a7"),
                new Move("e3f4"), new Move("e3g5"), new Move("e3h6"),
                new Move("e3c1"), new Move("e3d2"), new Move("e3g1"), new Move("e3f2")};

        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void LeopardMovementWithFriendOnG3EnemyPredOnH6DeadAllyOnB6AndDeadEnemyOnC1PreyOnE2FromE3() throws Exception {
        Leopard test = new Leopard(false);
        positionT.setMyAnimals(CreateAnimal( test, "e3"), CreateAnimal(new Elephant(false), "g3"),
                CreateAnimal(new Leopard(true), "h6"), CreateAnimal(new Rabbit(false), "b6", false),
                        CreateAnimal(new Elephant(true), "c1", false), CreateAnimal(new Rabbit(true), "e2"),
                        CreateAnimal(test, "e3"));

        Move expected[] = {new Move("e3e4"), new Move("e3e5"), new Move("e3e6"), new Move("e3e7"), new Move("e3e8"),
                new Move("e3e2"), new Move("e3f3"),
                new Move("e3d3"), new Move("e3c3"), new Move("e3b3"),new Move("e3a3"),
                new Move("e3d4"), new Move("e3c5"), new Move("e3b6"),new Move("e3a7"),
                new Move("e3f4"), new Move("e3g5"),
                new Move("e3c1"), new Move("e3d2"), new Move("e3g1"), new Move("e3f2")};

        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void SnakeMovementOnEmptyBoardFromE3() throws Exception {
        Snake test = new Snake(false);
        positionT.setMyAnimals(CreateAnimal(test, "e3"));
        Move expected[] = {new Move("e3d4"), new Move("e3e5"), new Move("e3d6"), new Move("e3e7"), new Move("e3d8"),
                new Move("e3d2"), new Move("e3c3"), new Move("e3b2"), new Move("e3a3"),
                new Move("e3f2"), new Move("e3e1"),
                new Move("e3f4"), new Move("e3g3"), new Move("e3h4")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void SnakeMovementOnEmptyBoardFromA1() throws Exception {
        Snake test = new Snake(false);
        positionT.setMyAnimals(CreateAnimal(test, "a1"));
        Move expected[] = {new Move("e3b2"), new Move("e3c1"), new Move("e3d2"),
                new Move("e3e1"), new Move("e3f2"),
                new Move("e3g1"), new Move("e3h2")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void SnakeMovementEnemyE1BoardFromA1() throws Exception {
        Snake test = new Snake(false);
        positionT.setMyAnimals(CreateAnimal(test, "a1"), CreateAnimal(new Rabbit(true), "e1"));
        Move expected[] = {new Move("e3b2"), new Move("e3c1"), new Move("e3d2"), new Move("e3e1")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void SnakeMovementFriendE1BoardFromA1() throws Exception {
        Snake test = new Snake(false);
        positionT.setMyAnimals(CreateAnimal(test, "a1"), CreateAnimal(new Rabbit(false), "e1"));
        Move expected[] = {new Move("e3b2"), new Move("e3c1"), new Move("e3d2")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    @Test
    public void HorseMovementFriendE1BoardFromA1() throws Exception {
        Horse test = new Horse(false);
        positionT.setMyAnimals(CreateAnimal(test, "a1"), CreateAnimal(new Rabbit(false), "c3"));
        Move expected[] = {new Move("a1a2"), new Move("a1b1")};
        Assert.assertArrayEquals("Moves possible unequal to expected. ", expected, test.possibleMoves());
    }

    public Animal CreateAnimal(Animal toCreate, String sq){
        toCreate.square=sq;
        toCreate.position = positionT;
        toCreate.alive=true;
        return toCreate;
    }

    public Animal CreateAnimal(Animal toCreate, String sq, boolean alive){
        toCreate.square=sq;
        toCreate.position = positionT;
        toCreate.alive=alive;
        return toCreate;
    }
}
