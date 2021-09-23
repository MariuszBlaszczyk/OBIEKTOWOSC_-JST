package enumtype.zad2.main;

import enumtype.zad2.model.Order;
import enumtype.zad2.service.OrderService;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {

        List<Order> list = OrderService.getOrders(Paths.get("src/enumtype/zad2/Order.csv"));
        list.forEach(o -> System.out.println(o.toString()));
        System.out.println();

        OrderService orderService = new OrderService();
        orderService.printOrderStatusAndReadExpectedStatusFromUser(list);

    }
}
