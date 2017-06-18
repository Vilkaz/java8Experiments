package collect;

import java.util.Collection;

/**
 * Created by Vilkas on 18/06/2017.
 */
public class Order {

    private Collection<HasPrice> articles;

    //region Constructor
    public Order() {
    }

    public Order(final Collection<HasPrice> articles) {
        this.articles = articles;
    }
    //endregion

    public PriceDTO getPrice() {
        return CalculatePriceFromArticles.calculatePrice(articles);
    }

}
