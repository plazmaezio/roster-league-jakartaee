
package org.rosterleague.common;

import org.rosterleague.entities.Player;

import java.io.Serial;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TeamRankingDetails implements Serializable {
    @Serial
    private static final long serialVersionUID = -1617419013515301816L;

    private final String teamId;
    private final String teamName;
    private final int points;
    private final List<PlayerDetails> players;

    public TeamRankingDetails(String teamId, String teamName, int points, List<PlayerDetails> players) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.points = points;
        this.players = players;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPoints() {
        return points;
    }

    public List<PlayerDetails> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(teamName)
                .append(" - ")
                .append(points)
                .append(" points\n");

        sb.append("   Team members:\n");

        for (PlayerDetails p : players) {
            sb.append("   - ")
                    .append(p)
                    .append("\n");
        }

        return sb.toString();
    }

}
