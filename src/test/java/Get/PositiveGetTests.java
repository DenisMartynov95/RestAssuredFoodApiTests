package Get;

import Asserts.Get.AssertFirstTest;
import ExtractFromJson.FirstTest.Result;
import TestsData.Get.Parameters;
import com.google.gson.Gson;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import TestsData.AuthKey;
import Asserts.Get.AssertFirstTest;

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
    public void complexSearch() {
        try {
            Map<String, Object> params1 = Parameters.getParam1();

            Response response = given()
                    .header("x-api-key", AuthKey.getAuthKey())
                    .param(params1.toString())
                    .and()
                    .get("recipes/complexSearch");
            response.then().assertThat().statusCode(200);

            if (response.getStatusCode() == 200) {
                System.out.println("Тест №1 прошел успешно");
                System.out.println("Статус код: " + response.getStatusCode());
            }

            // Проблема с тем, что будто бы не кладутся приходящие данные в Result, надо исправить
            Result result = response.body().as(Result.class);
            assertEquals(AssertFirstTest.getId(), result.getId());
            assertEquals(AssertFirstTest.getTitle(), result.getTitle());
            System.out.println(result.getId() + " " + result.getTitle());

//            Result result = response.body().as(Result.class);
//            Result result = response.body().as(Result.class)
//            assertNotNull(result);
//            Gson gson = new Gson();
//            String json = gson.toJson("Наименование блюда: " + result.getTitle() + " id Блюда: " + result.getId());
//            System.out.println(json);

        } catch (Exception e) {
            System.out.println("Тест №1 завершился с ошибкой: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
