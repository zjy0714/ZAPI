package com.yupi.yuapiinterface;

import com.zwh.zapiclientsdk.client.ZApiClient;
import com.zwh.zapiclientsdk.model.User;
import com.yupi.yuapiinterface.service.RestaurantService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    private ZApiClient zApiClient;

    @Resource
    private RestaurantService restaurantService;

    @Test
    void contextLoads() {
        String result = zApiClient.getNameByGet("yupi");
        User user = new User();
        user.setUsername("liyupi");
        String usernameByPost = zApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

    @Test
    void test(){
        String restaurant = restaurantService.getRandomRestaurant();
        System.out.println(restaurant);
    }

}
