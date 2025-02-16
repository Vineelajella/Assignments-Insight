package Day2Assignment;

public class PhoneNum21docx {
	 private String areaCode;
	    private String exchange;
	    private String extension;
		public PhoneNum21docx(String areaCode, String exchange, String extension) {
			super();
			this.areaCode = areaCode;
			this.exchange = exchange;
			this.extension = extension;
		}
		@Override
		public String toString() {
			return "PhoneNum21docx [areaCode=" + areaCode + ", exchange=" + exchange + ", extension=" + extension + "]";
		}
		 @Override
		    public boolean equals(Object obj) {
		        
		        if (this == obj) {
		            return true;
		        }
		        if (obj instanceof PhoneNum21docx) {
		        	PhoneNum21docx other = (PhoneNum21docx) obj;
		            return this.areaCode.equals(other.areaCode) &&
		                   this.exchange.equals(other.exchange) &&
		                   this.extension.equals(other.extension);
		        }
		        
		        return false;
		    }
		 @Override
		    public int hashCode() {
		        return areaCode.hashCode() * 31 + exchange.hashCode() * 17 + extension.hashCode();
		    }
}
