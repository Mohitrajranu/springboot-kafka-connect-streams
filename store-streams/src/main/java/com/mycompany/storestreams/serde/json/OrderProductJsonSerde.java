package com.mycompany.storestreams.serde.json;

import com.mycompany.commons.storeapp.events.OrderProduct;
import com.mycompany.commons.storeapp.events.Product;
import org.springframework.kafka.support.serializer.JsonSerde;

public class OrderProductJsonSerde extends JsonSerde<OrderProduct> {
}
