import com.sun.security.ntlm.Client;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClientInfo {

    private UUID code;
    private String type;
    private BigDecimal value;
    private Map<String, String> metadata;

    public static ClientInfo of(UUID code, String type, BigDecimal value) {
        return new ClientInfo(code, type, value, new HashMap<String, String>());
    }

    public ClientInfo(UUID code, String type, BigDecimal value, Map<String, String> metadata) {
        this.code = code;
        this.type = type;
        this.value = value;
        this.metadata = metadata;
    }

    public UUID getCode() {
        return code;
    }

    public void setCode(UUID code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
