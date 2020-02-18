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
		JsonObject response = new JsonObject();
		response.addProperty("name", "shorav");
		System.out.println(main(response).toString());

	}

}
