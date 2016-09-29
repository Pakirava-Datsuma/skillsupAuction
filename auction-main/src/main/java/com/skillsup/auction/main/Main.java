package com.skillsup.auction.main;

import com.skillsup.auction.domain.User;
import com.skillsup.auction.service.AuctionService;
import com.skillsup.auction.service.ItemService;
import com.skillsup.auction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

/**
 * Created by swanta on 17.09.16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:main.xml");
        AuctionService service = context.getBean(AuctionService.class);
        UserService users = context.getBean(UserService.class);
        ItemService items = context.getBean(ItemService.class);


        users.createUser("administrator", "Amanda", "Smith");
        users.createUser("john38", "Endie", "Johnson");
        users.createUser("SharpFeather", "April", "O'Neal");
        }

        System.out.println("Users: " + service.getUsers().size());
    }
}

/*
 * При этом создать beans.xml в модуле auction-main с annotation-config и
 * component-scan (некоторые успели сделали это на занятии)
 * 4. В Main классе использовать эти сервиса для следующей логики:
     * 1. Создать несколько User’ов
     * 2. Создать несколько Item’ов
     * 3. Один пользователей создает лот
     * 4. Несколько других пользователей делают ставки
     * 5. Закрываем лот    6. Выводим в консоль имя победителя торгов
     * 5. Задаем любые вопросы )
 *
 * - placeBid(lot)
 * - placeBid(lot, newPrice)
 * в параметры этих двух методов
 * Необходимо добавить параметр User, чтобы было понятно, кто делает ставку
 * При размещении ставки нам нужно фиксировать кто именно поставил ставку.
 *
 * необходимо добавить новую сущность в доменную модель
 * например: LotHistory (лот, кто сделал ставку, новая цена)
 */


