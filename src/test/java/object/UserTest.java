package object;

import com.object.User;
import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void equalUsersDefaultConstructorTest(){
        User usr1 = new User();
        User usr2 = new User();
        Assert.assertTrue(usr1.equals(usr2));
    }

    @Test
    public void equalUsersSpecificConstructorTest(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubko",20,true);
        Assert.assertTrue(usr1.equals(usr2));
    }

    @Test
    public void unequalUsersUnequalName(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytra","Zubko",20,true);
        Assert.assertFalse(usr1.equals(usr2));
    }

    @Test
    public void unequalUsersUnequalSurname(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubka",20,true);
        Assert.assertFalse(usr1.equals(usr2));
    }

    @Test
    public void unequalUsersUnequalAge(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubko",21,true);
        Assert.assertFalse(usr1.equals(usr2));
    }

    @Test
    public void unequalUsersUnequalActivity(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubko",20,false);
        Assert.assertFalse(usr1.equals(usr2));
    }

    @Test
    public void unequalHashUnequalName(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytra","Zubko",20,true);
        Assert.assertFalse(usr1.hashCode() == usr2.hashCode());
    }

    @Test
    public void unequalHashUnequalSurname(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubka",20,true);
        Assert.assertFalse(usr1.hashCode() == usr2.hashCode());
    }

    @Test
    public void unequalHashUnequalAge(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubko",21,true);
        Assert.assertFalse(usr1.hashCode() == usr2.hashCode());
    }

    @Test
    public void unequalHashUnequalActivity(){
        User usr1 = new User("Dmytro","Zubko",20,true);
        User usr2 = new User("Dmytro","Zubko",20,false);
        Assert.assertFalse(usr1.hashCode() == usr2.hashCode());
    }
}
