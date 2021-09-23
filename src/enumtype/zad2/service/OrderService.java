package enumtype.zad2.service;

import enumtype.zad2.model.Order;
import enumtype.zad2.model.OrderStatus;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class OrderService {


    public void printOrderStatusAndReadExpectedStatusFromUser(List<Order> list) {
        readOrderStatus();
        viewOrdersListByStatus(list);
    }

    public static List<Order> getOrders(Path path) throws IOException {
        final List<String> stringList = Files.readAllLines(path, StandardCharsets.UTF_8);
        return stringList.
                stream().map((line) -> {
                            final String[] split = line.split(";");
                            String name = split[0];
                            BigDecimal price = new BigDecimal(split[1].trim());
                            OrderStatus status = OrderStatus.valueOf(split[2].trim());
                            return new Order(name, price, status);
                        }
                ).toList();
    }


    private static void readOrderStatus() {
        System.out.print("Specify the status of orders to display (");
        OrderStatus[] array = OrderStatus.values();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].name());
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    private OrderStatus readStatusFromUser() {
        final Scanner input = new Scanner(System.in);
        return OrderStatus.valueOf(input.next().toUpperCase());
    }


    private void viewOrdersListByStatus(List<Order> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        OrderStatus orderStatus = readStatusFromUser();
        System.out.println("List of orders with status " + orderStatus.name());
        for (Order order : list) {
            if (orderStatus.name().equals(order.getStatus().name())) {
                System.out.println(order.toString());
            }
        }
    }


}
