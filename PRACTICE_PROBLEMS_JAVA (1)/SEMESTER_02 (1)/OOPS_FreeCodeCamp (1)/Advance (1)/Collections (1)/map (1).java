package OOPS_FreeCodeCamp.Advance.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map<String,String> emailsList =new HashMap<>();
        //You can initiate Map as deferent HashMaps
        emailsList.put("meisam","meisam.code.com");
        emailsList.put("brad","brad.code.com");


        emailsList.remove("brad","brad.code.com");

        System.out.println(emailsList.get("meisam"));

        System.out.println(emailsList.size());

        System.out.println(emailsList.containsKey("is contain brad "+"brad"));
        System.out.println(emailsList.containsValue("is contant : "+"code.com.pk"));



    }
}
