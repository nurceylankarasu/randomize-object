package example;

import com.example.Model;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

import static com.example.Randomize.randomize;
import static org.testng.Assert.assertTrue;

public class RandomizeTest {

    @Test
    public void a() {
        System.out.println(new Gson().toJson(randomize(Model.class)));

        Field[] declaredFields = Model.class.getDeclaredFields();
        assertTrue(Arrays.stream(declaredFields).anyMatch(field -> field.getName().equals("id") && field.getType().equals(Integer.class)));
        assertTrue(Arrays.stream(declaredFields).anyMatch(field -> field.getName().equals("name") && field.getType().equals(String.class)));
    }
}
