package com.example.user.cchomeworkw7d1;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name;
    private String nickname;
    private int ranking;

    public Player( String name, String nickname, int ranking ) {

        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public Player( String name, String nickname ) {
        this( name, nickname, -1 );
    }

    public String getName() {
        return name;
    }

    public void setName( String newName ) {
        this.name = newName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname( String newNickname ) {
        this.nickname = newNickname;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking( int newRanking ) {
        this.ranking = newRanking;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Nickname: " + nickname + ", Ranking: " + ranking;
    }
}
