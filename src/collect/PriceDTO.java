package collect;

/**
 * Created by Vilkas on 18/06/2017.
 */
public class PriceDTO implements HasPrice{

    private double gross;
    private double net;

    //region Constructor
    public PriceDTO() {
    }

    public PriceDTO(final double net, final double gross) {
        this.gross = gross;
        this.net = net;
    }
    //endregion

    //region getter setter
    public void setGross(final double gross) {
        this.gross = gross;
    }

    public void setNet(final double net) {
        this.net = net;
    }
    //endregion

    public void addPrices(HasPrice article) {
        this.net += article.getNet();
        this.gross += article.getGross();
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash *= this.net;
        hash *= this.gross;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof PriceDTO
                && ((PriceDTO) o).gross == this.gross
                && ((PriceDTO) o).net == this.net);
    }

    @Override
    public double getGross() {
        return this.gross;
    }

    @Override
    public double getNet() {
        return this.net;
    }
}
