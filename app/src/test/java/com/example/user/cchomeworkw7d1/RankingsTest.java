package com.example.user.cchomeworkw7d1;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by user on 07/11/2016.
 */

public class RankingsTest {

    private Player barney;
    private Player thePower;
    private Player razor;
    private Player popeye;
    private Player boogaloo;
    private Player jenno;
    private Player choppa;
    private Player theAsset;
    private Player undertaker;
    private Player hero;

    private Player theCat;

    private ArrayList<Player> testPlayersArray;
//    private Rankings emptyRankings;
    private Rankings prepopulatedRankings;

    @Before
    public void before() {

        this.theCat = new Player( "Mike Veitch", "The Cat" );

        this.barney = new Player( "Raymond Van Barneveld", "Barney" );
        this.thePower = new Player( "Phil Taylor", "The Power" );
        this.razor = new Player( "Ray Carver", "Razor" );
        this.popeye = new Player( "Petri Korte", "Popeye" );
        this.boogaloo = new Player( "Paul Barham", "Boogaloo" );
        this.jenno = new Player( "Paul Jennings", "Jenno" );
        this.choppa = new Player( "Pat Orreal", "Choppa" );
        this.theAsset = new Player( "Paul Nicholson", "The Asset" );
        this.undertaker = new Player( "Nigel Heydon", "Undertaker" );
        this.hero = new Player( "Nick Fullwell", "Hero" );

        Player[] playersArray = {
                barney,
                thePower,
                razor,
                popeye,
                boogaloo,
                jenno,
                choppa,
                theAsset,
                undertaker,
                hero
        };

        this.testPlayersArray = new ArrayList<>();

        for ( Player player : playersArray ) {
            this.testPlayersArray.add( player );
        }

//        this.emptyRankings = new Rankings();
        this.prepopulatedRankings = new Rankings( testPlayersArray );
    }

//    @Test
//    public void emptyRankingSize() {
//        assertEquals( 0, emptyRankings.size() );
//    }

    @Test
    public void populatedRankingHasPlayers() {
        assertEquals( testPlayersArray, prepopulatedRankings.getPlayers() );
    }

    @Test
    public void populatedRankingSetsRankings() {
        assertEquals( 1, barney.getRanking() );
        assertEquals( 2, thePower.getRanking() );
        assertEquals( 3, razor.getRanking() );
        assertEquals( 4, popeye.getRanking() );
        assertEquals( 5, boogaloo.getRanking() );
        assertEquals( 6, jenno.getRanking() );
        assertEquals( 7, choppa.getRanking() );
        assertEquals( 8, theAsset.getRanking() );
        assertEquals( 9, undertaker.getRanking() );
        assertEquals( 10, hero.getRanking() );
    }

    @Test
    public void getPlayerWithRanking() {
        assertEquals( barney, prepopulatedRankings.getPlayerWithRanking( 1 ) );
        assertEquals( thePower, prepopulatedRankings.getPlayerWithRanking( 2 ) );
        assertEquals( razor, prepopulatedRankings.getPlayerWithRanking( 3 ) );
        assertEquals( popeye, prepopulatedRankings.getPlayerWithRanking( 4 ) );
        assertEquals( boogaloo, prepopulatedRankings.getPlayerWithRanking( 5 ) );
        assertEquals( jenno, prepopulatedRankings.getPlayerWithRanking( 6 ) );
        assertEquals( choppa, prepopulatedRankings.getPlayerWithRanking( 7 ) );
        assertEquals( theAsset, prepopulatedRankings.getPlayerWithRanking( 8 ) );
        assertEquals( undertaker, prepopulatedRankings.getPlayerWithRanking( 9 ) );
        assertEquals( hero, prepopulatedRankings.getPlayerWithRanking( 10 ) );
    }

    @Test
    public void setPlayerAtRanking() {

        for ( int i = 1; i <= 10; i++ ) {
            prepopulatedRankings.setPlayerAtRanking( i, theCat );
            assertEquals( theCat, prepopulatedRankings.getPlayerWithRanking( i ) );
        }
    }

    @Test
    public void replaceBottomRankedWithPlayer() {
        prepopulatedRankings.replaceBottomRankedWithPlayer( theCat );
        assertEquals( theCat, prepopulatedRankings.getPlayerWithRanking( 10 ) );
    }

    @Test
    public void getPlayerByNickname() {
        assertEquals( boogaloo, prepopulatedRankings.findPlayerByNickname( "Boogaloo" ) );
    }

    @Test
    public void getPlayerByNicknameWhenNotFoundReturnsNull() {
        assertEquals( null, prepopulatedRankings.findPlayerByNickname( "Notaplayername") );
    }

    @Test
    public void movePlayerUpRanking() {
        prepopulatedRankings.movePlayerUpRankings( "Boogaloo");

        assertEquals( 1, barney.getRanking() );
        assertEquals( 2, thePower.getRanking() );
        assertEquals( 3, razor.getRanking() );
        assertEquals( 4, boogaloo.getRanking() );
        assertEquals( 5, popeye.getRanking() );
        assertEquals( 6, jenno.getRanking() );
        assertEquals( 7, choppa.getRanking() );
        assertEquals( 8, theAsset.getRanking() );
        assertEquals( 9, undertaker.getRanking() );
        assertEquals( 10, hero.getRanking() );
    }

    @Test
    public void movePlayerDownRanking() {
        prepopulatedRankings.movePlayerDownRankings( "Boogaloo");

        assertEquals( 1, barney.getRanking() );
        assertEquals( 2, thePower.getRanking() );
        assertEquals( 3, razor.getRanking() );
        assertEquals( 4, popeye.getRanking() );
        assertEquals( 5, jenno.getRanking() );
        assertEquals( 6, boogaloo.getRanking() );
        assertEquals( 7, choppa.getRanking() );
        assertEquals( 8, theAsset.getRanking() );
        assertEquals( 9, undertaker.getRanking() );
        assertEquals( 10, hero.getRanking() );
    }
}
