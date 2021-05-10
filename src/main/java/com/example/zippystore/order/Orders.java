package com.example.zippystore.order;

import com.example.zippystore.merchant.Merchants;
import com.example.zippystore.user.Users;

import javax.persistence.*;

@Entity
@Table(name = "tblOrders")
public class Orders {

    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "product_list")
    private String productList;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @OneToOne
    @JoinColumn(name = "merchant_id")
    private Merchants merchantId;


}
