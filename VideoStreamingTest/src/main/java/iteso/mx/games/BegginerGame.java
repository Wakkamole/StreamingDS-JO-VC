package iteso.mx.games;

import iteso.mx.trash.Trash;
import iteso.mx.trashLevels.TrashLevel;
import iteso.mx.trashLevels.TrashLevelBegginer;

import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

public class BegginerGame extends Game {

    public BegginerGame(){
        level = 1;
        levelString = "Beginner";
    }

    @Override
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit * 7;
    }

    @Override
    public void printAnswersMenu() {
        System.out.println("  a) Organic");
        System.out.println("  b) Inorganic");
    }

    @Override
    public boolean evalAnswer(String userAnswer, String trashValue) {

        String aux = "";
        if (userAnswer.equals("a"))
            aux = "Organic";
        else if (userAnswer.equals("b"))
            aux = "Inorganic";
        else
            System.out.println("Please enter a valid option");

        boolean answer = trashValue.equals(aux);
        return answer;
    }
}
