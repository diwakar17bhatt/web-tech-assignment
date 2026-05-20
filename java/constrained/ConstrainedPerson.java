package constrained;

import java.beans.*;

public class ConstrainedPerson {

    private int age;

    private VetoableChangeSupport support =
            new VetoableChangeSupport(this);

    public void addVetoableChangeListener(
            VetoableChangeListener listener) {

        support.addVetoableChangeListener(listener);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge)
            throws PropertyVetoException {

        int oldAge = this.age;

        support.fireVetoableChange(
                "age",
                oldAge,
                newAge
        );

        this.age = newAge;
    }
}