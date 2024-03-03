import java.util.Objects;

public class Secretary extends Staff {
    private Staff boss;

    public Secretary(String name, String school, Staff boss) {
        super(name, school);
        this.boss = boss;
    }

    protected Staff getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return "Secretary{name= '" + getName() + "', school='" + getSchool() + "', boss=" + boss.getName()
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Secretary) {
            Secretary s = (Secretary) o;
            if (super.equals(o)) {
                return (getBoss().equals(s.getBoss()));
            }
        }
        return false;
    }

    // ! What the hell is this hashCode asking me to do?

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), boss != null ? boss.hashCode() : 0);
    }
}
