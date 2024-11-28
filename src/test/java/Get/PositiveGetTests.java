package Get;

import Asserts.Get.AssertFirstTest;
import Asserts.Get.AssertSecondTest;
import Asserts.Get.AssertThirdTest;
import ExtractFromJson.GetMethods.FirstTest.Result;
import ExtractFromJson.GetMethods.FirstTest.Root;
import TestsData.Get.Parameters;
import com.google.gson.Gson;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import TestsData.AuthKey;

import java.util.Map;

import static Asserts.Get.AssertThirdTest.getTitle;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class PositiveGetTests {


    @Before
    public void setUp() {
        RestAssured.baseURI = "https://api.spoonacular.com/";
    }


    @Test
    @Step("GET запрос Search Recipes")
    @DisplayName("Комплексный поиск рецептов по параметрам")
    @Description("Так же проверяю какие данные пришли и сравниваю ассертом ответ")
    public void complexSearch() {
        try {
            Map<String, Object> params1 = Parameters.getParam1();

            Response response = given()
                    .header("x-api-key", AuthKey.getAuthKey())
                    .params(params1)
                    .and()
                    .get("recipes/complexSearch");
            response.then().assertThat().statusCode(200);

            if (response.getStatusCode() == 200) {
                System.out.println("Тест №1 прошел успешно");
                System.out.println("Статус код: " + response.getStatusCode());
            }

            ExtractFromJson.GetMethods.FirstTest.Root root = response.body().as(ExtractFromJson.GetMethods.FirstTest.Root.class);

            Result result = root.getResults().get(0); // Распаковываю нужный мне вложенный в Root класс Result
//                  Логирую десериализацию
//                  Gson gson = new Gson();
//                  String json = gson.toJson(root.getResults());
//                  System.out.println(json);

            assertNotNull(result.getId().toString());
            assertEquals(AssertFirstTest.getTitle(), result.getTitle());
            System.out.println("В поле ID " + result.getId() + " В поле Title " + result.getTitle());


        } catch (Exception e) {
            System.out.println("Тест №1 завершился с ошибкой: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    @Step("GET запрос findByNutrients")
    @DisplayName("Поиск блюда по параметру НУТРИЕНТЫ")
    @Description("Так же проверяю какие данные пришли и сравниваю с ассертом ответ")
    public void findByNutrients() {
        try {
            Map<String, Object> params2 = Parameters.getParam2();

            Response response = given()
                    .header("x-api-key", AuthKey.getAuthKey())
                    .params(params2)
                    .and()
                    .get("recipes/findByNutrients");
            response.then().statusCode(200);


            // В ответ приходит не объект, а массив, поэтому десериализуем объект массив объекто следующей строкой
            ExtractFromJson.GetMethods.SecondTest.Root[] roots = response.body().as(ExtractFromJson.GetMethods.SecondTest.Root[].class);
            // Затем начинаю проверку что массив не пуст
            if(roots.length > 0) {
                // Так как массив оказался не пустым - изымаю первую сущность из массива, если бы приходило несколько сущностей
                // Влепил бы сюда цикл и прошелся по всем
                ExtractFromJson.GetMethods.SecondTest.Root root = roots[0];
                assertEquals(AssertSecondTest.getId(), root.getId());
                assertEquals(AssertSecondTest.getCalories(), root.getCalories());
                assertEquals(AssertSecondTest.getTitle(), root.getTitle());
                System.out.println(root.getId() + " " + root.getCalories() + " " + root.getTitle());
                System.out.println("Тест №2 прошел успешно!");
            } else {
                throw new AssertionError("Тело пустое!");
            }

        } catch (Exception e) {
            System.out.println("Тест №2 завершился с ошибкой: " + e.getMessage());
            e.printStackTrace();
        }

    }

    @Test
    @Step("Get запрос findByIngredients")
    @DisplayName("Поиск блюда по параметру Ингридиенты")
    @Description("Так же проверяю какие данные пришли и сравниваю с нужным списком продуктов Title, для этого написан кусок кода в pogo классе")
    public void findByIngredients() {
        try {
            Map<String, Object> params3 = Parameters.getParam3();
            Response response = given()
                    .header("x-api-key", AuthKey.getAuthKey())
                    .params(params3)
                    .and()
                    .get("recipes/findByIngredients");
            response.then().statusCode(200);

            ExtractFromJson.GetMethods.ThirdTest.Root[] roots = response.body().as(ExtractFromJson.GetMethods.ThirdTest.Root[].class);
            String[] expectedTitles = AssertThirdTest.getTitle();

            for (String expectedTitle : expectedTitles) {
                boolean found = false;
                for (ExtractFromJson.GetMethods.ThirdTest.Root root : roots) {
                    if (root.getTitle().equals(expectedTitle)) {
                        found = true;
                        break;
                    }
                }
                assert found : "Ожидаемое блюдо \"" + expectedTitle + "\" не найдено в ответе";
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}