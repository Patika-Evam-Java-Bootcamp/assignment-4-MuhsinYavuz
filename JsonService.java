package Service ;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import Models.* ;
import java.util.List;

public class JsonService {
    public List<Student> students = new ArrayList<>(); // öğrenci listesi
    public JsonService() throws IOException {
        //data JSON ı okuyacak  ve arr aktaracak .
        String data = new String(Files.readAllBytes(Paths.get("src/main/resources/StudentsInformation.JSON")));
        JSONArray jsonArr = new JSONArray(data);
        for(int i = 0; i < jsonArr.length(); i++){
            // strJson ile dizideki verileri alır
            String strJson = jsonArr.get(i).toString();
            // obje ile ifade isimlerini ayırarak students listesine ekleme yapar.
            JSONObject jsonObject = new JSONObject(strJson);
            String name = jsonObject.getString("name");
            String surname = jsonObject.getString("surname");
            int age = jsonObject.getInt("age");
            students.add(new Student(name,surname,age));

        }
}

}
