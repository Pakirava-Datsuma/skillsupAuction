package com.skillsup.auction.main;

import com.skillsup.auction.service.AuctionService;
import com.skillsup.auction.service.ItemService;
import com.skillsup.auction.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by swanta on 17.09.16.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");
        AuctionService service = context.getBean(AuctionService.class);
        UserService users = context.getBean(UserService.class);
        ItemService items = context.getBean(ItemService.class);


        items.createItem("шпилька", "такая шпилька, отпущенная в сторону девушки, заставит её обратить на Вас внимание",
                users.createUser("administrator", "Amanda", "Smith"));
        items.createItem("совесть", "случайно нашел на дороге, состояние: немножко б/у",
                users.createUser("john38", "Endie", "Johnson"));
        items.createItem("то-не-знаю-что", "сходил туда-не-знаю-куда, достал две - дишнюю продаю",
                users.createUser("SharpFeather", "April", "O'Neal"));

        System.out.println("Users: " + service.getUsers().size());
    }
}

/*

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


