package immutable;

import com.immutable.Address;
import com.immutable.User;
import org.junit.Assert;
import org.junit.Test;

public class ImmutableUserTest {
    @Test
    public void changeCityAddressTest(){
        Address address = new Address("Kyiv",12231);
        User user = new User(address,"Dmytro");
        address.setCity("Palo-Alto");
        Assert.assertEquals("Kyiv",user.getAddress().getCity());
    }

    @Test
    public void changeCodeAddressTest(){
        Address address = new Address("Kyiv",12231);
        User user = new User(address,"Dmytro");
        address.setCode(12000);
        Assert.assertEquals(12231,user.getAddress().getCode());
    }
}
