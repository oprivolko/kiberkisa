package ser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLMapper {

    private static final Logger log = Logger.getLogger(XMLMapper.class);

    public static void main(String[] args) {

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
            XmlMapper xmlMapper = new XmlMapper();

            String xmlString = xmlMapper.writeValueAsString(guys);
            xmlMapper.writeValue(new File("staff.xml"), guys);
            System.out.println(xmlString);
            log.info("objects serilized to xml");
            log.info("success (xml)!");
        } catch (IOException e) {
            e.printStackTrace();
            log.error("whooops! smth went wrong");
        }


    }


}
