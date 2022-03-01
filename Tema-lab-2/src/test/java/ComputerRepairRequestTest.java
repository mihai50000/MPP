import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    
    @Test
    @DisplayName("Test ComputerRepairRequest initialization")
    public void testCrrInit() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        assertEquals(computerRepairRequest.getOwnerName(), "");
        assertEquals(computerRepairRequest.getOwnerAddress(), "");
    }

    @Test
    @DisplayName("Test ComputerRepairRequest owner setter")
    public void testCrrOwnerSetter() {
        ComputerRepairRequest computerRepairRequest = new ComputerRepairRequest();
        computerRepairRequest.setOwnerName("Mihai");
        assertEquals(computerRepairRequest.getOwnerName(), "Mihai");
        computerRepairRequest.setOwnerName("Popescu");
        assertEquals(computerRepairRequest.getOwnerName(), "Popescu");
    }
}
