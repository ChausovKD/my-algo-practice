package kyu8.basic_subclasses_adam_and_eve;

import static org.junit.Assert.assertTrue;

/*
    Task: Basic subclasses - Adam and Eve (8 kyu)
    URL: https://www.codewars.com/kata/547274e24481cfc469000416

    Description: According to the creation myths of the Abrahamic religions, Adam and Eve were the first Humans to
    wander the Earth.
    You have to do God's job. The creation method must return an array of length 2 containing objects (representing
    Adam and Eve). The first object in the array should be an instance of the class Man. The second should be an
    instance of the class Woman. Both objects have to be subclasses of Human. Your job is to implement the Human, Man
    and Woman classes.
*/

class God {
    public static Human[] create(){
        return new Human[] {new Man(), new Woman()};
    }
}

public class Main {
    public static void main(String[] args) {
        Human[] paradise = God.create();
        assertTrue("Adam is a man", paradise[0] instanceof Man);
        assertTrue("Eve is a woman", paradise[1] instanceof Woman);
    }
}

class Human {

}

class Man extends Human {

}

class Woman extends Human {

}