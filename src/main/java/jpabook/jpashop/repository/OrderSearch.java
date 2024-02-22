package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.PropertyResourceBundle;

@Getter
@Setter
public class OrderSearch {
    private String memberName; // 회원이름
    private OrderStatus orderStatus; //ORDER, CANCEL
}
