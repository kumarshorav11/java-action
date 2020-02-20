package com.qs;

import com.google.gson.JsonObject;

public class Hello {

	public static JsonObject main(JsonObject args) {
        String name = "stranger";
        if (args.has("name"))
            name = args.getAsJsonPrimitive("name").getAsString();
        JsonObject response = new JsonObject();
        response.addProperty("greeting", "Hello, " + name + "!");
        return response;
    }
	
	public static void main(String...strings) {
		String name = "stranger";
		 JsonObject response = new JsonObject();
		 if(strings.length > 0)
			 name = strings[0];
	     response.addProperty("greeting", "Hello, " + name + "!");
	     System.out.println(response);
	}

}
