package Server;

public class ClientDescriptor implements StringConsumer, StringProducer {
    MessageBoard m;
    @Override
    public void consume(String str) {
        m.consume(str);
    }

    @Override
    public void addConsumer(StringConsumer sc) {
        m = (MessageBoard) sc;
    }

    @Override
    public void removeConsumer(StringConsumer sc) {

    }
}
