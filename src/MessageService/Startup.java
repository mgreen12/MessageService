package MessageService;

/**
 *
 * @author mgreen12
 */
public class Startup {
    
    public static void main(String[] args) {
        MessageManager service = new MessageManager(new ArrayReader(), new ConsoleWriter());
        service.processMessage();   
    }
    
}
