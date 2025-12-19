package org.rosterleague.common;

import java.io.Serial;
import java.io.Serializable;

/**
 * DTO for {@link org.rosterleague.entities.Match}
 */
public class MatchDetails implements Serializable {
    @Serial
    private static final long serialVersionUID = 125141369065843219L;

    private final String id;
    private final String homeTeamId;
    private final String awayTeamId;
    private final int homeScore;
    private final int awayScore;


    public MatchDetails(String id,
                        String homeTeamId,
                        String awayTeamId,
                        int homeScore,
                        int awayScore) {
        this.id = id;
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getId() {
        return id;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    @Override
    public String toString() {
        return homeTeamId + " (" + homeScore +
                ") - (" + awayScore + ") " + awayTeamId;
    }
}