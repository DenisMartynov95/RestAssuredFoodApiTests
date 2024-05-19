package Asserts.Get;

import java.util.HashMap;
import java.util.Map;

/*
У данного ассерта каждый день меняются список выдаваемых наименований, поэтому важно его изменять, сзачала запускать в Postman
А потом уже переписывать оттуда ожидаемые в ассерте наименования
 */

public class AssertThirdTest {

    public static String[] getTitle() {
        return new String[] {"Slow Cooker Apple Pork Tenderloin","Traditional Apple Tart","Creamy Lime Pie Square Bites","Blood Orange Margarita","Napoleon - A Creamy Puff Pastry Cake"};
    }



}
