package com.object;

public class User {
    private String name;
    private String surname;
    private int age;
    private boolean active;

    public User(String name, String surname, int age, boolean active) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
        Object obj = new Object();
    }

    public User() {

    }

    /**
     * The equals() method must be:
     *
     *     reflexive: an object must equal itself
     *     symmetric: x.equals(y) must return the same result as y.equals(x)
     *     transitive: if x.equals(y) and y.equals(z) then also x.equals(z)
     *     consistent: the value of equals() should change only if a property that is contained in equals() changes (no randomness allowed)
     * @return
     */


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User))
            return false;
        User other = (User) o;
        boolean nameEquals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
        boolean surnameEquals = (this.surname == null && other.surname == null)
                || (this.surname != null && this.surname.equals(other.surname));
        boolean ageEquals = (this.age == other.age);
        boolean activeEquals = (this.active == other.active);
        return nameEquals && surnameEquals && ageEquals && activeEquals;
    }

    /**
     * The hashCode() method:
     *
     *     internal consistency: the value of hashCode() may only change if a property that is in equals() changes
     *     equals consistency: objects that are equal to each other must return the same hashCode
     *     collisions: unequal objects may have the same hashCode
     * @return
     */
    @Override
    public final int hashCode() {
        int result = 17;

        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (surname == null ? 0 : surname.hashCode());
        result = 31 * result + age;
        result = 31 * result + (active ? 1 : 0); //         1251/1257

        return result;
    }
}
