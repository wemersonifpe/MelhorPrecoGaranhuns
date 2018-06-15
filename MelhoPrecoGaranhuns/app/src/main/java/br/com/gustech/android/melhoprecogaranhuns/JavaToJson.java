package br.com.gustech.android.melhoprecogaranhuns;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;

/**
 * Created by 20162D13GR0323 on 14/06/2018.
 */

public class JavaToJson {

        public static String toJSON(Object object) throws JSONException, IllegalAccessException {
            String str = "";
            Class c = object.getClass();
            JSONObject jsonObject = new JSONObject();
            for (Field field : c.getDeclaredFields()) {
                field.setAccessible(true);
                String name = field.getName();
                String value = String.valueOf(field.get(object));
                jsonObject.put(name, value);
            }
            System.out.println(jsonObject.toString());
            return jsonObject.toString();
        }
}
