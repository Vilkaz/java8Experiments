package collect;

/**
 * Created by Vilkas on 18/06/2017.
 */
public class Article implements HasPrice {
    private Double net;
    private Double gross;

    //region Constructor
    public Article() {
    }

     public Article(final Number net, final Number gross) {
        this.net = net.doubleValue();
        this.gross = gross.doubleValue();
    }
    //endregion


    @Override
    public double getGross() {
        return gross;
    }

    @Override
    public double getNet() {
        return net;
    }
}
