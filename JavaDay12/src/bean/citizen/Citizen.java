package bean.citizen;

public class Citizen {

		String name;
		String aadharNumber;
		String mobileNumber;
		public Citizen(String name, String aadharNumber, String mobileNumber) {
			super();
			this.name = name;
			this.aadharNumber = aadharNumber;
			this.mobileNumber = mobileNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAadharNumber() {
			return aadharNumber;
		}
		public void setAadharNumber(String aadharNumber) {
			this.aadharNumber = aadharNumber;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		@Override
		public String toString() {
			return "Citizen [name=" + name + ", aadharNumber=" + aadharNumber + ", mobileNumber=" + mobileNumber + "]";
		}
		
		
}
