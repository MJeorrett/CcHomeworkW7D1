package com.example.user.cchomeworkw7d1;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Rankings {

    private ArrayList<Player> players;

//    public Rankings() {
//        this.players = new ArrayList<Player>();
//    }

    public Rankings( ArrayList<Player> players ) {

        this.players = new ArrayList<Player>( players );
        this.setPlayerRankings();
    }

    private void setPlayerRankings() {

        Player player;

        for ( int i = 0; i < 10; i++ ) {
            player = players.get( i );
            player.setRanking( i + 1 );
        }
    }

    public ArrayList<Player> getPlayers() {
        return new ArrayList<Player>( players );
    }

    public Player getPlayerWithRanking( int ranking ) {
        return players.get( ranking - 1 );
    }

    public void setPlayerAtRanking( int ranking, Player player ) {
        players.set( ranking - 1, player );
    }

    public void replaceBottomRankedWithPlayer( Player newBottomPlayer ) {
        this.setPlayerAtRanking( 10, newBottomPlayer );
    }

    public Player findPlayerByNickname( String nickname ) {

        for ( Player player : players ) {
            if ( player.getNickname() == nickname ) {
                return player;
            }
        }

        return null;
    }

    public void movePlayerUpRankings( String nickname ) {

        Player player = this.findPlayerByNickname( nickname );
        int playerIndex = player.getRanking() - 1;

        players.remove( playerIndex );
        players.add( playerIndex - 1, player );

        this.setPlayerRankings();
    }

    public void movePlayerDownRankings( String nickname ) {

        Player player = this.findPlayerByNickname( nickname );
        int playerIndex = player.getRanking() - 1;

        players.remove( playerIndex );
        players.add( playerIndex + 1, player );

        this.setPlayerRankings();
    }
}
