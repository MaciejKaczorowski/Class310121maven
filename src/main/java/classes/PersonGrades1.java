package classes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

public class PersonGrades1 {
        private final Map<Person1, List<Integer>> personToGrades = new HashMap<>();

        public List<Integer> addGrade(final Person1 person, final Integer grade) {
            if (personToGrades.containsKey(person)) {
                return personToGrades.computeIfPresent(person, (existingPerson, grades) -> {
                    grades.add(grade);
                    return grades;
                });
            }
            final List<Integer> grades = new ArrayList<>();
            grades.add(grade);
            personToGrades.put(person, grades);
            return grades;
        }
        public Optional<List<Integer>> getPersonGrades(final Person1 person) {
            if (personToGrades.containsKey(person)) {
                return Optional.of(personToGrades.get(person));
            }
            return Optional.empty();
        }
        public Map<Person1, List<Integer>> clearAllGrades() {
            for (final var entry : personToGrades.entrySet()) {
                entry.getValue().clear();
            }
            return personToGrades;
        }
}
