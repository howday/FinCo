package utilities;

import com.google.inject.AbstractModule;

public class ServiceInjector extends AbstractModule {

	IMessageService c = null;

	ServiceInjector(IMessageService clas) {
		this.c = clas;
	}

	@Override
	protected void configure() {
		bind(IMessageService.class).to(c.getClass());
	}

}