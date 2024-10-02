import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class Subject {
    protected List<Client> clients = new ArrayList<>();
    protected final Logger logger = Logger.getLogger(Subject.class.getName());

    public void subscribe(Client client) {
        clients.add(client);
        logger.info("Attached new client");
    }

    public void unsubscribe(Client client) {
        clients.remove(client);
        logger.info("Detached client");
    }

    public abstract void notifyClient();
}
