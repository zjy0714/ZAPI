package com.yupi.yuapiinterface;

import com.yupi.yuapiclientsdk.client.YuApiClient;
import com.yupi.yuapiclientsdk.model.User;
import com.yupi.yuapiinterface.service.RestaurantService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YuapiInterfaceApplicationTests {

    @Resource
    private YuApiClient yuApiClient;

    @Resource
    private RestaurantService restaurantService;

    @Test
    void contextLoads() {
        String result = yuApiClient.getNameByGet("yupi");
        User user = new User();
        user.setUsername("liyupi");
        String usernameByPost = yuApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

    @Test
    void test(){
        String restaurant = restaurantService.getRandomRestaurant();
        System.out.println(restaurant);
    }

}
