package MessageService;

/**
 *
 * @author mgreen12
 */
public class MessageManager {
    
    private InputMessage input;
    private OutputMessage output;
    
    public MessageManager(InputMessage input, OutputMessage output) {  
        setInputMessage(input);
        setOutputMessage(output);        
    }
    
    public void processMessage() {
        String message = input.setMessage();
        output.getMessage(message);
    }
    
    public final void setInputMessage(InputMessage input) {
        this.input = input;
    }
    
    public final void setOutputMessage(OutputMessage output) {
        this.output = output;
    }

    
    
    
}
