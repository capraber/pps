package com.globant.pps.repository;

import com.globant.pps.repository.entity.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.List;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/test/TestManifest.xml", sdk = 21)
public class UserRepositoryTest {

    public static final String HEIGHT = "1234";
    public static final Long DATE = 1234567890L;

    public static final String HEIGHT_UPDATE = "897";
    public static final Long DATE_UPDATE = 987654321L;
    UserRepository repository;

    public UserRepositoryTest() {
        repository = new UserDB();
    }

    @Test
    public void testCreateEntity() throws Exception {
        List<User> list1 = repository.list();
        Assert.assertTrue(list1.isEmpty());

        repository.create(HEIGHT, DATE);

        List<User> list2 = repository.list();
        Assert.assertFalse(list2.isEmpty());
        Assert.assertEquals(1, list2.size());
        Assert.assertEquals(HEIGHT, list2.get(0).getHeight());
        Assert.assertEquals(DATE, list2.get(0).getDate());

    }

    @Test
    public void testUpdateEntity() throws Exception {
        Long id = repository.create(HEIGHT, DATE);


        repository.update(id, HEIGHT_UPDATE, DATE_UPDATE);

        List<User> list = repository.list();
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(HEIGHT_UPDATE, list.get(0).getHeight());
        Assert.assertEquals(DATE_UPDATE, list.get(0).getDate());
    }
}
