package test;

import collect.Article;
import collect.HasPrice;
import collect.Order;
import collect.PriceDTO;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Vilkas on 18/06/2017.
 */
class CalculatePriceFromArticlesTest {
    @Test
    void calculatePrice() {
        List<HasPrice> articles = IntStream
                .range(1, 6)
                .mapToObj(value -> new Article(value, value * 2))
                .collect(Collectors.toList());
        Order order = new Order(articles);
        PriceDTO priceDTO = new PriceDTO(15, 30);
        assertEquals(priceDTO, order.getPrice());
    }

}