import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        UUID cliente1 = UUID.fromString("1a246eca-f228-48a1-8668-996cb9afa8cc");
        UUID cliente2 = UUID.fromString("bb95309a-4782-4ef1-9c19-4128484cba6d");

        List<ClientInfo> data = Arrays.<ClientInfo>asList(
                ClientInfo.of(cliente1, "products", BigDecimal.valueOf(20)),
                ClientInfo.of(cliente1, "products", BigDecimal.valueOf(30)),
                ClientInfo.of(cliente2, "products", BigDecimal.valueOf(40)),
                ClientInfo.of(cliente2, "products", BigDecimal.valueOf(40))
        );

        InputStream res = Main.class.getResourceAsStream("./teste.py");

        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.set("data", data);
        interpreter.set("cliente", cliente1);
        interpreter.execfile(res);

        PyObject x = interpreter.get("result");
        System.out.println(x);



    }
}
