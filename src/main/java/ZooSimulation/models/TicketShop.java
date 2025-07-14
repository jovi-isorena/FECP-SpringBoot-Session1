package ZooSimulation.models;

public class TicketShop extends Shop{
    public TicketShop(Vendor vendor) {
        super(vendor);

        setShopType("Ticket");
    }
}
