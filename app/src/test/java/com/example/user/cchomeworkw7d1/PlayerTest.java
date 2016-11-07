package com.example.user.cchomeworkw7d1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    private Player barney;

    @Before
    public void before() {
        barney = new Player( "Raymond van Barneveld", "Barney", 5 );
    }

    @Test
    public void getName() {
        assertEquals( "Raymond van Barneveld", barney.getName() );
    }

    @Test
    public void setName() {
        barney.setName( "Ray van B" );
        assertEquals( "Ray van B", barney.getName() );
    }

    @Test
    public void getNickname() {
        assertEquals( "Barney", barney.getNickname() );
    }

    @Test
    public void setNickname() {
        barney.setNickname( "Barnster" );
        assertEquals( "Barnster", barney.getNickname() );
    }

    @Test
    public void getRanking() {
        assertEquals( 5, barney.getRanking() );
    }

    @Test
    public void setRanking() {
        barney.setRanking( 2 );
        assertEquals( 2, barney.getRanking() );
    }

    @Test
    public void testToString() {
        assertEquals( "Name: Raymond van Barneveld, Nickname: Barney, Ranking: 5", barney.toString() );
    }

    @Test
    public void rankingIsMinus1WhenNotProvided() {
        Player defaultRanking = new Player( "Phil Taylor", "The Power" );
        assertEquals( -1, defaultRanking.getRanking() );
    }
}
