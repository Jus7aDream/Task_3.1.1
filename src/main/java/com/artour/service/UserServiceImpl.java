package com.artour.service;
import com.artour.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> addUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Abu Bakr al-Siddiq", 573, 634, 61,"first Righteous Caliph"));
        users.add(new User(2,"Umar ibn al-Khattab", 590, 644,54,"second Righteous Caliph"));
        users.add(new User(3,"Usman ibn Affan", 574, 656,82,"third Righteous Caliph"));
        users.add(new User(4,"Ali ibn Abu Talib", 600, 661,61,"4th Righteous Caliph"));
        users.add(new User(5, "Abu Ubaida ibn al-Jarrah", 583, 639,56,"Viceroy of the Levant (634-638)"));
        users.add(new User(6, "Saad ibn Abu Waqqas", 595, 674,79,"candidate for 3rd Caliph"));
        users.add(new User(7, "Abdurrahman ibn Auf", 580, 654,74,"candidate for 3rd Caliph"));
        users.add(new User(8, "Az-Zubair ibn al-Awwam", 594, 656,62,"participant in the Battle of the Camel"));
        users.add(new User(9,"Abu Muhammad Talha ibn Ubaydullaha", 595, 656,61,"participant in the Battle of the Camel"));
        users.add(new User(10,"Said ibn Zeid", 593, 673,80,"governor of Damascus (since 634)"));
        return users;
    }

    @Override
    public List<User> getAllUsers(int count) {
        return addUsers().stream().limit(count).collect(Collectors.toList());
    }
}
