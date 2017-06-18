package collect;

import java.util.Collection;

/**
 * Created by Vilkas on 18/06/2017.
 */
public class CalculatePriceFromArticles {

    public static PriceDTO calculatePrice(Collection<HasPrice> articles) {
        return articles
                .stream()
                .collect(PriceDTO::new,
                        PriceDTO::addPrices,
                        PriceDTO::addPrices);
    }

}
