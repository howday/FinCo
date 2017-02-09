package finco;

public class DefaultCustomer extends Customer implements IPerson {

		private String birthDate;

		@Override
		public String getCustomerType() {
			// TODO Auto-generated method stub
			return "Default";
		}

		@Override
		public String getBirthDate() {
			return this.birthDate;
		}

		@Override
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;

		}

	
}
