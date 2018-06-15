package org.study.entities.team;

import org.study.entities.developers.Developer;
import org.study.entities.testers.Tester;

import java.util.ArrayList;
import java.util.List;

public class Team<D extends Developer, T extends Tester> {

    private List<D> developers = new ArrayList<>();
    private List<T> testers = new ArrayList<>();

    public boolean addDevMember(D developer) {
        return developers.add(developer);
    }

    public boolean removeDevMember(D developer) {
        return developers.remove(developer);
    }

    public boolean addTestMember(T tester) {
        return testers.add(tester);
    }

    public boolean removeTestMember(T tester) {
        return testers.remove(tester);
    }

    public void createProgramm() {
        developers.forEach(d -> d.writeCode());
    }
    public void testProgram() { testers.forEach(t -> t.testCode()); }


}
