package utilities;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new ServiceInjector(new FacebookService()));
		Consumer app = injector.getInstance(Consumer.class);
		app.sendMessage("Hi Pankaj", "pankaj@abc.com");
	}
}