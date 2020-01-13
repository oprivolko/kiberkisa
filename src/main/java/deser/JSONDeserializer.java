package deser;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class JSONDeserializer {
        public static void main(String[] args) throws IOException {

            ObjectMapper objectMapper = new ObjectMapper();
            Staff staff1 [];
            try {
                staff1 = objectMapper.readValue(new File("staff.json"), Staff[].class);
                System.out.println(Arrays.asList(staff1));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}
