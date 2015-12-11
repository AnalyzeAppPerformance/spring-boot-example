package com.kodgemisi.webapps.inventory;

/**
 * Created by sedat on 26.06.2015.
 */

import com.kodgemisi.webapps.inventory.domain.Item;
import com.kodgemisi.webapps.inventory.domain.User;
import com.kodgemisi.webapps.inventory.repository.ItemRepository;
import com.kodgemisi.webapps.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ItemRepository itemRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public void run(String... strings) throws Exception {

        Item item1 = new Item("Mac", "Computer");
        Item item2 = new Item("HTC", "Phone");
        Item item3 = new Item("S6", "Phone");
        Item item4 = new Item("Xperia", "Phone");

        Set set1 = new HashSet<Item>();
        set1.add(item1);
        set1.add(item3);
        set1.add(item4);

        Set set2 = new HashSet<Item>();
        set2.add(item2);
        set2.add(item3);

        User user1 = new User("artur", "123456");
        user1.setName("Artur");
        user1.setLastName("Panek");
        user1.setItems(set1);

        User user2 = new User("michal", "654321");
        user2.setName("Michal");
        user2.setLastName("Szczur");
        user2.setItems(set2);

        item1.setUser(user1);
        item3.setUser(user1);
        item4.setUser(user1);

        item2.setUser(user2);

        userRepository.save(user1);
        userRepository.save(user2);

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);
    }
}
