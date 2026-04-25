package com.gla.generics;
import java.util.List;
import java.util.ArrayList;
abstract class JobRole {
    String candidateName;

    public JobRole(String candidateName) {
        this.candidateName = candidateName;
    }

    public abstract void evaluate();
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }
@Override
public void evaluate()
{
    System.out.println(candidateName + " evaluated for Product Management (Strategy + Communication)");
}
class Resume<T extends JobRole> {
    private List<T> candidates = new ArrayList<>();

    // Add resume
    public void addCandidate(T candidate) {
        candidates.add(candidate);
    }

    // Get list
    public List<T> getCandidates() {
        return candidates;
    }

    // Process resumes
    public void processResumes() {
        for (T c : candidates) {
            c.evaluate();
        }
    }
}
public class AIDrivenResumeScreeningSystem {
    public static void screenAll(List<? extends JobRole> list) {
        System.out.println("\nAI Screening Pipeline:");
        for (JobRole role : list) {
            role.evaluate();
        }
    }
        public static <T extends JobRole> void shortlist(T candidate) {
            System.out.println("Shortlisted: " + candidate.candidateName);
        }
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        seResumes.addCandidate(new SoftwareEngineer("Alice"));
        seResumes.addCandidate(new SoftwareEngineer("Bob"));
        Resume<DataScientist> dsResumes = new Resume<>();
        dsResumes.addCandidate(new DataScientist("Charlie"));
        Resume<ProductManager> pmResumes = new Resume<>();
        pmResumes.addCandidate(new ProductManager("David"));
        seResumes.processResumes();
        dsResumes.processResumes();
        pmResumes.processResumes();
        screenAll(seResumes.getCandidates());
        screenAll(dsResumes.getCandidates());
        screenAll(pmResumes.getCandidates());
        shortlist(new SoftwareEngineer("Eve"));
        shortlist(new DataScientist("Frank"));
    }
}
}
