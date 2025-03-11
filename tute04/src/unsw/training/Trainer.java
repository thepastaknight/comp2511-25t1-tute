package unsw.training;

import java.time.LocalDate;
import java.util.List;

/**
 * A trainer that runs in person seminars.
 * 
 * @author Robert Clifton-Everest
 */
public class Trainer {
    private String name;
    private String room;

    private List<Seminar> seminars;

    public List<Seminar> getSeminars() {
        return seminars;
    }

    public LocalDate addEmployeeToAvailableSeminar(String employee, List<LocalDate> availability) {
        for (Seminar seminar : seminars) {
            for (LocalDate available : availability) {
                if (seminar.isSeminarAvailable(available)) {
                    seminar.addEmployeeToSeminar(employee);
                    return available;
                }
            }
        }
        return null;
    }
}
