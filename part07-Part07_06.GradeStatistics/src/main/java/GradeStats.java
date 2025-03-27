
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ravi
 */
public class GradeStats {

    private ArrayList<Integer> points;

    public GradeStats() {
        this.points = new ArrayList<>();
    }

    public boolean checkRange(int number) {
        if (number >= 0 && number <= 100) {
            return true;
        }
        return false;
    }

    public void addPoints(int point) {
        if (checkRange(point)) {
            this.points.add(point);
        }

    }

    public int noOfSubs() {
        return this.points.size();
    }

    public int totalPoints() {
        int sum = 0;
        for (int i : this.points) {
            sum = sum + i;
        }

        return sum;
    }

    public double avgAll() {
        return 1.0 * totalPoints() / noOfSubs();
    }

    public int sumPass() {
        int sum = 0;
        for (int i : this.points) {
            if (isMoreThan50(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public double avgPass() {
        int sum = sumPass();
        if (sum == 0) {
            return -1;
        }

        return 1.0 * sum / noOfPassSubs();
    }

    public int noOfPassSubs() {
        int num = 0;
        for (int i : this.points) {
            if (isMoreThan50(i)) {
                num++;
            }
        }
        return num;

    }

    public boolean isMoreThan50(int point) {
        if (checkRange(point)) {
            if (point >= 50) {
                return true;
            }
        }
        return false;
    }

    public double passPerc() {
        if (noOfPassSubs() == 0) {
            return 0.0;
        }

        System.out.println(noOfPassSubs());
        System.out.println(noOfSubs());

        return 100.0 * noOfPassSubs() / noOfSubs();
    }

    public int[] gradeDistribuition() {
        int[] grades = new int[6];

        for (int point : this.points) {
            if (point < 50) {
                grades[0]++;

            } else if (point < 60) {
                grades[1]++;

            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else if (point >= 90) {
                grades[5]++;
            }
        }

        return grades;

    }

    public void printGrades(int[] grades) {
        System.out.print("5: ");
        printStars(grades[5]);
        System.out.print("4: ");
        printStars(grades[4]);
        System.out.print("3: ");
        printStars(grades[3]);
        System.out.print("2: ");
        printStars(grades[2]);
        System.out.print("1: ");
        printStars(grades[1]);
        System.out.print("0: ");
        printStars(grades[0]);

    }

    public void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}



