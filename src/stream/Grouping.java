package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Grouping {
  public static void main(String[] args) {
    final User adam = new User("Adam");

    final User bob = new User("Bob");

    final List<Order> orders = Arrays.asList(
        new Order(1, adam)
        , new Order(2, bob)
        , new Order(3, adam)
        , new Order(4, bob)
        , new Order(5, adam)
        , new Order(6, bob)
                                            );
    final List<Request> requests = orders.stream()
                                         .collect(Collectors.groupingBy(Order::getUser))
                                         .entrySet()
                                         .stream()
                                         .map(entry -> new Request(entry.getKey().getName()
                                             , entry.getValue()
                                                    .stream()
                                                    .map(Order::getId)
                                                    .collect(Collectors.toList())))
                                         .collect(Collectors.toList());

  }
}

class User {
  private final String name;

  User(final String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }
}

class Order {
  private final int id;

  private final User user;

  Order(final int id, final User user) {
    this.id = id;
    this.user = user;
  }

  public int getId() {
    return id;
  }

  public User getUser() {
    return user;
  }
}

class Request {
  private final List<Integer> orderIds;

  private final String username;

  Request(final String username, final List<Integer> orderIds) {
    this.orderIds = orderIds;
    this.username = username;
  }

  public List<Integer> getOrderIds() {
    return orderIds;
  }

  public String getUsername() {
    return username;
  }
}
