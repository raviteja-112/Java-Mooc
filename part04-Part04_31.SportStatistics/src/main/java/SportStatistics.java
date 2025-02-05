
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Game> games = readFile(file);

        System.out.println("Team: ");
        String teamSearch = scan.nextLine();
        int gamesPlayed = howManyGames(games, teamSearch);
        System.out.println("Games: " + gamesPlayed);

        int wonLost[] = howManyWon(games, teamSearch);
        System.out.println("Wins: " + wonLost[0]);
        System.out.println("Losses: " + wonLost[1]);
    }

    public static ArrayList<Game> readFile(String file) {
        ArrayList<Game> records = new ArrayList<>();
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitPoints = Integer.valueOf(parts[3]);

                records.add(new Game(homeTeam, visitTeam, homePoints, visitPoints));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return records;
    }

    public static int howManyGames(ArrayList<Game> games, String team) {
        int countGame = 0;

        for (Game game : games) {
            if (game.getHomeTeam().contains(team)
                    || game.getVisitTeam().contains(team)) {
                countGame++;
            }
        }

        return countGame;
    }

    public static int[] howManyWon(ArrayList<Game> games, String team) {
        int[] winLose = new int[2];
        for (Game game : games) {
            if (game.getHomeTeam().contains(team)) {
                if (game.getHomePoint() > game.getVisitPoint()) {
                    winLose[0]++;
                } else {
                    winLose[1]++;
                }
            }
            if (game.getVisitTeam().contains(team)) {
                if (game.getVisitPoint() > game.getHomePoint()) {
                    winLose[0]++;
                } else {
                    winLose[1]++;
                }
            }
        }
        return winLose;
    }
}
