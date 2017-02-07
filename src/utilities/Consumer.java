package utilities;

import com.google.inject.Inject;

public class Consumer {

	private IMessageService service;

	/**
	 * setter method injector
	 * 
	 * @param svc
	 *            - messageService
	 */

	@Inject
	public void setService(IMessageService svc) {
		this.service = svc;
	}

	public boolean sendMessage(String msg, String rec) {
		// some business logic here
		return service.sendMessage(msg, rec);
	}
}