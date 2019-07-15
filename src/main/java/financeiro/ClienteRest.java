package financeiro;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class ClienteRest {

	public static String testaServico() {
	    Client c = Client.create();
	    WebResource wr = c.resource("http://localhost:8080/responde/teste");
	    String json = wr.get(String.class);
	    Gson gson = new Gson();
	    return gson.fromJson(json, String.class);
  }
	
	public static  <T> List<T> getLista(String caminho, Class<T> tipo) {
	    Client c = Client.create();
	    WebResource wr = c.resource(caminho);
	    String json = wr.get(String.class);
	    Gson gson = new Gson();
	    return gson.fromJson(json, new TypeToken<List<T>>(){}.getType());
  }
	
	
	public static <T> T getUnico(String caminho, Class<T> tipo) {
	    Client c = Client.create();
	    WebResource wr = c.resource(caminho);
	    String json = wr.get(String.class);
	    Gson gson = new Gson();
	    return gson.fromJson(json, tipo);
  }
}