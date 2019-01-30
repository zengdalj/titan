package com.sunvalley.order.modelEX;

import com.sunvalley.order.model.ShopOrder;
import com.sunvalley.order.model.ShopOrderItem;
import lombok.Data;

import java.util.List;

/**
 * 类或方法的功能描述 :订单Model扩展类
 *
 * @author: logan.zou
 * @date: 2018-08-03 11:00
 */
@Data
public class ShopOrderEX extends ShopOrder {

    /**
     * 订单商品
     */
    List<ShopOrderItem> shopOrderItemList;
} 

