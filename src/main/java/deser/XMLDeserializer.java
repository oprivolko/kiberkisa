package deser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class XMLDeserializer {
    public static void main(String[] args) throws IOException{
        try {
            XmlMapper xmlMapper = new XmlMapper();
            Staff staff1[]= xmlMapper.readValue(new File("staff.xml"), Staff[].class);
            System.out.println(Arrays.asList(staff1));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
