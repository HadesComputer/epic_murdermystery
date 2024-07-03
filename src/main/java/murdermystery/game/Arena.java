package murdermystery.game;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.HashMap;

public class Arena {
    private int minPlayers;
    private int maxPlayers;
    private int maxMurderers;
    private int minMurderers;
    private int minDetectives;
    private int maxDetectives;
    private int minAccomplices;
    private int maxAccomplices;
    private int minAssistants;
    private int maxAssistants;
    private int startIn;
    private int gameTime;
    private ArrayList<Player> players;
    private ArrayList<Location> goldDrip;
    private HashMap<Player, Role>  roles;
    private Location lobbyPoint;
    private Location viewPoint;
    private Location potionPoint;
    private GameState currentState;



    public void addPlayer(Player p){

    }

    public void removePlayer(Player p){

    }

    public void killPlayer(Player p){

    }

    public void startGame(){

    }

    public void reloadArena(){

    }

    public void clearArena(){

    }

    public int getSizeOfRole(Role role){
        int size = 0;
        for(Role r : roles.values()){
            if(r == role){
                size++;
            }
        }
        return size;
    }
    public boolean isInRole(Player p){ return this.roles.containsKey(p);}
    public Role getRoleByPlayer(Player p){return this.roles.get(p);}
    public boolean thereAreDetectivesAlive(){return getSizeOfRole(Role.DETECTIVE) <= 0;}
    public boolean thereAreMurderersAlive(){return getSizeOfRole(Role.MURDERER) <= 0;}
    public boolean thereAreInnocentAlive(){return getSizeOfRole(Role.INNOCENT) <= 0;}
    public boolean thereAreAccomplicesAlive(){return getSizeOfRole(Role.ACCOMPLICE) <= 0;}
    public boolean thereAreAssistantsAlive(){return getSizeOfRole(Role.ASSISTANT) <= 0;}

    public boolean isFull(){return getPlayers().size() == getMaxPlayers();}

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getMaxMurderers() {
        return maxMurderers;
    }

    public void setMaxMurderers(int maxMurderers) {
        this.maxMurderers = maxMurderers;
    }

    public int getMinMurderers() {
        return minMurderers;
    }

    public void setMinMurderers(int minMurderers) {
        this.minMurderers = minMurderers;
    }

    public int getMinDetectives() {
        return minDetectives;
    }

    public void setMinDetectives(int minDetectives) {
        this.minDetectives = minDetectives;
    }

    public int getMaxDetectives() {
        return maxDetectives;
    }

    public void setMaxDetectives(int maxDetectives) {
        this.maxDetectives = maxDetectives;
    }

    public int getMinAccomplices() {
        return minAccomplices;
    }

    public void setMinAccomplices(int minAccomplices) {
        this.minAccomplices = minAccomplices;
    }

    public int getMaxAccomplices() {
        return maxAccomplices;
    }

    public void setMaxAccomplices(int maxAccomplices) {
        this.maxAccomplices = maxAccomplices;
    }

    public int getMinAssistants() {
        return minAssistants;
    }

    public void setMinAssistants(int minAssistants) {
        this.minAssistants = minAssistants;
    }

    public int getMaxAssistants() {
        return maxAssistants;
    }

    public void setMaxAssistants(int maxAssistants) {
        this.maxAssistants = maxAssistants;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public HashMap<Player, Role> getRoles() {
        return roles;
    }

    public void setRoles(HashMap<Player, Role> roles) {
        this.roles = roles;
    }

    public Location getLobbyPoint() {
        return lobbyPoint;
    }

    public void setLobbyPoint(Location lobbyPoint) {
        this.lobbyPoint = lobbyPoint;
    }

    public Location getViewPoint() {
        return viewPoint;
    }

    public void setViewPoint(Location viewPoint) {
        this.viewPoint = viewPoint;
    }

    public Location getPotionPoint() {
        return potionPoint;
    }

    public void setPotionPoint(Location potionPoint) {
        this.potionPoint = potionPoint;
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }

    public int getStartIn() {
        return startIn;
    }

    public void setStartIn(int startIn) {
        this.startIn = startIn;
    }

    public int getGameTime() {
        return gameTime;
    }

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }
}
