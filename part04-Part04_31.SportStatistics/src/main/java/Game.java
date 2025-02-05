/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ravi
 */
public class Game {
    private String homeTeam;
    private String vistingTeam;
    private int homePoints;
    private int vistingPoints;
    
    public Game(String ht,String vt,int hp,int vp){
        this.homeTeam = ht;
        this.vistingTeam = vt;
        this.homePoints = hp;
        this.vistingPoints = vp;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }

    public String getVisitTeam(){
        return this.vistingTeam;
    }
    
    public int getHomePoint(){
        return this.homePoints;
    }
    
    public int getVisitPoint(){
        return this.vistingPoints;
    }    
    
}
