package dto;

public class CurrencyDTO {
	
	private String low;
	private String high;
	
	public CurrencyDTO(String low, String high) {
		super();
		this.low = low;
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}
	
	

}
