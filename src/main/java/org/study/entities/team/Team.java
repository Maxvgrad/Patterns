package org.study.entities.team;

import org.study.entities.developers.Developer;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Developer> {
    private List<T> team = new ArrayList<>();

    public boolean addTeamMember(T member) {
        return team.add(member);
    }

    public boolean removeTeamMember(T member) {
        return team.remove(member);
    }

    public void createProgramm() {
        team.stream().forEach(t -> t.writeCode());
    }
}
