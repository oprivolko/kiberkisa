package ser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONMapper {
    private static final Logger log = Logger.getLogger(JSONMapper.class);


    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        Staff staffObject1 = new Staff();
        staffObject1.setName("Tom");
        staffObject1.setAge(40);


        Staff staffObject2 = new Staff();
        staffObject2.setName("Bill");
        staffObject2.setAge(30);

        List<Staff> guys = new ArrayList();
        guys.add(staffObject2);
        guys.add(staffObject1);
        String result = null;
        try {
            result = objectMapper.writeValueAsString(guys);
            objectMapper.writeValue(new File("staff.json"), guys);
            log.info("objects serilized to json");
            log.info("success (json)!");
        } catch (IOException e) {
            e.printStackTrace();
            log.error("whooops! smth went wrong");
        }
        System.out.println(result);
    }

}

