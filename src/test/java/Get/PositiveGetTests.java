package Get;

import Asserts.Get.AssertFirstTest;
import Asserts.Get.AssertSecondTest;
import ExtractFromJson.GetMethods.FirstTest.Result;
import ExtractFromJson.GetMethods.FirstTest.Root;
import TestsData.Get.Parameters;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import TestsData.AuthKey;

import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PositiveGetTests {


    @Before
    public void setUp() {
        RestAssured.baseURI = "https://api.spoonacular.com/";
    }


    @Test
    @Step("GET запрос Search Recipes")
    @DisplayName("Комплексный поиск рецептов по параметрам")
    @Description("Так же проверяю какие данные пришли и сравниваю с ассертом ответ")
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

            assertEquals(AssertFirstTest.getId(), result.getId());
            assertEquals(AssertFirstTest.getTitle(), result.getTitle());
            System.out.println(result.getId() + " " + result.getTitle());



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
            Map <String, Object> params2 = Parameters.getParam2();

            Response response = given()
                    .header("x-api-key", AuthKey.getAuthKey())
                    .params(params2)
                    .and()
                    .get("recipes/findByNutrients");
            response.then().statusCode(200);

            if (response.getStatusCode() == 200) {
                System.out.println("Тест №2 прошел успешно");
                System.out.println("Статус код: " + response.getStatusCode());
            }

            ExtractFromJson.GetMethods.SecondTest.Root root = response.body().as(ExtractFromJson.GetMethods.SecondTest.Root.class);
            assertEquals(AssertSecondTest.getId(), root.getId());
            assertEquals(AssertSecondTest.getCalories(), root.getCalories());
            assertEquals(AssertSecondTest.getTitle(), root.getTitle());
            System.out.println(root.getId() + " " + root.getCalories() + " " + root.getTitle());

        } catch (Exception e) {
            System.out.println("Тест №2 завершился с ошибкой: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
